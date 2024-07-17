package main.java.com.ohgiraffers.section03;

public enum UserRole2 {

    // 열거 - 0부터 번호를 가짐
    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    // 필드를 만들어서 값을 받을 수 있음
    private final String description;

    // 생성자
    UserRole2(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }


}
