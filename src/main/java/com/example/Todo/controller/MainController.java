package com.example.Todo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(method = RequestMethod.GET)
    public String main(Model model){
        model.addAttribute("test","To-do Application");
        return "/main/main";
    }
}
