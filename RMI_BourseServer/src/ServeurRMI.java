

import java.rmi.Naming;

import rmi.BourseImpl;


public class ServeurRMI {

	public static void main(String[] args) {
		try {
			BourseImpl od=new BourseImpl();
			Naming.rebind("rmi://localhost:1099/BOURSE", od);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//start rmiregistry
	//start java ServeurRMI
	
}
