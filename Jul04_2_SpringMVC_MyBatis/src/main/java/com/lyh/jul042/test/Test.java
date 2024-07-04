package com.lyh.jul042.test;

import java.math.BigDecimal;
import java.util.Date;

public class Test {
	private String t_subject;
	private Date t_when;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(String t_subject, Date t_when) {
		super();
		this.t_subject = t_subject;
		this.t_when = t_when;
	}

	public String getT_subject() {
		return t_subject;
	}

	public void setT_subject(String t_subject) {
		this.t_subject = t_subject;
	}

	public Date getT_when() {
		return t_when;
	}

	public void setT_when(Date t_when) {
		this.t_when = t_when;
	}
	
	
	
}
