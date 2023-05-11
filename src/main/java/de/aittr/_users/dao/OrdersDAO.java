package de.aittr._users.dao;

import de.aittr._users.entity.Order;
import de.aittr._users.entity.User;

import java.util.ArrayList;
import java.util.List;

public class OrdersDAO {

    public List<Order> getOrders() {
        List<Order> list = new ArrayList<>(
                List.of(
                        new Order(1, new User (1,"Jack", "Berlin"), "iPhone"),
                        new Order(2, new User (2,"Nick", "Paris"), "Car"),
                        new Order(3, new User (2,"Nick", "Paris"), "Book"),
                        new Order(4, new User (2,"Nick", "Paris"), "Food"),
                        new Order(5, new User (3,"Lena", "Berlin"), "Skates"),
                        new Order(6, new User (4,"Ted", "Oslo"), "Glasses")
                )
        );
        return list;
    }


}
