package ru.solianko.telrostask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/main")
    public String mainPage(Model model) {

        return "main";
    }

    @GetMapping("/subpage")
    public String subPage(Model model) {

        return "subpage";
    }

    @GetMapping("/login")
    public String loginPage(Model model) {

        return "login";
    }
}
