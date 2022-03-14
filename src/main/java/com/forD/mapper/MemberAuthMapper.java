package com.forD.mapper;



import com.forD.domain.AuthVO;

public interface MemberAuthMapper {
	public void signUp(AuthVO auth);
	//public int updateMember(AuthVO auth);
	public int modify(String auth,String userid);
	public int modify(AuthVO auth);

}
