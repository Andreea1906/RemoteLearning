package Entity;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Boolean> domainAvailability;

    public Registry() {
        this.domainAvailability = new HashMap<>();
    }

    public void initiateDomainCreation(Domain domain) {
        domainAvailability.put(domain.getDomainName(), false);
        System.out.println("Creating domain: " + domain.getDomainName());
    }

    public boolean isDomainAvailable(String domainName) {
        return !domainAvailability.containsKey(domainName) || domainAvailability.get(domainName);
    }
    }
