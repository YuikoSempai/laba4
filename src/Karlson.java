package src;

import src.AbsClass.FairyPerson;

public class Karlson extends FairyPerson {

    public Vint vint = new Vint();

    public Karlson(String name, Location loc) {
        super(name, loc);
    }

    public class Vint {
        private String vintStatus = "Off";

        public void setVintStatus(String vintStatus) {
            this.vintStatus = vintStatus;
        }

        public String getVintStatus() {
            return vintStatus;
        }

        public void turnOn() {
            this.vintStatus = "On";
            System.out.println("Vint on");
        }

        public void turnOff() {
            this.vintStatus = "Off";
            System.out.println("Vint off");
        }
    }
}
