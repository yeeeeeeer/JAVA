package com.ohgiraffers.understand;

import java.sql.*;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rset = null;
        ResultSet rset2 = null;

        // 급여 많이
        String query = "SELECT * " +
                "       FROM EMPLOYEE " +
                "       WHERE SALARY = " +
                "               (SELECT MAX(SALARY) " +
                "                   FROM EMPLOYEE)";
        System.out.println("--- " + query);


        try {
            pstmt = con.prepareStatement(query);
            System.out.println(pstmt);
            rset = pstmt.executeQuery();

            while(rset.next()) {
                System.out.println(rset.getString("EMP_ID") + " " + rset.getString("EMP_NAME")+ " " + rset.getString("PHONE")+ " " + rset.getString("SALARY"));
            }

            // 선동일 사원의 사번, 이름, 연락처, 전화번호, 직급(JOB 테이블) 출력

            String query2 = "SELECT A.EMP_ID, A.EMP_NAME, A.PHONE, B.JOB_CODE" + "FROM EMPLOYEE A" + "JOIN JOB B";
            System.out.println(query2);

            pstmt2 = con.prepareStatement(query2);
            System.out.println(pstmt2);
            rset2 = pstmt2.executeQuery();

            while(rset2.next()) {
                System.out.println(rset2.getString("A.EMP_ID")+" "+rset2.getString("A.EMP_NAME")+" "+rset2.getString("A.PHONE")+" "+rset2.getString("B.JOB_CODE"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(con);
            close(pstmt);
            close(rset);
            close(pstmt2);
            close(rset2);
        }
    }
}
