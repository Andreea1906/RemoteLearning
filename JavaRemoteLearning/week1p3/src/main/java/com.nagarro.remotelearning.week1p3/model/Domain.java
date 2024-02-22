package Entity;

import java.util.List;

public class Domain {
    private String domainName;
    private String owner;
    private String hosts;

    public Domain(String domainName, String owner, String hosts) {
        this.domainName = domainName;
        this.owner = owner;
        this.hosts = hosts;
    }

    public String getDomainName() {
        return domainName;
    }
}
