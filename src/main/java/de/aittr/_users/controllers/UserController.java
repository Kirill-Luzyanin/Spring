package de.aittr._users.controllers;

import de.aittr._users.dao.UsersDAO;
import de.aittr._users.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    /*
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String helloMethod(){
        return "hello";
    }
     */

    /*
    @GetMapping(value = "/users")
    public String usersMethod(){
        return "users";
    }
     */

    private UsersDAO usersDAO = new UsersDAO();
    private List<User> users = usersDAO.getUsers();


    // или так /users
    // или так /users?city=Berlin
    @GetMapping(value = "/users")
    public String usersList(@RequestParam(name="city", required = false, defaultValue = "all") String city, Model model){
        List<User> res=users;
        if(!city.equals("all")){
            res=users.stream().filter(c->c.getCity().equals(city)).toList();
        }
        model.addAttribute("users",res);
        //model.addAttribute("users", users);
        //model.addAttribute("hello", "hello");
        //model.addAttribute("five", 5);
        return "users";
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




}
