package com.ohgiraffers.auth.member.model.dao;

import com.ohgiraffers.auth.member.model.dto.MemberDTO;

public interface MemberDAO {

	// xml 파일과 같은 이름으로 쿼리 꼭 맞춰줘야함
	
	
	// 회원가입 진행하는 인서트 쿼리
	int insertMember(MemberDTO requestMember);
	
	// 암호화된 비밀번호 반환해줄 메소드
	String selectEcrtyptedPwd(MemberDTO requestMember);
	
	// 암호 비교하고 결과 반환해줄 메소드
	MemberDTO selectLoginMember(MemberDTO requestMember);

}
