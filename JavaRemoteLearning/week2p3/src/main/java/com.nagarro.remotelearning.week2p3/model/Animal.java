package entity;

class Animal {
    Animal() {
        System.out.println("entity.Animal Constructor");
    }

    static {
        System.out.println("entity.Animal Static Block1");
    }

    {
        System.out.println("entity.Animal Initialization Block");
    }

    static {
        System.out.println("entity.Animal Static Block");
    }
}
