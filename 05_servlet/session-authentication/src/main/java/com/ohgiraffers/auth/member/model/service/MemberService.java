package com.ohgiraffers.auth.member.model.service;

import static com.ohgiraffers.auth.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ohgiraffers.auth.member.model.dao.MemberDAO;
import com.ohgiraffers.auth.member.model.dto.MemberDTO;

public class MemberService {

	private MemberDAO memberDAO;
	
	public int registMember(MemberDTO requestMember) {
		
		// sql 세션 받는 템플릿 class 따로 만들고오기 - common 하위
		// 그리고 mybatis.config.xml에 mapper 해놓고오기
		
		SqlSession session = getSqlSession();
		memberDAO = session.getMapper(MemberDAO.class);
		
		int result = memberDAO.insertMember(requestMember);
		
		if(result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		
		session.close();
		
		return result;
	}

	
	
	public MemberDTO loginCheck(MemberDTO requestMember) {
		
		SqlSession session = getSqlSession();
		memberDAO = session.getMapper(MemberDAO.class);
		
		MemberDTO loginMember = null;
		
		
		// db 아이디비번과 - 입력한 아이디비번 비교
		String encPwd = memberDAO.selectEcrtyptedPwd(requestMember);
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		if(passwordEncoder.matches(requestMember.getMemberPwd(), encPwd)) {
			loginMember = memberDAO.selectLoginMember(requestMember);
		}
		
		session.close();
		
		return loginMember;
		
	}

}
