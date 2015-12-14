package models.securityvulnerabilities.vulnerabilities;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import models.securityvulnerabilities.SecurityVulnerability;
import models.w3afreport.Vulnerability;

@models.securityvulnerabilities.Vulnerability("Cookie without HttpOnly")
public class CookieWithoutHttpOnly implements SecurityVulnerability {

    class CookieWithoutHttpOnlyVector {

        String url;
    }

    List<CookieWithoutHttpOnlyVector> vectors = new ArrayList<CookieWithoutHttpOnlyVector>();

    @Override
    public void decode(Vulnerability w3afVulnerability) {
        CookieWithoutHttpOnlyVector vector = new CookieWithoutHttpOnlyVector();
        vector.url = w3afVulnerability.getUrl();
        this.vectors.add(vector);
    }

    @Override
    public String encode() {
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile("report/cookiewithouthttponly.template");
        StringWriter writer = new StringWriter();
        try {
            mustache.execute(writer, this).flush();
        } catch (Exception e) {

        }
        return writer.toString();
    }

}
