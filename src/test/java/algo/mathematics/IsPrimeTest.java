package algo.mathematics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsPrimeTest {
  @Test
  void test2NotPrime() {
    assertTrue(IsPrime.run(2), "2 is a prime");
  }
}
