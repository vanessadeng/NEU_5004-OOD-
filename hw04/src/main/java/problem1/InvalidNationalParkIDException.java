package problem1;

/**
 * Interface NationalParkDirectoryInterface contains information about a directory of US national parks
 */
public class InvalidNationalParkIDException extends Exception{

    public InvalidNationalParkIDException(String message){
        super(message);
    }
}
