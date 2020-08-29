package design.prototype.case1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test prototype/case1")
public class CarTest {

  @DisplayName("Two instances should have same properties but different address")
  @Test
  void testCarClass() {
    Car car0 = new Car("Toyota", "Camery", 2019);
    Car car1 = new Car(car0.getMake(), car0.getModel(), car0.getYear());
    assertEquals(car0.toString(), car1.toString());
    assertNotEquals(car0.hashCode(), car1.hashCode());
  }
}