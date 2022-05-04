package algo.ds.stack_queue;

import java.util.LinkedList;

/**
 * @name AnimalQueue
 * @description An animal queue, which holds only dogs and cats, operates on a strictly "fist in, first out" basis.
 * People must adopt either the first of all animals at the shelter,
 * or they can select whether they would prefer the first dog or the first cat(cannot select a specific animal they like)
 * Create the data structures to maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog, dequeueCat.
 */
enum Animal {
  DOG,
  CAT,
};

class AnimalData {
  public Animal animal;
  public int order;
  public AnimalData(Animal animal, int order) {
    this.animal = animal;
    this.order = order;
  }
}

public class AnimalQueue {
  private int order;
  private LinkedList<AnimalData> dogQueue;
  private LinkedList<AnimalData> catQueue;
  public AnimalQueue() {
    order = 0;
    dogQueue = new LinkedList<AnimalData>();
    catQueue = new LinkedList<AnimalData>();
  }

  public void enqueue(Animal data) {
    if(data == Animal.CAT) {
      catQueue.add(new AnimalData(data, this.order));  
    } else if(data == Animal.DOG) {
      dogQueue.add(new AnimalData(data, this.order));
    }
    order++;
  }

  public AnimalData dequeueDog() {
    return dogQueue.poll();
  }

  public AnimalData dequeueCat() {
    return catQueue.poll();
  }

  public AnimalData dequeue() {
    var firstCat = catQueue.peek();
    var firstDog = dogQueue.peek();
    if(firstCat == null && firstDog == null) return null;
    if(firstCat == null && firstDog != null) return dequeueDog();
    if(firstCat != null && firstDog == null) return dequeueCat();
    return firstCat.order < firstDog.order ? dequeueCat() : dequeueDog();
  }
}
