package servants;
import java.util.List;

import metier.Cotation;
import metier.MetierBourse;
import bourse.BoursePOA;
import bourse.CCotation;
public class BourseImpl extends BoursePOA {
	private MetierBourse metier;

	public BourseImpl() {
		metier =new MetierBourse();
	}

	@Override
	public CCotation[] getCotations(String cs) {
		List<Cotation> cots=metier.getCotations(cs);
		CCotation[] lesCots=new CCotation[cots.size()];
		for(int i=0;i<cots.size();i++){
			Cotation mc=cots.get(i);
			CCotation cc=new CCotation();
			cc.numCotation=mc.getNumCotation();
			cc.dateCotation=mc.getDateCotation().toString();
			cc.valAction=mc.getValAction();
			cc.codeSociete=mc.getCodeSociete();
			lesCots[i]=cc;			
		}
		return lesCots;
	}

	@Override
	public double getMoyennesCotations(String cs) {
		List<Cotation> cots=metier.getCotations(cs);
		double some=0;
		for(Cotation c:cots){
			some+=c.getValAction();
		}
		return some/cots.size();
	}
	

}
