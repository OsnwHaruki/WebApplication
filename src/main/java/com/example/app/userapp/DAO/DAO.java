package com.example.app.userapp.DAO;

import com.example.app.userapp.model.Users;

import java.util.List;

public interface DAO {
    void Register(Users users) throws Exception;
    List<Users> AllUsers();

    void Edit(Users users);
    Users GetUser(int id);
    void  Delete(Users users);
}
