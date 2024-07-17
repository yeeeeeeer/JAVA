package scanner;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("음식 이름 입력");
        String foodName = sc.nextLine();
        System.out.println("음식의 가격 입력");
        int foodPrice = sc.nextInt();
        System.out.println("음식의 수량 입력");
        int foodQuantity = sc.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + " " + foodQuantity + " 개를 주문하셨습니다. 총 가격은 " + totalPrice + " 원 입니다.");


    }
}
