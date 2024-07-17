package main.java.com.ohgiraffers.section01.understand.seller;

import main.java.com.ohgiraffers.section01.understand.car.Car;
import main.java.com.ohgiraffers.section01.understand.car.ElectricCar;
import main.java.com.ohgiraffers.section01.understand.car.OldCar;

public class Seller {

    // 영업사원 이름
    private String name;

    // 판매 수당
    private double result;

    // 생성자는 name만 만듬,,,?
    public Seller(String name) {
        this.name = name;
    }

    // 차 판매하는 메소드 ?? 매개변수에 부모 배열넣은이유
    public void sale(Car[] cars) {
        for (Car car : cars) {   // Car 배열의 cars가 하나씩 반복되서 대입된다?
            if (car instanceof ElectricCar) {   // (car - 배열 값)이 전기차가 맞냐? 라는 조건식
                ElectricCar electricCar = (ElectricCar) car;   // 부모를 자식에게 넣을 때 강제 형변환?
                System.out.println(electricCar.getBrand() + " 사의 " + electricCar.getName() + " 를 판매했습니다.");
                result += electricCar.getPrice();
            } else {
                OldCar oldCar = (OldCar) car;  //car를 Oldcar로 강제 형변환
                System.out.println(oldCar.getBrand() + " 사의 " + oldCar.getName() + " 를 판매했습니다.");
                result += oldCar.getPrice();
            }
        }
    }

    // 투스트링,,
    @Override
    public String toString() {
        return name + " 사원의 총 수수료는 " + result + " 원 입니다.";
    }
}
