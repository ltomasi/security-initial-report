package models.securityvulnerabilities.vulnerabilities;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import models.securityvulnerabilities.SecurityVulnerability;
import models.securityvulnerabilities.Vulnerability;

@Vulnerability("SQL injection")
public class SqlInjection implements SecurityVulnerability {

    class SqlInjectionVector {

        String vulParam;

        public String encode() {
            return this.vulParam;
        }
    }

    List<SqlInjectionVector> vectors = new ArrayList<SqlInjectionVector>();

    @Override
    public void decode(models.w3afreport.Vulnerability w3afVulnerability) {
        SqlInjectionVector vector = new SqlInjectionVector();
        vector.vulParam = w3afVulnerability.getVar();
        this.vectors.add(vector);
    }

    @Override
    public String encode() {
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile("report/sqlinjection.template");
        StringWriter writer = new StringWriter();
        try {
            mustache.execute(writer, this).flush();
        } catch (Exception e) {

        }
        return writer.toString();
    }

}
