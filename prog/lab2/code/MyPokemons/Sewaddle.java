package code.MyPokemons;

import code.PokemonsAttacks.*;
import ru.ifmo.se.pokemon.*;


public class Sewaddle extends Pokemon {
    public Sewaddle(String name, int lvl) {
        super(name, lvl);
        setMove(new Swagger(), new CalmMind());
        setStats(45, 53, 70, 40, 60, 42);
        setType(Type.BUG, Type.GRASS);
    }
}


