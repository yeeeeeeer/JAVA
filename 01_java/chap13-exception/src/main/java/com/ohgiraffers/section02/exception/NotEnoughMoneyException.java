package main.java.com.ohgiraffers.section02.exception;

// 가진 돈보다 상품이 비쌀 때 오류 발생시킬거임
public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException() {
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
