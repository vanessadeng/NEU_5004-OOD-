package problem2;

public class Soldier extends AbstractPiece{

  protected Double stamina;
  private static final Double MAX_STAMINA = 100.0;
  private static final Double MIN_STAMINA = 0.0;

  public Soldier(Name name, Integer age, Double stamina) throws InvalidAgeException, InvalidStaminaException {
    super(name, age);
    if (stamina < MIN_STAMINA || stamina > MAX_STAMINA) {
      throw new InvalidStaminaException("provided stamina is invalid");
    }
    this.stamina = stamina;
  }
  public void updateStamina(Double stamina) throws InvalidStaminaException{
    if (this.stamina + stamina < MIN_STAMINA || this.stamina + stamina > MAX_STAMINA) {
      throw new InvalidStaminaException("stamina cannot be outside the range of 0 and 100");
    }
    this.stamina = this.stamina + stamina;
  }


}
