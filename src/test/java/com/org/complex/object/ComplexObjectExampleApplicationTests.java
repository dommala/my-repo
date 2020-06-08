package com.org.complex.object;

import com.org.complex.object.model.*;
import com.org.complex.object.service.EmployeeService;
import org.junit.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
class ComplexObjectExampleApplicationTests {

   /* 	@BeforeClass
	public void  initSetData(){
		System.out.println("Before Test Case");
	}

	@AfterClass
   public void cleanUpData(){
		System.out.println("After Test Case");
	}*/

    @Autowired
    EmployeeService employeeService;

    @Before
    public void init() {
        Data data = new Data();
        data.setId(80);
        Employee employee=new Employee();
        employee.setName("naidu");
        Address address=new Address();
        PermanentAddress permanentAddress=new PermanentAddress();
        permanentAddress.setCity("banglore");
        address.setPermanentAddress(permanentAddress);
        CurrentAddress currentAddress=new CurrentAddress();
        currentAddress.setcCity("punganur");
        address.setCurrentAddress(currentAddress);
        employee.setAddress(address);
        data.setEmployee(employee);
        employeeService.createData(data);

        System.out.println("Before Test Case");
    }

    @After
    public void cleanUp() {
        System.out.println("After Test Case");
    }

    @Test
    void contextLoads() {
        System.out.println("Test Case");
        Assert.assertNotNull(new Object());
        Assert.assertNull(null);
        Assert.assertEquals("TEST", "TEST");
    }

    @Test
    public void getAll() {
        List<Data> arl = employeeService.getData();
        Assert.assertNotNull(arl);

    }

    @Test
    public void getEmployee() {
        List<Employee> arl = employeeService.getEmployee();
        Assert.assertNotNull(arl);
    }

    @Test
    public void getCurrentAddress() {
        List<CurrentAddress> arl = employeeService.getCurrentAddress();
        Assert.assertNotNull(arl);
    }

    @Test
    public void getPermanentAddress() {
        List<PermanentAddress> arl = employeeService.getPermanentAddress();
        Assert.assertNotNull(arl);
    }

    @Test
    public void getById() {
        Optional<Data> arl = employeeService.getById(80);
        Assert.assertNotNull(arl);
    }

    @Test
    public void createData() {

        Data data1 = new Data();
        data1.setId(81);
        Employee employee = new Employee();
        employee.setName("chandra");
        Address address = new Address();
        CurrentAddress currentAddress = new CurrentAddress();
        currentAddress.setcCity("blr");
        address.setCurrentAddress(currentAddress);
        PermanentAddress permanentAddress = new PermanentAddress();
        permanentAddress.setCity("pgr");
        address.setPermanentAddress(permanentAddress);
        employee.setAddress(address);
        data1.setEmployee(employee);

        employeeService.createData(data1);
        Assert.assertNotNull(data1);
    }


}
