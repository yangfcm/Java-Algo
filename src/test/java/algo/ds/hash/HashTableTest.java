package algo.ds.hash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HashTableTest {
  private HashTable<String, String> table;

  @BeforeEach
  public void setUp() {
    table = new HashTable<String, String>();
  }

  @AfterEach
  public void clean() {
    table = null;
  }

  @DisplayName("Should create a null hash table")
  @Test
  public void testConstructor() {
    assertEquals(table.getCount(), 0);
    for(int i = 0; i < table.getSize(); i++) {
      assertEquals(table.getHashNode(i), null);
    }
  }

  private void setKeyValuePairs() {
    table.add("k1", "v1");
    table.add("k2", "v2");
    table.add("k3", "v3");
  }

  @DisplayName("Should be able to put new key-value pair.")
  @Test
  public void testPut(){
    setKeyValuePairs();
    assertEquals(table.getCount(), 3);
    table.add("k4", "v4");
    assertEquals(table.getCount(), 4);
  }

  @DisplayName("Should be able to get value by given key")
  @Test
  public void testGet() {
    setKeyValuePairs();
    assertEquals(table.get("k1"), "v1");
    assertEquals(table.get("k2"), "v2");
    assertEquals(table.get("k3"), "v3");
    assertEquals(table.get("k99"), null);
  }

  @DisplayName("Should be able to remove a given key")
  @Test
  public void testRemove() {
    setKeyValuePairs();    
    String removed = table.remove("k2");
    assertEquals(removed, "v2");
    assertEquals(table.get("k2"), null);
  }
}
