package scanner;

public class Quiz05 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int temp;

        temp = a; // 10
        a = b;  // 10 = 20 -> 20 = 20
        b = temp;

        System.out.println("a " + a);
        System.out.println("b " + b);


    }
}
