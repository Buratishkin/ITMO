package records;

import classes.characters.Savage;
import enums.WeatherEvents;

public record Boat(Savage[] users) {
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
        System.out.printf("лишь %s %s сели в лодку\n", weatherEvent, toString());
    }

    public void afterStart() {
        System.out.printf("как только %s отчалили, ", toString());
    }

}
