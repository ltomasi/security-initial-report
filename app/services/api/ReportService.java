package services.api;

import java.io.File;
import java.io.InputStream;

import com.google.inject.ImplementedBy;

import services.impl.ReportServiceImpl;

@ImplementedBy(ReportServiceImpl.class)
public interface ReportService {

    File generateInitialReport(InputStream inputStram);
}
