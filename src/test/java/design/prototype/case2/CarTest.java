package design.prototype.case2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test prototype/case2 - prototype clone")
public class CarTest {
  @DisplayName("Two instances should have same properties but different address")
  @Test
  void testCarClass() {
    Car car0 = new Car("Toyota", "Camery", 2019);
    Car car1 = (Car) car0.clone();
    assertEquals(car0.toString(), car1.toString());
    assertNotEquals(car0.hashCode(), car1.hashCode());
  }
}