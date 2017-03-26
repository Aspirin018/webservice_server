package webservice_server;

import javax.xml.ws.Endpoint;

public class WeatherServer {
	public static void main(String[] args) {
		String address = "http://localhost:12345/weather";
		WeatherInterfaceImpl impl = new WeatherInterfaceImpl();
		Endpoint.publish(address, impl);
	}
}
