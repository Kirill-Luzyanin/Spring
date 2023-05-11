package de.aittr._users.entity;

import java.util.Objects;

public class Order {

    private int orderID;
    private User user;
    private String title;

    public Order(int orderID, User user, String title) {
        this.orderID = orderID;
        this.user = user;
        this.title = title;
    }

    public Order() {
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderID == order.orderID && Objects.equals(user, order.user) && Objects.equals(title, order.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, user, title);
    }
}
