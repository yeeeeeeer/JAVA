package main.java.com.ohgiraffers.section01.understand.car;

// Car 클래스 상속받음
public class ElectricCar extends Car {

    // 전기차 에너지 필드 만듬 - 전기차에만 필요한 변수라 추가한거임
    private String energy;

    // 생성자를 통해 만들수 있어서.?? 생성자를 먼저 만든거임
    public ElectricCar(String brand, int price, String name, String energy) {
        super(brand, price, name);     // super : Car(부모클래스)의 생성자 호출
        this.energy = energy;
    }

    // energy의 getter setter 만듬
    public String getEnergy() { return energy; }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    // 오버라이드 : 부모 메서드를 자식에서 재정의
    // 영업사원이 먹는 수수료 계산하는 메소드
    @Override
    public double getPrice() {
        System.out.println("전기차의 판매가는 " + super.getPrice() + " 원 입니다.");  //부모의 돈을 넣어줌 super
        return super.getPrice() * 0.15;   // 기존 판매가에 수수료 붙여서 반환해줌
    }

    // 투스트링 : 객체 정보를 문자열로 반환해줌 (sout: 콘솔출력 / tostring: 객체정보 반환) <- tostring은 현업에서 어떻게 사용되는지??
    @Override
    public String toString() {
        return "ElectricCar{" + "carName = " + super.getName() + "energy='" + energy + '\'' + '}';
    }
}
