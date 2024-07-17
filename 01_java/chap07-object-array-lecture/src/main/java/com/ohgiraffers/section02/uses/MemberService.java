package main.java.com.ohgiraffers.section02.uses;

// Application 의 명령을 "실행" 할 클래스 임
public class MemberService {


    public void signUpMembers() {
        // 회원정보담은(Member) 배열 생성 members
        Member[] members = new Member[5];

        members[0] = new Member(1, "user01", "pass01", "변우석", 20, '남');
        members[1] = new Member(2, "user02", "pass02", "김혜윤", 20, '여');
        members[2] = new Member(3, "user03", "pass03", "이순재", 80, '남');
        members[3] = new Member(4, "user04", "pass04", "수지", 35, '여');
        members[4] = new Member(5, "user05", "pass05", "공유", 45, '남');

        // 회원등록 repo에게 명령내리는 클래스 호출
        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);      // 레지스트에 members 배열(회원정보값) 넣어줌

    }

    public void showAllMembers() {
        MemberFinder finder = new MemberFinder();

        System.out.println("---------- 가입된 회원 목록 ----------");
        for (Member member : finder.findAllMembers()) {
            if(member != null){
                System.out.println(member.getInfo());
            }
        }
        System.out.println("--------- 회원 조회 완료 ---------");
    }
}

