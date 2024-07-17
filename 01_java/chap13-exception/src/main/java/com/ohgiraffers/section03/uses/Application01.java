package main.java.com.ohgiraffers.section03.uses;

import java.awt.image.BufferedImage;
import java.io.*;

public class Application01 {
    public static void main(String[] args) {

        // 예외처리가 자주 사용되는 io 패키지에서 예외처리를 사용하는 구문을 이해할 수 있다
        // io : 컴퓨터의 파일을 읽거나 사용하는 패키지

        BufferedReader in = null;

        try{
            in = new BufferedReader(new FileReader("test.dat"));
            String s;

            while((s=in.readLine()) != null){
                System.out.println(s);
            }
        }catch(FileNotFoundException e){
            System.out.println("익셉션 발생");
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("finally 실행");

            try{
                if(in != null){
                    in.close();       // IO? 로 열면 in.close 로 닫아야 한다.
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
