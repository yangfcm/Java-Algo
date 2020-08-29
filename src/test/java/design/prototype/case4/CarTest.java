package design.prototype.case4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test prototype/case4 - deepclone")
public class CarTest {
  Car car0;

  @BeforeEach
  public void setUp() {
    Dealer dealer = new Dealer("Johns", "No.1 John St.");
    car0 = new Car("Toyota", "Camery", 2019, dealer);
  }

  @DisplayName("Two instances should have same properties but different address")
  @Test
  void testCarClass() {
    Car car1 = (Car) car0.deepClone();
    assertEquals(car0.toString(), car1.toString());
    assertNotEquals(car0.hashCode(), car1.hashCode());
  }

  @DisplayName("Project instances should have different address")
  @Test
  void testObjectInClass() {
    Car car1 = (Car) car0.deepClone();
    assertNotEquals(car0.getDealer().hashCode(), car1.getDealer().hashCode());
  }
}