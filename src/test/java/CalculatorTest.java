import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
//  @BeforeEach
  private JUnitCalculator jUnitCalculator = new JUnitCalculator();


  @Test
  public void testSanityCheck() {
    assertEquals("Hello", "Hello");
  }

  @Test
  public void testSum() {
    assertEquals( 4 , jUnitCalculator.add(2,2) );
    assertEquals(2,jUnitCalculator.add(1,1));
    assertEquals(0,jUnitCalculator.add(-1,1));
    assertEquals(-2,jUnitCalculator.add(-1,-1));
  }

  @Test
  public void testDivision(){
    assertEquals(4, jUnitCalculator.division(4, 1));
    assertEquals(1, jUnitCalculator.division(1, 1));
    assertEquals(0, jUnitCalculator.division(3, 4));
  }

}







