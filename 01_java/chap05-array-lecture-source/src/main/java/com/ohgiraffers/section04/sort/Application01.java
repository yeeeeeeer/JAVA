package main.java.com.ohgiraffers.section04.sort;

public class Application01 {
    public static void main(String[] args) {

        // "변수의 두 값을 변경"하는 방법에 대해 이해할 수 있다.

        // 두개의 변수를 서로 바꾼다
        int num1 = 10;
        int num2 = 20;

        // 새로운 변수를 하나 선언한다
        int temp;
        temp = num1;      // 10 = 10
        num1 = num2;      // 10 = 20 -> num1 20
        num2 = temp;      // 20 = 10 -> num2 10

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        // 배열의 인덱스에 있는 값도 서로 변경할 수 있다
        int[] arr = {2, 1, 3};

        int temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }


        //
    }
}
