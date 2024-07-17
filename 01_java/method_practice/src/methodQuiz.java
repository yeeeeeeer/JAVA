public class methodQuiz {
    public static void main(String[] args) {

        // 원의 둘레, 넓이 반환하는 메소드 만들어보기

        // 메소드 불러올때 클래스 먼저 new연산자로 생성
        // 생성한 클래스 명.
        methodQuiz quiz = new methodQuiz();

        // 원의 둘레 메소드 호출(반지름 15, PI값) - 출력
        System.out.println("원의 둘레: " + quiz.circlePermeter(15, 3.14));

        // 원의 넓이 메소드 호출(반지름 20, PI값) - 출력
        System.out.println("원의 넓이: " + quiz.circleArea(20, 3.14));

    }

    // 원의 둘레 메소드 - 원주율*지름 = 2*원주율*반지름
    // (반지름, 3.14)
    public double circlePermeter(double redius, final double PI) {
        return 2 * PI * redius;
    }

    // 원의 넓이 메소드  - 원주율*반지름*반지름
    public double circleArea(double radius, final double PI) {
        return PI * radius * radius;
    }


}
