import exeptions.IncorrectGuestsNumber;
import formatters.PriceFormatter;
import models.Bill;

public final class BillCalculator {

    private final int guestsNumber;

    BillCalculator(int guestsNumber) throws IncorrectGuestsNumber {
        if (guestsNumber <= 0) {
            throw new IncorrectGuestsNumber("Гостей не может быть отрицательное количество или равное нулю");
        } else if (guestsNumber == 1) {
            throw new IncorrectGuestsNumber("Нет смысла делить счет на 1 гостя");
        } else {
            this.guestsNumber = guestsNumber;
        }
    }

    void calculate(Bill bill) {
        PriceFormatter priceFormatter = new PriceFormatter();

        double pricePerPerson = bill.getTotalPrice() / guestsNumber;
        String formattedPricePerPerson = priceFormatter.formatPrice(pricePerPerson);

        System.out.println("\n===================================");
        System.out.println(String.format("Каждый должен заплатить - %s", formattedPricePerPerson));
    }

}
