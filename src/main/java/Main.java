import java.util.Scanner;

import exeptions.IncorrectGuestsNumber;
import models.Bill;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BillCalculator calculator = null;
        BillReader billReader = new BillReader();
        BillPrinter billPrinter = new BillPrinter();

        System.out.println("Вас приветствует программа для разделения счета!");
        System.out.println("================================================");

        while (calculator == null) {
            System.out.println("\nУкажите количество гостей, между которыми нужно разделить счет:");
            try {
                String input = scanner.next().trim();
                int guestsNumber = Integer.parseInt(input);
                calculator = new BillCalculator(guestsNumber);
            } catch (IncorrectGuestsNumber e) {
                System.out.println(String.format("Некорректный ввод! %s.", e.getMessage()));
            } catch (Exception e) {
                System.out.println("Некорректный ввод! Допустимо вводить только числа.");
            }
        }

        Bill bill = billReader.read();
        billPrinter.print(bill);
        calculator.calculate(bill);
    }
}