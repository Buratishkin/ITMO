package code.PokemonsAttacks;

import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove{
    public Slash(){
        super(Type.PSYCHIC, 70, 100);
    }

    //Slash наносит урон и имеет повышенный коэффициент критического удара (1⁄8 вместо 1⁄24).
    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        if (pokemon.getStat(Stat.SPEED) / 512.0 > Math.random()) {
            return 6.0;
        } else {
            return 1.0;
        }
    }
    
    @Override
    protected String describe() {
        return "применил Slash";
    }
}

