package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class Application02 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        // try : 예외발생이 가능한 코드
        // catch : 예외 처리 코드
        try{
            et.checkEnoughMoney(1000,-500);
        }catch(NotEnoughMoneyException e){
            e.printStackTrace();
        }catch (PriceNegativeException | MoneyNegativeException e){
            e.printStackTrace();
        }finally {
            System.out.println("finally는 무조건 마지막에 동작");
        }

    }
}
