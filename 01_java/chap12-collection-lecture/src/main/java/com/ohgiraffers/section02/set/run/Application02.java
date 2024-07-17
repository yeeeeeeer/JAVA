package main.java.com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application02 {
    public static void main(String[] args) {

        /*
        * LinkedHashSet 클래스
        * "HashSet 의 기능 + 저장 순서를 유지" 하는 특징을 가진다.
        * jdk 1.4부터 제공하고 있다.
        * */

        LinkedHashSet<String> lhset = new LinkedHashSet<>();
        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println("lhset: " + lhset);

        // 오름차순 정렬 TreeSet
        TreeSet<String> tset = new TreeSet<>(lhset);
        System.out.println(tset);


    }
}
