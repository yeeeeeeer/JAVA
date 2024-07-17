package scanner;

import java.util.Scanner;

public class Quiz08 {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("상품의 가격을 입력(-1 입력하면 종료) ");
            int price = sc.nextInt();

            if (price == -1) {
                System.out.println("--- 프로그램 종료 ---");
                break;
            }

            System.out.println("상품의 수량을 입력 ");
            int quantity = sc.nextInt();

            int totalPrice = price * quantity;
            System.out.println("총 비용 : " + totalPrice);
        }
    }
}
