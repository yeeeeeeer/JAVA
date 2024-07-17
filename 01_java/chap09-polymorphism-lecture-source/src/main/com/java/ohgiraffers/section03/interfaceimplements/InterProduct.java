package main.com.java.ohgiraffers.section03.interfaceimplements;

public interface InterProduct {
    
    public static final int MAX_NUM = 100;
    int MIN_NUM = 10;
    
    void abstractMethod();  // void 앞에 public 강제로 붙어있는 상태임

    // { } 몸체 가지는 것들
    static void staticMethod(){
        System.out.println("InterProduct 클래스의 static method 호출");
    }

    default void defaultMethod(){
        System.out.println("InterProduct 클래스의 default method 호출");
    }

    
}
