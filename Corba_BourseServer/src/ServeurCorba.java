import org.omg.CORBA.ORB;
import org.omg.CosNaming.*;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import servants.BourseImpl;

public class ServeurCorba {

	public static void main(String[] args) {
		try {
			ORB orb=ORB.init(args,null);
			POA rootPOA=POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootPOA.the_POAManager().activate();
			BourseImpl od=new BourseImpl();
			NamingContext root=NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
			NameComponent[] nsNom=new NameComponent[1];
			nsNom[0]=new NameComponent("BOURSE","");
			root.rebind(nsNom, rootPOA.servant_to_reference(od));
			orb.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//start tnameserv
		//start javaServeurCorba
	}

}
