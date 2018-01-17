
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "moyenneCotations", namespace = "http://ws/test")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moyenneCotations", namespace = "http://ws/test")
public class GetMoyenne {

    @XmlElement(name = "cs", namespace = "")
    private String cs;

    /**
     * 
     * @return
     *     returns String
     */
    public String getCs() {
        return this.cs;
    }

    /**
     * 
     * @param cs
     *     the value for the cs property
     */
    public void setCs(String cs) {
        this.cs = cs;
    }

}
