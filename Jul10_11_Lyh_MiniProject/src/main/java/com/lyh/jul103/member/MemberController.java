package com.lyh.jul103.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDAO mDAO;
	
	
	@RequestMapping(value = "/member.regist.go", method = RequestMethod.GET)
	public String goRegistController(HttpServletRequest req) {
		req.setAttribute("cp", "member/regist.jsp");
		req.setAttribute("lp", "member/login.jsp");	
		return "index";
	}
	
	@RequestMapping(value = "/member.regist", method = RequestMethod.POST)
	public String registController(HttpServletRequest req) {
		if (mDAO.signup(req)) {
			req.setAttribute("cp", "home.jsp");
			
		}else {
			req.setAttribute("cp", "member/regist.jsp");
			
		}
		req.setAttribute("lp", "member/login.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/member.login", method = RequestMethod.POST)
	public String loginController(HttpServletRequest req) {
		if (mDAO.login(req)) {
			req.setAttribute("cp", "home.jsp");
			req.setAttribute("lp", "member/miniInfo.jsp");
		}else {
			req.setAttribute("cp", "member/regist.jsp");
			req.setAttribute("lp", "member/login.jsp");
		}
		return "index";
	}
	
	@RequestMapping(value = "/member.update.go", method = RequestMethod.GET)
	public String goUpdateController(HttpServletRequest req) {
		if (mDAO.loginCheck(req)) {
			mDAO.getMemberInfo(req);
			req.setAttribute("cp", "member/update.jsp");
			req.setAttribute("lp", "member/miniInfo.jsp");
		}else {
			req.setAttribute("cp", "home.jsp");
			req.setAttribute("lp", "member/login.jsp");
		}
		return "index";
	}	
	
	@RequestMapping(value = "/member.update", method = RequestMethod.POST)
	public String updateController(HttpServletRequest req) {
		if (mDAO.loginCheck(req)) {
			mDAO.updateMember(req);
			mDAO.getMemberInfo(req);
			req.setAttribute("cp", "home.jsp");
			req.setAttribute("lp", "member/miniInfo.jsp");
		}else {
			req.setAttribute("cp", "home.jsp");
			req.setAttribute("lp", "member/login.jsp");
		}
		return "index";
	}
	
	@RequestMapping(value = "/member.delete", method = RequestMethod.GET)
	public String deleteController(HttpServletRequest req) {
		if (mDAO.loginCheck(req)) {
			mDAO.deleteMember(req);
		}
		req.setAttribute("cp", "home.jsp");
		req.setAttribute("lp", "member/login.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/member.logout", method = RequestMethod.GET)
	public String logoutCOntroller(HttpServletRequest req) {
		if (mDAO.loginCheck(req)) {
			mDAO.logoutMember(req);
		}
		req.setAttribute("cp", "home.jsp");
		req.setAttribute("lp", "member/login.jsp");
		return "index";
	}
}
