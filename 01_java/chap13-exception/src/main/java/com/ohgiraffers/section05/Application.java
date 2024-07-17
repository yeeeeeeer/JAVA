package main.java.com.ohgiraffers.section05;

// 예외처리 예시로 해보기
public class Application {
    public static void main(String[] args) {

        Job[] jobList = new Job[5];

        try {

            jobList[0] = new Job(1, "백엔드");
            jobList[1] = new Job(2, "프론트엔드");
            jobList[2] = new Job(3, "데브옵스");
            jobList[3] = new Job(4, "DBA");
            jobList[4] = new Job(5, "PM");
            jobList[5] = new Job(6, "PL");
            jobList[6] = new Job(7, "BogData");

            for (int i = 0; i < jobList.length; i++) {
                System.out.println(jobList[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {      // ArrayIndexOutOfBoundsException e ??
            e.printStackTrace();      // e.printStackTrace : 예외 발생 시점과 관련된 메서드 호출 정보를 콘솔에 출력 -> 에러 발생 위치 알수있음
        } catch (Exception e) {       // 혹시모르는 에러방지를 위한 최상위 catch 추가
            e.printStackTrace();
        }

        for (int i = 0; i < jobList.length; i++) {
            System.out.println(jobList[i]);
        }

    }
}
