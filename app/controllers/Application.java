package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import com.google.inject.Inject;

import models.exception.InvalidW3afReportException;
import play.mvc.Controller;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import play.mvc.Result;
import play.mvc.Results;
import services.api.ReportService;
import views.html.*;

public class Application extends Controller {

    @Inject
    ReportService reportService;

    public Result index() throws InvalidW3afReportException, JAXBException, FileNotFoundException {
        return Results.ok(index.render());
    }

    public Result upload() {
        MultipartFormData body = Controller.request().body().asMultipartFormData();
        FilePart w3afReport = body.getFile("w3af_report");
        if (w3afReport != null) {
            String fileName = w3afReport.getFilename();
            String contentType = w3afReport.getContentType();
            File file = w3afReport.getFile();
            try {
                File report = this.reportService.generateInitialReport(new FileInputStream(file));
                
                Controller.response().setContentType("application/x-download");
                Controller.response().setHeader("Content-disposition", "attachment; filename=" + report.getName() + "");
                return Results.ok(report);
            } catch (FileNotFoundException e) {
            }
            Controller.flash("error", "Missing file");
            return Results.redirect(routes.Application.index());            
        } else {
            Controller.flash("error", "Missing file");
            return Results.redirect(routes.Application.index());
        }
    }

}
