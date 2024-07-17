package main.java.com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    public RacingCar() {
        System.out.println("RacingCar 클래스의 기본 생성자 호출");
    }

    //  오버라이딩하고나서 슈퍼 지우는이유?
    @Override
    public void run() {
        System.out.println("레이싱카가 전속력 질주");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적을 울릴 수 없음");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춤");
    }
}
