package src;

import java.util.ArrayList;

import src.absClass.*;
import src.interfaces.LocationInterface;

public class Location implements LocationInterface {

    final String name;
    private int count = 0;
    private static int maxThingCount = 5;

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
    public void addThing(final Thing o1){
        if (count != Location.maxThingCount) {
            this.count += 1;
            this.listThing.add(o1);
        } else {
            throw new LocationOverFlow(o1.getName() + " не может быть добавлен в локацию " + this.getName());
        }

    }

    public Location(final String name) {
        this.name = name;
    }

    public static class LocationInfo {

        public static int getMaxThingCount() {
            return maxThingCount;
        }
    }
}
