
package br.net.hnn.ufrrj.tebd.gerado.historicoescolar;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java de PeriodosType complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="PeriodosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Periodo" type="{}PeriodoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodosType", propOrder = {
        "periodo"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PeriodosType {

    @XmlElement(name = "Periodo", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<PeriodoType> periodo;

    /**
     * Gets the value of the periodo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodoType }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<PeriodoType> getPeriodo() {
        if (periodo == null) {
            periodo = new ArrayList<PeriodoType>();
        }
        return this.periodo;
    }

}
