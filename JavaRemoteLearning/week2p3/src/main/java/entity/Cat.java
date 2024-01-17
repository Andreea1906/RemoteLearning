package entity;

import entity.Animal;

public class Cat extends Animal {
    public Cat() {
        System.out.println("entity.Cat Constructor");
    }

    {
        System.out.println("entity.Cat Initialization Block");
    }

    static {
        System.out.println("entity.Cat Static Block");
    }
}
