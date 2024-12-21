package Exceptions;

public class CantCatchRatInOtherLocationException extends RuntimeException {
    private final String customMessage;

    public CantCatchRatInOtherLocationException(String message) {
        super(message);
        this.customMessage = message;
    }

    @Override
    public String getMessage() {
        return "CantCatchRatInOtherLocationException " + customMessage;
    }
}

