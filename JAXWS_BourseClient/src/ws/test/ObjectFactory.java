
package ws.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.test package. 
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

    private final static QName _GetCotations_QNAME = new QName("http://ws/test", "getCotations");
    private final static QName _MoyenneCotationsResponse_QNAME = new QName("http://ws/test", "moyenneCotationsResponse");
    private final static QName _MoyenneCotations_QNAME = new QName("http://ws/test", "moyenneCotations");
    private final static QName _GetCotationsResponse_QNAME = new QName("http://ws/test", "getCotationsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCotations }
     * 
     */
    public GetCotations createGetCotations() {
        return new GetCotations();
    }

    /**
     * Create an instance of {@link MoyenneCotationsResponse }
     * 
     */
    public MoyenneCotationsResponse createMoyenneCotationsResponse() {
        return new MoyenneCotationsResponse();
    }

    /**
     * Create an instance of {@link GetCotationsResponse }
     * 
     */
    public GetCotationsResponse createGetCotationsResponse() {
        return new GetCotationsResponse();
    }

    /**
     * Create an instance of {@link MoyenneCotations }
     * 
     */
    public MoyenneCotations createMoyenneCotations() {
        return new MoyenneCotations();
    }

    /**
     * Create an instance of {@link Cotation }
     * 
     */
    public Cotation createCotation() {
        return new Cotation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCotations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/test", name = "getCotations")
    public JAXBElement<GetCotations> createGetCotations(GetCotations value) {
        return new JAXBElement<GetCotations>(_GetCotations_QNAME, GetCotations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoyenneCotationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/test", name = "moyenneCotationsResponse")
    public JAXBElement<MoyenneCotationsResponse> createMoyenneCotationsResponse(MoyenneCotationsResponse value) {
        return new JAXBElement<MoyenneCotationsResponse>(_MoyenneCotationsResponse_QNAME, MoyenneCotationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoyenneCotations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/test", name = "moyenneCotations")
    public JAXBElement<MoyenneCotations> createMoyenneCotations(MoyenneCotations value) {
        return new JAXBElement<MoyenneCotations>(_MoyenneCotations_QNAME, MoyenneCotations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCotationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/test", name = "getCotationsResponse")
    public JAXBElement<GetCotationsResponse> createGetCotationsResponse(GetCotationsResponse value) {
        return new JAXBElement<GetCotationsResponse>(_GetCotationsResponse_QNAME, GetCotationsResponse.class, null, value);
    }

}
