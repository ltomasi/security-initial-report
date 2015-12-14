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
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="content-encoding" use="required" type="{}content-encoding" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "value" })
@XmlRootElement(name = "body")
public class Body {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "content-encoding", required = true)
    protected ContentEncoding contentEncoding;

    /**
     * Obt�m o valor da propriedade value.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obt�m o valor da propriedade contentEncoding.
     * 
     * @return possible object is {@link ContentEncoding }
     * 
     */
    public ContentEncoding getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Define o valor da propriedade contentEncoding.
     * 
     * @param value
     *            allowed object is {@link ContentEncoding }
     * 
     */
    public void setContentEncoding(ContentEncoding value) {
        this.contentEncoding = value;
    }

}
