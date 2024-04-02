package com.nagarro.remotelearning.week6p1.factory;

import com.nagarro.remotelearning.week6p1.domain.Employee;
import com.nagarro.remotelearning.week6p1.domain.Engine;
import com.nagarro.remotelearning.week6p1.domain.EngineComponent;
import com.nagarro.remotelearning.week6p1.exception.InsufficientStockException;
import com.nagarro.remotelearning.week6p1.exception.UnauthorizedEmployeeException;
import com.nagarro.remotelearning.week6p1.exception.UnqualifiedEmployeeException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EngineFactoryTest {
    private EngineFactory engineFactory;
    private List<Employee> employees;
    private List<EngineComponent> engineComponents;

    @org.junit.Before
    public void setUp() throws Exception {
        employees = new ArrayList<>();
        employees.add(new Employee("John", true, true));
        employees.add(new Employee("Alice", false, true));
        employees.add(new Employee("Dorel", false, false));
        engineComponents = new ArrayList<>();
        for (int i = 0; i < EngineFactory.getComponentsPerEngine() * 5; i++) {
            engineComponents.add(new EngineComponent("Component" + i, 10.0));
        }
        engineFactory = new EngineFactory(employees, engineComponents);
    }

    @org.junit.Test
    public void testManufactureEnginesWithEnoughComponents() {
        int numberOfEngines = 3;
        Employee assignedEmployee = employees.get(0);
        List<Engine> engines = engineFactory.manufactureEngines(numberOfEngines, assignedEmployee);
        assertEquals(numberOfEngines, engines.size());
    }

    @org.junit.Test(expected = InsufficientStockException.class)
    public void testManufactureEnginesWithNotEnoughComponents() {
        int numberOfEngines = 10;
        Employee assignedEmployee = employees.get(0);
        engineFactory.manufactureEngines(numberOfEngines, assignedEmployee);
    }

    @org.junit.Test(expected = UnauthorizedEmployeeException.class)
    public void testManufactureEnginesWithUnauthorizedEmployee() {
        int numberOfEngines = 3;
        Employee unauthorizedEmployee = new Employee("Unauthorized", false, true);
        engineFactory.manufactureEngines(numberOfEngines, unauthorizedEmployee);
    }

    @org.junit.Test(expected = UnqualifiedEmployeeException.class)
    public void testManufactureEnginesWithUnqualifiedEmployee() {
        int numberOfEngines = 3;
        Employee unqualifiedEmployee = employees.get(2);
        engineFactory.manufactureEngines(numberOfEngines, unqualifiedEmployee);
    }
}