
package dev.ifrs.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dev.ifrs.ws package. 
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

    private final static QName _Convert2_QNAME = new QName("http://ws.ifrs.dev/", "convert2");
    private final static QName _Convert1_QNAME = new QName("http://ws.ifrs.dev/", "convert1");
    private final static QName _Convert2Response_QNAME = new QName("http://ws.ifrs.dev/", "convert2Response");
    private final static QName _Convert1Response_QNAME = new QName("http://ws.ifrs.dev/", "convert1Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dev.ifrs.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Convert2Response }
     * 
     */
    public Convert2Response createConvert2Response() {
        return new Convert2Response();
    }

    /**
     * Create an instance of {@link Convert1Response }
     * 
     */
    public Convert1Response createConvert1Response() {
        return new Convert1Response();
    }

    /**
     * Create an instance of {@link Convert2 }
     * 
     */
    public Convert2 createConvert2() {
        return new Convert2();
    }

    /**
     * Create an instance of {@link Convert1 }
     * 
     */
    public Convert1 createConvert1() {
        return new Convert1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ifrs.dev/", name = "convert2")
    public JAXBElement<Convert2> createConvert2(Convert2 value) {
        return new JAXBElement<Convert2>(_Convert2_QNAME, Convert2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ifrs.dev/", name = "convert1")
    public JAXBElement<Convert1> createConvert1(Convert1 value) {
        return new JAXBElement<Convert1>(_Convert1_QNAME, Convert1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ifrs.dev/", name = "convert2Response")
    public JAXBElement<Convert2Response> createConvert2Response(Convert2Response value) {
        return new JAXBElement<Convert2Response>(_Convert2Response_QNAME, Convert2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ifrs.dev/", name = "convert1Response")
    public JAXBElement<Convert1Response> createConvert1Response(Convert1Response value) {
        return new JAXBElement<Convert1Response>(_Convert1Response_QNAME, Convert1Response.class, null, value);
    }

}
