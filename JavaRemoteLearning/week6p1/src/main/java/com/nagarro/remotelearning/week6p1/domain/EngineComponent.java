package com.nagarro.remotelearning.week6p1.domain;

public class EngineComponent {
    
    private String name;
    private double weight;

    public EngineComponent(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
