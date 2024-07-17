package main.com.java.ohgiraffers.section04.use1;

public class RacingCar extends Car {

    @Override
    public void go() {
        System.out.println("레이싱카가 달린다");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춘다");
    }
}
