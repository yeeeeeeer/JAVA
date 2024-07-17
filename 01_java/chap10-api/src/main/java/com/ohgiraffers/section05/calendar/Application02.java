package main.java.com.ohgiraffers.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application02 {
    public static void main(String[] args) {

        /*
         * API 문서를 살펴보면 calendar 클래스는 abstract 클래스로 작성되어 있다.
         * 따라서 Calendar 클래스를 이용해서 인스턴스를 생성하는 것이 불가능하다.
         *
         *
         * Calendar 클래스를 이용한 인스턴스 생성 방법에는 두 가지가 있다.
         * 1. getInstance() static 메소드를 이용해서 인스턴스를 반환받는 방법
         * 2. 후손 클래스인 GregorianCalendar 클래스를 이용해서 인스턴스를 생성하는 방법
         * */

        // 1. getInstance() 메소드 이용
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);

        /*
         * toString() 이 오버라이딩되어있어 모든 필드값 확인 가능.
         * Date 클래스에 비해 매우 많은 필드들이 값을 가지고 있다.
         * 또한 생성된 인스턴스의 타입이 후손 클래스 타입인 GregorianCalendar 타입인 것을 확인 가능하다.
         * 이 방식으로 인스턴스 생성하면 운영체제의 날짜/시간 정보를 이용해서 인스턴스를 생성하게 된다.
         * */
        System.out.println(calendar);

        // 특정 날짜, 시간 정보를 이용해 인스턴스를 생성하는 방법 - GregorianCalendar(국제표준시)의 생성자로 제공한다.
        Calendar gregorianCalendar = new GregorianCalendar();  // 부모를 자식ㅇ게 넣어줌?
        System.out.println(gregorianCalendar);

        // 년, 월, 일, 시, 분, 초 정보를 이용해 인스턴스 생성
        // 2014년 9월 8일 16:42:00
        int year = 2014;
        int month = 8;
        int dayOfMonth = 8;
        int hour = 16;
        int min = 42;
        int second = 0;

        Calendar choiceDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);

        System.out.println("choiceDay = " + choiceDay);

        /*
         * 상황에 따라 특정 일자를 기준으로 한 Date 타입의 인스턴스가 필요한 경우도 있다.
         * 먼저 GregorianCalendar 를 이용해서 특정 날짜/시간 정보로 인스턴스를 생성한 후
         * 1970년 1월 1일 0시 0분 0초 를 기준으로 지난 시간을 millisecond
         * */

        System.out.println(choiceDay.getTimeInMillis());

        Date date = new Date(choiceDay.getTimeInMillis());
        System.out.println("date = " + date);

        // 실제 사용시 형태
        Date date2 = new Date(new GregorianCalendar(year, month, dayOfMonth, hour, min, second).getTimeInMillis());
        System.out.println("date2 = " + date2);

        // 생성된 인스턴스의 필드 정보를 Calendar 클래스에 있는 get() 메소드를 사용하여 반환받을 수 있다.
        int choiceYear = choiceDay.get(1);
        int choiceMonth = choiceDay.get(2);
        int choiceDayOfMonth = choiceDay.get(5);

        System.out.println(choiceYear);
        System.out.println(choiceMonth);
        System.out.println(choiceDayOfMonth);

        // 인자로 전달하는 정수에 따라 필드값을 반환받을 수 있지만
        // 각 필드에 매칭되는 매개변수의 위치 정수를 다외워야 사용이 가능해지기 때문에
        // 상수 필드 형태로 제공하고있다.
        System.out.println(choiceDay.get(Calendar.YEAR));
        System.out.println(choiceDay.get(Calendar.MONTH));
        System.out.println(choiceDay.get(Calendar.DATE                                                                  ));
        System.out.println(choiceDay.get(Calendar.DAY_OF_MONTH));
        System.out.println(choiceDay.get(Calendar.AM_PM));
        System.out.println(choiceDay.get(Calendar.HOUR_OF_DAY));   //24
        System.out.println(choiceDay.get(Calendar.HOUR));   //12

    }
}
