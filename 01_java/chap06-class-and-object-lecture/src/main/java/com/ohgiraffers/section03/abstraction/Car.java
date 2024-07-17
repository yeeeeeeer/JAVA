package main.java.com.ohgiraffers.section03.abstraction;

public class Car {

    // 불린형의 초기값은 false. 시동이 꺼진 상태
    private boolean isOn;
    // 속도
    private int speed;

    // 시동을 거는 메소드 - 1
    public void startUp() {
        if (isOn) {
            System.out.println("이미 시동이 걸려 있습니다.");
        } else {
            this.isOn = true; // 시동이 꺼진걸 다시 켜주는 코드
            System.out.println("시동이 걸렸습니다.");
        }
    }

    // 앞으로 가는 메소드 - 2
    public void go() {
        if (isOn) {
            if (speed == 0) {
                System.out.println("자동차가 출발합니다");
            }
            speed += 10;
            System.out.println("자동차는 시속 " + speed + "km/h 입니다.");
        }else{
            System.out.println("자동차는 시동이 걸려야 출발이 가능합니다.");
        }
    }

    // 멈추는 메소드 - 3
    public void stop() {
        if (isOn) {
            if (this.speed > 0) {
                while (this.speed > 0) {
                    this.speed--;
                    System.out.println("현재 속도는 " + this.speed + "km/h");
                }
            } else {
                System.out.println("이미 멈춰있는 상태입니다.");
            }
        } else {
            System.out.println("시동을 걸지않은 경우 유압으로 인해 브레이크가 점점 무거워집니다.");
        }
    }
    
    // 시동끄는 메소드 - 4
    public void turnOff(){
        if(isOn){
            if(this.speed > 0){
                System.out.println("달리는 상태에서 시동을 끄는 것은 위험합니다.");
            }else{
                this.isOn = false;     // 시동을 꺼줌
                System.out.println("시동을 끄겠습니다. 고생하셨습니다.");
            }
        }else{
            System.out.println("이미 시동이 꺼져 있습니다.");
        }
        
    }

}
