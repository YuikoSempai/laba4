package src.absClass;

import src.Location;

public class Item extends Thing {
    public void setLocation(Location loc) {
        this.location = loc;
    }

    public Item(final String name, final Location loc) {
        this.name = name;
        try {
            loc.addThing(this);
            this.location = loc;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
