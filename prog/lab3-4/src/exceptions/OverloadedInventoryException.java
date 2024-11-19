package exceptions;

public class OverloadedInventoryException extends Exception {
    public OverloadedInventoryException() {
        getMessage();
    }

    public OverloadedInventoryException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "слишком тяжелый инвентарь";
    }
}
