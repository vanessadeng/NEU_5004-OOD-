package problem1;

import java.util.Objects;

/**
 * AbstractFoodItem is an abstract class that extends AbstractFoodItem and contains all information
 */
public abstract class AbstractFoodItem implements IAbstractFoodItem{


  protected String name;
  protected Double currentPricePerUnit;
  protected Integer availableQuantity;

  /**
   * @param name name of the food item
   * @param currentPricePerUnit current price per unit of the food item
   * @param availableQuantity available quantity of the food item
   */
  public AbstractFoodItem(String name, Double currentPricePerUnit, Integer availableQuantity) {
    this.name = name;
    this.currentPricePerUnit = currentPricePerUnit;
    this.availableQuantity = availableQuantity;
  }

  /**
   * @return name of the food item
   */
  public String getName() {
    return name;
  }


  /**
   * @return current price per unit of the food item
   */
  public Double getCurrentPricePerUnit() {
    return currentPricePerUnit;
  }


  /**
   * @return available quantity of the food item
   */
  public Integer getAvailableQuantity() {
    return availableQuantity;
  }


  /**
   * @param o object to be compared
   * @return true if two objects are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AbstractFoodItem that)) {
      return false;
    }
    return Objects.equals(getName(), that.getName()) && Objects.equals(
        getCurrentPricePerUnit(), that.getCurrentPricePerUnit()) && Objects.equals(
        getAvailableQuantity(), that.getAvailableQuantity());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getCurrentPricePerUnit(), getAvailableQuantity());
  }

  @Override
  public String toString() {
    return "AbstractFoodItem{" +
        "name='" + name + '\'' +
        ", currentPricePerUnit=" + currentPricePerUnit +
        ", availableQuantity=" + availableQuantity +
        '}';
  }
}

