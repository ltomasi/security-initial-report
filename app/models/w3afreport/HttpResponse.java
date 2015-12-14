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
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="headers" type="{}headers"/>
 *         &lt;element ref="{}body" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "status", "headers", "body" })
@XmlRootElement(name = "http-response")
public class HttpResponse {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected Headers headers;
    protected Body body;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Obt�m o valor da propriedade status.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obt�m o valor da propriedade headers.
     * 
     * @return possible object is {@link Headers }
     * 
     */
    public Headers getHeaders() {
        return this.headers;
    }

    /**
     * Define o valor da propriedade headers.
     * 
     * @param value
     *            allowed object is {@link Headers }
     * 
     */
    public void setHeaders(Headers value) {
        this.headers = value;
    }

    /**
     * Obt�m o valor da propriedade body.
     * 
     * @return possible object is {@link Body }
     * 
     */
    public Body getBody() {
        return this.body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *            allowed object is {@link Body }
     * 
     */
    public void setBody(Body value) {
        this.body = value;
    }

    /**
     * Obt�m o valor da propriedade id.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {
        return this.id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setId(String value) {
        this.id = value;
    }

}
