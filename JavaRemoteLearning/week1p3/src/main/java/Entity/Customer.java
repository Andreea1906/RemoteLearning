package Entity;

public class Customer {
    private String Name;

    public Domain requestNewDomain(String domainName, String owner, String hosts) {
        return new Domain(domainName, owner, hosts);
    }
}
