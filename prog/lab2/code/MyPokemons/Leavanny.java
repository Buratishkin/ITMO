package code.MyPokemons;

import code.PokemonsAttacks.*;
import ru.ifmo.se.pokemon.*;


public class Leavanny extends Swadloon {
    public Leavanny(String name, int lvl) {
        super(name, lvl);
        setMove(new Swagger(), new CalmMind(), new GrassWhistle(), new Slash());
        setStats(75, 103, 80, 70, 80, 92);
        setType(Type.BUG, Type.GRASS);
    }
}
