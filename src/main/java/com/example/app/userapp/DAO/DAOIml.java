package com.example.app.userapp.DAO;

import com.example.app.userapp.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public class DAOIml implements DAO{
 private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    @Override
    public List<Users> AllUsers(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Users").list();
    }


    @Override
    public void Delete(Users users) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(users);
    }

    @Override
    public void Register(Users users) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        session.persist(users);

    }


    @Override
    public Users GetUser(int id){
        Session session = sessionFactory.getCurrentSession();
        return session.get(Users.class,id);
    }


    @Override
    public void Edit(Users users) {
        Session session = sessionFactory.getCurrentSession();
        session.update(users);
    }
}
