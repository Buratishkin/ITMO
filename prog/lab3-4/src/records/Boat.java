package records;

import classes.characters.Savage;
import enums.WeatherEvents;
import interfaces.Repairable;

import java.util.Random;

public record Boat(Savage[] users) implements Repairable{
    @Override
    public void repair() {
        Random random = new Random(10);
        if (random.nextInt() < 4) {
            System.out.println("Лодка не работает");
        } else {
            System.out.println("Лодка работает");
        }
    }

    @Override
    public String toString() {
        String line = "";
        for (int i = 0; i < this.users.length; i++){
            if (i != this.users.length - 1)
                line += this.users[i].getName() + ", ";
            else {
                line += this.users[i].getName();
            }
        }
        return line;
    }

    public void start(WeatherEvents weatherEvent) {
        System.out.printf("лишь %s %s сели в лодку\n", weatherEvent.toString(), toString());
    }

    public void afterStart() {
        System.out.printf("как только %s отчалили, ", toString());
    }

}
