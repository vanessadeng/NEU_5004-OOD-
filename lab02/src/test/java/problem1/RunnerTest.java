package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RunnerTest {

  Runner testRunner;
  Name expectedName;
  Double expected5KTime;
  Double expectedHalfMarathonTime;
  String expectedFavoriteEvent;
  @BeforeEach
  void setUp() {
    Name name = new Name("Allyson", "Michelle", "Felix");
    testRunner = new Runner(name, 168.0, 95.0, "US Track and Field", 35.0, 178.0, "Olympics");
    expectedName = new Name("Allyson", "Michelle", "Felix");
    expected5KTime = 35.0;
    expectedHalfMarathonTime = 178.0;
    expectedFavoriteEvent = "Olympics";
  }

  @Test
  void getBest5KTime() {
    assertEquals(expected5KTime,testRunner.getBest5KTime());
  }

  @Test
  void getBestHalfMarathonTime() {
    assertEquals(expectedHalfMarathonTime,testRunner.getBestHalfMarathonTime());
  }

  @Test
  void getFavoriteRunningEvent() {
    assertEquals(expectedFavoriteEvent,testRunner.getFavoriteRunningEvent());
  }

  @Test
  void testEquals_Different5KTime() {
    Name newName = new Name("Allyson", "Michelle", "Felix");
    Runner newTestRunner = new Runner(newName, 168.0, 95.0, "US Track and Field", 25.0, 178.0,
        "Olympics");
    assertFalse(testRunner.equals(newTestRunner));
  }

  @Test
  void testEquals_DifferentHalfMarathonTime() {
    Name newName = new Name("Allyson", "Michelle", "Felix");
    Runner newTestRunner = new Runner(newName, 168.0, 95.0, "US Track and Field", 35.0, 165.0,
        "Olympics");
    assertFalse(testRunner.equals(newTestRunner));
  }

  @Test
  void testEquals_DifferentVenue() {
    Name newName = new Name("Allyson", "Michelle", "Felix");
    Runner newTestRunner = new Runner(newName, 168.0, 95.0, "US Track and Field", 35.0, 178.0,
        "Rock'n'Roll Marathon");
    assertFalse(testRunner.equals(newTestRunner));
  }
  @Test
  void testEquals() {
  }

  @Test
  void testHashCode() {
    Name newName = new Name("Allyson", "Michelle", "Felix");
    Runner newTestRunner = new Runner(newName, 168.0, 95.0, "US Track and Field", 35.0, 178.0,
        "Olympics");
    assertEquals(newTestRunner.hashCode(), testRunner.hashCode());

  }

  @Test
  void testToString() {
    assertEquals("Runner{best5KTime=35.0, bestHalfMarathonTime=178.0, favoriteRunningEvent='Olympics'}", testRunner.toString());


  }
}