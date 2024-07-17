package main.com.java.ohgiraffers.section03.interfaceimplements;

public class Product extends Object implements InterProduct {

    /*
    * 클래스에서 인터페이스를 상속받을 때는 implements 키워드 사용한다.
    * 인터페이스는 여러 개를 상속받을 수 있으며,
    * extends 로 다른 클래스를 상속받는 경우에도 그것과 별개로 인터페이스도 추가 상속이 가능해진다.
    * 단, extends 키워드를 앞에 작성하고 뒤에 implements 키워드를 작성한다. (순서 바뀌면 에러남)
    * */

    @Override
    public void abstractMethod() {
        System.out.println("interProduct의 nonstaticMethod 오버라이딩 메소드 호출");
    }

    @Override
    public void defaultMethod() {
        System.out.println("interProduct의 default 메소드 오버라이딩 호출");
    }
}
