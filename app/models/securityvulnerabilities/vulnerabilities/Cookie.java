package models.securityvulnerabilities.vulnerabilities;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import models.securityvulnerabilities.SecurityVulnerability;
import models.w3afreport.Vulnerability;
import models.w3afreport.HttpTransactions;
import models.w3afreport.HttpTransaction;
import models.w3afreport.HttpResponse;
import models.w3afreport.Headers;
import models.w3afreport.Header;

@models.securityvulnerabilities.Vulnerability("Cookie")
public class Cookie implements SecurityVulnerability {

    class CookieVector {

	String url;
    }

    List<CookieVector> vectors = new ArrayList<CookieVector>();

    @Override
    public void decode(models.w3afreport.Vulnerability w3afVulnerability) {
        CookieVector vector = new CookieVector();
	vector.url = w3afVulnerability.getUrl();

        this.vectors.add(vector);
    }

    @Override
    public String encode() {
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile("report/cookie.template");
        StringWriter writer = new StringWriter();
        try {
            mustache.execute(writer, this).flush();
        } catch (Exception e) {

        }
        return writer.toString();
    }

}
