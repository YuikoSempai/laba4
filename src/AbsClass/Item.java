package src.AbsClass;

import src.Location;

public abstract class Item extends Thing {
    abstract public void use(String s);
    abstract public String getStatus();

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
