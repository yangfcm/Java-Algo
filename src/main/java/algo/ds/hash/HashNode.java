package algo.ds.hash;

public class HashNode<K, V> {
  K key;
  V value;
  // final int hashCode;
  HashNode<K, V> next;

  public HashNode(K key, V value) {
    this.key = key;
    this.value = value;
  }
}
