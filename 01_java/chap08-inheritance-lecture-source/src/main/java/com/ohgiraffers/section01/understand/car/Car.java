package main.java.com.ohgiraffers.section01.understand.car;

// 부모 상속 Car
public class Car {

    // 현대자동차 하나만 할거라 final 브랜드
    private final String brand;

    private int price;

    private String name;

    // 기본생성자 말고 전체생성자 만듬
    public Car(String brand, int price, String name) {
        this.brand = brand;
        this.price = price;
        this.name = name;
    }

    // getter(변수값 반환. 읽기 전용) 만 만듬
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
