package formatters;

public final class PriceFormatter {

    public String formatPrice(double value) {
        String currency;
        int lastDigit = (int)value % 10;
        int lastDigits = (int)value % 100;

        if (lastDigit == 1 && (lastDigits < 10 || lastDigits > 20)) {
            currency = "рубль";
        } else if (lastDigit >= 2 && lastDigit <= 4 && (lastDigits < 10 || lastDigits > 20)) {
            currency = "рубля";
        } else {
            currency = "рублей";
        }

        return String.format("%.2f %s", value, currency);
    }

}

