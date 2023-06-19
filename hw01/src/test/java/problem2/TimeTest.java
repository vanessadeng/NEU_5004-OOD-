package problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TimeTest {

  private Time testTime;

  @BeforeEach
  void setUp() {
    testTime = new Time(4,15,19);
  }

  @Test
  void getHour() {
    assertEquals(4,testTime.getHour());
  }

  @Test
  void setHour() {
    testTime.setHour(14);
    assertEquals(14,testTime.getHour());
  }

  @Test
  void getMinute() {
    assertEquals(15, testTime.getMinute());
  }

  @Test
  void setMinute() {
    testTime.setMinute(20);
    assertEquals(20,testTime.getMinute());
  }

  @Test
  void getSecond() {
    assertEquals(19, testTime.getSecond());
  }

  @Test
  void setSecond() {
    testTime.setSecond(50);
    assertEquals(50,testTime.getSecond());
  }
}