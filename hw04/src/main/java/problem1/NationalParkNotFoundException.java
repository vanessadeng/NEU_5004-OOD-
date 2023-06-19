package problem1;

/**
 * Class NationalParkNotFoundException is a type of exception that is thrown when the national park is not found in the directory
 */
public class NationalParkNotFoundException extends Exception{
    public NationalParkNotFoundException(String message){
        super(message);
    }
}
