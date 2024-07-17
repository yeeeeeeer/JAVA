package main.com.java.ohgiraffers.section04.ues2;

public class Dicer {

    private int currentPosition;

    // 주사위던지기 메소드 - 주사위 변수를 매개변수로 받음
    public void throwDice(Dice dice) {
        int diceNumber = dice.getNumber();
        move(diceNumber);
        System.out.println(currentPosition + " 만큼 이동하셨습니다.");
    }

    // 움직이는 메소드 - 주사위 숫자 매개변수로 받음
    public void move(int diceNumber) {
        this.currentPosition += diceNumber;
    }
}



