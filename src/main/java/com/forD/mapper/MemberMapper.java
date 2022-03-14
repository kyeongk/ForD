package com.forD.mapper;

import java.util.List;

import com.forD.domain.Criteria;
import com.forD.domain.MemberVO;

public interface MemberMapper {
	public MemberVO read(String userid);
	public void signUp(MemberVO member);
	public List<MemberVO> getMemberList(Criteria cri);
	public int getTotalMember(Criteria cri);
	public int remove(String userid);
	public int idDupliChk(MemberVO member);
	public int emailDupliChk(MemberVO member);
	public String checkPw(String userid);
	public int modifyByUser(MemberVO member);
	public int modifyPwByUser(MemberVO member);
	public int removeByUser(MemberVO member);

}
