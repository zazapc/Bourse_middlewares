
package ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCotationsResponse", namespace = "http://ws/test")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCotationsResponse", namespace = "http://ws/test")
public class GetCotationsResponse {

    @XmlElement(name = "return", namespace = "")
    private List<metier.Cotation> _return;

    /**
     * 
     * @return
     *     returns List<Cotation>
     */
    public List<metier.Cotation> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<metier.Cotation> _return) {
        this._return = _return;
    }

}
