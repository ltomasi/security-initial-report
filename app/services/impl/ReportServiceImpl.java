package services.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.google.inject.Inject;

import models.exception.InvalidW3afReportException;
import models.factory.VulnerabilityFactory;
import models.securityvulnerabilities.SecurityVulnerability;
import models.securityvulnerabilities.vulnerabilities.SqlInjection;
import models.w3afreport.Vulnerability;
import models.w3afreport.W3AfRun;
import services.api.ReportService;

public class ReportServiceImpl implements ReportService {

    @Inject
    VulnerabilityFactory vulnerabilityFactory;

    @Override
    public W3AfRun unmarshalW3afReport(InputStream inputStream) throws InvalidW3afReportException, JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(W3AfRun.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        W3AfRun report;
        try {
            report = (W3AfRun) unmarshaller.unmarshal(inputStream);
        } catch (JAXBException e) {
            throw new InvalidW3afReportException("The report provided not in accordance with the w3af schema", e);
        }

        return report;
    }

    @Override
    public void generateInitialReport(InputStream inputStream) {
        W3AfRun w3afRun = null;
        try {
            w3afRun = this.unmarshalW3afReport(inputStream);
        } catch (InvalidW3afReportException | JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        List<SecurityVulnerability> vulnerabilities = this.createVulnerabilities(w3afRun);
        for (SecurityVulnerability securityVulnerability : vulnerabilities) {
            System.out.println(securityVulnerability);
        }

        HashMap<Class<? extends SecurityVulnerability>, String> teste = new HashMap<Class<? extends SecurityVulnerability>, String>();
        teste.put(SqlInjection.class, "asdf");

        System.out.println("=========================");
    }

    private List<SecurityVulnerability> createVulnerabilities(W3AfRun w3AfRun) {
        List<SecurityVulnerability> vulnerabilities = new ArrayList<SecurityVulnerability>();
        for (Vulnerability vulnerability : w3AfRun.getVulnerability()) {
            SecurityVulnerability securityVulnerability = this.vulnerabilityFactory.createVulnerability(vulnerability.getName());
            if (securityVulnerability != null) {
                securityVulnerability.decode(vulnerability);
                vulnerabilities.add(securityVulnerability);
            }
        }
        return vulnerabilities;
    }

}
