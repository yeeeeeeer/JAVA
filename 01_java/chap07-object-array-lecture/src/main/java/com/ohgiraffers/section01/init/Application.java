package main.java.com.ohgiraffers.section01.init;

public class Application {
    public static void main(String[] args) {

        /*
         * 객체 배열은 레퍼런스 변수에 대한 배열이다
         * 생성한 인스턴스도 배열을 이용해서 관리하면
         * "동일한 타입" 의 여러 개의 인스턴스를 각각 취급하지 않고 "연속 처리" 할 수 있어서 유용하다.
         * 또한 반환값은 "1개의 값만 반환" 할 수 있기 때문에
         * 동일한 타입의 여러 인스턴스를 반환해야하는 경우 "객체 배열" 을 이용할 수 있다.
         *
         *
         * = 동일한 타입의 인스턴스들을 연속처리해서 1개의 반환값으로 반환한다.
         * */


        // 객체배열 안쓰고 호출해보기 -  각각의 자동차로 객체 생성. - 하나하나 씀
        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이드", 250);
        Car car4 = new Car("부가티베이론", 400);
        Car car5 = new Car("포터", 120);

        // 각 자동차의 객체 드라이브맥스스피드 호출
        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        // 동일한 타입을 여러번 쓰고 호출하는게 불편함 -> 객체배열 이용하기
        // 객체배열 선언
        Car[] carArray = new Car[5];

        // 인덱스에 접근해서 값 넣어주기
        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("람보르기니", 350);
        carArray[2] = new Car("롤스로이드", 250);
        carArray[3] = new Car("부가티베이론", 400);
        carArray[4] = new Car("포터", 120);

        System.out.println("------------------");
        // for문으로 부르기
        for (int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }


        System.out.println("------------------");
        // 배열 {} 사용해서 값 바로 넣기
        Car[] carArray2 = {
                new Car("페라리", 300),
                new Car("티코", 120),
                new Car("포터", 100)
        };

        // 향상된 for문 사용해서 부르기
        for (Car car: carArray2) {
            car.driveMaxSpeed();
        }


    }
}
