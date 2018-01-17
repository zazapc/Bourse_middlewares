package metier;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MetierBourse {
	public List<Cotation> getCotations(String codeSoc){
	List<Cotation> cotations=new ArrayList<Cotation>();
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bourse_ws","root","");
		PreparedStatement ps=conn.prepareStatement("select * from cotations where CODE_SOCIETE=?");
		ps.setString(1, codeSoc);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			Cotation cot=new Cotation();
			cot.setNumCotation(rs.getLong("NUM_COTATION"));
			cot.setDateCotation(rs.getDate("DATE_COTATION"));
			cot.setValAction(rs.getDouble("VAL_ACTION"));
			cotations.add(cot);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return (cotations);
	}
}
