
package br.net.hnn.ufrrj.tebd.gerado.pedido;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.net.hnn.ufrrj.tebd.gerado.pedido package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.net.hnn.ufrrj.tebd.gerado.pedido
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link ArgumentosType }
     * 
     */
    public ArgumentosType createArgumentosType() {
        return new ArgumentosType();
    }

    /**
     * Create an instance of {@link ArgumentoType }
     * 
     */
    public ArgumentoType createArgumentoType() {
        return new ArgumentoType();
    }

}
