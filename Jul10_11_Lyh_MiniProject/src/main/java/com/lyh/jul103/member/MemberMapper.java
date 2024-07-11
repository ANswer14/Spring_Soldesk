package com.lyh.jul103.member;

import java.util.List;

public interface MemberMapper {
	
	
	
	public abstract int signUp(Member m);
	
	public abstract Member login(Member m);
	
	public abstract Member loginCheck(Member m);
	
	public abstract Member getMemberInfo(Member m);
	
	public abstract int update(Member m);
	
	public abstract int delete(Member m);
	
	public abstract int logout(Member m);
}
