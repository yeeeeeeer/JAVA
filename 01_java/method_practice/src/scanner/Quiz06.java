package scanner;

import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" 첫번째 숫자 입력 ");
        int num1 = sc.nextInt();
        System.out.println(" 두번째 숫자 입력 ");
        int num2 = sc.nextInt();

        int temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("두 숫자사이의 정수 출력");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if(i != num2){
                System.out.println(" , ");
            }
        }
    }
}
