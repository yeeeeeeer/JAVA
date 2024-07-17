package main.java.com.ohgiraffers.section01.understand.car;

public class OldCar extends Car {

    // 내연차의 특징만 필드로 추가해줌 
    private String oilType;

    // 생성자 만들기
    public OldCar(String brand, int price, String name, String oilType) {
        super(brand, price, name);
        this.oilType = oilType;
    }

    // getter setter 만들기
    public String getOilType() {
        return oilType;
    }

    public void setOilType(String oilType) {
        this.oilType = oilType;
    }

    // 오버라이드
    @Override
    public double getPrice() {
        System.out.println("내연기관 자동차 판매가는 " + super.getPrice() + " 원 입니다.");
        return super.getPrice() * 0.1;
    }

    // 투스트링
    @Override
    public String toString() {
        return "OldCar{" +
                "name = " + super.getName() +
                "oilType='" + oilType + '\'' +
                '}';
    }
}
