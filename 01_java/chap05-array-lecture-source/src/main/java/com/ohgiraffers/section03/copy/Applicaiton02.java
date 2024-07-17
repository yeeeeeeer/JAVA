package main.java.com.ohgiraffers.section03.copy;

public class Applicaiton02 {
    public static void main(String[] args) {

        // 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다.

        // 아래 메소드들은 모두 같은 주소값을 가지고있음

        // 스트링 배열 하나 만듬
        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("names.hashCode(): "+names.hashCode());      // names 주소값
        // 메소드 호출
        print(names);

        // 애니멀즈 메소드 받으려면?
        // 선언 먼저
        String[] animals = getAnimals();
        System.out.println("animals.hashCode(): " + animals.hashCode());
        // print에 animals를 넣음
        print(animals);
    }

    // String names를 매개변수로 받는 메소드
    public static void print(String[] names) {
        System.out.println("names.hashCode(): " + names.hashCode());    // 매개변수로 받은 names 주소값
    }

    // () 를 매개변수로 받는 메소드
    public static String[] getAnimals() {
        String[] animals = {"낙타", "호랑이", "돼지"};
        System.out.println("animals.hashCode(): " + animals.hashCode());
        return animals;
    }

}
