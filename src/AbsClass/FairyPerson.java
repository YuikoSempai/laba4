package src.absClass;

import src.Location;

public abstract class FairyPerson extends Thing {

    public FairyPerson(final String name, final Location loc) {
        this.name = name;
        this.location = loc;
    }
}