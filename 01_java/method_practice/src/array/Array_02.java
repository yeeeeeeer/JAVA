package array;

import java.util.Scanner;

public class Array_02 {
    public static void main(String[] args) {

        // 상품관리 프로그램
        /*
         * 기능
         * 1. 상품 등록 - 상품 이름, 가격 입력받아 저장
         * 2. 상품 목록 - 등록한 모든 상품의 목록 출력
         *
         * 동작
         * 0. 사용자에게 세 가지 선택 제시 - 1. 상품등록 2. 상품목록 3. 종료
         * 1. 상품 등록 - 사용자에게 상품 이름, 가격 입력받아 배열에 저장 (10개까지 제한)
         * 2. 상품 목록 - 배열에 저장된 모든 상품 출력
         * 3. 종료 - 프로그램 종료
         *
         * */

        // 사용자 입력받는 Scanner scanner
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 상품 이름, 가격 입력받고 - 배열 저장
        // 10개 제한
        int max = 10;
        String[] productNames = new String[max];
        int[] productPrices = new int[max];

        // 등록된 상품 갯수 변수
        int productCount = 0;

        // 선택 제시
        while (true) {
            System.out.println("1. 상품등록 / 2. 상품목록 / 3. 종료");
            System.out.println("메뉴 선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            // 선택 -> 실행
            // 1번 상품등록 - productNames 상품 이름, productPrices 가격 max(10개)까지 받기 -> 배열
            if (choice == 1) {
                if (productCount >= max) {
                    System.out.println(" 더이상 상품을 등록할 수 없습니다. ");
                    continue;

                }
                System.out.println("상품 이름 입력 : ");
                productNames[productCount] = scanner.nextLine();

                System.out.println("상품 가격 입력 : ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;


            } else if (choice == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다~");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i] + " 원");
                }


            } else if (choice == 3) {
                System.out.println("프로그램 종료");
                break;


            } else {
                System.out.println("잘못된 메뉴를 선택했습니다");
            }
        }
    }
}
