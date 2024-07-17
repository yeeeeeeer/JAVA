package com.ohgiraffers.section01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application01 {
    public static void main(String[] args) {

        Connection con = getConnection();

        // 쿼리문을 저장하고 실행하는 인터페이스
        Statement stmt = null;

        // select 결과 집합을 받아오는 인터페이스
        ResultSet rset = null;

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery("SELECT EMP_ID,EMP_NAME FROM EMPLOYEE"); //대문자로 쓰기

            while (rset.next()) {
                System.out.println(rset.getString("EMP_ID") + "  " + rset.getString("EMP_NAME"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(con);
            close(stmt);
            close(rset);
        }
    }
}
