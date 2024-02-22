import entity.Tank;

public class Main {

    public static void main(String[] args) {
        Tank tank = new Tank();

        // Test scenarios
        tank.fillTank("Water");
        tank.fillTank("Oil");
        System.out.println(tank.emptyTank());
        System.out.println(tank.emptyTank());
        System.out.println(tank.emptyTank());

        // Simulating cleanup
        tank.fillTank("Gasoline");
        tank = null;
        System.gc();
}
}
