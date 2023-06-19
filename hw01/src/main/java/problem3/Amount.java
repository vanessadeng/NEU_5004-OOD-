package problem3;

/**
 * Class Amount represents an amount of money, including the dollar amount and cent amount
 */
public class Amount {

  private Integer dollarAmount;
  private Integer centAmount;

  /**
   * @param dollarAmount dollar amount
   * @param centAmount cent amount
   */
  public Amount(Integer dollarAmount, Integer centAmount) {
    this.dollarAmount = dollarAmount;
    this.centAmount = centAmount;
  }

  /**
   * getter for dollar amount
   * @return dollar amoun stored in integer
   */
  public Integer getDollarAmount() {
    return dollarAmount;
  }

  /**
   * setter for dollar amount
   * @param dollarAmount set as dollar amount
   *
   */
  public void setDollarAmount(Integer dollarAmount) {
    this.dollarAmount = dollarAmount;
  }

  /**
   * getter for cent amount
   * @return cent amount stored in integer
   */
  public Integer getCentAmount() {
    return centAmount;
  }

  /**
   * setter for cent amount
   * @param centAmount set as cent amount
   */
  public void setCentAmount(Integer centAmount) {
    this.centAmount = centAmount;
  }


}
