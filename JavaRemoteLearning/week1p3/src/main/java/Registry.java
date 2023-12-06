public class Registry {
    public void createDomain(Customer customer, Domain domain) {
        System.out.println("Creating domain: " + domain.getDomainName() + " for customer: " + customer.getName());
    }
}
