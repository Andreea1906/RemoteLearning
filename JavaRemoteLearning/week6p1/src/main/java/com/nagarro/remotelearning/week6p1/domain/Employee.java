package com.nagarro.remotelearning.week6p1.domain;


public class Employee {

    private String name;
    private boolean isAssemblyLineWorker;
    private boolean isAdministrator;

    public Employee(String name, boolean isAdministrator, boolean isAssemblyLineWorker) {
        this.name = name;
        this.isAdministrator = isAdministrator;
        this.isAssemblyLineWorker = isAssemblyLineWorker;
    }

    public boolean isAssemblyLineWorker() {
        return isAssemblyLineWorker;
    }

    public boolean isAdministrator() {
        return isAdministrator;
    }

    public String getName() {
        return name;
    }
}
