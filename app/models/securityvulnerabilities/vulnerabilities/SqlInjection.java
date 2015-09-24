package models.securityvulnerabilities.vulnerabilities;

import models.securityvulnerabilities.SecurityVulnerability;
import models.securityvulnerabilities.Vulnerability;

@Vulnerability("SQL injection")
public class SqlInjection implements SecurityVulnerability {

    private String vulParam;

    @Override
    public void decode(models.w3afreport.Vulnerability w3afVulnerability) {
        this.vulParam = w3afVulnerability.getVar();
    }

}
