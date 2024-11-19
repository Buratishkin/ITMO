package code.PokemonsAttacks;

import ru.ifmo.se.pokemon.*;

public class GrassWhistle extends StatusMove{
    public GrassWhistle(){
        super(Type.GRASS, 0, 55);
    }

    //Grass Whistle погружает цель в сон, если попадает. Спящий покемон не может двигаться
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);
    }

    @Override
    protected String describe() {
        return "применил GrassWhistle";
    }

}

