package main.java.com.ohgiraffers.section01.generic;

// 클래스명 옆에 <아무영문자 대문자>
public class GenericTest<T> {

    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }


}
