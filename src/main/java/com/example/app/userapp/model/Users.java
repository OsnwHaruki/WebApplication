package com.example.app.userapp.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Column(name = "name")
    private String Name;
    @Column(name = "login")
    private String Login;
    @Column(name = "password")
    private int Password;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
