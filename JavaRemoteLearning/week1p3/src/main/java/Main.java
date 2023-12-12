import Entity.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Registry registry = new Registry();
        Registrar registrar = new Registrar(registry);
        Reseller reseller = new Reseller(registrar);

        Customer customer1 = new Customer();


        System.out.println("Customer 1 tries to purchase a domain");
        reseller.purchaseDomain(customer1, "example.com", "John", "Vali, Mihai, Ionel");

        System.out.println("Customer 2 is trying to purchase the same domain by another customer");
        Customer customer2 = new Customer();
        reseller.purchaseDomain(customer2, "example.com", "Matias", "Adrian, Matei");

    }
}
