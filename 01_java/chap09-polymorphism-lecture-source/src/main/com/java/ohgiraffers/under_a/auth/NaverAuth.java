package main.com.java.ohgiraffers.under_a.auth;

import main.com.java.ohgiraffers.under_a.dto.MemberDTO;

public class NaverAuth implements SnsAuth{

    MemberDTO[] memberDTOS = new MemberDTO[1];
    MemberDTO memberDTOS1 = new MemberDTO("naver","naver");

    @Override
    public boolean login(MemberDTO memberDTO) {
        if (memberDTOS1.getId().equals(memberDTO.getId())&& memberDTOS1.getPwd().equals(memberDTO.getPwd())) {
            return true;
        }else{
            return false;
        }
    }
}
