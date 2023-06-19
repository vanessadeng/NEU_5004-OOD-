package problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IdentifierTest {
  private Identifier testIdentifier;

  @BeforeEach
  void setUp() {
    testIdentifier = new Identifier("Vanessa Deng", 1998, "China");
  }

  @Test
  void getUserName() {
    assertEquals("Vanessa Deng", testIdentifier.getUserName());
  }

  @Test
  void getYear() {
    assertEquals(1998, testIdentifier.getYear());
  }

  @Test
  void getCountry() {
    assertEquals("China", testIdentifier.getCountry());
  }
}