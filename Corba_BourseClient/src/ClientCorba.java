import org.omg.CORBA.ORB;
import org.omg.CosNaming.*;

import bourse.Bourse;
import bourse.BourseHelper;
import bourse.CCotation;

public class ClientCorba {

	public static void main(String[] args) {
		try {
			ORB orb = ORB.init(args, null);
			NamingContext root=NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
			NameComponent[] nsNom=new NameComponent[1];
			nsNom[0]=new NameComponent("BOURSE","");
			org.omg.CORBA.Object refObj=root.resolve(nsNom);
			Bourse stub=BourseHelper.narrow(refObj);
			System.out.println("Moyenne des Cotation de SGMB :"+stub.getMoyennesCotations("SGMB"));
			/*CCotation[] cots=stub.getCotations("SGMB");
			for(CCotation cc:cots){
				System.out.println(cc.dateCotation+"--"+cc.valAction);
			}*/
			} catch (Exception e) {
			e.printStackTrace();
		}
//java ClientCorba
	}

}
