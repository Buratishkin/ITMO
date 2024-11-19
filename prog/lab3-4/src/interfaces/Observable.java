package interfaces;

import classes.items.Item;
import classes.items.Spyglass;
import enums.Moves;

public interface Observable {
    void observe(Item spyglass, Moves move);
}
