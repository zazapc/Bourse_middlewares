import java.util.List;

import ws.test.BourseService;
import ws.test.BourseWS;
import ws.test.Cotation;


public class ClientJAXWS {

	public static void main(String[] args) {
		BourseService stub=new BourseWS().getBourseServicePort();
		double moy=stub.moyenneCotations("SGMB");
		List<Cotation> cots=stub.getCotations("SGMB");
		System.out.println("Moyenn"+moy);
		for(Cotation c:cots){
			System.out.println(c.getDateCotation()+"--"+c.getValAction());
		}
		

	}

}
