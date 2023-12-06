public class Reseller {

    private Registrar registrar;

    public Reseller(Registrar registrar) {
        this.registrar = registrar;
    }

    public void buyDomain(Customer customer, Domain domain) {
        // Some processing or validation
        registrar.createDomain(customer, domain);
    }
}
