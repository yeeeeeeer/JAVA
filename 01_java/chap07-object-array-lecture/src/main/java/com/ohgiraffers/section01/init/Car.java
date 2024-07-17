package main.java.com.ohgiraffers.section01.init;

public class Car {

    // 필드명은 전역변수를 말함. 
    private String modelName;

    private int maxSpeed;

    // 생성자는 클래스명과 동일한 이름을 가져야한다. 생성자는 리턴값이 없다.
    // this 는 "생성자의 매개변수명 = 필드명" -> this 로 필드라는 것을 구분해줌
    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    // 밑에는 그냥 메소드. 생성자는 클래스명과 동일한 이름을 가져야하는데 이름이 다름 
    // 여러번 호출하기 편하려고 만들어놓은 메소드임
    public void driveMaxSpeed() {
        System.out.println(modelName + " 이(가) 최고 시속 " + maxSpeed + "km/h 로 달려갑니다.");
    }
}
