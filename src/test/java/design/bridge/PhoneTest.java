package design.bridge;

import design.bridge.phone.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test bridge/phone")
public class PhoneTest {
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

  @DisplayName("Test Folded Samsung phone")
  @Test
  void testFoldedSamsungPhone() {
    Phone testPhone = new FoldedPhone(new SamsungPhone());
    testPhone.call();
    String output = outputStreamCaptor.toString();
    assertTrue(output.contains("Folded phone"));
    assertTrue(output.contains("Calling with Samsung"));
  }

  @DisplayName("Test Folded Nokia phone")
  @Test
  void testFoldedNokiaPhone() {
    Phone testPhone = new FoldedPhone(new NokiaPhone());
    testPhone.call();
    String output = outputStreamCaptor.toString();
    assertTrue(output.contains("Folded phone"));
    assertTrue(output.contains("Calling in Nokia"));
  }

  @DisplayName("Test Upright Samsung phone")
  @Test
  void testUprightSamsungPhone() {
    Phone testPhone = new UprightPhone(new SamsungPhone());
    testPhone.call();
    String output = outputStreamCaptor.toString();
    assertTrue(output.contains("Upright phone"));
    assertTrue(output.contains("Calling with Samsung"));
  }

  @DisplayName("Test Upright Nokia phone")
  @Test
  void testUprightNokiaPhone() {
    Phone testPhone = new UprightPhone(new NokiaPhone());
    testPhone.call();
    String output = outputStreamCaptor.toString();
    assertTrue(output.contains("Upright phone"));
    assertTrue(output.contains("Calling in Nokia"));
  }
}