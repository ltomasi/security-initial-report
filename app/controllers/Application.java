package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import com.google.inject.Inject;

import models.exception.InvalidW3afReportException;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;
import services.api.ReportService;
import views.html.*;

public class Application extends Controller {

    @Inject
    ReportService reportService;

    public Result index() throws InvalidW3afReportException, JAXBException, FileNotFoundException {
        File file = new File("report-multilidaae-noauth.xml");
        this.reportService.generateInitialReport(new FileInputStream(file));
        // this.reportService.unmarshalW3afReport(null);
        return Results.ok(index.render("Your new application is ready."));
        // return Results.ok();
    }

}
