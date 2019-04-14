
package br.net.hnn.ufrrj.tebd.gerado.historicoescolar;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


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
 *         &lt;element name="Aluno" type="{}AlunoType"/>
 *         &lt;element name="Periodos" type="{}PeriodosType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "HistoricoEscolar")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class HistoricoEscolar {

    @XmlElement(name = "Aluno", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected AlunoType aluno;
    @XmlElement(name = "Periodos", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PeriodosType periodos;

    /**
     * Obtém o valor da propriedade aluno.
     *
     * @return possible object is
     * {@link AlunoType }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public AlunoType getAluno() {
        return aluno;
    }

    /**
     * Define o valor da propriedade aluno.
     *
     * @param value allowed object is
     *              {@link AlunoType }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAluno(AlunoType value) {
        this.aluno = value;
    }

    /**
     * Obtém o valor da propriedade periodos.
     *
     * @return possible object is
     * {@link PeriodosType }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PeriodosType getPeriodos() {
        return periodos;
    }

    /**
     * Define o valor da propriedade periodos.
     *
     * @param value allowed object is
     *              {@link PeriodosType }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPeriodos(PeriodosType value) {
        this.periodos = value;
    }

}
