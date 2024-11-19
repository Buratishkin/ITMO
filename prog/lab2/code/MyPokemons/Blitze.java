package code.MyPokemons;

import code.PokemonsAttacks.*;
import ru.ifmo.se.pokemon.*;

public class Blitze extends Pokemon {
    public Blitze(String name, int lvl) {
        super(name, lvl);
        setMove(new DoubleTeam(), new Swagger(), new TailWhip());
        setStats(45, 60, 32, 50, 32, 76);
        setType(Type.ELECTRIC);
    }
}
