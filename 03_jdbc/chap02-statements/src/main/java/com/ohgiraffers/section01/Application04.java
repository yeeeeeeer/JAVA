package com.ohgiraffers.section01;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application04 {
    public static void main(String[] args) {

        // 조회한 객체를 DTO에 담기
        Connection con = getConnection();

        Statement stmt = null;
        ResultSet rset = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("조회하실 사번을 입력 해주세요");
        String empId = sc.nextLine();

        String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = " + empId;

        EmployeeDTO selectEmp = null;  //?

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);

            if(rset.next()) {
                selectEmp = new EmployeeDTO();   //?

                selectEmp.setEmpId(rset.getString("EMP_ID"));
                selectEmp.setEmpName(rset.getString("EMP_NAME"));
                selectEmp.setEmpNo(rset.getString("EMP_NO"));
                selectEmp.setEmail(rset.getString("EMAIL"));
                selectEmp.setPhone(rset.getString("PHONE"));
                selectEmp.setDeptCode(rset.getString("DEPT_CODE"));
                selectEmp.setJobCode(rset.getString("JOB_CODE"));
                selectEmp.setSalLevel(rset.getString("SAL_LEVEL"));
                selectEmp.setSalary(rset.getInt("SALARY"));
                selectEmp.setBonus(rset.getInt("BONUS"));
                selectEmp.setManagerId(rset.getString("MANAGER_ID"));
                selectEmp.setHireDate(rset.getDate("HIRE_DATE"));
                selectEmp.setEndDate(rset.getDate("ENT_DATE"));
                selectEmp.setEndYn(rset.getString("ENT_YN"));
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
