package src.interfaces;

import src.Location;
import src.absClass.Item;

public interface PersonInterface {

    public void move(Location loc);

    public void sayPhrase(String phrase);

    public void moveItem(Item predmet, Location loc);
}
