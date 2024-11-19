package enums;

public enum WeatherEvents {
    TIDE("начался прилив"),
    STORM("шторм закончился"),
    GALE("буря стихла"),
    SUN("вышло солнце");

    private final String describtion;
    WeatherEvents(String describtion) {
        this.describtion = describtion;
    }

    @Override
    public String toString() {
        return this.describtion;
    }
}
