package problem2;

import java.util.Objects;

public abstract class Civilian extends AbstractPiece{


  protected Double wealth;
  protected static final Double MIN_WEALTH = 0.0;

  public Civilian(Name name, Integer age, Double wealth) throws InvalidAgeException , InvalidWealthException{

    super(name, age);
    if (wealth < MIN_WEALTH) {
      throw new InvalidWealthException("provided wealth is invalid");
    }
    this.wealth = wealth;
  }

  public Double getWealth() {
    return wealth;
  }

  protected void updateWealth(Double wealth) throws InvalidWealthException{
    if (this.wealth + wealth < MIN_WEALTH) {
      throw new InvalidWealthException("wealth cannot be negative");
    }
    this.wealth = this.wealth + wealth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Civilian civilian)) {
      return false;
    }
    return Objects.equals(getWealth(), civilian.getWealth());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getWealth());
  }

  @Override
  public String toString() {
    return "Civilian{" +
        "wealth=" + wealth +
        ", name=" + name +
        ", age=" + age +
        '}';
  }
}

