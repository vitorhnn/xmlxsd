
package br.net.hnn.ufrrj.tebd.gerado.historicoescolar;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AlunoType complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="AlunoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Matricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Curso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlunoType", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class AlunoType {

    @XmlElement(name = "Nome", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String nome;
    @XmlElement(name = "Matricula", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String matricula;
    @XmlElement(name = "Curso", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String curso;

    /**
     * Obtém o valor da propriedade nome.
     *
     * @return possible object is
     * {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     *
     * @param value allowed object is
     *              {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade matricula.
     *
     * @return possible object is
     * {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define o valor da propriedade matricula.
     *
     * @param value allowed object is
     *              {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtém o valor da propriedade curso.
     *
     * @return possible object is
     * {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCurso() {
        return curso;
    }

    /**
     * Define o valor da propriedade curso.
     *
     * @param value allowed object is
     *              {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCurso(String value) {
        this.curso = value;
    }

}
