package src.Interfaces;

import src.Location;
import src.AbsClass.Item;

public interface PersonInterface {

    public void move(Location loc);

    public void sayPhrase(String phrase);

    public void moveItem(Item predmet, Location loc);
}
