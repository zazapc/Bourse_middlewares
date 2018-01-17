package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import metier.Cotation;
import metier.MetierBourse;

public class BourseImpl extends UnicastRemoteObject implements BourseRemote {
    private MetierBourse metier;
	public BourseImpl() throws RemoteException {
		metier=new MetierBourse();
	}

	@Override
	public double getMoyenneCotations(String cs) throws RemoteException {
		List<Cotation> cots=metier.getCotations(cs);
		double some=0;
		for(Cotation c:cots)
			some+=c.getValAction();
		return some/cots.size();
	}

	@Override
	public List<Cotation> getCotations(String cs) throws RemoteException {
		List<Cotation> cots=metier.getCotations(cs);
		return cots;
	}
	//rmic rmi.BourseImpl
}
