package de.aittr._users.controllers;

import de.aittr._users.dao.OrdersDAO;
import de.aittr._users.dao.UsersDAO;
import de.aittr._users.entity.Order;
import de.aittr._users.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class OrdersController {

    private OrdersDAO ordersDAO = new OrdersDAO();
    private List<Order> orders = ordersDAO.getOrders();


    @GetMapping(value="/orders")
    public String listOrder(Model model){
        model.addAttribute("orders",orders);
        return "orders";
    }


    private UsersDAO usersDAO = new UsersDAO();
    private List<User> users = usersDAO.getUsers();


    // четко только один вариант /users/2/orders
    @GetMapping(value = "/users/{id}/orders")
    public String userById(@PathVariable int id, Model model){
        List<User> res=new ArrayList<>();
        res.add(users.get(id));
        model.addAttribute("users",res);
        model.addAttribute("user_id",id);
        return "user-info";
    }

}
