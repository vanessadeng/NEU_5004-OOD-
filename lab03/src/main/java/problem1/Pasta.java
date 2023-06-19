package problem1;

/**
 * Pasta is a type of AbstractNonPerishableFoodItem with a name, current price per unit, available
 * quantity
 */
public class Pasta extends AbstractNonPerishableFoodItem{

  /**
   * @param name             name of the food item
   * @param currentPricePerUnit current price per unit of the food item
   * @param availableQuantity available quantity of the food item
   */
  public Pasta(String name, Double currentPricePerUnit, Integer availableQuantity) {
    super(name, currentPricePerUnit, availableQuantity);
  }

  @Override
  public String toString() {
    return "Pasta{" +
        "name='" + name + '\'' +
        ", currentPricePerUnit=" + currentPricePerUnit +
        ", availableQuantity=" + availableQuantity +
        '}';
  }
}
