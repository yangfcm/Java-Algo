package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test String/DefangingIP")
public class DefangingIPTest {

  @ParameterizedTest(name = "IP Address {1} is defanged to {2}")
  @MethodSource("dataSource")
  void testSolution(String ipAddress, String expected) {
    assertEquals(expected, DefangingIP.solution(ipAddress));
  }
  
  static Stream<Arguments> dataSource() {
    return Stream.of(
      Arguments.arguments("1.1.1.1", "1[.]1[.]1[.]1"),
      Arguments.arguments("255.100.50.0", "255[.]100[.]50[.]0")
    );
  }
}