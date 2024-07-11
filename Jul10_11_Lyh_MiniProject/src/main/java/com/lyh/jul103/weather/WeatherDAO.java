package com.lyh.jul103.weather;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class WeatherDAO {

	
	public String getKoreaWeather (HttpServletRequest req) {
		try {
			
			URL u = new URL("https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4141051000");
			
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			
			StringBuffer sb = new StringBuffer();
			String line = null;
			while ( (line = br.readLine()) != null) {
				sb.append(line.replace("\r\n", ""));
			}
			
			return sb.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
}
