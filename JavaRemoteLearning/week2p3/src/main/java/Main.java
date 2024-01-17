import entity.Cat;

public class Main {
    static {
        System.out.println("Main Class Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Creating an object of entity.Cat");
        Cat cat = new Cat();
    }
}
