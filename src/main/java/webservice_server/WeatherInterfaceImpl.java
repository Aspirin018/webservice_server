package webservice_server;

import javax.jws.WebService;

@WebService
public class WeatherInterfaceImpl implements WeatherInterface{

	public String getWeatherByCity(String city) {
		// TODO Auto-generated method stub
		System.out.println("接收到客户端请求的城市："+ city);
		String result = "天气很冷";
		System.out.println("返回天气：" + result);
		return result;
	}


}
