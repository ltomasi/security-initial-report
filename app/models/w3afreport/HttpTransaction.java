//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2015.09.13 �s 01:49:31 PM BRT 
//

package models.w3afreport;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de http-transaction complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conte�do esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType name="http-transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}http-request" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}http-response" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "http-transaction", propOrder = { "httpRequest", "httpResponse" })
public class HttpTransaction {

    @XmlElement(name = "http-request")
    protected List<HttpRequest> httpRequest;
    @XmlElement(name = "http-response")
    protected List<HttpResponse> httpResponse;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the httpRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the httpRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getHttpRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HttpRequest }
     * 
     * 
     */
    public List<HttpRequest> getHttpRequest() {
        if (this.httpRequest == null) {
            this.httpRequest = new ArrayList<HttpRequest>();
        }
        return this.httpRequest;
    }

    /**
     * Gets the value of the httpResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the httpResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getHttpResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HttpResponse }
     * 
     * 
     */
    public List<HttpResponse> getHttpResponse() {
        if (this.httpResponse == null) {
            this.httpResponse = new ArrayList<HttpResponse>();
        }
        return this.httpResponse;
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
