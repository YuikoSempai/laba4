package src.interfaces;

import src.LocationOverFlow;
import src.absClass.*;

public interface LocationInterface {
    abstract public void addThing(final Thing o) throws LocationOverFlow;
    public int getCount();
}
