package com.arakelyan.repositories;

import com.arakelyan.models.User;

import java.time.LocalDate;
import java.util.List;

public class UsersRepository {

    List<User> findAll() {
        User user = new User("Andrey","asdf", LocalDate.parse("1987-06-27"));

    }
}
