package main.java.com.ohgiraffers.section05.calendar;

import java.util.Date;

public class Application01 {
    public static void main(String[] args) {

        /*
        * Date 클래스
        * jdk 1.0 부터 날짜를 취급하기위해 사용되던 date 클래스는
        * 생성자를 비롯하여 대부분의 메소드가 deprecated 되어있다.
        *
        * Deprecated?
        * 향후 버전이 업뎃되면서 사라지게 될 기능이니 가급적 사용 권장하지 않는다는 의미.
        * 하지만 하위 버전의 호환성때문에 한번에 제거되지 않고 남겨두었기 때문에 사용하는 것이 가능하다.
        *
        * jdk 1.1 부터는 새롭게 제공되는 calendar 클래스를 이용하여 날짜와 시간에 관한 처리를 하게 된다.
        * 하지만 calendar 클래스는 몇 가지 문제를 가지고 있다.
        *
        * 1. Calendar 인스턴스는 불변객체가 아니기 때문에 값을 수정할 수 있다.
        *
        * 2. 윤초(leap second)는 고려하지 않는다.
        * 윤초란?
        *
        * 3. Calendar 클래스는 월을 0부터 11까지 표현하는 불편함이 있다.
        *
        *
        * jkd 8 부터 이러한 문제해결을 위해 time 패키지를 제공하고 있다.
        *
        * */

        Date today = new Date();

        System.out.println(today);

        System.out.println(today.getTime());

        Date time = new Date(1716270824172L);
        System.out.println(time);
    }
}
