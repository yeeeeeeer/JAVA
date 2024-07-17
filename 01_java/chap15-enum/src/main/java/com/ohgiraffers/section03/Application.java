package main.java.com.ohgiraffers.section03;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {

        // enum 문법
        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin);
        System.out.println(admin.getNameToLowerCase());

        UserRole2 consumer = UserRole2.CONSUMER;
        // ordinal 는 번호, name 은 열거이름, getDescription 은 넣은 필드값
        System.out.println(consumer.ordinal() + " " + consumer.name() + " " + consumer.getDescription());

        UserRole2 consumer2 = UserRole2.CONSUMER;

        // 싱글톤 패턴, 상수 라 앞, 뒤 선언 상관없이 값이 같음
        if (consumer2 == consumer) {
            System.out.println("동일 비교");
        }


        // EnumSet 을 활용하여 여러 "열거형 타입" 들을 set(자료형 구조)으로 취급할 수 있다.
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iter = roles.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next().name());
        }

        // 특정 상수만 골라서 set에 추가할 수 있다.
        System.out.println("----------------");
        EnumSet<UserRole2> user2 = EnumSet.of(UserRole2.CONSUMER, UserRole2.PRODUCER);
        Iterator<UserRole2> userIter = user2.iterator();
        while(userIter.hasNext()) {
            UserRole2 role = userIter.next();
            System.out.println(role.ordinal()+" "+role.getDescription());
        }

        // 특정 상수를 제외하여 set에 추가할 수 있다.
        System.out.println("----------------");
        EnumSet<UserRole2> notGuest = EnumSet.complementOf(EnumSet.of(UserRole2.GUEST));
        Iterator<UserRole2> notGuestIter = notGuest.iterator();
        while(notGuestIter.hasNext()) {
            UserRole2 role = notGuestIter.next();
            System.out.println(role.ordinal()+" "+role.getDescription());
        }
    }
}
