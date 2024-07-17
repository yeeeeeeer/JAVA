package main.java.com.ohgiraffers.section02.variable;

public class Question {
    public static void main(String[] args) {

        /*
         * 강경리가 사원 10명의 월급을 입금해줘야하는 날이다.
         * 사원의 직책은 대리/과장/차장/부장이 있으며
         * 대리는 100만원, 과장은 120만원, 차장은 130만원, 부장은 150만원의 월급을 받는다.
         * 보너스는 각 월급 *0.5 만큼을 더해서 주어야한다.
         * */

        // 화면에 출력되는 형태는 다음과 같아야한다.
        // 김대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입금되었습니다.

        int money = 100;
        double bonus = money * 0.5;      //실수가 있어서 double로 써야함.
        System.out.println("김대리의 월급은 " + money + "만원 + 보너스 " + bonus + "만원으로 총 " + (money + bonus) + "만원 입금되었습니다.");
    }
}
