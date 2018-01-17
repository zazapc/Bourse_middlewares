package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import metier.Cotation;

public interface BourseRemote extends Remote {
	public double getMoyenneCotations(String cs)throws RemoteException;
	public List<Cotation> getCotations(String cs)throws RemoteException;
	

}
