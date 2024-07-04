package com.lyh.jul042.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lyh.jul042.student.StudentDAO;

@Controller
public class TestController {
	
	@Autowired
	private TestDAO tDAO;
	
	@Autowired
	private StudentDAO sDAO;
	
	@RequestMapping(value="/test.info", method = RequestMethod.GET)
	public String ViewTest(Test t, HttpServletRequest req) {
		tDAO.insertTestInfo(t, req);
		tDAO.getTestInfo(req);
		sDAO.getAllStudent(req);
		return "input";
	}
	
}
