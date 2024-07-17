package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

public class Application03 {
    public static void main(String[] args) {

        /*
        * Object 클래스의 명세에 작성된 일반 규약에 따르면
        * equals() 메소드를 재정의 하는 경우 반드시 hashCode() 메소드도 재정의하도록 되어있다.
        * 만약 hashCode() 를 재정의 하지 않으면 같은 값을 가지는 동등 객체는
        * 같은 해쉬코드값을 가져야한다는 규약에 위반하게 된다.
        * (강제성은 없지만 규약대로 작성하는 것이 좋음)
        * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        // 각각 new 연산자로 만들었기때문에 둘은 서로 다른 주소값을 가짐
        // Book 에 hashCode 오버라이딩하고나서는 같은 주소값 가짐
        System.out.println("book1 = "+ book1.hashCode());
        System.out.println("book2 = "+ book2.hashCode());

    }
}
