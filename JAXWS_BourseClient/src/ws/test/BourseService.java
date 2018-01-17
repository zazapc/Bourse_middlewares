
package ws.test;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BourseService", targetNamespace = "http://ws/test")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BourseService {


    /**
     * 
     * @param cs
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "moyenneCotations", targetNamespace = "http://ws/test", className = "ws.test.MoyenneCotations")
    @ResponseWrapper(localName = "moyenneCotationsResponse", targetNamespace = "http://ws/test", className = "ws.test.MoyenneCotationsResponse")
    @Action(input = "http://ws/test/BourseService/moyenneCotationsRequest", output = "http://ws/test/BourseService/moyenneCotationsResponse")
    public double moyenneCotations(
        @WebParam(name = "cs", targetNamespace = "")
        String cs);

    /**
     * 
     * @param cs
     * @return
     *     returns java.util.List<ws.test.Cotation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCotations", targetNamespace = "http://ws/test", className = "ws.test.GetCotations")
    @ResponseWrapper(localName = "getCotationsResponse", targetNamespace = "http://ws/test", className = "ws.test.GetCotationsResponse")
    @Action(input = "http://ws/test/BourseService/getCotationsRequest", output = "http://ws/test/BourseService/getCotationsResponse")
    public List<Cotation> getCotations(
        @WebParam(name = "cs", targetNamespace = "")
        String cs);

}