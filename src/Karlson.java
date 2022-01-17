package src;

import src.absClass.FairyPerson;

public class Karlson extends FairyPerson {

    public Vint vint = new Vint();

    public Karlson(String name, Location loc) {
        super(name, loc);
    }

    public class Vint {
        private String vintStatus = "Off";

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

    public void move(Location loc) {
        loc.addThing(this);
        System.out.println(loc.getCount());
        this.location = loc;
        System.out.println(this.getName() + " переместился в " + this.location.getName());
    }
}
