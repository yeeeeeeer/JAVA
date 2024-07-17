package main.java.com.ohgiraffers.section04.sort;

public class Application02 {
    public static void main(String[] args) {

        // 순차 정렬 - 비효율적, 잘 사용하지않지만 알고 넘어가는 정도

        // 앞에꺼랑 비교하고 작으면 바꾼다?
        // 초기 배열 선언
        int[] iarr = {2, 5, 4, 6, 1, 3};

        for (int i = 1; i < iarr.length; i++) {

            for (int j = 0; j < i; j++) {

                if (iarr[i] < iarr[j]) {
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }
            }
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i] + " ");
        }
    }
}
