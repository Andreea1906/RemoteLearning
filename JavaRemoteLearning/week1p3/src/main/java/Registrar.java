public class Registrar {
    private Registry registry;

    public Registrar(Registry registry) {
        this.registry = registry;
    }

    public void createDomain(Customer customer, Domain domain) {
        // Some processing or validation
        registry.createDomain(customer, domain);
    }
}
