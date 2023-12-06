public class Domain {
    private String domainName;
    private String ownerDetails;
    private String[] hosts;

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getOwnerDetails() {
        return ownerDetails;
    }

    public void setOwnerDetails(String ownerDetails) {
        this.ownerDetails = ownerDetails;
    }

    public String[] getHosts() {
        return hosts;
    }

    public void setHosts(String[] hosts) {
        this.hosts = hosts;
    }
}
