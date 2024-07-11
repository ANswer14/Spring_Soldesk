package com.lyh.jul103.member;

import java.io.File;
import java.net.URLEncoder;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import oracle.sql.DATE;

@Service
public class MemberDAO {
	
	@Autowired
	private SqlSession ss;
	
	public boolean signup(HttpServletRequest req){
		try {
			String path = req.getSession().getServletContext().getRealPath("resources/m_photo");
			System.out.println(path);
			MultipartRequest mr = new MultipartRequest(req, path,
					30 * 1024 * 1024, "UTF-8", new DefaultFileRenamePolicy()
					);
			String year = mr.getParameter("m_year");
			String month = mr.getParameter("m_month");
			String day = mr.getParameter("m_day");
			String photo = mr.getFilesystemName("m_photo");
			String photoKr = URLEncoder.encode(photo,"UTF-8").replace("+", " ");
			if (month.length() == 1) {
				month = "0" + month;
			}
			if (day.length() == 1) {
				day = "0" + day;
			}
			
			String birth = year + month + day;
			System.out.println(birth);
			
			Member m = new Member();
			
		    System.out.println("MemberDAO: " + mr.getParameter("m_id")); // 로그 추가
			m.setM_id(mr.getParameter("m_id"));
			m.setM_pw(mr.getParameter("m_pw"));
			m.setM_name(mr.getParameter("m_name"));
			m.setM_birth(birth);
			m.setM_photo(photoKr);
			
			System.out.println(m.getM_id());
			
			if (ss.getMapper(MemberMapper.class).signUp(m) == 1) {
				
				req.setAttribute("r", "가입 성공");
				return true;
			}else {
			File f = new File(path + "/" + mr.getFilesystemName("m_photo"));
			f.delete();
				req.setAttribute("r", "가입 실패");
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "가입 실패");
			return false;
		}
		
	}
	
	public boolean login(HttpServletRequest req) {
		try {
			Member m = new Member();
			String id = req.getParameter("m_id");
			String pw = req.getParameter("m_pw");
			m.setM_id(id);
			if (id.equals(ss.getMapper(MemberMapper.class).login(m).getM_id())
				&& pw.equals(ss.getMapper(MemberMapper.class).login(m).getM_pw())) {
				req.getSession().setAttribute("sessionId", id);
				req.getSession().setMaxInactiveInterval(30000);
				req.setAttribute("r", "로그인 성공!");
				req.setAttribute("info", ss.getMapper(MemberMapper.class).login(m));
				return true;
			}else {
				req.setAttribute("r", "로그인 실패!");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "로그인 실패!");
			return false;
		}
		
	}
	
	public boolean loginCheck(HttpServletRequest req) {
		
		try {
			Member m = new Member();
			m.setM_id(req.getSession().getAttribute("sessionId").toString());
			if (req.getSession().getAttribute("sessionId").toString().equals(ss.getMapper(MemberMapper.class).loginCheck(m).getM_id())) {
				if (req.getSession().getAttribute("sessionId").equals(null)) {
					return false;
				}
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void getMemberInfo(HttpServletRequest req) {
		try {
			Member m = new Member();
			m.setM_id(req.getSession().getAttribute("sessionId").toString());
			m.setM_pw(ss.getMapper(MemberMapper.class).getMemberInfo(m).getM_pw());
			m.setM_name(ss.getMapper(MemberMapper.class).getMemberInfo(m).getM_name());
			m.setM_birth(ss.getMapper(MemberMapper.class).getMemberInfo(m).getM_birth());
			m.setM_photo(ss.getMapper(MemberMapper.class).getMemberInfo(m).getM_photo());
			
			
			req.setAttribute("info", m);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void updateMember(HttpServletRequest req) {
		try {
			String path = req.getSession().getServletContext().getRealPath("resources/m_photo");
			MultipartRequest mr = new MultipartRequest(req, path,
					30 * 1024 * 1024, "UTF-8", new DefaultFileRenamePolicy()
					);
			String photo = mr.getFilesystemName("m_photo");
			String photoKr = URLEncoder.encode(photo, "UTF-8").replace("+", " ");
			
			Member m1 = new Member();
			m1.setM_id(req.getSession().getAttribute("sessionId").toString());
			File f = new File(path + "/" + (String)ss.getMapper(MemberMapper.class).getMemberInfo(m1).getM_photo());
			f.delete();
			
			Member m2 = new Member();
			m2.setM_id(req.getSession().getAttribute("sessionId").toString());
			m2.setM_pw(mr.getParameter("m_pw"));
			m2.setM_name(mr.getParameter("m_name"));
			m2.setM_birth(ss.getMapper(MemberMapper.class).getMemberInfo(m2).toString());
			m2.setM_photo(photoKr);
			
			if (ss.getMapper(MemberMapper.class).update(m2) == 1) {
				req.setAttribute("r", "업데이트 성공!");
				
			}else {
				req.setAttribute("r", "업데이트 실패!");
				File df = new File(path + "/" + photoKr);
				df.delete();
			}
			
		} catch (Exception e) {
			req.setAttribute("r", "업데이트 실패!");
			e.printStackTrace();
		}
		
	}
	
	public void deleteMember(HttpServletRequest req) {
		try {
			String path = req.getSession().getServletContext().getRealPath("resources/m_photo");
			System.out.println(path);
			String id = req.getSession().getAttribute("sessionId").toString();
			Member m = new Member();
			m.setM_id(id);
			File f = new File(path + "/" + ss.getMapper(MemberMapper.class).getMemberInfo(m).getM_photo());
			f.delete();
			if (ss.getMapper(MemberMapper.class).delete(m) == 1) {
				req.setAttribute("r", "탈퇴 성공!");
				req.getSession().setAttribute("sessionId", null);
			}else {
				
				req.setAttribute("r", "탈퇴 실패!");
			}
		} catch (Exception e) {
			req.setAttribute("r", "탈퇴 실패!");
			e.printStackTrace();
		}
	}
	
	public void logoutMember(HttpServletRequest req) {
		try {
			Member m = new Member();
			m.setM_id(req.getSession().getAttribute("sessionId").toString());
			ss.getMapper(MemberDAO.class).logoutMember(req);
			req.getSession().setAttribute("sessionId", null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
