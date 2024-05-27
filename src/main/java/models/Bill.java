package models;

import java.util.ArrayList;

public final class Bill {

    private final ArrayList<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getAllMenuItems() {
        return new ArrayList<>(menuItems);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (MenuItem menuItem : menuItems) {
            totalPrice += menuItem.price;
        }
        return totalPrice;
    }

}
