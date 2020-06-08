package com.org.complex.object.service;

import com.org.complex.object.model.CurrentAddress;
import com.org.complex.object.model.Data;
import com.org.complex.object.model.Employee;
import com.org.complex.object.model.PermanentAddress;
import com.org.complex.object.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@ControllerAdvice
@Service
public class EmployeeService {

    @Autowired
    DataRepository dataRepository;

    public void createData(Data data) {
        dataRepository.save(data);
    }

    public List<Data> getData() {
        return dataRepository.findAll();
    }

    public List<CurrentAddress> getCurrentAddress() {
        List<CurrentAddress> currentAddresses = new ArrayList<>();
        for (Data data : dataRepository.findAll()) {
            currentAddresses.add(data.getEmployee().getAddress().getCurrentAddress());
        }
        return currentAddresses;
    }
    public Optional<Data> getById(int id) {
        Optional<Data> data=dataRepository.findById(id);
        return data;
    }


    public List<PermanentAddress> getPermanentAddress() {
        List<PermanentAddress> permanentAddresses = new ArrayList<>();
        for (Data data : dataRepository.findAll()) {
            permanentAddresses.add(data.getEmployee().getAddress().getPermanentAddress());
        }
        return permanentAddresses;
    }

    public List<Employee> getEmployee() {
        List<Employee> employees = new ArrayList<>();
        for (Data data : dataRepository.findAll()) {
            employees.add(data.getEmployee());
        }
        return employees;
    }

}

