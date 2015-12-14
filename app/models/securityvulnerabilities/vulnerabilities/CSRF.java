package models.securityvulnerabilities.vulnerabilities;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import models.securityvulnerabilities.SecurityVulnerability;
import models.w3afreport.Vulnerability;

@models.securityvulnerabilities.Vulnerability("CSRF vulnerability")
public class CSRF implements SecurityVulnerability {

    class CsrfVector {

	String url;
	String http;
    }

    List<CsrfVector> vectors = new ArrayList<CsrfVector>();

    @Override
    public void decode(models.w3afreport.Vulnerability w3afVulnerability) {
        CsrfVector vector = new CsrfVector();
	vector.url = w3afVulnerability.getUrl();
	vector.http = w3afVulnerability.getMethod();
        this.vectors.add(vector);
    }

    @Override
    public String encode() {
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile("report/csrf.template");
        StringWriter writer = new StringWriter();
        try {
            mustache.execute(writer, this).flush();
        } catch (Exception e) {

        }
        return writer.toString();
    }

}
