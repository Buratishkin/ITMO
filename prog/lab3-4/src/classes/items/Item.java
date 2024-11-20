package classes.items;

import classes.characters.Human;

import java.util.Objects;
import java.util.Random;

public class Item{
    protected final double weight;

    public Item(double weight){
        this.weight = weight;
    }
    public Item(){
        Random random = new Random();
        this.weight = Math.round(random.nextDouble(10.0, 15.0) * 10) / 10.0;
    }
    public double getWeight(){
        return this.weight;
    }

    public String getSimpleWeight(){
        if (this.weight < 5.0){
            return "легкой";
        } else {
            return "тяжелой";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Item item = (Item) obj;
        return Objects.equals(weight, item.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "предмет" + weight;
    }
}
