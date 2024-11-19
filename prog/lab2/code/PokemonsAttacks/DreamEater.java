package code.PokemonsAttacks;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove{
    boolean flag = false;
    public DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }

    //Status status = pokemon.getCondition();
    //Пожиратель снов наносит урон только спящим противникам, а пользователь восстанавливает 50% потерянного здоровья.
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        if (pokemon.getCondition().equals(Status.SLEEP)){
            flag = true;
            pokemon.setMod(Stat.HP, (int) Math.round(damage));
        }
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (flag)
            pokemon.setMod(Stat.HP, ((int)(((pokemon.getStat(Stat.HP) - pokemon.getHP()) / 2))));
    }

    @Override
    protected String describe() {
        return "применил DreamEater";
    }
}

