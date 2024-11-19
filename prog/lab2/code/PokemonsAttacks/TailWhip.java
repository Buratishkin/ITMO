package code.PokemonsAttacks;

import ru.ifmo.se.pokemon.*;

public class TailWhip extends StatusMove {
    public TailWhip(){
        super(Type.NORMAL, 0, 100);
    }

    //TailWhip снижает защиту цели на одну ступень.
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "применил TailWhip";
    }
}

