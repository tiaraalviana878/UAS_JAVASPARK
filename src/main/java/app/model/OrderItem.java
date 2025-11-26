package app.model;

import java.io.Serializable;

public class OrderItem implements Serializable {
    private String menuId;
    private String name;
    private int quantity;
    private double price;

    public OrderItem() {
    }

    public OrderItem(String menuId, String name, int quantity, double price) {
        this.menuId = menuId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return price * quantity;
    }

    // Optional helper: representasi string untuk debugging
    @Override
    public String toString() {
        return String.format("%s x%d = %.2f", name, quantity, getTotal());
    }
}
