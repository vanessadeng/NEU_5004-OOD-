package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Objects;
class AthleteTest {

  private Name testName;
  private Athlete testAthlete;
  private Athlete otherAthlete;

  @BeforeEach
  void setUp() {
    testName = new Name("Rebecca", "Jane", "Smith");
    testAthlete = new Athlete(testName,5.8,135.0);

  }

  @Test
  void getAthletesName() {
    Name expectedName = new Name("Rebecca","Jane","Smith");
    assertEquals(expectedName,testAthlete.getAthletesName());
  }

  @Test
  void getHeight() {
    assertEquals(5.8, testAthlete.getHeight());
  }

  @Test
  void getWeight() {
    assertEquals(135.0, testAthlete.getWeight());
  }

  @Test
  void getLeague() {
    assertNull(testAthlete.getLeague());
  }

  @Test
  void testEquals_comparisonToSelf() {
    assertTrue(testAthlete.equals(testAthlete));

  }

  @Test
  void testEquals_nullComparison(){
    assertFalse(testAthlete.equals(null));
  }

  @Test
  void testEquals_differentDataTypes() {
    assertFalse(testAthlete.equals(testName));
  }

  @Test
  void testEquals_differentNames() {
    Name otherName = new Name("Allison", "Jane","Smith");
    otherAthlete = new Athlete(otherName,5.8,135.0);
    assertFalse(testAthlete.equals(otherAthlete));
  }

  @Test
  void testEquals_differentHeights() {
    otherAthlete = new Athlete(testName,5.5,135.0);
    assertFalse(testAthlete.equals(otherAthlete));
  }

  @Test
  void testEquals_differentWeights() {
    otherAthlete = new Athlete(testName,5.5,115.0);
    assertFalse(testAthlete.equals(otherAthlete));
  }

  @Test
  void testEquals_sameFields() {
    otherAthlete = new Athlete(testName,5.8,135.0);
    assertTrue(testAthlete.equals(otherAthlete));
  }




  @Test
  void testHashCode() {
    int expectedHashCode = Objects.hash(testAthlete.athletesName,testAthlete.height,
        testAthlete.weight, testAthlete.league);
    assertEquals(expectedHashCode,testAthlete.hashCode());

  }

  @Test
  void testToString() {
    String expectedString = "Athlete{" +
        "athletesName=" + testAthlete.athletesName +
        ", height=" + testAthlete.height +
        ", weight=" + testAthlete.weight +
        ", league='" + testAthlete.league + '\'' +
        '}';
    assertEquals(expectedString,testAthlete.toString());
  }
}