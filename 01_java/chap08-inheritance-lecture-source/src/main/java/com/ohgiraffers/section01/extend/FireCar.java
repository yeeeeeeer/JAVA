package main.java.com.ohgiraffers.section01.extend;

import java.util.function.DoubleToIntFunction;

// extexds Car - Car에서 상속받겠다는 뜻
public class FireCar extends Car {

    public FireCar() {
        super();   // Car를 불러온다는 뜻?
    }

    // 오버라이드 - Car의 soundHorn을 재정의해서 사용하겠다.
    // 단축키 알트인서트 - 오버라이등 - 기능 선택 오케이
    @Override
    public void soundHorn() {
        if (isRunning()) {
            System.out.println("빵ㅇㅇㅇ빵");
        } else {
            System.out.println("소방차가 주행중이 아닙니다.");
        }
    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견했다. 물을 뿌린다------");
    }
}
