package problem1;

import java.time.LocalDate;

/**
 * Vegetable is a type of AbstractPerishableFoodItem with a name, current price per unit, available
 * quantity
 */
public class Vegetable extends AbstractPerishableFoodItem{

  /**
   * @param name              name of the food item
   * @param currentPricePerUnit current price per unit of the food item
   * @param availableQuantity available quantity of the food item
   * @param orderDate       order date of the food item
   * @param expirationDate  expiration date of the food item
   */
  public Vegetable(String name, Double currentPricePerUnit, Integer availableQuantity,
      LocalDate orderDate, LocalDate expirationDate) {
    super(name, currentPricePerUnit, availableQuantity, orderDate, expirationDate);
  }

  @Override
  public String toString() {
    return "Vegetable{" +
        "orderDate=" + orderDate +
        ", expirationDate=" + expirationDate +
        ", name='" + name + '\'' +
        ", currentPricePerUnit=" + currentPricePerUnit +
        ", availableQuantity=" + availableQuantity +
        '}';
  }
}
