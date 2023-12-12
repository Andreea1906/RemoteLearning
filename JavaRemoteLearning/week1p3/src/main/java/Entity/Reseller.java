package Entity;

import java.util.List;

public class Reseller {

    private Registrar registrar;

    public Reseller(Registrar registrar) {
        this.registrar = registrar;
    }
    public void purchaseDomain(Customer customer, String domainName, String owner, String hosts) {
        Domain domain = customer.requestNewDomain(domainName, owner, hosts);
        registrar.createDomain(domain);
    }
}
