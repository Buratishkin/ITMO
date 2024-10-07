package LabTwo;

import ru.ifmo.se.pokemon.*;

class Swagger extends StatusMove {
    protected Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    //Swagger сбивает цель с толку и повышает ее атаку на две ступени.
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
        pokemon.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "применил Swagger";
    }
}

class DreamEater extends SpecialMove{
    boolean flag = false;
    protected DreamEater(){

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

class Psychic extends SpecialMove {
    protected Psychic(){
        super(Type.PSYCHIC, 90,100);
    }

    //Psychic наносит урон и имеет 10%-ный шанс снизить Специальную защиту цели на одну ступень.
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "применил Psychic";
    }
}

class Facade extends PhysicalMove {
    protected Facade() {
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

class DoubleTeam extends StatusMove {
    protected DoubleTeam(){
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

class TailWhip extends StatusMove {
    protected TailWhip(){
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

class Overheat extends SpecialMove{
    protected Overheat(){
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

class CalmMind extends StatusMove{
    protected CalmMind(){
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

class GrassWhistle extends StatusMove{
    protected GrassWhistle(){
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

class Slash extends PhysicalMove{
    protected Slash(){
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
