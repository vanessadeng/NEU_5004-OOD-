package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbstractFoodItemTest {
  private Rice testRice;

  private Meat testMeat;

  private Pasta testPasta;

  private String expectedName;
  private Double expectedUnitPrice;
  private Integer expectedQuantity;
  private LocalDate expectedOrderDate;
  private LocalDate expectedExpirationDate;




  @BeforeEach
  void setUp() {
    testRice = new Rice("Jasmine Rice", 2.0, 10);
    testMeat = new Meat("Chicken", 5.0, 10, LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 10));
    testPasta = new Pasta("Penne", 3.0, 10);



  }

  @Test
  void getName_Rice() {
    expectedName = "Jasmine Rice";
    assertEquals(expectedName, testRice.getName());
  }
  @Test
  void getName_Meat() {
    expectedName = "Chicken";
    assertEquals(expectedName, testMeat.getName());
  }

  @Test
  void getCurrentPricePerUnit_Rice() {
    expectedUnitPrice = 2.0;
    assertEquals(expectedUnitPrice, testRice.getCurrentPricePerUnit());
  }
  @Test
  void getCurrentPricePerUnit_Meat() {
    expectedUnitPrice = 5.0;
    assertEquals(expectedUnitPrice, testMeat.getCurrentPricePerUnit());
  }

  @Test
  void getAvailableQuantity() {
    expectedQuantity = 10;
    assertEquals(expectedQuantity, testMeat.getAvailableQuantity());
  }

  @Test
  void getOrderDate_Meat() {
    expectedOrderDate = LocalDate.of(2020, 1, 1);
    assertEquals(expectedOrderDate, testMeat.getOrderDate());
  }

  void getExpirationDate() {
    expectedExpirationDate = LocalDate.of(2020, 1, 10);
    assertEquals(expectedExpirationDate, testMeat.getExpirationDate());
  }


  @Test
  void testEquals_SameObject(){
    assertTrue(testRice.equals(testRice));
  }
  @Test
  void testEquals_DifferentObject(){
    assertFalse(testRice.equals(testMeat));

  }

  @Test
  void testEquals_NullObject(){
    assertFalse(testRice.equals(null));
  }

  @Test
  void testEquals_DifferentOrderDate(){
    Meat testMeat2 = new Meat("Chicken", 5.0, 10, LocalDate.of(2020, 1, 2), LocalDate.of(2020, 1, 10));
    assertFalse(testMeat.equals(testMeat2));
  }

  @Test
  void testEquals_DifferentObjectsSameAttribute(){
    Meat testMeat2 = new Meat("Chicken", 5.0, 10, LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 10));
    assertTrue(testMeat.equals(testMeat2));
  }

  @Test
  void testEquals_OtherObjectRice_DifferentName(){
    Rice testRice2 = new Rice("Brown Rice", 2.0, 10);
    assertFalse(testRice.equals(testRice2));
  }
  @Test
  void testEquals_OtherObjectRice_DifferentUnitPrice(){
    Rice testRice2 = new Rice("Jasmine Rice", 3.0, 10);
    assertFalse(testRice.equals(testRice2));
  }

  @Test
  void testEquals_OtherObjectRice_DifferentQuantity(){
    Rice testRice2 = new Rice("Jasmine Rice", 2.0, 11);
    assertFalse(testRice.equals(testRice2));
  }

  @Test
  void testHashcode_Perishable(){
    Meat testMeat2 = new Meat("Chicken", 5.0, 10, LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 10));
    assertEquals(testMeat.hashCode(), testMeat2.hashCode());
  }






  @Test
  void toString_Rice() {
    String expectedString = "Rice{" +
        "name='" + testRice.getName() + '\'' +
        ", currentPricePerUnit=" + testRice.getCurrentPricePerUnit() +
        ", availableQuantity=" + testRice.getAvailableQuantity() +
        '}';


    assertEquals(expectedString, testRice.toString());
  }
  @Test
  void toString_Pasta() {
    String expectedString = "Pasta{" +
        "name='" + testPasta.getName() + '\'' +
        ", currentPricePerUnit=" + testPasta.getCurrentPricePerUnit() +
        ", availableQuantity=" + testPasta.getAvailableQuantity() +
        '}';

    assertEquals(expectedString, testPasta.toString());
  }
  @Test
  void toString_Meat() {
    String expectedString = "Meat{" +
        "orderDate=" + testMeat.getOrderDate() +
        ", expirationDate=" + testMeat.getExpirationDate() +
        ", name='" + testMeat.getName() + '\'' +
        ", currentPricePerUnit=" + testMeat.getCurrentPricePerUnit() +
        ", availableQuantity=" + testMeat.getAvailableQuantity() +
        '}';

    assertEquals(expectedString, testMeat.toString());
  }

  @Test
  void testGetOrderDate() {
    LocalDate expectedOrderDate = LocalDate.of(2020, 1, 1);
    assertEquals(expectedOrderDate, testMeat.getOrderDate());
  }

  @Test
  void testGetExpirationDate() {
    LocalDate expectedExpirationDate = LocalDate.of(2020, 1, 10);
    assertEquals(expectedExpirationDate, testMeat.getExpirationDate());
  }
}