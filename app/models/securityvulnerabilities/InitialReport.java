package models.securityvulnerabilities;

import java.util.List;

public class InitialReport {

    private List<SecurityVulnerability> vulnerabilitiesList;

    public InitialReport(List<SecurityVulnerability> vulnerabilities) {
        this.vulnerabilitiesList = vulnerabilities;
    }

    public String getVulnerabilities() {
        String msg = "";
        for (SecurityVulnerability securityVulnerability : this.vulnerabilitiesList) {
            msg += securityVulnerability.encode();

        }
        return msg;
    }

    /**
     * @param vulnerabilities
     *            the vulnerabilities to set
     */
    public void setVulnerabilities(List<SecurityVulnerability> vulnerabilities) {
        this.vulnerabilitiesList = vulnerabilities;
    }

}
