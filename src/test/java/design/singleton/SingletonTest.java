package design.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test design/singleton")
public class SingletonTest {

  @DisplayName("Implementation 1: Two instances created on Singleton should be same ")
  @Test()
  public void TestSingleInstance1() {
    SingleInstance1 ins1 = SingleInstance1.getInstance();
    SingleInstance1 ins2 = SingleInstance1.getInstance();
    assertTrue(ins1 == ins2);
    assertEquals(ins1.hashCode(), ins2.hashCode());
  }

  @DisplayName("Implementation 2: Two instances created on Singleton should be same ")
  @Test()
  public void TestSingleInstance2() {
    SingleInstance2 ins1 = SingleInstance2.getInstance();
    SingleInstance2 ins2 = SingleInstance2.getInstance();
    assertTrue(ins1 == ins2);
    assertEquals(ins1.hashCode(), ins2.hashCode());
  }

  @DisplayName("Implementation 3: Two instances created on Singleton should be same ")
  @Test()
  public void TestSingleInstance3() {
    SingleInstance3 ins1 = SingleInstance3.getInstance();
    SingleInstance3 ins2 = SingleInstance3.getInstance();
    assertTrue(ins1 == ins2);
    assertEquals(ins1.hashCode(), ins2.hashCode());
  }

  @DisplayName("Implementation 4: Two instances created on Singleton should be same ")
  @Test()
  public void TestSingleInstance4() {
    SingleInstance4 ins1 = SingleInstance4.getInstance();
    SingleInstance4 ins2 = SingleInstance4.getInstance();
    assertTrue(ins1 == ins2);
    assertEquals(ins1.hashCode(), ins2.hashCode());
  }

  @DisplayName("Implementation 5: Two instances created on Singleton should be same ")
  @Test()
  public void TestSingleInstance5() {
    SingleInstance5 ins1 = SingleInstance5.getInstance();
    SingleInstance5 ins2 = SingleInstance5.getInstance();
    assertTrue(ins1 == ins2);
    assertEquals(ins1.hashCode(), ins2.hashCode());
  }
}