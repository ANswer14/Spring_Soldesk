package com.lyh.jul042.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestDAO {
	
	@Autowired
	private SqlSession ss;
	
	
	
	
	public void insertTestInfo(Test t, HttpServletRequest req) {
		try {
			// View 파라미터 3개(t_year, t_month, t_day -> t_when)
			// DAO에서 처리 
			String t_year = req.getParameter("t_year");
			
			// 2024 1 1 -> SimpleDateFormat
			// 202411 => 2024년 11월? / 2024년 1월 1일?
			int t_month = Integer.parseInt(req.getParameter("t_month"));
			int t_day = Integer.parseInt(req.getParameter("t_day"));
			
			String t_when2 = String.format("%s%02d%02d", t_year, t_month, t_day); // 20240101
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date t_when = sdf.parse(t_when2);
			t.setT_when(t_when);
			TestMapper tm = ss.getMapper(TestMapper.class);
			
			if (tm.insertTestInfo(t) == 1) {
				req.setAttribute("r2", "성공");
			}
		} catch (Exception e) {
			req.setAttribute("r2", "실패");
			e.printStackTrace();
		}
	}
	
	
	public void getTestInfo(HttpServletRequest req) {
		try {
			
			req.setAttribute("testInfo", ss.getMapper(TestMapper.class).getTestInfo());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
