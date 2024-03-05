package com.nagarro.remotelearning.week6p2.factory;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import java.util.List;

import com.nagarro.remotelearning.week6p2.domain.Employee;
import com.nagarro.remotelearning.week6p2.domain.Engine;
import com.nagarro.remotelearning.week6p2.exception.UnqualifiedEmployeeException;
import com.nagarro.remotelearning.week6p2.factory.EngineFactory;
import com.nagarro.remotelearning.week6p2.service.EmployeeService;
import org.junit.Test;
import org.mockito.Mockito;

public class EngineFactoryTest {

    @Test
    public void testManufactureEnginesWithQualifiedEmployee() {

        EmployeeService employeeService = mock(EmployeeService.class);
        Employee employee = new Employee("Ionel");
        Mockito.when(employeeService.isAssemblyLineWorker(any())).thenReturn(true);



        EngineFactory engineFactory = new EngineFactory(employeeService);


        List<Engine> engines = engineFactory.manufactureEngines(3, new Employee("John"));


        assertEquals(3, engines.size());


    }

    @Test(expected = UnqualifiedEmployeeException.class)
    public void testManufactureEnginesWithUnqualifiedEmployee() {

        EmployeeService employeeService = mock(EmployeeService.class);
        when(employeeService.isAssemblyLineWorker(any(Employee.class))).thenReturn(false);


        EngineFactory engineFactory = new EngineFactory(employeeService);

        engineFactory.manufactureEngines(3, new Employee("Jane"));
    }
}
