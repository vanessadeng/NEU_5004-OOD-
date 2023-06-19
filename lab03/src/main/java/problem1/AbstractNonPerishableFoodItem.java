package problem1;

/**
 * AbstractNonPerishableFoodItem is an abstract class that extends AbstractFoodItem. It contains
 * all information of an abstract non-perishable food item.
 */
public abstract class AbstractNonPerishableFoodItem extends AbstractFoodItem{

  protected static final Integer MAX_ALLOWED_QUANTITY = 250;

  /**
   * @param name name of the food item
   * @param currentPricePerUnit current price per unit of the food item
   * @param availableQuantity available quantity of the food item
   */
  public AbstractNonPerishableFoodItem(String name, Double currentPricePerUnit,
      Integer availableQuantity) {
    super(name, currentPricePerUnit, availableQuantity);
  }
}
