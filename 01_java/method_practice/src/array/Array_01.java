package array;

import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {

//        // 4행 3열
//        Scanner sc = new Scanner(System.in);
//
//        int[][] arr = new int[4][3];
//        String[] subject = {"국어", "영어", "수학"};
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println((i + 1) + " 번 학생의 성적 입력: ");
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(subject[j] + " 점수: ");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < arr[i].length; j++) {
//                sum += arr[i][j];
//            }
//            double avg = sum / 3.0;
//            System.out.println((i + 1) + " 번 학생의 총점 : " + sum + ", 평균 : " + avg);
//
//        }

        // 학생 수 입력받기
        // 학생 수 (행)

        Scanner sc = new Scanner(System.in);
        System.out.println("학생수를 입력: ");
        int[][] arr = new int[sc.nextInt()][3];
        String[] subject = {"국어", "영어", "수학"};

        // 성적 입력 , 점수 받기 ) 반복
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + " 번 학생의 성적 입력 : ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(subject[j] + "점수 : ");
                arr[i][j] = sc.nextInt();
            }
        }

        // 학생별 총점 ) 반복
        // 평균 구하기 (총점 / 행 갯수 arr[i].length)
        double avg;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            avg = (sum / arr[i].length);

            System.out.println((i + 1) + " 번 학생의 총점 : " + sum);
            System.out.println("평균 : "+avg);
        }


    }
}
