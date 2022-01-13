package src;

import src.Interfaces.SayAble;
import src.AbsClass.*;

import java.util.Objects;

public class Person extends Thing implements SayAble {

    public Person(final String name, final Location loc) {
        this.name = name;
        try {
            loc.addThing(this);
            this.location = loc;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setLocation(final Location location) {
        this.location = location;
    }

    @Override
    public void sayPhrase(final String phrase) {
        System.out.println(this.name + ": " + phrase);

    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final Person person = (Person) o;
        return Objects.equals(name, person.name) && (Objects.equals(location, person.location));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, getClass());
    }

    @Override
    public String toString() {
        return this.name + "|" + this.location + this.getClass();
    }

    public void move(Location loc) {
        loc.addThing(this);
        System.out.println(loc.getCount());
        this.location = loc;
        System.out.println(this.getName() + " переместился в " + this.location.getName());
    }

    public void movePredmet(Item predmet, Location loc) {
        predmet.setLocation(loc);
        System.out.println(this.name + " переместил " + predmet.getName() + " в " + loc.getName());
    }
}
