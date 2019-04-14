
package br.net.hnn.ufrrj.tebd.gerado.pedido;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArgumentoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArgumentoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArgumentoType", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class ArgumentoType {

    @XmlElement(name = "Nome", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String nome;
    @XmlElement(name = "Valor", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String valor;

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValor(String value) {
        this.valor = value;
    }

}
