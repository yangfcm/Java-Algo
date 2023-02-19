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

@DisplayName("Test Assorted/DrawPyramid")
public class DrawPyramidTest {
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
  void testSolution(int num, String pyramid) {
    DrawPyramid.solution(num);
    assertEquals(outputStreamCaptor.toString(), pyramid);
  }

  static Stream<Arguments> dataSource() {
    int num1 = 2;
    String pyramid1 = " # \n###\n";
    int num2 = 3;
    String pyramid2 = "  #  \n ### \n#####\n";
    int num3 = 4;
    String pyramid3 = "   #   \n  ###  \n ##### \n#######\n";
    return Stream.of(Arguments.arguments(num1, pyramid1), Arguments.arguments(num2, pyramid2),
        Arguments.arguments(num3, pyramid3));
  }

}
