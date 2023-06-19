import java.util.Objects;

/**
 * RoofGutterCleaning.java is a class that extends Exterior.java
 */
public class RoofGutterCleaning extends Exterior{

    private Double squareFootageOfRoof;
    private Enum typeOfRoof;

    private static final Double ADDITIONAL_RATE_BAR = 3000.0;
    private static final Double ADDITIONAL_RATE_PER_HOUR = 50.0;
    private static final Double ADDITIONAL_FEE = 200.0;

    /**
     * @param propertyAddress The address of the property
     * @param propertySize The size of the property
     * @param isMonthlyService If the service is monthly service or not
     * @param numPastServices The number of past services
     * @param estimatedHours The estimated hours
     * @param squareFootageOfRoof The square footage of the roof
     * @param typeOfRoof The type of the roof
     * @throws RoofSquareNonPositiveException if the square footage of the roof is not positive
     */
    public RoofGutterCleaning(String propertyAddress, Enum propertySize, Boolean isMonthlyService, Integer numPastServices, Integer estimatedHours, Double squareFootageOfRoof, Enum typeOfRoof) throws RoofSquareNonPositiveException
    {
        super(propertyAddress, propertySize, isMonthlyService, numPastServices, estimatedHours);
        if (squareFootageOfRoof <= 0) {
            throw new RoofSquareNonPositiveException("Roof square footage must be positive!");
        }
        this.squareFootageOfRoof = squareFootageOfRoof;
        this.typeOfRoof = typeOfRoof;
    }


    /**
     * @return the price of the service
     */
    public double calculatePrice() {
        Double price = BASE_RATE*this.estimatedHours*(1 - this.discountRate);
        if (this.squareFootageOfRoof > ADDITIONAL_RATE_BAR) {
            price += ADDITIONAL_RATE_PER_HOUR*(this.squareFootageOfRoof - ADDITIONAL_RATE_BAR);
        }
        if (this.typeOfRoof == TypeOfRoof.MANSARD) {
            price += ADDITIONAL_FEE;
        }
        return price;
    }

    public Double getSquareFootageOfRoof() {
        return squareFootageOfRoof;
    }

    public Enum getTypeOfRoof() {
        return typeOfRoof;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RoofGutterCleaning that = (RoofGutterCleaning) o;
        return Objects.equals(squareFootageOfRoof, that.squareFootageOfRoof) && Objects.equals(typeOfRoof, that.typeOfRoof);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), squareFootageOfRoof, typeOfRoof);
    }

    @Override
    public String toString() {
        return "RoofGutterCleaning{" +
                "squareFootageOfRoof=" + squareFootageOfRoof +
                ", typeOfRoof=" + typeOfRoof +
                '}';
    }
}
