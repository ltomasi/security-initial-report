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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

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
 *       &lt;attribute name="caller" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "content" })
@XmlRootElement(name = "error")
public class Error {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "caller", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String caller;

    /**
     * Obt�m o valor da propriedade content.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Define o valor da propriedade content.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Obt�m o valor da propriedade caller.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * Define o valor da propriedade caller.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCaller(String value) {
        this.caller = value;
    }

}
