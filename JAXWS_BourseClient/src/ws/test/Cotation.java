
package ws.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cotation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cotation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeSociete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateCotation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numCotation" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="valAction" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cotation", propOrder = {
    "codeSociete",
    "dateCotation",
    "numCotation",
    "valAction"
})
public class Cotation {

    protected String codeSociete;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCotation;
    protected long numCotation;
    protected double valAction;

    /**
     * Gets the value of the codeSociete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSociete() {
        return codeSociete;
    }

    /**
     * Sets the value of the codeSociete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSociete(String value) {
        this.codeSociete = value;
    }

    /**
     * Gets the value of the dateCotation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCotation() {
        return dateCotation;
    }

    /**
     * Sets the value of the dateCotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCotation(XMLGregorianCalendar value) {
        this.dateCotation = value;
    }

    /**
     * Gets the value of the numCotation property.
     * 
     */
    public long getNumCotation() {
        return numCotation;
    }

    /**
     * Sets the value of the numCotation property.
     * 
     */
    public void setNumCotation(long value) {
        this.numCotation = value;
    }

    /**
     * Gets the value of the valAction property.
     * 
     */
    public double getValAction() {
        return valAction;
    }

    /**
     * Sets the value of the valAction property.
     * 
     */
    public void setValAction(double value) {
        this.valAction = value;
    }

}
