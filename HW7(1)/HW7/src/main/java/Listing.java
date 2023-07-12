import java.util.Objects;

/**
 * @param <P> Property type (House, Condo, etc.)
 * @param <C> Contract type (Sale, Rental, etc.)
 */
public class Listing<P extends Property, C extends Contract>{

    private P property;
    private C contract;

    /**
     * @param property  Property to list
     * @param contract Contract to list
     */
    public Listing(P property, C contract) {
        this.property = property;
        this.contract = contract;
    }

    /**
     * @return Property as P
     */
    public P getProperty() {
        return property;
    }

    /**
     * @return Contract as C
     */
    public C getContract() {
        return contract;
    }

    /**
     * @param o Object to compare to
     * @return Whether objects are equal as Boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Listing<?, ?> listing = (Listing<?, ?>) o;
        return Objects.equals(property, listing.property) && Objects.equals(contract,
            listing.contract);
    }

    /**
     * @return Hash code as Integer
     */
    @Override
    public int hashCode() {
        return Objects.hash(property, contract);
    }

    /**
     * @return String representation of object
     */
    @Override
    public String toString() {
        return "Listing{" +
            "property=" + property +
            ", contract=" + contract +
            '}';
    }
}
