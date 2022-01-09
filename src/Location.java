package src;

import java.util.ArrayList;
import src.Interfaces.LocationInterface;
import src.AbsClass.*;

public class Location implements LocationInterface {

    final String name;
    public int count = 0;
    final private static int maxPersonCount = 5;

    @Override
    public int getCount() {
        return this.count;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Thing> listThing = new ArrayList<Thing>();

    public ArrayList<Thing> getAllThing() throws ArrayListException {
        if (this.listThing.size() == 0) {
            throw new ArrayListException(this.name + " is empty");
        }
        return this.listThing;
    }

    @Override
    public void addThing(final Thing o1) throws LocationOverFlow {
        if (count != Location.maxPersonCount) {
            this.count += 1;
            this.listThing.add(o1);
        } else {
            throw new LocationOverFlow(o1.getName() + " не может быть добавлен в локацию " + this.getName());
        } // Попробовать выкинуть ошибку!

    }

    public Location(final String name) {
        this.name = name;
    }

    public Location(final String name, final int count) {
        this.name = name;
        this.count = count;
    }

    public static class LocationInfo {

        public static int getMaxCountPerson() {
            return maxPersonCount;
        }
    }
}
