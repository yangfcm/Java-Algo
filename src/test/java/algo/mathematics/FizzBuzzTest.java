package algo.mathematics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math/Fizzbuzz")
public class FizzBuzzTest {
  // @Rule
  // public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
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

  @DisplayName("Test Fizzbuzz with number 5")
  @Test
  public void TestFizzBuzzWith5() {
    String printResult = "1\n2\nfizz\n4\nbuzz\n";
    Fizzbuzz.run(5);
    assertEquals(outputStreamCaptor.toString(), printResult);
  }

  @DisplayName("Test Fizzbuzz with number 15")
  @Test
  public void TestFizzBuzzWith15() {
    String printResult = "1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\n11\nfizz\n13\n14\nfizzbuzz\n";
    Fizzbuzz.run(15);
    assertEquals(outputStreamCaptor.toString(), printResult);
  }
}