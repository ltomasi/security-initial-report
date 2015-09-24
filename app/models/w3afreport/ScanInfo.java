//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2015.09.13 �s 01:49:31 PM BRT 
//

package models.w3afreport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de anonymous complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conte�do esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}audit"/>
 *         &lt;element ref="{}auth"/>
 *         &lt;element ref="{}bruteforce"/>
 *         &lt;element ref="{}grep"/>
 *         &lt;element ref="{}evasion"/>
 *         &lt;element ref="{}output"/>
 *         &lt;element ref="{}mangle"/>
 *         &lt;element ref="{}crawl"/>
 *         &lt;element ref="{}infrastructure"/>
 *       &lt;/all>
 *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "scan-info")
public class ScanInfo {

    @XmlElement(required = true)
    protected Audit audit;
    @XmlElement(required = true)
    protected Auth auth;
    @XmlElement(required = true)
    protected Bruteforce bruteforce;
    @XmlElement(required = true)
    protected Grep grep;
    @XmlElement(required = true)
    protected Evasion evasion;
    @XmlElement(required = true)
    protected Output output;
    @XmlElement(required = true)
    protected Mangle mangle;
    @XmlElement(required = true)
    protected Crawl crawl;
    @XmlElement(required = true)
    protected Infrastructure infrastructure;
    @XmlAttribute(name = "target", required = true)
    protected String target;

    /**
     * Obt�m o valor da propriedade audit.
     * 
     * @return possible object is {@link Audit }
     * 
     */
    public Audit getAudit() {
        return this.audit;
    }

    /**
     * Define o valor da propriedade audit.
     * 
     * @param value
     *            allowed object is {@link Audit }
     * 
     */
    public void setAudit(Audit value) {
        this.audit = value;
    }

    /**
     * Obt�m o valor da propriedade auth.
     * 
     * @return possible object is {@link Auth }
     * 
     */
    public Auth getAuth() {
        return this.auth;
    }

    /**
     * Define o valor da propriedade auth.
     * 
     * @param value
     *            allowed object is {@link Auth }
     * 
     */
    public void setAuth(Auth value) {
        this.auth = value;
    }

    /**
     * Obt�m o valor da propriedade bruteforce.
     * 
     * @return possible object is {@link Bruteforce }
     * 
     */
    public Bruteforce getBruteforce() {
        return this.bruteforce;
    }

    /**
     * Define o valor da propriedade bruteforce.
     * 
     * @param value
     *            allowed object is {@link Bruteforce }
     * 
     */
    public void setBruteforce(Bruteforce value) {
        this.bruteforce = value;
    }

    /**
     * Obt�m o valor da propriedade grep.
     * 
     * @return possible object is {@link Grep }
     * 
     */
    public Grep getGrep() {
        return this.grep;
    }

    /**
     * Define o valor da propriedade grep.
     * 
     * @param value
     *            allowed object is {@link Grep }
     * 
     */
    public void setGrep(Grep value) {
        this.grep = value;
    }

    /**
     * Obt�m o valor da propriedade evasion.
     * 
     * @return possible object is {@link Evasion }
     * 
     */
    public Evasion getEvasion() {
        return this.evasion;
    }

    /**
     * Define o valor da propriedade evasion.
     * 
     * @param value
     *            allowed object is {@link Evasion }
     * 
     */
    public void setEvasion(Evasion value) {
        this.evasion = value;
    }

    /**
     * Obt�m o valor da propriedade output.
     * 
     * @return possible object is {@link Output }
     * 
     */
    public Output getOutput() {
        return this.output;
    }

    /**
     * Define o valor da propriedade output.
     * 
     * @param value
     *            allowed object is {@link Output }
     * 
     */
    public void setOutput(Output value) {
        this.output = value;
    }

    /**
     * Obt�m o valor da propriedade mangle.
     * 
     * @return possible object is {@link Mangle }
     * 
     */
    public Mangle getMangle() {
        return this.mangle;
    }

    /**
     * Define o valor da propriedade mangle.
     * 
     * @param value
     *            allowed object is {@link Mangle }
     * 
     */
    public void setMangle(Mangle value) {
        this.mangle = value;
    }

    /**
     * Obt�m o valor da propriedade crawl.
     * 
     * @return possible object is {@link Crawl }
     * 
     */
    public Crawl getCrawl() {
        return this.crawl;
    }

    /**
     * Define o valor da propriedade crawl.
     * 
     * @param value
     *            allowed object is {@link Crawl }
     * 
     */
    public void setCrawl(Crawl value) {
        this.crawl = value;
    }

    /**
     * Obt�m o valor da propriedade infrastructure.
     * 
     * @return possible object is {@link Infrastructure }
     * 
     */
    public Infrastructure getInfrastructure() {
        return this.infrastructure;
    }

    /**
     * Define o valor da propriedade infrastructure.
     * 
     * @param value
     *            allowed object is {@link Infrastructure }
     * 
     */
    public void setInfrastructure(Infrastructure value) {
        this.infrastructure = value;
    }

    /**
     * Obt�m o valor da propriedade target.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Define o valor da propriedade target.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTarget(String value) {
        this.target = value;
    }

}
