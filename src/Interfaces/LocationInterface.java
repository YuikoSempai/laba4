package src.Interfaces;

import src.LocationOverFlow;
import src.AbsClass.*;

public interface LocationInterface {
    abstract public void addThing(final Thing o) throws LocationOverFlow;
    public int getCount();
}
