package main.java.com.ohgiraffers.section02.package_and_import;

import jdk.swing.interop.SwingInterOpUtils;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 패키지란 ?
        * 서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의 묶음으로 단위를 구성하는 것을 말한다.
        * 같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없지만, 패키지가 다르면 동일한 이름을 가진 클래스를 만들 수 있다.
        * 클래스명은 원래 패키지명을 포함하고 있기 때문이다.
        * 지금까지 클래스명에 패키지명을 함께 사용하지 않은 이유는 동일 패키지 내에서 사용했기 때문이다.
        * 그렇기 때문에 서로 다른 패키지에 존재하는 클래스를 사용하는 경우, 클래스명 앞에 패키지명을 명시해 풀 클래스 이름으로 사용해야한다.
        * */

        // Calculator 호출
        main.java.com.ohgiraffers.section01.method.Calculator calc = new main.java.com.ohgiraffers.section01.method.Calculator();
        // 다른 패키지의 클래스를 불러오기때문에 풀네임을 적었다.  + static없는 메소드라서 초기화도 해줌.(static 없는 메소드는 메모리효율이 떨어져서(미리 메모리공간을 받지못하니까) 비추천)
        int min = calc.minNumber0f(30, 20);
        System.out.println(min);

        // static 메소드 호출
        int max = main.java.com.ohgiraffers.section01.method.Calculator.maxNumber0f(30, 20);
        // 클래스명.메소드명()인데, 다른 패키지에 있는 메소드를 불러와서 풀 쿨래스 네임을 썼다.
        System.out.println(max);
    }
}
