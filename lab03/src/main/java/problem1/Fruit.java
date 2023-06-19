package problem1;

import java.time.LocalDate;

public class Fruit extends AbstractPerishableFoodItem{

  public Fruit(String name, Double currentPricePerUnit, Integer availableQuantity,
      LocalDate orderDate, LocalDate expirationDate) {
    super(name, currentPricePerUnit, availableQuantity, orderDate, expirationDate);
  }

  @Override
  public String toString() {
    return "Fruit{" +
        "orderDate=" + orderDate +
        ", expirationDate=" + expirationDate +
        ", name='" + name + '\'' +
        ", currentPricePerUnit=" + currentPricePerUnit +
        ", availableQuantity=" + availableQuantity +
        '}';
  }
}
