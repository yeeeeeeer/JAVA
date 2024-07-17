package main.java.com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application02 {
    public static void main(String[] args) {

        /*
        * Properties 란?
        * HashMap 으로 구현하여 사용 용법이 거의 유사하지만 key와 value 모두 문자열만 사용할 수 있는 자료구조이다.
        * 설정 파일의 값을 읽어서 어플리케이션에 적용될 때 사용한다.
        *
        * */

        Properties prop = new Properties();

        prop.setProperty("deriver", "mysql.jdbc.driver.MysqlDriver");
        prop.setProperty("url", "localhost");
        prop.setProperty("user", "user");
        prop.setProperty("pass", "pass");
        System.out.println(prop);

        // 파일생성
        try {
            prop.store(new FileOutputStream("driver.dat"),"jdbcDriver");
            prop.store(new FileWriter("driver.txt"),"jdbcDriver");
            prop.storeToXML(new FileOutputStream("driver.xml"),"jdbcDriver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 파일읽기
        Properties prop2 = new Properties();

        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));
            prop2.list(System.out);
 
            // 키의 값 출력
            System.out.println(prop2.getProperty("driver"));
            System.out.println(prop2.getProperty("url"));
            System.out.println(prop2.getProperty("user"));
            System.out.println(prop2.getProperty("pass"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
