package com.lyh.jul103.member;

public class Member {
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_birth;
	private String m_photo;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String m_id, String m_pw, String m_name, String m_birth, String m_photo) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_birth = m_birth;
		this.m_photo = m_photo;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_birth() {
		return m_birth;
	}

	public void setM_birth(String m_birth) {
		this.m_birth = m_birth;
	}

	public String getM_photo() {
		return m_photo;
	}

	public void setM_photo(String m_photo) {
		this.m_photo = m_photo;
	}
	
	
	
}
