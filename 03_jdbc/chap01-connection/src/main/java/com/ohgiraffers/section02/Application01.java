package com.ohgiraffers.section02;

import java.sql.Connection;

import static com.ohgiraffers.section02.JDBCTemplate.close;
import static com.ohgiraffers.section02.JDBCTemplate.getConnection;

public class Application01 {
    // 메소드 따로 만들어서 불러오는 방법
    public static void main(String[] args) {
        Connection con = getConnection();
        System.out.println(con);
        close(con);
    }
}
