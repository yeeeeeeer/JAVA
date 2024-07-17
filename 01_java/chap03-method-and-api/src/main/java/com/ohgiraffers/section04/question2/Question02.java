package main.java.com.ohgiraffers.section04.question2;

import main.java.com.ohgiraffers.section04.question.Question;
import org.w3c.dom.ls.LSOutput;

public class Question02 {

    public String randomNumber(int random) {
        return random > 0 ? random % 2 == 0 ? "x는 양수면서 짝수입니다" : "x는 양수면서 홀수입니다" : random % 2 == 0 ? "x는 음수면서 짝수입니다" : "x는 음수면서 홀수입니다";
    }

    /*
     * 1. (양수 음수 물어보기)
     * 1-1. 양수 : (짝수인지 홀수인지)
     * 1-2. 음수 : (짝수인지 홀수인지)
     *
     * (1번 num > 0) ?
     * (1-1번 num % 2 == 0 ? (1-1-1번 양수면서 짝수 : 1-1-2번 양수면서 홀수)) :
     * (1-2번 num % 2 == 0 ? (1-2-1번 음수면서 짝수 : 1-2-2번 음수면서 홀수))
     */
}
