package classes.characters;

import enums.Landscapes;
import enums.Moves;
import interfaces.Moveable;

public abstract class Human implements Moveable {
    abstract public void move();

    protected final String name;
    Human(){
        this.name = "безымённый";
    }
    Human(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
