package main.java.com.ohgiraffers.section01.extend;

public class Car {

    // 주행중에만 클랫션 울리는 기능
    private boolean runningStatus;

    // 기본생성자
    public Car() {
        System.out.println("car 클래스의 기본 생성자 호출");
    }

    // 자동차 기능들 - 달리는
    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    // 주행 상태 반환
    public boolean isRunning() {
        return runningStatus;
    }

    // 주행 중일때 경적 울리는 기능
    public void soundHorn() {
        if (isRunning()) {
            System.out.println("빵빵");
        } else {
            System.out.println("주행중이 아닌 상태에서 경적을 울리 수 없습니다.");
        }
    }

    // 멈춤
    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
