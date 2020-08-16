package algo.mathematics;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test Math/IsPrime")
public class IsPrimeTest {

  @ParameterizedTest(name = "Number {0} is tested as a prime number")
  @ValueSource(ints = { 2, 3, 17, 8747 })
  void testPrime(int num) {
    assertTrue(IsPrime.run(num));
  }

  @ParameterizedTest(name = "Number {0} is tested as a non-prime number")
  @ValueSource(ints = { 4, 8, 522 })
  void testNonPrime(int num) {
    assertFalse(IsPrime.run(num));
  }
}
