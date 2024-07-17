package com.ohgiraffers.section01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application02 {
    public static void main(String[] args) {

        // 사원번호에 해당하는 사원의 정보를 조회한다.
        // 1. connection
        // 2. statement 쿼리룰 만든다
        // 3. 쿼리를 보낸다
        // 4. resultSet으로 결과를 받는다.


        // 1. connection
        Connection con = getConnection();

        Statement stmt = null; // 쿼리문 실행
        ResultSet rset = null; // 쿼리 실행 결과를 저장, 접근

        // 2. statement 쿼리 만들기
        try {
            stmt = con.createStatement();
            String empid = "200";

            // 3, 4 번
            rset = stmt.executeQuery("SELECT EMP_ID, EMP_NAME FROM EMPLOYEE WHERE EMP_ID = " + empid);

            // 결과물 출력
            while (rset.next()) {
                System.out.println(("EMP_ID") + "   " + rset.getString("EMP_NAME"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
