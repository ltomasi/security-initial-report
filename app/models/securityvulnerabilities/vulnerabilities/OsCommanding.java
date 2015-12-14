package models.securityvulnerabilities.vulnerabilities;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import models.securityvulnerabilities.SecurityVulnerability;
import models.w3afreport.Vulnerability;

@models.securityvulnerabilities.Vulnerability("OS commanding vulnerability")
public class OsCommanding implements SecurityVulnerability {

    class OsInjectionVector {

	String url;
        String vulParam;
	String http;
    }

    List<OsInjectionVector> vectors = new ArrayList<OsInjectionVector>();

    @Override
    public void decode(models.w3afreport.Vulnerability w3afVulnerability) {
        OsInjectionVector vector = new OsInjectionVector();
        vector.vulParam = w3afVulnerability.getVar();
	vector.url = w3afVulnerability.getUrl();
	vector.http = w3afVulnerability.getMethod();
        this.vectors.add(vector);
    }

    @Override
    public String encode() {
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile("report/oscommanding.template");
        StringWriter writer = new StringWriter();
        try {
            mustache.execute(writer, this).flush();
        } catch (Exception e) {

        }
        return writer.toString();
    }

}
