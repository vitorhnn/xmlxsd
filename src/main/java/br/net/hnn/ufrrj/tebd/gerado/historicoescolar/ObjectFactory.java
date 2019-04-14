
package br.net.hnn.ufrrj.tebd.gerado.historicoescolar;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mypackage package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HistoricoEscolar }
     */
    public HistoricoEscolar createHistoricoEscolar() {
        return new HistoricoEscolar();
    }

    /**
     * Create an instance of {@link AlunoType }
     */
    public AlunoType createAlunoType() {
        return new AlunoType();
    }

    /**
     * Create an instance of {@link PeriodosType }
     */
    public PeriodosType createPeriodosType() {
        return new PeriodosType();
    }

    /**
     * Create an instance of {@link MateriaType }
     */
    public MateriaType createMateriaType() {
        return new MateriaType();
    }

    /**
     * Create an instance of {@link PeriodoType }
     */
    public PeriodoType createPeriodoType() {
        return new PeriodoType();
    }

    /**
     * Create an instance of {@link MateriasType }
     */
    public MateriasType createMateriasType() {
        return new MateriasType();
    }

}
