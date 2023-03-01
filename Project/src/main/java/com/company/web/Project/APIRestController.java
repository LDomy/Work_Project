package com.company.web.Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;



import java.sql.SQLException;

@RestController
@RequestMapping("/api")
public class APIRestController {

    @GetMapping("/greeting")
    public String greeting(){
        return "Cica!";
    }

    @PostMapping(value = "/insert")
    public String insert(@RequestBody String email, @RequestBody String pass) throws SQLException, ClassNotFoundException {
        SQLInsert insert = new SQLInsert(email,pass);
        return "Inserted! Check database";
    }
    @GetMapping("/login")
    public String login() throws SQLException,ClassNotFoundException{
        SQLLogin login = new SQLLogin();

        return "Bejelentkeztél";
    }

}
