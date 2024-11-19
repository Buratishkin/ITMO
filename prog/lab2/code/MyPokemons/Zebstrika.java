package code.MyPokemons;

import code.PokemonsAttacks.*;
import ru.ifmo.se.pokemon.*;

public class Zebstrika extends Blitze {
    public Zebstrika(String name, int lvl) {
        super(name, lvl);
        setMove(new DoubleTeam(), new Swagger(), new TailWhip(), new Overheat());
        setStats(75, 100, 63, 80, 63, 116);
        setType(Type.ELECTRIC);
    }
}
