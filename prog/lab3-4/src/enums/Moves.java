package enums;

public enum Moves {
    SIT("сидели"),
    RUN("бегали"),
    STAND("стояли"),
    JUMP("прыгали"),
    DANCE("танцевали"),
    OBSERVE("наблюдали за морем"),
    DEFAULT("ничего не делали"),
    LIY("лежали");

    private final String describtion;
    Moves(String describtion) {
        this.describtion = describtion;
    }


    @Override
    public String toString() {
        return this.describtion;
    }
}
