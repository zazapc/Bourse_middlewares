package metier;
import java.io.Serializable;
import java.util.Date;

public class Cotation implements Serializable {
	private long numCotation;
	private String codeSociete;
	private Date dateCotation;
	private double valAction;
	
	public Cotation( String codeSociete, Date dateCotation, double valAction) {
		this.codeSociete = codeSociete;
		this.dateCotation = dateCotation;
		this.valAction = valAction;
	}
	public Cotation() {
	
	}
	public long getNumCotation() {
		return numCotation;
	}
	public void setNumCotation(long numCotation) {
		this.numCotation = numCotation;
	}
	public String getCodeSociete() {
		return codeSociete;
	}
	public void setCodeSociete(String codeSociete) {
		this.codeSociete = codeSociete;
	}
	public Date getDateCotation() {
		return dateCotation;
	}
	public void setDateCotation(Date dateCotation) {
		this.dateCotation = dateCotation;
	}
	public double getValAction() {
		return valAction;
	}
	public void setValAction(double valAction) {
		this.valAction = valAction;
	}
	@Override
	public String toString() {
		return "numCotation=" + numCotation + ", codeSociete="
				+ codeSociete + ", dateCotation=" + dateCotation
				+ ", valAction=" + valAction + "]";
	}
	
	
	

}
