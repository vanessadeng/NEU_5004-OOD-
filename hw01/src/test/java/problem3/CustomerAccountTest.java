package problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerAccountTest {
  private static final double CONVERSION_RATE_Dollar = 0.000025;
  private static final double CONVERSION_RATE_CENT = 0.00000025;
  private CustomerAccount testCustomerAccount;
  private Amount testAmount;
  private Identifier testIdentifier;





  @BeforeEach
  void setUp() {
    testAmount = new Amount(10, 20);
    testIdentifier = new Identifier("Vanessa Deng", 1998, "China");
    testCustomerAccount = new CustomerAccount(testAmount, testIdentifier);



  }

  @Test
  void getCurrentAmount() {
    assertEquals(testAmount.getDollarAmount(), testCustomerAccount.getCurrentAmount().getDollarAmount());
    assertEquals(testAmount.getCentAmount(), testCustomerAccount.getCurrentAmount().getCentAmount());

  }

  @Test
  void getIdentifier() {
    Identifier newIdentifier = new Identifier("Vanessa Deng", 1998, "China");
    assertEquals(newIdentifier.getUserName(), testCustomerAccount.getIdentifier().getUserName());
    assertEquals(newIdentifier.getYear(), testCustomerAccount.getIdentifier().getYear());
    assertEquals(newIdentifier.getCountry(), testCustomerAccount.getIdentifier().getCountry());
  }

  @Test
  void deposit() {
    Amount depositAmount = new Amount(35, 44);
    Amount expectedResultAmount = new Amount(45,64);
    CustomerAccount resultAccount = testCustomerAccount.deposit(depositAmount);
    assertEquals(expectedResultAmount.getCentAmount(), resultAccount.getCurrentAmount().getCentAmount());
    assertEquals(expectedResultAmount.getDollarAmount(), resultAccount.getCurrentAmount().getDollarAmount());

  }

  @Test
  void withdraw() {
    Amount withdrawAmount = new Amount(10, 9);
    Amount expectedResultAmount = new Amount(0, 11);
    CustomerAccount resultAccount = testCustomerAccount.withdraw(withdrawAmount);
    assertEquals(expectedResultAmount.getCentAmount(), resultAccount.getCurrentAmount().getCentAmount());
    assertEquals(expectedResultAmount.getDollarAmount(), resultAccount.getCurrentAmount().getDollarAmount());
  }

  @Test
  void convert() {
    double expectedBTC = CONVERSION_RATE_Dollar * testAmount.getDollarAmount() + CONVERSION_RATE_CENT * testAmount.getCentAmount();
    assertEquals(expectedBTC, testCustomerAccount.convert(testAmount), 0.000255);



  }
}