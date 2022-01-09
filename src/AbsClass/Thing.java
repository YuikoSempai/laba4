package src.AbsClass;

import java.util.Objects;
import src.Location;
import src.Person;

public abstract class Thing {
    protected String name;
    protected Location location;


    
    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getClass());
    }

    @Override
    public String toString() {
        return this.name + "|" + this.getClass();
    }

    public String getName(){
        return this.name;
    }

    public Location getLocation(){
        return this.location;
    }
}
