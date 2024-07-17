package array;

import java.util.Scanner;

public class Quiz02_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수 입력");

        int[] arr = new int[5];
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i =4; i >= 0; i--) {
            System.out.print(arr[i]);
            if(i > 0){
                System.out.print(", ");
            }
        }

    }
}
