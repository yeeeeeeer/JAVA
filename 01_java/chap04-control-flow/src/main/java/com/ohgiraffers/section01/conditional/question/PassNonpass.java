package main.java.com.ohgiraffers.section01.conditional.question;

public class PassNonpass {
    // 합격여부구하는 메소드

    //  if (a, b, c 40 이상) {
    //      if (평균 60 이상) {
    //                  - 합격출력}
    //      else {불합 - 불합격 출력}
    //  } else {불합 출력}

    public void result(int a, int b, int c, int aver) {

//        Average aver = new Average();
//        int avere = aver.aver(a,b,c);

        if (a > 40 && b > 40 && c > 40) {
            if (aver > 60) {
                System.out.println("평균점수는 " + aver + "점 이고 합격입니다!");
            } else {
                System.out.println("불합격입니다!");
            }
        } else {
            System.out.println("불합격입니다!");
        }
    }
}
