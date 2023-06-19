package problem2;

public abstract class AbstractPiece implements IPiece{

  protected Name name;
  protected Integer age;
  private static final Integer MAX_AGE = 128;
  private static final Integer MIN_AGE = 0;

  public AbstractPiece(Name name, Integer age) throws InvalidAgeException {
    if (age < MIN_AGE || age > MAX_AGE) {
      throw new InvalidAgeException("provided age is invalid");
    }
    this.name = name;
    this.age = age;
  }
}
