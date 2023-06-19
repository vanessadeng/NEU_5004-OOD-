package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BaseballPlayerTest {

  BaseballPlayer testBaseballPlayer;
  String expectedTeam;
  Double expectedAverageBatting;
  Integer expectedSeasonHomeRuns;

  @BeforeEach
  void setUp() {
    Name name = new Name("Aaron","James","Judges");
    testBaseballPlayer = new BaseballPlayer(name, 6.7, 282.0,"MLB","Los Angeles Angels",0.305,8);
    expectedTeam = "Los Angeles Angels";
    expectedAverageBatting = 0.305;
    expectedSeasonHomeRuns = 8;


  }

  @Test
  void getTeam() {
    assertEquals(expectedTeam,testBaseballPlayer.getTeam());


  }

  @Test
  void getAverageBatting() {
    assertEquals(expectedAverageBatting,testBaseballPlayer.getAverageBatting());
  }

  @Test
  void getSeasonHomeRuns() {
    assertEquals(expectedSeasonHomeRuns,testBaseballPlayer.getSeasonHomeRuns());
  }

  @Test
  void testEquals_comparisonToSelf() {
    assertTrue(testBaseballPlayer.equals(testBaseballPlayer));

  }

  @Test
  void testEquals_nullComparison(){
    assertFalse(testBaseballPlayer.equals(null));
  }

  @Test
  void testEquals_DifferentDataTypes(){
    Name expectedName = new Name("Aaron","James","Judges");
    Runner testRunner = new Runner(expectedName,169.0,95.0,"US Track and Field", 35.0,178.0,"Olympics");
    assertFalse(testBaseballPlayer.equals(testRunner));
  }

  @Test
  void testEquals_DifferentTeam() {
    Name newName = new Name("Aaron","James","Judges");
    BaseballPlayer newTestBaseballPlayer = new BaseballPlayer(newName, 6.7, 282.0,"MLB","New York Mets",0.305,8);
    assertFalse(testBaseballPlayer.equals(newTestBaseballPlayer));
  }

  @Test
  void testEquals_DifferentAvgBattingScore() {
    Name newName = new Name("Aaron","James","Judges");
    BaseballPlayer newTestBaseballPlayer = new BaseballPlayer(newName, 6.7, 282.0,"MLB","Los Angeles Angels",0.355,8);
    assertFalse(testBaseballPlayer.equals(newTestBaseballPlayer));
  }

  @Test
  void testEquals_DifferentSeasonHomeRuns() {
    Name newName = new Name("Aaron","James","Judges");
    BaseballPlayer newTestBaseballPlayer = new BaseballPlayer(newName, 6.7, 282.0,"MLB","Los Angeles Angels",0.305,9);
    assertFalse(testBaseballPlayer.equals(newTestBaseballPlayer));
  }




  @Test
  void testHashCode() {
    Name newName = new Name("Aaron","James","Judges");
    BaseballPlayer newTestBaseballPlayer = new BaseballPlayer(newName, 6.7, 282.0,"MLB","Los Angeles Angels",0.305,8);
    assertEquals(newTestBaseballPlayer.hashCode(),testBaseballPlayer.hashCode());


  }

  @Test
  void testToString() {
    String expectedString =  "BaseballPlayer{" +
        "team='" +testBaseballPlayer.getTeam() + '\'' +
        ", averageBatting=" + testBaseballPlayer.getAverageBatting() +
        ", seasonHomeRuns=" + testBaseballPlayer.getSeasonHomeRuns() +
        '}';
    assertEquals(expectedString,testBaseballPlayer.toString());
  }
}