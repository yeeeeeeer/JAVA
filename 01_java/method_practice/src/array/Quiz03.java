package array;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("5개 정수 입력");

        int[] array = new int[5];
        int sum = 0;
        double avg ;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }

        avg = sum/ array.length;

        System.out.println("입력정수 합계: " + sum);
        System.out.println("입력정수 평균: " + avg);

    }
}
