package com.lyh.jul033;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lyh.jul033.calc.CalcDAO;

@Controller
public class HomeController {
	
	@Autowired
	private CalcDAO cDAO;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String input() {
		
		return "input";
	}
	
	@RequestMapping(value = "/HomeController", method = RequestMethod.GET)
	public String output(@RequestParam(value="op") String op, HttpServletRequest req) {
		if (op.equals("height")) {
			cDAO.convertHeight(req);
		}else if(op.equals("width")) {
			cDAO.convertWidth(req);
		}else if (op.equals("temp")) {
			cDAO.convertTemp(req);
		}else if (op.equals("vel")) {
			cDAO.convertVel(req);
		}
		return "output";
	
	
	
}
}
	