
package br.net.hnn.ufrrj.tebd.gerado.pedido;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArgumentosType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArgumentosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Argumento" type="{}ArgumentoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArgumentosType", propOrder = {
    "argumento"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class ArgumentosType {

    @XmlElement(name = "Argumento", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<ArgumentoType> argumento;

    /**
     * Gets the value of the argumento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the argumento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArgumento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArgumentoType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T11:46:08-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<ArgumentoType> getArgumento() {
        if (argumento == null) {
            argumento = new ArrayList<ArgumentoType>();
        }
        return this.argumento;
    }

}
