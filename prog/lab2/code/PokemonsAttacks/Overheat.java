package code.PokemonsAttacks;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove{
    public Overheat(){
        super(Type.FIRE, 130, 90);
    }

    //Перегрев наносит урон, но снижает Специальную атаку пользователя на две ступени после атаки.
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "применил Overheat";
    }
}

