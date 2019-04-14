
package br.net.hnn.ufrrj.tebd.gerado.historicoescolar;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Classe Java de MateriaType complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="MateriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Resultado" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Situacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MateriaType", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class MateriaType {

    @XmlElement(name = "Nome", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String nome;
    @XmlElement(name = "Codigo", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String codigo;
    @XmlElement(name = "Resultado", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigDecimal resultado;
    @XmlElement(name = "Situacao", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String situacao;

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
     * Obtém o valor da propriedade codigo.
     *
     * @return possible object is
     * {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade resultado.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigDecimal getResultado() {
        return resultado;
    }

    /**
     * Define o valor da propriedade resultado.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setResultado(BigDecimal value) {
        this.resultado = value;
    }

    /**
     * Obtém o valor da propriedade situacao.
     *
     * @return possible object is
     * {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getSituacao() {
        return situacao;
    }

    /**
     * Define o valor da propriedade situacao.
     *
     * @param value allowed object is
     *              {@link String }
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-04-13T09:35:35-03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSituacao(String value) {
        this.situacao = value;
    }

}
