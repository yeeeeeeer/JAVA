package main.java.com.ohgiraffers.section02.uses;

// 2번 전체 회원 정보를 조회할때 - "회원들을 조회하겠다는 명령" 을 repository에게 내리는 클래스 임
public class MemberFinder {

    // 등록된 회원정보를 담은 메소드 반환하는 메소드?
    public Member[] findAllMembers() {
        return MemberRepository.findAllMembers();
    }

}

