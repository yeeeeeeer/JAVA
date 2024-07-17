package main.java.com.ohgiraffers.section01.array;

public class Application05 {
    public static void main(String[] args) {

        // 랜덤으로 트럼프 카드 뽑긔

        // 배열 두개 사용
        String[] shapes = {"SPADE", "HEART", "CLUB", "DIAMOND"};    // index 0 1 2 3
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        // math.random은 0.0 ~ 0.99999
        // math.random * 배열 길이만큼 -> (int)로 소수점 날리면 인덱스만큼 됨.
        int shapesNumber = (int) (Math.random() * shapes.length);
        int chNumber = (int) (Math.random() * number.length);

        System.out.println(shapes[shapesNumber] + " " + number[chNumber]);

    }
}
