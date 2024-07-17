package array;

import java.util.Scanner;

public class Quiz04_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("입력받을 숫자 갯수 입력");
        int count = sc.nextInt();

        int[] arr = new int[count];

        int minNumber, maxNumber;

        System.out.println(count + "개의 정수를 입력");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        minNumber = maxNumber = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minNumber){
                minNumber = arr[i];
            }
            if(arr[i] > maxNumber){
                maxNumber = arr[i];
            }
        }

        System.out.println("가장 작은 정수: "+minNumber);
        System.out.println("가장 큰 정수: "+maxNumber);

    }
}
