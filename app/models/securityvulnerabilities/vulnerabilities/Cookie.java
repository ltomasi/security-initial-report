package models.securityvulnerabilities.vulnerabilities;

import java.io.StringWriter;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import models.securityvulnerabilities.SecurityVulnerability;
import models.w3afreport.Vulnerability;

@models.securityvulnerabilities.Vulnerability("Cookie")
public class Cookie implements SecurityVulnerability {

    @Override
    public void decode(Vulnerability w3afVulnerability) {
        // TODO Auto-generated method stub

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
