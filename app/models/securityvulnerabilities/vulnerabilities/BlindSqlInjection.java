package models.securityvulnerabilities.vulnerabilities;

import models.securityvulnerabilities.SecurityVulnerability;
import models.securityvulnerabilities.Vulnerability;

@Vulnerability("Blind SQL injection vulnerability")
public class BlindSqlInjection implements SecurityVulnerability {

    @Override
    public void decode(models.w3afreport.Vulnerability w3afVulnerability) {
        // TODO Auto-generated method stub

    }

}
