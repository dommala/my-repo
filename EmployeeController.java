package com.springhelloworld.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee createEmp(Employee emp) {
        emp.setName("chandra");
        emp.setSalary("250000");
        return emp;
    }
}
