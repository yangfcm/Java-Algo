package algo.ds.hash;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @name HashTable
 * @description Implement a hash table
 * @note When implementing hash table in Java, there's some difference in terms of the language features.
 * 1. Java doesn't have built-in data structure that allows you to store multiple different typed values. 
 * In dynamic languages, like JS, python, it's not an issue; In typed language(C# to be more specific), it actually provides *tuples* that is used to solve this.
 * So to tackle issue, you'll have to create your own data structure, called *HashNode* in this case.
 * 2. Java doesn't support generic array like C#. To solve this, use array list instead of array
 */
public class HashTable<K, V> {
  private List<HashNode<K, V>> table;  // a table/list that stores a list of buckets.
  private int size; // Ths size/capacity of the list.
  private int count;  // The  current size of the list

  public HashTable() {
    table = new ArrayList<HashNode<K, V>>();
    size = 8; // The initial size of the list.
    count = 0;  // How many buckets are used.
    for(int i = 0; i < size; i++) {
      table.add(null);  // Initialize every bucket.
    }
  }

  public int getCount() {
    return count;
  }
  public int getSize() {
    return size;
  }
  public List<HashNode<K, V>> getTable() {
    return table;
  }
  public HashNode<K, V> getHashNode(int index) {
    return table.get(index);
  }

  private final int hash(K key) { // Get the index for the key.
    return Math.abs(Objects.hashCode(key)) % size;
  }

  public void add(K key, V value) { // Add a key value pair.
    int index = hash(key);
    HashNode<K, V> head = table.get(index);

    // Check if the key already exists.
    while(head != null) {
      if(head.key.equals(key)) {
        head.value = value;
        return;
      }
      head = head.next;
    }

    // Insert a key-value pair.
    count++;
    head = table.get(index);
    HashNode<K, V> newNode = new HashNode<K, V>(key, value);
    newNode.next = head;
    table.set(index, newNode);
    
    // Check if the hash table size should be increased.
    if((count* 1.0)/size >= 0.75) {
      resize(size*2);
    }
  }

  public V get(K key) { // Return a value for a key
    int index = hash(key);
    HashNode<K, V> head = table.get(index);

    while(head != null) {
      if(head.key.equals(key)) {
        return head.value;
      }
      head = head.next;
    }
    return null;
  }

  public V remove(K key) { // Remove a given key.
    int index = hash(key);
    HashNode<K, V> head = table.get(index);
    HashNode<K, V> prev = null;
    while(head != null) {
      if(head.key.equals(key)) {  // If key is found.
        break;
      }
      // Otherwise, keep looking.
      prev = head;
      head = head.next;
    }

    if(head == null) return null;
    count--;
    if(prev != null) {
      prev.next = head.next;
    } else {
      table.set(index, head.next);
    }

    // Check if the hash table size should be decreased.
    if((count* 1.0)/size >= 0.75) {
      resize(size*2);
    }
    return head.value;
  }

  public void resize(int size) {
    var oldTable = table;
    this.size = size;
    count = 0;
    table = new ArrayList<HashNode<K, V>>();
    for(int i = 0; i < this.size; i++) {
      table.add(null);
    }
    for(int k = 0; k < oldTable.size(); k++) {
      HashNode<K, V> head = oldTable.get(k);
      while(head != null) {
        this.add(head.key, head.value);
        head = head.next;
      }
    }
  }
}
