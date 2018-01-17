package ws;

import javax.xml.ws.Endpoint;

public class ServeurJAXWS {

	public static void main(String[] args) {
		String url="http://localhost:8787/BourseWS";//?wsdl
		Endpoint.publish(url, new BourseService());
		System.out.println(url);
	}
	//Client src ->wsimport -s . Bourse.wsdl
}
