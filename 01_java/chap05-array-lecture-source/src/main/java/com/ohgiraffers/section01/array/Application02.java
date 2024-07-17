package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        /*
         * 배열의 선언
         *
         * 자료형[] 변수명;    //선언까지는 stack에 공간만 형성
         * */

        int[] iarray;
        int array[];

        /*
         *  new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자다.
         * 발생한 주소를 레퍼런스 주소에 저장하여 이것을 사용하기 때문에 참조자료형(reference type)이라고 한다.
         * new 연산자는 = 참조자료형
         * */

        // 배열을 할당할 시, 반드시 크기를 지정해야 한다.
        iarray = new int[5];
        array = new int[4];

        // 선언과 동시에 할당.
        int[] iarr = new int[3];

        System.out.println("heap 영역의 주소값 : " + iarray);
        System.out.println("heap 영역의 주소값 : " + array);
        System.out.println("heap 영역의 주소값 : " + iarr);

        // hashCode() : 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다.
        System.out.println(iarray.hashCode());
        System.out.println(array.hashCode());
        System.out.println(iarr.hashCode());

        // 스캐너로 입력받은 정수로 배열 길이를 지정해보자

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int size = sc.nextInt();

        int[] darr = new int[size];

        System.out.println("darr의 hashCode : " + darr.hashCode());
        System.out.println("darr의 length : " + darr.length);

        // 같은 배열에 새로운 값을 할당하면 서로 다른 주소값을 가진다 -> 기존 배열은 garbage에서 수거해감
        darr = new int[50];
        System.out.println("바뀐 hashCode" + darr.hashCode());
        System.out.println("바뀐 length" + darr.length);
    }
}
