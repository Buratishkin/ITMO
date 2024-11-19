package code.PokemonsAttacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    //Facade наносит урон и бьет с удвоенной силой (140), если пользователь обожжен, отравлен или парализован.
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        Status status = pokemon.getCondition();
        if (status.equals(Status.BURN) || status.equals(Status.PARALYZE) || status.equals(Status.POISON)) {
            pokemon.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
        pokemon.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected String describe() {
        return "применил Facade";
    }
}

