package algo.ds.stack_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test ds/stack_queue/AnimalQueue")
public class AnimalQueueTest {
  private AnimalQueue animalQueue;

  @BeforeEach
  public void setUp() {
    animalQueue = new AnimalQueue();
    animalQueue.enqueue(Animal.CAT);
    animalQueue.enqueue(Animal.DOG);
    animalQueue.enqueue(Animal.DOG);
    animalQueue.enqueue(Animal.DOG);
    animalQueue.enqueue(Animal.CAT);
    animalQueue.enqueue(Animal.CAT);
    animalQueue.enqueue(Animal.DOG);
  }

  @AfterEach
  public void clean() {
    animalQueue = null;
  }

  @DisplayName("Test dequeue method.")
  @Test
  public void testDequeue() {
    assertEquals(animalQueue.dequeue().animal, Animal.CAT);
    assertEquals(animalQueue.dequeue().animal, Animal.DOG);
    assertEquals(animalQueue.dequeue().animal, Animal.DOG);
    assertEquals(animalQueue.dequeue().animal, Animal.DOG);
    assertEquals(animalQueue.dequeue().animal, Animal.CAT);
    assertEquals(animalQueue.dequeue().animal, Animal.CAT);
    assertEquals(animalQueue.dequeue().animal, Animal.DOG);
    assertEquals(animalQueue.dequeue(), null);
  }

  @DisplayName("Test dequeueCat method")
  @Test
  public void testDequeueCat() {
    assertEquals(animalQueue.dequeueCat().animal, Animal.CAT);
    assertEquals(animalQueue.dequeueCat().animal, Animal.CAT);
    assertEquals(animalQueue.dequeueCat().animal, Animal.CAT);
    assertEquals(animalQueue.dequeueCat(), null);
  }

  @DisplayName("Test dequeueDog method")
  @Test
  public void testDequeueDog() {
    assertEquals(animalQueue.dequeueDog().animal, Animal.DOG);
    assertEquals(animalQueue.dequeueDog().animal, Animal.DOG);
    assertEquals(animalQueue.dequeueDog().animal, Animal.DOG);
    assertEquals(animalQueue.dequeueDog().animal, Animal.DOG);
    assertEquals(animalQueue.dequeueDog(), null);
  }
}
