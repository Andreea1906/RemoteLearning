package Entity;

public class Registrar {
    private Registry registry;

    public Registrar(Registry registry) {
        this.registry = registry;
    }

    public void createDomain(Domain domain) {
        if (registry.isDomainAvailable(domain.getDomainName())) {
            registry.initiateDomainCreation(domain);
        } else {
            System.out.println("Entity.Domain '" + domain.getDomainName() + "' is not available.");
        }
    }
}
