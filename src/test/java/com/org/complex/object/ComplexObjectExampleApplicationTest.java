package com.org.complex.object;

import com.org.complex.object.model.Data;
import com.org.complex.object.repository.DataRepository;
import com.org.complex.object.service.EmployeeService;
import javafx.beans.binding.When;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
class ComplexObjectExampleApplicationTest {
    @Mock
    DataRepository dataRepository;

    Data data;

    @Before
    void setUp() {
        data.getEmployee().getAddress().getPermanentAddress().setHome("#25");
        data.getEmployee().getAddress().getPermanentAddress().setStreet("bst");
        data.getEmployee().getAddress().getPermanentAddress().setPincode("123456");
        data.getEmployee().getAddress().getPermanentAddress().setCity("blr");
        dataRepository.save(data);
        System.out.println("before");
    }
    @After
    void tearDown() {

        System.out.println("after");
    }

    @Test
    public  void getPermanentAddressTest(){

    }
}