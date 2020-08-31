package design.adaptor.case2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test adaptor/case2")
public class AdaptorTest {
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

  @DisplayName("Use the right adaptor")
  @Test
  void testRightAdaptor() {
    Phone phone = new Phone();
    phone.charge(new VoltageAdaptor5V(new VoltageStandard()));
    String output = outputStreamCaptor.toString();
    assertTrue(output.contains("Voltage matched, charging..."));
  }

  @DisplayName("Use the wrong adaptor")
  @Test
  void testWrongAdaptor() {
    Phone phone = new Phone();
    phone.charge(new VoltageAdaptor10V(new VoltageStandard()));
    String output = outputStreamCaptor.toString();
    assertTrue(output.contains("Warning: Voltage not matched!"));
  }
}