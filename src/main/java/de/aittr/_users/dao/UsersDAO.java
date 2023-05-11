package de.aittr._users.dao;

import de.aittr._users.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UsersDAO {

    public List<User> getUsers(){
        List<User> list = new ArrayList<>(
                List.of(
                        new User (1,"Jack", "Berlin"),
                        new User (2,"Nick", "Paris"),
                        new User (3,"Lena", "Berlin"),
                        new User (4,"Ted", "Oslo")
                )
        );
    return list;
    }

}
