import java.util.Scanner;

import models.Bill;
import models.MenuItem;

public final class BillReader {

    Bill read() {
        Bill bill = new Bill();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nДавайте добавим все товары из счета.");
        System.out.println("------------------------------------");

        while (true) {
            String itemName;
            double itemPrice;

            System.out.println("\nВведите навазние товара:");
            itemName = scanner.next().trim();

            try {
                System.out.println("Введите цену товара:");
                itemPrice = Double.parseDouble(scanner.next().trim());
            } catch (NumberFormatException e) {
                itemPrice = -1;
            }

            if (itemName.isEmpty() || itemPrice < 0) {
                System.out.println("Данные о товаре введены не корректно!");
            } else {
                MenuItem menuItem = new MenuItem(itemName, itemPrice);
                bill.addMenuItem(menuItem);
                System.out.println("Товар успешно добавлен!");
            }

            System.out.println("\nХотите добавить еще товары?");
            String addMoreAnswer = scanner.next().trim().toLowerCase();
            if (addMoreAnswer.equals("завершить")) {
                break;
            }
        }

        return bill;
    }

}
