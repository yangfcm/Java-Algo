package algo.assorted;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test Assorted/DrawSteps")
public class DrawStepsTest {
  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }

  @AfterEach
  public void tearDown() {
    System.setOut(standardOut);
  }

  @ParameterizedTest(name = "With number {0}, should draw {1}")
  @MethodSource("dataSource")
  void testSolution(int num, String step) {
    DrawSteps.solution(num);
    assertEquals(outputStreamCaptor.toString(), step);
  }

  static Stream<Arguments> dataSource() {
    int num1 = 2;
    String step1 = "# \r\n##\r\n";
    int num2 = 3;
    String step2 = "#  \r\n## \r\n###\r\n";
    int num3 = 4;
    String step3 = "#   \r\n##  \r\n### \r\n####\r\n";
    return Stream.of(Arguments.arguments(num1, step1), Arguments.arguments(num2, step2),
        Arguments.arguments(num3, step3));
  }

}
