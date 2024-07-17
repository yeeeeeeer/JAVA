package main.java.com.ohgiraffers.question;

public class LoginRepository {

    private final static User[] users;    // 회원가입된 회원들 배열

    private static int count;  // 회원제한위한 변수

    static {
        users = new User[10];    // 10명만 받을 것
    }

    // 회원가입 시킬 메소드  - 10명만 받을 if문
    public static boolean store(User[] users) {
        for (int i = 0; i < users.length; i++) {

            if (count != 10) {
                users[count++] = users[i];
                System.out.println("회원가입 되었습니다.");
            } else {
                System.out.println("정원 초과");
                return false;   // 가입 실패
            }
        }
        return true;  // 회원가입 성공
    }

    // 회원가입 된 회원 정보 등록시키는 출력문 메소드
    public void regist(User[] users) {
        System.out.println("회원가입 성공했어요");
    }


    // 회원등록시키기 위한 출력문 메소드
    public void regist(User[] users) {
        System.out.println("회원을 등록합니다");
    }


    // 로그인 시키는 메소드
    public void sucLogin() {

        if ( regist(users) == users){
            System.out.println("로그인 완료");
            // 프로그램 종료
        }else{
            System.out.println("가입된 회원이 아닙니다.");
        }


    }


}
