import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import org.junit.Assert;
import org.junit.Test;

import models.exception.InvalidW3afReportException;
import models.factory.VulnerabilityFactory;
import models.securityvulnerabilities.SecurityVulnerability;
import models.securityvulnerabilities.vulnerabilities.BlindSqlInjection;
import models.w3afreport.W3AfRun;
import services.impl.ReportServiceImpl;

/**
 *
 * Simple (JUnit) tests that can call all parts of a play app. If you are
 * interested in mocking a whole application, see the wiki for more details.
 *
 */
public class ApplicationTest {

    @Test
    public void simpleCheck() throws FileNotFoundException, InvalidW3afReportException, JAXBException {
        File file = new File("report.xml");
        ReportServiceImpl service = new ReportServiceImpl();
        W3AfRun report = service.unmarshalW3afReport(new FileInputStream(file));
        System.out.println(report.getW3AfVersion());
    }

    @Test
    public void testCreateSql() {
        VulnerabilityFactory factory = new VulnerabilityFactory();
        SecurityVulnerability aclass = factory.createVulnerability("Blind SQL injection vulnerability");
        Assert.assertTrue(aclass instanceof BlindSqlInjection);
    }

    @Test
    public void testCreateVulnerabilites() throws FileNotFoundException {
        File file = new File("report-multilidaae-noauth.xml");
        ReportServiceImpl service = new ReportServiceImpl();
        service.generateInitialReport(new FileInputStream(file));
    }
}
