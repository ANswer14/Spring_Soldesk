package com.lyh.jul033.calc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class CalcDAO {
	public void convertHeight(HttpServletRequest req) {
		int cm = Integer.parseInt(req.getParameter("num"));
		double inch = cm / 2.54; 
		String ans = toString().format("%.3f", inch);
		req.setAttribute("h", "#ff0000");
		req.setAttribute("b", cm + "㎝");
		req.setAttribute("r", ans + "inch");
	}
	
	public void convertWidth(HttpServletRequest req) {
		int m2 = Integer.parseInt(req.getParameter("num"));
		double width = m2 / 3.306;
		String ans = toString().format("%.3f", width);
		req.setAttribute("h", "#008000");
		req.setAttribute("b", m2 + "㎡");
		req.setAttribute("r", ans + "평");
	}
	
	public void convertTemp(HttpServletRequest req) {
		int C = Integer.parseInt(req.getParameter("num"));
		double F = (C * 1.8) + 32;
		String ans = toString().format("%.3f", F);		
		req.setAttribute("h", "#0080ff");
		req.setAttribute("b", C + "℃");
		req.setAttribute("r", ans + "℉");
	}
	
	public void convertVel(HttpServletRequest req) {
		int mi = Integer.parseInt(req.getParameter("num"));
		double km = mi * 1.609;
		String ans = toString().format("%.3f", km);
		req.setAttribute("h", "pink");
		req.setAttribute("b", mi + "mi/h");
		req.setAttribute("r", ans + "km/h");
	}
}
