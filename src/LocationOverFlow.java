package src;

public class LocationOverFlow extends RuntimeException {
    public LocationOverFlow(String message){
        super(message + " now location = null");
    }
}
