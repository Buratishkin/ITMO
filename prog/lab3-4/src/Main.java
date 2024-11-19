import classes.characters.MainCharacter;
import classes.characters.Savage;
import classes.items.Pistol;
import classes.items.Rifle;
import classes.items.Spyglass;
import classes.items.Sword;
import enums.Landscapes;
import enums.Moves;
import enums.WeatherEvents;
import records.Boat;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        //спаун дикарей
        Savage savage1 = new Savage("Угабуга");
        Savage savage2 = new Savage("Агавага");
        Savage savage3 = new Savage("Бугугага");

        Savage[] savages1 = new Savage[]{savage1, savage2, savage3};
        WeatherEvents weatherEvent = getRandomFromEnum(WeatherEvents.values());
        Boat boat1 = new Boat(savages1);
        //лишь <погода> <имена дикарей1> сели в лодку
        boat1.start(weatherEvent);

        Moves move = getRandomFromEnum(Moves.values());
        //до отплытия <имена дикарей1> <действие1> на берегу
        savage1.move(move, boat1.toString());

        MainCharacter mainCharacter = new MainCharacter("Селифан");
        mainCharacter.equip(new Spyglass());
        //я ясно различал в [легкой, тяжелой] трубке как они <действие1>
        mainCharacter.observe(mainCharacter.getItem(0), move);

        int randomInt = random.nextInt(2, 4);
        Landscapes landscape1 = getRandomFromEnum(Landscapes.values());

        //как только они отчалили, я пошёл к <ландшафт> и снарядился
        boat1.afterStart();
        mainCharacter.move(landscape1, 0);
        mainCharacter.equip(new Sword());
        mainCharacter.equip(new Rifle());
        mainCharacter.equip(new Pistol());


        Landscapes landscape2 = getRandomFromEnum(Landscapes.values());
        //и, не теряя времени, отправился к тому <ландшафт2>, откуда открыл первые признаки этих людей
        mainCharacter.move(landscape2, 1);

        Savage savage4 = new Savage("Джагамага");
        Savage savage5 = new Savage("Шугудага");
        Savage savage6 = new Savage("Турунгума");
        Savage[] savages2 = new Savage[]{savage4, savage5, savage6};
        Boat boat2 = new Boat(savages2);
        //добравшись туда, я взглянул в сторону моря и увидел лодку с <имена дикарей2>, направлявшиеся от острова к материку
        mainCharacter.arrive(boat2);
    }
    public static <E> E getRandomFromEnum(E[] values){
        Random random = new Random();
        int randomIndex = random.nextInt(values.length); // Генерируем случайный индекс
        return values[randomIndex];
    }
}