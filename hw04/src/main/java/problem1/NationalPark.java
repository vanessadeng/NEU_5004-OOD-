package problem1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 * Class NationalParkDirectory contains information about a directory of US national parks
 */
/*
Class NationalPark contain information about an individual US national park
 */
public class NationalPark {

    private String nationalParkID;
    private String nationalParkName;
    private String state;
    private Double area;
    private LocalDate dateParkFounded;
    private String[] visitorCenters;
    private Boolean openYearRound;

    /**
     * @param nationalParkID  unique ID of the national park
     * @param nationalParkName name of the national park
     * @param state          state where the national park is located
     * @param area          area of the national park in square miles
     * @param dateParkFounded date the national park was founded
     * @param visitorCenters array of visitor centers in the national park
     * @param openYearRound whether the national park is open year round
     */
    public NationalPark(String nationalParkID, String nationalParkName, String state, Double area,
                        LocalDate dateParkFounded, String[] visitorCenters, Boolean openYearRound) {
        this.nationalParkID = nationalParkID;
        this.nationalParkName = nationalParkName;
        this.state = state;
        this.area = area;
        this.dateParkFounded = dateParkFounded;
        this.visitorCenters = visitorCenters;
        this.openYearRound = openYearRound;
    }

    /**
     * @return unique ID of the national park
     */
    public String getNationalParkID() {
        return nationalParkID;
    }

    /**
     * @return name of the national park
     */
    public String getNationalParkName() {
        return nationalParkName;
    }

    /**
     * @return state where the national park is located
     */
    public String getState() {
        return state;
    }

    /**
     * @return area of the national park in square miles
     */
    public Double getArea() {
        return area;
    }

    /**
     * @return date the national park was founded
     */
    public LocalDate getDateParkFounded() {
        return dateParkFounded;
    }

    /**
     * @return array of visitor centers in the national park
     */
    public String[] getVisitorCenters() {
        return visitorCenters;
    }

    /**
     * @return whether the national park is open year round
     */
    public Boolean getOpenYearRound() {
        return openYearRound;
    }

    /**
     * @param o object to be compared
     * @return true if the two objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NationalPark)) return false;
        NationalPark that = (NationalPark) o;
        return Objects.equals(getNationalParkID(), that.getNationalParkID()) &&
                Objects.equals(getNationalParkName(), that.getNationalParkName()) &&
                Objects.equals(getState(), that.getState()) &&
                Objects.equals(getArea(), that.getArea()) &&
                Objects.equals(getDateParkFounded(), that.getDateParkFounded()) &&
                Arrays.equals(getVisitorCenters(), that.getVisitorCenters()) &&
                Objects.equals(getOpenYearRound(), that.getOpenYearRound());
    }

    /**
     * @return hashcode of the object
     */
    @Override
    public int hashCode() {
        int result = Objects.hash(getNationalParkID(), getNationalParkName(),
                getState(), getArea(), getDateParkFounded(), getOpenYearRound());
        result = 31 * result + Arrays.hashCode(getVisitorCenters());
        return result;
    }

    /**
     * @return string representation of the object
     */
    @Override
    public String toString() {
        return "NationalPark{" +
                "nationalParkID='" + nationalParkID + '\'' +
                ", nationalParkName='" + nationalParkName + '\'' +
                ", state='" + state + '\'' +
                ", area=" + area +
                ", dateParkFounded=" + dateParkFounded +
                ", visitorCenters=" + Arrays.toString(visitorCenters) +
                ", openYearRound=" + openYearRound +
                '}';
    }
}
