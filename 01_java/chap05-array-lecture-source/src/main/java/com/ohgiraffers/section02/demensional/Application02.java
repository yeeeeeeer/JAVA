package main.java.com.ohgiraffers.section02.demensional;

public class Application02 {
    public static void main(String[] args) {

        // 선언과 할당 동시에 할 수 있다.

        // 정변 배열
        int[][] iarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};   // 3행 5열의 배열

        // 반복문 이용한 값 출력
        for (int i = 0; i < iarr.length; i++) {
            // 해당 인덱스의 길이만큼
            for (int j = 0; j < iarr[i].length; j++) {
                System.out.println(iarr[i][j] + " ");
            }
            System.out.println();
        }

        // 가변 배열 - 인덱스마다 번호를 다르게?
        int[][] iarr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < iarr2.length; i++) {
            for (int j = 0; j < iarr2[i].length; j++) {
                System.out.println(iarr2[i][j] + " ");
            }
            System.out.println();
        }

        // 미리 할당한 배열을 이용한 방식
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[][] iarr3 = {arr1, arr2};   // 2행 5열

        for (int i = 0; i < iarr3.length; i++) {
            for (int j = 0; j < iarr3[i].length; j++) {
                System.out.println(iarr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
