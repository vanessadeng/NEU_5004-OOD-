package problem1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * AbstractPerishableFoodItem is an abstract class that extends AbstractFoodItem. It contains
 */
public abstract class AbstractPerishableFoodItem extends AbstractFoodItem{
  protected LocalDate orderDate;
  protected LocalDate expirationDate;
  protected static final Integer MAX_ALLOWED_QUANTITY = 100;


  /**
   * @param name name of the food item
   * @param currentPricePerUnit current price per unit of the food item
   * @param availableQuantity available quantity of the food item
   * @param orderDate order date of the food item
   * @param expirationDate expiration date of the food item
   */
  public AbstractPerishableFoodItem(String name, Double currentPricePerUnit,
      Integer availableQuantity, LocalDate orderDate, LocalDate expirationDate) {
    super(name, currentPricePerUnit, availableQuantity);
    this.orderDate = orderDate;
    this.expirationDate = expirationDate;
  }

  /**
   * @return order date of the food item
   */
  public LocalDate getOrderDate() {
    return orderDate;
  }


  /**
   * @return expiration date of the food item
   */
  public LocalDate getExpirationDate() {
    return expirationDate;
  }


  /**
   * @param o object to be compared with this object
   * @return true if two objects are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AbstractPerishableFoodItem that)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return Objects.equals(getOrderDate(), that.getOrderDate()) && Objects.equals(
        getExpirationDate(), that.getExpirationDate());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getOrderDate(), getExpirationDate());
  }

  @Override
  public String toString() {
    return "AbstractPerishableFoodItem{" +
        "orderDate=" + orderDate +
        ", expirationDate=" + expirationDate +
        '}';
  }
}
