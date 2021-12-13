
import main.java.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

  private static Calculator calculator;

  @BeforeAll

  public static void setUp(){
    calculator = new Calculator();
  }

  @Test
  public void verifyAddition() {
    //TODO
    assertEquals(45, calculator.addition(25,20),"Result is not correct");
    assertEquals(15, calculator.addition(5,10),"Result is not correct");

  }


  @Test
  public void verifySubtraction() {
    //TODO
    assertEquals(5, calculator.subtract(25,20),"Result is not correct");
    assertEquals(30, calculator.subtract(40,10),"Result is not correct");
  }


  @Test
  public void verifyMultiplication() {
    //TODO
    assertEquals(100, calculator.multiply(5,20),"Result is not correct");
    assertEquals(6, calculator.multiply(3,2),"Result is not correct");
  }

  @Test
  public void verifyDivision() {
    //TODO
    assertEquals(5, calculator.division(20,4),"Result is not correct");
    assertEquals(10, calculator.division(40,4),"Result is not correct");
  }


  @Test
  public void verifyDivisionByZero() {
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
      calculator.division(5, 0);
    });
    assertEquals("Cannot division by zero", exception.getMessage());

  }

}


