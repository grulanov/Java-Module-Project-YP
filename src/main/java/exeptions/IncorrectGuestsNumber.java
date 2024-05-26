package exeptions;

public class IncorrectGuestsNumber extends Exception {
    public IncorrectGuestsNumber(String errorMessage) {
        super(errorMessage);
    }
}
