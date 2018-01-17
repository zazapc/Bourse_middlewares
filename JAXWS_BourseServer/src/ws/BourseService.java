package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Cotation;
import metier.MetierBourse;

@WebService(serviceName="BourseWS", targetNamespace="http://ws/test")
public class BourseService {
	private MetierBourse metier;

	public BourseService() {
	metier=new MetierBourse();	
	}
	@WebMethod(operationName="moyenneCotations")
	public double getMoyenne(@WebParam(name="cs")String cs){
		List<Cotation> cots=metier.getCotations(cs);
		double some=0;
		for(Cotation c:cots)
			some+=c.getValAction();
		return some/cots.size();
	}
	@WebMethod(operationName="getCotations")
	public List<Cotation> getCotations(@WebParam(name="cs")String cs){
		return metier.getCotations(cs);
	}
//wsgen -s . -wsdl -cp ../bin ws.BourseService
}
