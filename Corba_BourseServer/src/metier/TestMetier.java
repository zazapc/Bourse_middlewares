package metier;
import java.util.Iterator;
public class TestMetier {
	public static void main(String[] args){
		MetierBourse bourse =new MetierBourse();
		Iterator<Cotation> it=bourse.getCotations("SGMB").iterator();
		while(it.hasNext()){
			Cotation cot=it.next();
			System.out.println(cot.getDateCotation()+"\t"+cot.getValAction());
			
		}
	}
	//idlj -fall -v Bourse.idl
}
