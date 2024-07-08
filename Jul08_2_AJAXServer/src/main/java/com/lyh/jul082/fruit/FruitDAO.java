package com.lyh.jul082.fruit;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitDAO {
	
	@Autowired
	private SqlSession ss;
	
	public void getAllFruits(HttpServletRequest req) {
		try {
			req.setAttribute("fruits", ss.getMapper(FruitMapper.class).getAllFruits());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
