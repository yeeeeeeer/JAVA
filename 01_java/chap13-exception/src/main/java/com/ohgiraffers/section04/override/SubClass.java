package main.java.com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{

    // 예외 없이 가능 - 부모 메소드가 예외를 던지더라도 재정의하면서 예외를 발생시키지 않을 수 있기 때문에
    // public void method()  {  }

    // 동일 예외 던져주는 구문. 작성 O
    // public void method() throws IOException{  }

    // 상위 타입인 exception은 불가능
    // public void method() throws Exception{  }

    public void method() throws FileNotFoundException{}

}
