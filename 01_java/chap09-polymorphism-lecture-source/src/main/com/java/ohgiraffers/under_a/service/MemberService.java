package main.com.java.ohgiraffers.under_a.service;

import main.com.java.ohgiraffers.under_a.auth.GoogleAuth;
import main.com.java.ohgiraffers.under_a.auth.KakaoAuth;
import main.com.java.ohgiraffers.under_a.auth.NaverAuth;
import main.com.java.ohgiraffers.under_a.dto.MemberDTO;

public class MemberService {

    public void findMember(String authType, MemberDTO memberDTO) {

        switch (authType) {
            case "google":
                GoogleAuth googleAuth = new GoogleAuth();
                boolean result = googleAuth.login(memberDTO);
                if (result) {
                    System.out.println("구글 계정으로 인증된 " + memberDTO.getId() + " 님 환영합니다.");
                } else {
                    System.out.println("구글에 인증된 회원이 없습니다.");
                }
                break;

            case "naver":
                NaverAuth naverAuth = new NaverAuth();
                boolean result1 = naverAuth.login(memberDTO);
                if (result1) {
                    System.out.println("네이버 계정으로 인증된 " + memberDTO.getId() + " 님 환영합니다.");
                } else {
                    System.out.println("네이버에 인증된 회원이 없습니다.");
                }
                break;

            case "kakao":
                KakaoAuth kakaoAuth = new KakaoAuth();
                boolean result2 = kakaoAuth.login(memberDTO);
                if (result2) {
                    System.out.println("카카오 계정으로 인증된 " + memberDTO.getId() + " 님 환영합니다.");
                } else {
                    System.out.println("카카오에 인증된 회원이 없습니다.");
                }
                break;

            default:
                System.out.println("존재하지 않는 인증 유형입니다.");
                return;

        }


    }
}
