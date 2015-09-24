package services.api;

import java.io.InputStream;

import javax.xml.bind.JAXBException;

import com.google.inject.ImplementedBy;

import models.exception.InvalidW3afReportException;
import models.w3afreport.W3AfRun;
import services.impl.ReportServiceImpl;

@ImplementedBy(ReportServiceImpl.class)
public interface ReportService {

    W3AfRun unmarshalW3afReport(InputStream inputStream) throws InvalidW3afReportException, JAXBException;

    void generateInitialReport(InputStream inputStram);
}
