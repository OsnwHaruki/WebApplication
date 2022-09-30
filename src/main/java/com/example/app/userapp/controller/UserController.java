package com.example.app.userapp.controller;

import com.example.app.userapp.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.app.userapp.service.service;

import java.util.List;

@Controller
public class UserController {
    private   service service;
    @Autowired
    public void setService(service service){
        this.service = service;
    }

    @GetMapping("/welcome")
    public ModelAndView welcomePage(){
        List<Users> names = service.allUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcomePage");
        modelAndView.addObject("Names", names);
        return modelAndView;
        }
    @GetMapping("/edit/{id}")
    public ModelAndView editPage(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView();
        Users user = service.getUser(id);
        modelAndView.addObject("specialUs",user);
        modelAndView.setViewName("editPage");
        return modelAndView;
    }
    @PostMapping("/edit")
    public ModelAndView editUser(@ModelAttribute("specialUs") Users users){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/welcome");
        service.edit(users);
        return modelAndView;
    }
    @GetMapping("/add")
    public ModelAndView addUserPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }
    @PostMapping("/add")
    public ModelAndView addUser(@ModelAttribute("user") Users user) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/welcome");
        service.register(user);
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public ModelAndView deleteUser(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/welcome");
        Users users = service.getUser(id);
        service.delete(users);
        return modelAndView;
    }
}
