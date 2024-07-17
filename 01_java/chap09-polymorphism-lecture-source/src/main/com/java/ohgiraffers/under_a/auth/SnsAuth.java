package main.com.java.ohgiraffers.under_a.auth;

import main.com.java.ohgiraffers.under_a.dto.MemberDTO;

// 인터페이스 SnsAuth
public interface SnsAuth {
    boolean login(MemberDTO memberDTO);
}
