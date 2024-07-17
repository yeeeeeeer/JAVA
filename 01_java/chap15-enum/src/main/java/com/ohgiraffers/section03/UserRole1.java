package main.java.com.ohgiraffers.section03;

public enum UserRole1 {

    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;

    // 생성자를 가질 순 있지만 호출 못한다
    UserRole1(){
    }

    public String getNameToLowerCase(){
        return this.name().toLowerCase();   // 필드 이름을 소문자로 바꿔주겠다
    }

}
