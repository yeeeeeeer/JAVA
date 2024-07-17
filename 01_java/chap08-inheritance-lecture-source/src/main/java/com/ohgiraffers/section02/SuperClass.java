package main.java.com.ohgiraffers.section02;

// 부모클래스
public class SuperClass {

    /*
    * 오버라이딩 이란?
    * 부모 클래스에서 상속받은 메소드를 자식 클래스에서 재정의해서 사용하는 것.
    *
    * 오버라이딩 성립 요건
    * 1. 메소드 이름 동일
    * 2. 메소드 리턴 타입 동일
    * 3. 매개변수의 타입, 갯수, 순서가 동일
    * 4. X private 메소드는 접근이 불가능하기 때문에 오버라이딩이 불가능하다.
    * 5. X final 키워드가 사용된 메소드는 오버라이딩이 불가능하다.
    * 6. 접근제한자는 부모메서드와 같거나 더 넓은 범위여야 한다.
    * 7. 예외 처리는 같은 예외이거나 더 구체적인(하위) 예외를 처리해야 한다. (예외는 Exception 파트에서 다룰 것이다.)
    * */


    //오버라이딩 테스트
    public void method(int num){}

    public void privateMethod(int num){}

    public final void finalMethod(){}

    public void protectedMethod(){}

}
