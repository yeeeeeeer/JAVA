package main.java.com.ohgiraffers.section02.uses;

// db 연결부 - "데이터 수행" 할 클래스 임
// 레지스터 : 데이터 받고 반환만 해줌
public class MemberRepository {

    private final static Member[] members;

    private static int count;   //회원 1명이 들어올때마다 카운드 증가시키려고 만듬

    static {
        members = new Member[10];  // 10명만 받을 것이라는 의미
    }

    // 가입 처리
    // 멤버등록할 메소드 / 10명만 받는 if문
    public static boolean store(Member[] newMembers) {
        for (int i = 0; i < newMembers.length; i++) {

            if (count != 10) {
                members[count++] = newMembers[i];
            } else {
                System.out.println("정원 초과");
                return false;
            }
        }
        return true;   // 정상적으로 등록되었다...
    }


    // 등록된 회원정보를 담고있는 메소드
    public static Member[] findAllMembers() {
        return members;
    }

    // 로그인 처리 - 가입목록 == 회원 -> "로그인 완료" / "가입회원 x"

}
