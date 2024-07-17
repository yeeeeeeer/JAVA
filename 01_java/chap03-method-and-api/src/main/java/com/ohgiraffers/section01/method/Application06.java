package main.java.com.ohgiraffers.section01.method;

public class Application06 {
    public static void main(String[] args){

        /*
        * 메소드 리턴 값 테스트
        * 메소드는 항상 마지막에 return; 명령어가 존재한다.
        * return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
        * 이 때 가지고 가는 값을 리턴값 이라고 한다.
        *
        * return 값을 가지기 위해서는 메소드 선언부에 리턴 타입을 명시해주어야 한다.
        * void 는 아무 반환값도 가지지 않겠다는 리턴값에 사용할 수 있는 키워드이다.    // void는 메소드기능 실행만하고 리턴값없이 끝난다
        * 반환값이 없는 경우 return 을 생략해도 컴파일러가 자동으로 추가하지만,    // return 이름만 추가하고 값은 없는 상태
        * 반환값이 있는 경우 return 구문을 반드시 명시적으로 작성해야한다.
        * 또한 메소드 선언부에 선언한 리턴타입과 반환값의 자료형이 반드시 일치해야 한다.
        * */
        

        System.out.println("main() 메소드 시작됨..");

        Application06 app6 = new Application06();

        // 받아온 메소드값을 String 변수에 대입
        String result = app6.test();
        System.out.println(result);

        // 변수대입말고 괄호안에 바로 불러올 수도 있음.
        System.out.println(app6.test());

        System.out.println("main() 메소드 종료됨..");
    }

    // public 반환타입(자료형 또는 void) 메소드명(){ 실행코드 return 선언타입과 같은 반환타입 ;}
    public String test(){
        return "Hello World!";
    }
}
