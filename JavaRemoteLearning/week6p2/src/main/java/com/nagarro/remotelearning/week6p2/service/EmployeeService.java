package com.nagarro.remotelearning.week6p2.service;


import com.nagarro.remotelearning.week6p2.domain.Employee;

/**
 * Provides methods to retrieve information about employees.
 */
public interface EmployeeService {

    /**
     * Determines if a given employee is an assembly line worker.
     *
     * @param employee the employee to check
     * @return true is the employee is an assembly line worker, false otherwise
     */
    public boolean isAssemblyLineWorker(Employee employee);

    /**
     * Determines if a given employee is an administrator.
     *
     * @param employee the employee to check
     * @return true is the employee is an administrator, false otherwise
     */
    public boolean isAdministrator(Employee employee);
}
