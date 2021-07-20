import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @BeforeEach
  private JUnitCalculator jUnitCalculator = new JUnitCalculator():


  @Test
  public void testSanityCheck() {
    assertEquals("Hello", "Hello");
  }

  @Test
  public void testSum() {
    assertEquals( 4 , JUnitCalculator.add(2,2) );

  }
}







