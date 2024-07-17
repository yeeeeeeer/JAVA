package main.java.com.ohgiraffers.section02.demensional;

public class Application01 {
    public static void main(String[] args) {
        /*
         * 다차원 배열
         * 다차원 배열은 2차원 이상의 배열을 의미한다.
         *
         * 배열의 인덱스마다 또다른 배열의 주소를 보관하는 배열을 의미한다.
         * 즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미.
         * 더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열 이상은 사용빈도가 적다.
         * */

        /*
         * 2차원 배열 사용 방법
         * 1. 배열의 주소를 보관할 "레퍼런스 변수 선언" <- new 연산자 사용하는
         * 2. 여러 개의 1차원 배열의 주소를 관리하는 "배열 생성"
         * 3. 각 인덱스에서 관리하는 배열을 할당하여 주소를 보관하는 배열에 저장
         * 4. 생성한 여러개의 1차원 배열에 차례로 접근해서 사용
         * */

        // 레퍼런스 변수 선언
        int[][] iarr1;
//        iarr1 = new int[][];
        int[] iarr3[][];
        // 변수 초기화. 길이 꼭 지정하기. 2차원은 앞에꺼 지정해야됨.
        iarr1 = new int[3][];

        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];   // 밑에 코드랑 같은 의미임
        iarr1 = new int[3][5];

        for (int i = 0; i < iarr1[0].length; i++) {
            System.out.println(iarr1[0][i] + " ");
        }
        for (int i = 0; i < iarr1[1].length; i++) {
            System.out.println(iarr1[1][i] + " ");
        }
        System.out.println();


        for (int i = 0; i < iarr1.length; i++) {
            for (int j = 0; j < iarr1[i].length; j++) {
                System.out.println(iarr1[i][j] + " ");
            }
        }

    }
}
