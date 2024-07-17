package com.ohgiraffers.section01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Apllication02 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "songpa";
        String password = "songpa";

        // try에서쓰면 final에서 어처피 써야해서 try문 밖에 씀
        Connection con = null;

        try {
            con = DriverManager.getConnection(url, user, password);
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
