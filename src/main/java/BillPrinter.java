import formatters.PriceFormatter;
import models.Bill;
import models.MenuItem;

public final class BillPrinter {

    void print(Bill bill) {
        PriceFormatter priceFormatter = new PriceFormatter();

        System.out.println("\nЗакрываем счет");
        System.out.println("==============");
        System.out.println("\nДобавленные товары:");

        for (MenuItem menuItem : bill.getAllMenuItems()) {
            String formattedPrice = priceFormatter.formatPrice(menuItem.price);
            System.out.println(String.format("- %s, %s", menuItem.name, formattedPrice));
        }
    }

}
