package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeliveryTest {

  private Delivery testDelivery;


  @BeforeEach
  void setUp() {
    Time testStartTime = new Time(12, 30, 40);
    Time testEndTime = new Time(14, 50, 26);
    testDelivery = new Delivery("Beijing","Shenzhen", testStartTime, testEndTime);

  }

  @Test
  void getStartingLocation() {
    String expectedStartingLocation = "Beijing";

    assertEquals(expectedStartingLocation,testDelivery.getStartingLocation());


  }

  @Test
  void setStartingLocation() {

    testDelivery.setStartingLocation("Shanghai");
    assertEquals("Shanghai",testDelivery.getStartingLocation());
  }

  @Test
  void getEndLocation() {
    String expectedEndLocation = "Shenzhen";

    assertEquals(expectedEndLocation,testDelivery.getEndLocation());

  }

  @Test
  void setEndLocation() {
    testDelivery.setEndLocation("Guangzhou");
    assertEquals("Guangzhou",testDelivery.getEndLocation());
  }

  @Test
  void getStartTime() {
    Time expectedStartTime = new Time(12,30,40);
    assertEquals(expectedStartTime.getHour(),testDelivery.getStartTime().getHour());
    assertEquals(expectedStartTime.getMinute(),testDelivery.getStartTime().getMinute());
    assertEquals(expectedStartTime.getSecond(),testDelivery.getStartTime().getSecond());
  }

  @Test
  void setStartTime() {
    Time newStartTime = new Time(15,30,26);
    testDelivery.setStartTime(newStartTime);
    assertEquals(newStartTime,testDelivery.getStartTime());
  }

  @Test
  void getEndTime() {
    Time expectedEndTime = new Time(14,50,26);
    assertEquals(expectedEndTime.getHour(),testDelivery.getEndTime().getHour());
    assertEquals(expectedEndTime.getMinute(),testDelivery.getEndTime().getMinute());
    assertEquals(expectedEndTime.getSecond(),testDelivery.getEndTime().getSecond());
  }

  @Test
  void setEndTime() {
    Time newEndTime = new Time(17,20,25);
    testDelivery.setEndTime(newEndTime);
    assertEquals(newEndTime,testDelivery.getEndTime());

  }

  @Test
  void getDuration() {
    Time expectedDuration = new Time(2,19,46);
    assertEquals(expectedDuration.getHour(),testDelivery.getDuration().getHour());
    assertEquals(expectedDuration.getMinute(),testDelivery.getDuration().getMinute());
    assertEquals(expectedDuration.getSecond(),testDelivery.getDuration().getSecond());
  }
}