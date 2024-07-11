package com.lyh.jul103;

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

import com.lyh.jul103.member.MemberDAO;

@Controller
public class HomeController {
	
	@Autowired
	private MemberDAO mDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		req.setAttribute("cp", "home.jsp");
		req.setAttribute("lp", "member/login.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home2(HttpServletRequest req) {
		if (mDAO.loginCheck(req)) {
			req.setAttribute("lp", "member/miniInfo.jsp");
		}else {
			req.setAttribute("lp", "member/login.jsp");
		}
		req.setAttribute("cp", "home.jsp");
		return "index";
	}
}
