package code.MyPokemons;

import code.PokemonsAttacks.*;
import ru.ifmo.se.pokemon.*;


public class HoopaConfined extends Pokemon {
    public HoopaConfined(String name, int lvl) {
        super(name, lvl);
        setMove(new Swagger(), new DreamEater(), new Psychic(), new Facade());
        setStats(80, 110, 60, 150, 130, 70);
        setType(Type.PSYCHIC, Type.GHOST);
    }
}