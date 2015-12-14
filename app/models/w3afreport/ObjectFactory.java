//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2015.09.13 �s 01:49:31 PM BRT 
//

package models.w3afreport;

import java.math.BigInteger;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the generated package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VulnerabilityFixEffort_QNAME = new QName("", "fix-effort");
    private final static QName _VulnerabilityReferences_QNAME = new QName("", "references");
    private final static QName _VulnerabilityFixGuidance_QNAME = new QName("", "fix-guidance");
    private final static QName _VulnerabilityDescription_QNAME = new QName("", "description");
    private final static QName _VulnerabilityHttpTransactions_QNAME = new QName("", "http-transactions");
    private final static QName _VulnerabilityLongDescription_QNAME = new QName("", "long-description");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Auth }
     * 
     */
    public Auth createAuth() {
        return new Auth();
    }

    /**
     * Create an instance of {@link Plugin }
     * 
     */
    public Plugin createPlugin() {
        return new Plugin();
    }

    /**
     * Create an instance of {@link Config }
     * 
     */
    public Config createConfig() {
        return new Config();
    }

    /**
     * Create an instance of {@link Grep }
     * 
     */
    public Grep createGrep() {
        return new Grep();
    }

    /**
     * Create an instance of {@link Bruteforce }
     * 
     */
    public Bruteforce createBruteforce() {
        return new Bruteforce();
    }

    /**
     * Create an instance of {@link Vulnerability }
     * 
     */
    public Vulnerability createVulnerability() {
        return new Vulnerability();
    }

    /**
     * Create an instance of {@link References }
     * 
     */
    public References createReferences() {
        return new References();
    }

    /**
     * Create an instance of {@link HttpTransactions }
     * 
     */
    public HttpTransactions createHttpTransactions() {
        return new HttpTransactions();
    }

    /**
     * Create an instance of {@link Mangle }
     * 
     */
    public Mangle createMangle() {
        return new Mangle();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link HttpRequest }
     * 
     */
    public HttpRequest createHttpRequest() {
        return new HttpRequest();
    }

    /**
     * Create an instance of {@link Headers }
     * 
     */
    public Headers createHeaders() {
        return new Headers();
    }

    /**
     * Create an instance of {@link Crawl }
     * 
     */
    public Crawl createCrawl() {
        return new Crawl();
    }

    /**
     * Create an instance of {@link Output }
     * 
     */
    public Output createOutput() {
        return new Output();
    }

    /**
     * Create an instance of {@link ScanInfo }
     * 
     */
    public ScanInfo createScanInfo() {
        return new ScanInfo();
    }

    /**
     * Create an instance of {@link Audit }
     * 
     */
    public Audit createAudit() {
        return new Audit();
    }

    /**
     * Create an instance of {@link Evasion }
     * 
     */
    public Evasion createEvasion() {
        return new Evasion();
    }

    /**
     * Create an instance of {@link Infrastructure }
     * 
     */
    public Infrastructure createInfrastructure() {
        return new Infrastructure();
    }

    /**
     * Create an instance of {@link W3AfRun }
     * 
     */
    public W3AfRun createW3AfRun() {
        return new W3AfRun();
    }

    /**
     * Create an instance of {@link HttpResponse }
     * 
     */
    public HttpResponse createHttpResponse() {
        return new HttpResponse();
    }

    /**
     * Create an instance of {@link Reference }
     * 
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link HttpTransaction }
     * 
     */
    public HttpTransaction createHttpTransaction() {
        return new HttpTransaction();
    }

    /**
     * Create an instance of {@link PluginType }
     * 
     */
    public PluginType createPluginType() {
        return new PluginType();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }
     * {@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fix-effort", scope = Vulnerability.class)
    public JAXBElement<BigInteger> createVulnerabilityFixEffort(BigInteger value) {
        return new JAXBElement<BigInteger>(ObjectFactory._VulnerabilityFixEffort_QNAME, BigInteger.class,
                Vulnerability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link References }
     * {@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "references", scope = Vulnerability.class)
    public JAXBElement<References> createVulnerabilityReferences(References value) {
        return new JAXBElement<References>(ObjectFactory._VulnerabilityReferences_QNAME, References.class,
                Vulnerability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }
     * {@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fix-guidance", scope = Vulnerability.class)
    public JAXBElement<String> createVulnerabilityFixGuidance(String value) {
        return new JAXBElement<String>(ObjectFactory._VulnerabilityFixGuidance_QNAME, String.class, Vulnerability.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }
     * {@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = Vulnerability.class)
    public JAXBElement<String> createVulnerabilityDescription(String value) {
        return new JAXBElement<String>(ObjectFactory._VulnerabilityDescription_QNAME, String.class, Vulnerability.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}
     * {@link HttpTransactions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "http-transactions", scope = Vulnerability.class)
    public JAXBElement<HttpTransactions> createVulnerabilityHttpTransactions(HttpTransactions value) {
        return new JAXBElement<HttpTransactions>(ObjectFactory._VulnerabilityHttpTransactions_QNAME,
                HttpTransactions.class, Vulnerability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }
     * {@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "long-description", scope = Vulnerability.class)
    public JAXBElement<String> createVulnerabilityLongDescription(String value) {
        return new JAXBElement<String>(ObjectFactory._VulnerabilityLongDescription_QNAME, String.class,
                Vulnerability.class, value);
    }

}
