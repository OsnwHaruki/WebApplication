package com.example.app.userapp.service;

import com.example.app.userapp.model.Users;

import java.util.List;

public interface service {
    void register(Users users) throws Exception;
    List<Users> allUsers();

   Users getUser(int id);

   void edit(Users users);

    void delete(Users users);
}
