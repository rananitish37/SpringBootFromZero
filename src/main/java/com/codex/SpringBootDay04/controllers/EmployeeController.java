package com.codex.SpringBootDay04.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/{employeeId}")
    public String findEmployee(@PathVariable int employeeId){
        return "employee is: "+employeeId;
    }
}
