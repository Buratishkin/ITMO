package code.PokemonsAttacks;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove{
    public CalmMind(){
        super(Type.PSYCHIC, 0,0);
    }

    //CalmMind повышает Специальную атаку и Специальную защиту пользователя на одну ступень каждую.
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
    }

    @Override
    protected String describe() {
        return "применил CalmMind";
    }
}
