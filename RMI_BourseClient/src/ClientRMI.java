import java.rmi.Naming;
import java.util.List;

import metier.Cotation;
import rmi.BourseRemote;

public class ClientRMI {

	public static void main(String[] args) {
		try {
			BourseRemote stub=(BourseRemote) Naming.lookup("rmi://localhost:1099/BOURSE");
		    double moyenne=stub.getMoyenneCotations("SGMB");
		    List<Cotation> cots=stub.getCotations("SGMB");
		    System.out.println("Moyenne :"+moyenne);
		    for(Cotation c:cots)
		    	System.out.println(c.getDateCotation()+"--"+c.getValAction());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
