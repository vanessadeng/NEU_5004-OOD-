package problem3;

/**
 * Class CustomerAccount represents a customer's account, including the current amount and the
 */
public class CustomerAccount {

  private static final double CONVERSION_RATE_Dollar = 0.000025;
  private static final double CONVERSION_RATE_CENT = 0.00000025;
  private static final int MAX_CONVERT = 100;

  private final Amount currentAmount;
  private final Identifier identifier;


  /**
   * @param currentAmount current amount
   * @param identifier identifier
   */
  public CustomerAccount(Amount currentAmount, Identifier identifier) {
    this.currentAmount = currentAmount;
    this.identifier = identifier;
  }


  /**
   * getter for current amount
   * @return current amount stored in Amount object
   */
  public Amount getCurrentAmount() {
    return currentAmount;
  }

  /**
   * getter for identifier
   * @return identifier stored in Identifier object
   */
  public Identifier getIdentifier() {
    return identifier;
  }

  /**
   * @param depositAmount deposit amount
   * @return updated customer account
   */
  public CustomerAccount deposit(Amount depositAmount){
    Amount updatedAmount = new Amount(0,0);

    updatedAmount.setDollarAmount(currentAmount.getDollarAmount()+depositAmount.getDollarAmount()+(currentAmount.getCentAmount() + depositAmount.getCentAmount())/MAX_CONVERT);
    updatedAmount.setCentAmount((currentAmount.getCentAmount()+depositAmount.getCentAmount())%MAX_CONVERT);
    return new CustomerAccount(updatedAmount,identifier);


  }

  /**
   * @param withdrawAmount withdraw amount
   * @return updated customer account
   */
  public CustomerAccount withdraw(Amount withdrawAmount){
    Amount updatedAmount = new Amount(0,0);
    if (withdrawAmount.getCentAmount() >= MAX_CONVERT){
      updatedAmount.setCentAmount(withdrawAmount.getCentAmount()%MAX_CONVERT);
      updatedAmount.setDollarAmount(withdrawAmount.getDollarAmount()+withdrawAmount.getCentAmount()/MAX_CONVERT);
    }
    if (withdrawAmount.getCentAmount() > currentAmount.getCentAmount()){
      updatedAmount.setDollarAmount(currentAmount.getDollarAmount()-withdrawAmount.getDollarAmount()-1);
      updatedAmount.setCentAmount(MAX_CONVERT+currentAmount.getCentAmount()-withdrawAmount.getCentAmount());
    }
    else{
      updatedAmount.setDollarAmount(currentAmount.getDollarAmount()-withdrawAmount.getDollarAmount());
      updatedAmount.setCentAmount(currentAmount.getCentAmount()-withdrawAmount.getCentAmount());
    }
    return new CustomerAccount(updatedAmount,identifier);
  }

  /**
   * @param convertAmount convert amount
   * @return converted amount
   */
  public double convert(Amount convertAmount){
    return convertAmount.getDollarAmount()*CONVERSION_RATE_Dollar+convertAmount.getCentAmount()*CONVERSION_RATE_CENT;

  }


}
