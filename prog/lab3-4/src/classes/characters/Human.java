package classes.characters;

import interfaces.Moveable;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Human human = (Human) obj;
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "человек" + name;
    }
}
