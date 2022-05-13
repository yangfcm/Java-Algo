package algo.ds.linkedlist;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/linkedlist/Partition")
public class PartitionTest {
  private MyLinkedList<Integer> list;

  @BeforeEach
  public void setUp() {
    list = new MyLinkedList<Integer>();
    list.addLast(3);
    list.addLast(5);
    list.addLast(8);
    list.addLast(10);
    list.addLast(2);
    list.addLast(1);
    list.addLast(9);
  }

  @AfterEach
  public void clean() {
    list = null;
  }

  @DisplayName("Should partition list - case 1")
  @Test
  public void testPartitionWith5() {
    var partitionList = Partition.solution(list, 5);
    assertTrue(partitionList.findAt(0).getData() < 5);
    assertTrue(partitionList.findAt(1).getData() < 5);
    assertTrue(partitionList.findAt(2).getData() < 5);
    assertTrue(partitionList.findAt(3).getData() >= 5);
    assertTrue(partitionList.findAt(4).getData() >= 5);
    assertTrue(partitionList.findAt(5).getData() >= 5);
    assertTrue(partitionList.findAt(6).getData() >= 5);
  }

  @DisplayName("Should partition list - case 2")
  @Test
  public void testPartitionWith9() {
    var partitionList = Partition.solution(list, 9);
    assertTrue(partitionList.findAt(0).getData() < 9);
    assertTrue(partitionList.findAt(1).getData() < 9);
    assertTrue(partitionList.findAt(2).getData() < 9);
    assertTrue(partitionList.findAt(3).getData() < 9);
    assertTrue(partitionList.findAt(4).getData() < 9);
    assertTrue(partitionList.findAt(5).getData() >= 9);
    assertTrue(partitionList.findAt(6).getData() >= 9);
  }
}