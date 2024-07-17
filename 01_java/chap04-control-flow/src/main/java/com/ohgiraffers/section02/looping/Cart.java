package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Cart {

    public static void main(String[] args) {

        Cart cart = new Cart();
        cart.cart();
        /*
         * 인터넷 장바구니
         * */

        /*
         * 장바구니에 담은 물건들 한번에 결제하는 기능
         * 1. 장바구니의 제한이 없다. (물건을 담는)
         * 2. 결제 확인을 받으면 진행함.
         * */
    }

    public void cart() {
        // 0. 장바구니에 담긴 제품의 가격을 합산하여 관리하는 변수가 필요함 - 반복문

        int result = 0;    // 장바구니 역할 : 카트에 담긴 제품의 가격을 입력받기 위한 변수

        boolean payments = false;   // 결제 여부를 판단하는 변수

        // 2. 사용자에게 입력받을 수 있도록 함 - scanner
        Scanner sc = new Scanner(System.in);

        // 1. 사용자한테 어느 제품을 주문할 것인지 물어본다.
        // 물건을 담는 횟수가 제한이 없어서 무한반복함 -> 초기식, 조건식, 증감식 없이 빈칸으로 남겨놓기.
        // false나올때까지 반복함
        // 사용자가 결제를 진행하면 반복하지 않기 위해 조건식에 결제 여부를 입력함
        for (; !payments; ) {
            System.out.println("바나나 / 사과 / 레몬사탕 중 어느 제품을 구매하시나요?");
            // 어느 제품을 장바구니에 담는지 확인하기 위한 변수
            String product = sc.nextLine();
            // 사용자가 고른 제품이 존재한다면 result 라는 변수에 가격을 추가함
            switch (product) {
                case "바나나":
                    result += 4500;
                    break;
                case "사과":
                    result += 10000;
                    break;
                case "레몬사탕":
                    result += 16000;
                    break;
                default:
                    System.out.println("존재하지 않는 제품입니다.");
                    break;
            }

            // 3. 결제 여부를 물어보고 결제를 진행함
            System.out.println("결제 하시겠나요?");
            // 결제 여부의 데이터는 boolean 타입으로 true or false 로 입력받음
            payments = sc.nextBoolean();
            // 만약 결제 여부를 판단하는 변수인 payments가 true라면 결제를 진행함
            if (payments) {
                System.out.println("결제할 금액은 : " + result + "입니다.");
            }
            sc.nextLine(); // 뭐 빈공간을 없애주는거?

        }


    }
}

