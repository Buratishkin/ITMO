package exceptions;

public class WeaponNotWorkingException extends RuntimeException {
    public WeaponNotWorkingException(String message) {
        super(message);
    }

    public WeaponNotWorkingException() {
        getMessage();
    }

    @Override
    public String getMessage() {
        return "оружие на работает";
    }
}
