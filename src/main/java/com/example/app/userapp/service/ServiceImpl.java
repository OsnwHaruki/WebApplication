package com.example.app.userapp.service;

import com.example.app.userapp.DAO.DAO;
import com.example.app.userapp.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceImpl implements service {
    private DAO dao;

    @Autowired
    public void setDao(DAO dao) {
        this.dao = dao;
    }


    @Override
    @Transactional
    public void delete(Users users) {
        dao.Delete(users);
    }

    @Override
    @Transactional
    public void register(Users users) throws Exception {
        dao.Register(users);
    }
    @Override
    @Transactional
    public List<Users> allUsers() {
        return dao.AllUsers();
    }
    @Override
    @Transactional
    public void edit(Users users) {
        dao.Edit(users);
    }
    @Override
    @Transactional
    public Users getUser(int id) {
        return dao.GetUser(id);
    }
}
