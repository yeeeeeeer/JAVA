package main.java.com.ohgiraffers.section01.method;

public class Calculator {

    // 둘 중 최솟값을 리턴
    public int minNumber0f(int first, int second){            // static 없음. 코드만 가지고 ram에 없음.
        return (first > second) ? second : first ;
    }
    // 둘 중 최댓값을 리턴
    public static int maxNumber0f(int first, int second){     // static 있음. ram에 있어서 cpu에서 바로 읽는다
        return (first > second)? first : second ;
    }
}
