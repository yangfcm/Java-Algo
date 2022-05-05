package algo.ds.stack_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/stack_queue/Weave")
public class WeaveTest {
  private Queue<Integer> q1;
  private Queue<Integer> q2;

  @BeforeEach
  public void setUp() {
    q1 = new LinkedList<Integer>();
    q2 = new LinkedList<Integer>();
  }

  @AfterEach
  public void clean() {
    q1 = null;
    q2 = null;
  }

  @DisplayName("Should weave two queues as expected - 1")
  @Test
  public void testSolutionCase1() {
    q1.add(1);
    q1.add(2);
    q1.add(3);
    q1.add(4);
    q1.add(5);
    q1.add(6);
    q2.add(100);
    q2.add(200);
    var weavedQ = Weave.solution(q1, q2);
    assertEquals(1, weavedQ.poll());
    assertEquals(100, weavedQ.poll());
    assertEquals(2, weavedQ.poll());
    assertEquals(200, weavedQ.poll());
    assertEquals(3, weavedQ.poll());
    assertEquals(4, weavedQ.poll());
    assertEquals(5, weavedQ.poll());
    assertEquals(6, weavedQ.poll());
  }

  @DisplayName("Should weave two queues as expected - 2")
  @Test
  public void testSolutionCase2() {
    q1.add(1);
    q1.add(2);
    q1.add(3);
    q2.add(100);
    q2.add(200);
    q2.add(300);
    q2.add(400);
    q2.add(500);
    var weavedQ = Weave.solution(q1, q2);
    assertEquals(1, weavedQ.poll());
    assertEquals(100, weavedQ.poll());
    assertEquals(2, weavedQ.poll());
    assertEquals(200, weavedQ.poll());
    assertEquals(3, weavedQ.poll());
    assertEquals(300, weavedQ.poll());
    assertEquals(400, weavedQ.poll());
    assertEquals(500, weavedQ.poll());

  }
  
}
