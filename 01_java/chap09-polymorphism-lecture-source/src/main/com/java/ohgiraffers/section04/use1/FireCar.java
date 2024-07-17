package main.com.java.ohgiraffers.section04.use1;

// Car 상속받음 / Soundable 인터페이스 적용
public class FireCar extends Car implements Soundable{

    @Override
    public void go() {
        System.out.println("소방차가 달린다");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춘다");
    }

    @Override
    public void horn() {
        System.out.println("소방차가 나간다. 비키시오");
    }
}
