package classes.characters;

import enums.Moves;

public class Savage extends Human{
    public Savage(String name) {
        super(name);
    }

    public void move(){
        System.out.println("двигается дикарь");
    }

    public void move(Moves move, String savages) {
        System.out.printf("до отплытия %s %s на берегу\n", savages, move);
    }
}
