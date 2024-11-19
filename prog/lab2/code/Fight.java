package code;
import ru.ifmo.se.pokemon.*;
import code.MyPokemons.*;

public class Fight {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon pokemon1 = new HoopaConfined("Хупа", 4);
        Pokemon pokemon2 = new Blitze("Блитз", 3);
        Pokemon pokemon3 = new Zebstrika("Зебра", 4);
        Pokemon pokemon4 = new Sewaddle("Сева", 2);
        Pokemon pokemon5 = new Swadloon("Свад", 3);
        Pokemon pokemon6 = new Leavanny("Лёва", 4);

        battle.addAlly(pokemon1);
        battle.addFoe(pokemon2);
        battle.addFoe(pokemon3);

        battle.addFoe(pokemon4);
        battle.addFoe(pokemon5);
        battle.addFoe(pokemon6);

        battle.go();
    }
}

