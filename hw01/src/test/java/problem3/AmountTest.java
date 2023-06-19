package problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AmountTest {

  private Amount testAmount;

  @BeforeEach
  void setUp() {
    testAmount = new Amount(10, 20);

  }

  @Test
  void getDollarAmount() {
    assertEquals(10, testAmount.getDollarAmount());
  }

  @Test
  void setDollarAmount() {
    testAmount.setDollarAmount(20);
    assertEquals(20, testAmount.getDollarAmount());
  }

  @Test
  void getCentAmount() {
    assertEquals(20, testAmount.getCentAmount());
  }

  @Test
  void setCentAmount() {
    testAmount.setCentAmount(30);
    assertEquals(30, testAmount.getCentAmount());
  }
}