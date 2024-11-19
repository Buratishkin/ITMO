package code.PokemonsAttacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }

    //DoubleTeam повышает уклончивость пользователя на одну ступень, тем самым затрудняя попадание по нему.
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe() {
        return "применил DoubleTeam";
    }
}

