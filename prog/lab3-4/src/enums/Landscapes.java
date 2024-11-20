package enums;

public enum Landscapes {
    FIELD("полю"),
    FOREST("лесу"),
    HILL("холму"),
    CAVE("пещере"),
    MOUNTAIN("горе");

    private final String describtion;

    Landscapes(String describtion) {
        this.describtion = describtion;
    }

    @Override
    public String toString() {
        return this.describtion;
    }
}
