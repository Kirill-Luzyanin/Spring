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

    /*
    // или так /users
    // или так /users?city=Berlin
    @GetMapping(value = "/orders")
    public String usersList(@RequestParam(name="city", required = false, defaultValue = "all") String city, Model model){
        List<User> res=users;
        if(!city.equals("all")){
            res=users.stream().filter(c->c.getCity().equals(city)).toList();
        }
        model.addAttribute("users",res);
        //model.addAttribute("users", users);
        //model.addAttribute("hello", "hello");
        //model.addAttribute("five", 5);
        return "orders";
    }

    // четко только один вариант /users/2
    @GetMapping(value = "/users/{id}")
    public String userById(@PathVariable int id, Model model){
        List<User> res=new ArrayList<>();
        res.add(users.get(id));
        model.addAttribute("users",res);
        model.addAttribute("user_id",id);
        return "user-info";
    }

     */

}
