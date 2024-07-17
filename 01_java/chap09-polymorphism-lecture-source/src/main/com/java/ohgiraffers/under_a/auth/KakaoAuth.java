package main.com.java.ohgiraffers.under_a.auth;

import main.com.java.ohgiraffers.under_a.dto.MemberDTO;

public class KakaoAuth implements SnsAuth {

    MemberDTO[] memberDTOS = new MemberDTO[1];
    MemberDTO memberDTOS1 = new MemberDTO("kakao","kakao");

    @Override
    public boolean login(MemberDTO memberDTO) {
        if (memberDTOS1.getId().equals(memberDTO.getId())&& memberDTOS1.getPwd().equals(memberDTO.getPwd())) {
            return true;
        }else{
            return false;
        }
    }
}
