package edu.pw.projetorest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/users")
    @ResponseBody
    public String getUsers() {
        return "{\"users\":[{\"name\":\"Matheus Adler\", \"country\":\"Brasil\"},"
                + "{\"name\":\"Bruno Gomes\",\"country\":\"Brasil\"}]}";
    }
}
