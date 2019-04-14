
package br.net.hnn.ufrrj.tebd.gerado.pedido;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Metodo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Argumentos" type="{}ArgumentosType"/>
 *       &lt;/all>
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
@XmlRootElement(name = "Pedido")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Pedido {

    @XmlElement(name = "Metodo", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String metodo;
    @XmlElement(name = "Argumentos", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ArgumentosType argumentos;

    /**
     * Obtém o valor da propriedade metodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getMetodo() {
        return metodo;
    }

    /**
     * Define o valor da propriedade metodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMetodo(String value) {
        this.metodo = value;
    }

    /**
     * Obtém o valor da propriedade argumentos.
     * 
     * @return
     *     possible object is
     *     {@link ArgumentosType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ArgumentosType getArgumentos() {
        return argumentos;
    }

    /**
     * Define o valor da propriedade argumentos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArgumentosType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setArgumentos(ArgumentosType value) {
        this.argumentos = value;
    }

}
