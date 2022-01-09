package src;

import src.AbsClass.Thing;
import src.Interfaces.DoorInterface;

public class D_Test extends Thing implements DoorInterface {
    
    private String status = "closed";

    public void close(){
        status = "closed";
        System.out.println("Door is closed now");
    }

    public void open(){
        status = "open";
        System.out.println("Door is open now");
    }

    public String getStatus(){
        return status;
    }

    
}
