package code.MyPokemons;

import code.PokemonsAttacks.*;
import ru.ifmo.se.pokemon.*;


public class Swadloon extends Sewaddle {
    public Swadloon(String name, int lvl) {
        super(name, lvl);
        setMove(new Swagger(), new CalmMind(), new GrassWhistle());
        setStats(55, 63, 90, 50, 80, 42);
        setType(Type.BUG, Type.GRASS);
    }
}


