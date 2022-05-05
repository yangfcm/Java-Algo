package algo.ds.stack_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/stack_queue/QueueFromStack")
public class QueueFromStackTest {
  private QueueFromStack<Integer> queue;

  @BeforeEach
  public void setUp() {
    queue = new QueueFromStack<Integer>();
  }

  @AfterEach
  public void clean() {
    queue = null;
  }

  @DisplayName("Test enqueue and peek")
  @Test
  public void testEnqueue() {
    queue.enqueue(1);
    assertEquals(queue.peek(), 1);
    queue.enqueue(2);
    assertEquals(queue.peek(), 1);
    queue.enqueue(3);
    assertEquals(queue.peek(), 1);
  }

  @DisplayName("Test dequeue")
  @Test
  public void testDequeue() {
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    assertEquals(queue.dequeue(), 1);
    assertEquals(queue.dequeue(), 2);
    assertEquals(queue.dequeue(), 3);
  }
}

