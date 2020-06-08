package com.org.complex.object.controller;

import com.org.complex.object.model.CurrentAddress;
import com.org.complex.object.model.Data;
import com.org.complex.object.model.Employee;
import com.org.complex.object.model.PermanentAddress;
import com.org.complex.object.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = {"/Data"})
public class DataController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/{id}")
    public Optional<Data> getById(@PathVariable Integer id) {
        return employeeService.getById(id);
    }

    @PostMapping("/createData")
    public void createData(@RequestBody Data data) {
        employeeService.createData(data);
    }

    @GetMapping("/getData")
    public List<Data> getData() {
        return employeeService.getData();
    }

    @GetMapping("/getPermanentAddress")
    public List<PermanentAddress> getPermanentAddress() {
        return employeeService.getPermanentAddress();
    }

    @GetMapping("/currentAddressList")
    public List<CurrentAddress> getCurrentAddress() {
        return employeeService.getCurrentAddress();
    }

    @GetMapping("/getEmployee")
    public List<Employee> getEmployee() {
        return employeeService.getEmployee();
    }
}
