package com.lyh.jul082.fruit;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FruitController {

	
	@Autowired
	private FruitDAO fDAO;
	
	@RequestMapping(value = "/FruitController", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		fDAO.getAllFruits(req);
		
		return "index";
	}
	
}
