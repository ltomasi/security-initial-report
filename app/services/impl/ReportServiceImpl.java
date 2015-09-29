package services.impl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import com.google.inject.Inject;

import models.exception.InvalidW3afReportException;
import models.factory.VulnerabilityFactory;
import models.securityvulnerabilities.InitialReport;
import models.securityvulnerabilities.SecurityVulnerability;
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
        InitialReport initialReport = new InitialReport(vulnerabilities);
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile("report.template");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(baos, Charset.forName("UTF-8"));
        try {
            mustache.execute(writer, initialReport).flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        try {
            FileOutputStream fos = new FileOutputStream(new File("teste.tex"));
            fos.write(baos.toByteArray());
            fos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private List<SecurityVulnerability> createVulnerabilities(W3AfRun w3AfRun) {
        Map<String, SecurityVulnerability> vulnerabilites = new HashMap<String, SecurityVulnerability>();
        for (Vulnerability vulnerability : w3AfRun.getVulnerability()) {
            String vulnerabilityKeyName = vulnerability.getName();

            if (vulnerabilites.containsKey(vulnerabilityKeyName)) {
                SecurityVulnerability securityVulnerability = vulnerabilites.get(vulnerabilityKeyName);
                securityVulnerability.decode(vulnerability);
            } else {
                SecurityVulnerability securityVulnerability = this.vulnerabilityFactory.createVulnerability(vulnerabilityKeyName);
                if (securityVulnerability != null) {
                    vulnerabilites.put(vulnerabilityKeyName, securityVulnerability);
                    securityVulnerability.decode(vulnerability);
                }
            }
        }
        return new ArrayList<>(vulnerabilites.values());
    }

}
