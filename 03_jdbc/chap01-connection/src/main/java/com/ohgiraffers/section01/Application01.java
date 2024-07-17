package com.ohgiraffers.section01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application01 {
    public static void main(String[] args) {
        // connection 하기
        // 데이터베이스와 연결하기 위한 "접속정보"들을 관리하는 객체
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "songpa", "songpa");

            System.out.println(con);  // 잘 연결됏는지 확인하기위해 , 출력되면 잘 된거
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
