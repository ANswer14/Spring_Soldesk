package com.lyh.jul103.weather;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyh.jul103.member.MemberDAO;

@Controller
public class WeatherController {

	
	@Autowired
	private MemberDAO mDAO;
	private WeatherDAO wDAO;
	
	/*@RequestMapping(value = "/weather.go", method = RequestMethod.GET)
	public String goWeather(HttpServletRequest req) {
		if (mDAO.loginCheck(req)) {
			req.setAttribute("lp", "member/miniInfo.jsp");
		}else {
			req.setAttribute("lp", "member/login.jsp");
		}
		req.setAttribute("cp", "weather/weather.jsp");
		return "index";
	}*/
	
	@RequestMapping(value = "/weather.get", method = RequestMethod.GET,
			produces = "application/xml; charset=UTF-8")
	public @ResponseBody String getKoreaWeather(HttpServletRequest req) {
		if (mDAO.loginCheck(req)) {
			req.setAttribute("lp", "member/miniInfo.jsp");
		}else {
			req.setAttribute("lp", "member/login.jsp");
		}
		
		req.setAttribute("cp", "weather/weatherInfo.jsp");
		return wDAO.getKoreaWeather(req);
				
	}
	
	
}
