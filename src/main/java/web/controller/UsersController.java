package web.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import web.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.services.UserService;

import java.sql.SQLException;

@Controller

public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String index(Model model) {

        model.addAttribute("users", userService.listUsers());
        return "index";
    }

    @GetMapping("/saveForm")
    public String saveForm(Model model) throws SQLException {
        User user = new User();
        model.addAttribute("user", user);
        return "user-info";
    }

    @GetMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user) throws SQLException {
        userService.saveUser(user);
        return "redirect:users";
    }
}
