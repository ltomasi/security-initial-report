//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2015.09.13 �s 01:49:31 PM BRT 
//

package models.w3afreport;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence>
 *         &lt;element name="w3af-version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}scan-info"/>
 *         &lt;element ref="{}vulnerability" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}error" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="start-long" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{}version use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "w3AfVersion", "scanInfo", "vulnerability", "error" })
@XmlRootElement(name = "w3af-run")
public class W3AfRun {

    @XmlElement(name = "w3af-version", required = true)
    protected String w3AfVersion;
    @XmlElement(name = "scan-info", required = true)
    protected ScanInfo scanInfo;
    protected List<Vulnerability> vulnerability;
    protected List<Error> error;
    @XmlAttribute(name = "start", required = true)
    protected BigInteger start;
    @XmlAttribute(name = "start-long", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String startLong;
    @XmlAttribute(name = "version", required = true)
    protected BigDecimal version;

    /**
     * Obt�m o valor da propriedade w3AfVersion.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getW3AfVersion() {
        return this.w3AfVersion;
    }

    /**
     * Define o valor da propriedade w3AfVersion.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setW3AfVersion(String value) {
        this.w3AfVersion = value;
    }

    /**
     * Obt�m o valor da propriedade scanInfo.
     * 
     * @return possible object is {@link ScanInfo }
     * 
     */
    public ScanInfo getScanInfo() {
        return this.scanInfo;
    }

    /**
     * Define o valor da propriedade scanInfo.
     * 
     * @param value
     *            allowed object is {@link ScanInfo }
     * 
     */
    public void setScanInfo(ScanInfo value) {
        this.scanInfo = value;
    }

    /**
     * Gets the value of the vulnerability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the vulnerability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getVulnerability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vulnerability }
     * 
     * 
     */
    public List<Vulnerability> getVulnerability() {
        if (this.vulnerability == null) {
            this.vulnerability = new ArrayList<Vulnerability>();
        }
        return this.vulnerability;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Error }
     * 
     * 
     */
    public List<Error> getError() {
        if (this.error == null) {
            this.error = new ArrayList<Error>();
        }
        return this.error;
    }

    /**
     * Obt�m o valor da propriedade start.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getStart() {
        return this.start;
    }

    /**
     * Define o valor da propriedade start.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setStart(BigInteger value) {
        this.start = value;
    }

    /**
     * Obt�m o valor da propriedade startLong.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStartLong() {
        return this.startLong;
    }

    /**
     * Define o valor da propriedade startLong.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setStartLong(String value) {
        this.startLong = value;
    }

    /**
     * Obt�m o valor da propriedade version.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getVersion() {
        return this.version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

}
