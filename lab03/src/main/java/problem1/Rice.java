package problem1;

/**
 * Rice is a type of AbstractNonPerishableFoodItem with a name, current price per unit, available
 */
public class Rice extends AbstractNonPerishableFoodItem{

  /**
   * @param name            name of the food item
   * @param currentPricePerUnit current price per unit of the food item
   * @param availableQuantity available quantity of the food item
   */
  public Rice(String name, Double currentPricePerUnit, Integer availableQuantity) {
    super(name, currentPricePerUnit, availableQuantity);
  }

  @Override
  public String toString() {
    return "Rice{" +
        "name='" + name + '\'' +
        ", currentPricePerUnit=" + currentPricePerUnit +
        ", availableQuantity=" + availableQuantity +
        '}';
  }
}
