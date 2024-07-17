package main.java.com.ohgiraffers.section06.temary;

public class Test {
    public static void main(String[] args) {

        /*
         * 영어시험을 본 결과 1번학생은 90점, 2번학생은 95점, 3번학생은 81점, 4번학생은 88점을 맞았다.
         * 평균을 구한 후 90~100점 사이에 있는 학생은 합격, 아니라면 불합격을 출력하자
         * */

        int student1 = 90;
        int student2 = 95;
        int student3 = 81;
        int student4 = 88;

        int average = (student1 + student2 + student3 + student4) / 4;
        System.out.println("학생들 평균 점수 : " + average);

        String result1 = (90 < student1 && student1 < 100) ? "합격" : "불합격";
        String result2 = (90 < student2 && student2 < 100) ? "합격" : "불합격";
        String result3 = (90 < student3 && student3 < 100) ? "합격" : "불합격";
        String result4 = (90 < student4 && student4 < 100) ? "합격" : "불합격";

        System.out.println("1번학생 : " + result1);
        System.out.println("2번학생 : " + result2);
        System.out.println("3번학생 : " + result3);
        System.out.println("4번학생 : " + result4);
        
    }
}
