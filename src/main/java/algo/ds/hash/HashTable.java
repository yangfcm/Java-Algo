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
 * So to tackle tackle issue, you'll have to create your own data structure, called *HashNode* in this case.
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

  private final int hash(K key) { // Get the index for the key.
    return Math.abs(Objects.hashCode(key)) % size;
  }

  public void add(K key, V value) { // Add a key value pair.

  }

  public V get(K key) { // Return a value for a key

  }

  public void remove(K key) { // Remove a given key.

  }
}
