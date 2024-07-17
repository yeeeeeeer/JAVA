package main.java.com.ohgiraffers.section02.uses;

// 1번 회원등록 눌렀을 때 - "회원 등록을 repository 에게 명령" 하는 클래스 임
public class MemberRegister {

    // service의 회원정보를 등록시키기 위한 출력문 메소드?
    public void regist(Member[] members){
        System.out.println("회원을 등록합니다.");
        for(Member member:members){
            System.out.println(member.getInfo()+" 님을 회원 등록 시도 합니다.");
        }

        // 멤버 등록의 기능을 가지는 클래스를 가져와서 등록 유무 알려주는 출력 메소드
        // static은 boolean형이라 조건식을 이렇게 적어도된다
        if(MemberRepository.store(members)){
            System.out.println("총 "+ members.length + " 명의 회원 등록에 성공했습니다.");
        }else{
            System.out.println("인원이 마감되어 등록에 실패했습니다.");
        }

    }
    
}
