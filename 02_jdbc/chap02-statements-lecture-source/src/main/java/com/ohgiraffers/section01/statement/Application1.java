package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {

        /* 설명. 트랜젝션 처리를 위한 DBMS 연동을 Connection 객체 생성 */
        Connection con = getConnection();

        // 비즈니스 로직 시작
        /* 설명. 해당 Connection을 통해 트랜젝션 처리(비즈니스 로직 수행, CRUD) */
        System.out.println("con = " + con);

        Statement stmt = null;          // 쿼리를 운반하고 결과를 반환하는 객체
        ResultSet rset = null;          // 조회의 결과를 반환하는 객체

        try {
            stmt = con.createStatement();

            /* 설명. 쿼리의 결과인 다중행/단일행을 받은 ResultSet(현재는 다중행) */
            rset = stmt.executeQuery("SELECT * FROM EMPLOYEE");     // 쿼리문은 대문자로 쓰기

            /* 설명. rset.next() 한 행 씩 확인 */
            while(rset.next()) {            // 이 반복문의 조회의 결과 행만큼 반복

                /* 설명. 반복문 안애서의 rset은 단일행으로 해석할 것 */
                System.out.println(rset.getString("EMP_NAME")
                                         + ", " + rset.getString("SALARY"));
            }

        // 비즈니스 로직 끝

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            /* 설명. 열린 순서에서 반대로 닫아주어야 한다. */
            close(rset);
            close(stmt);
            close(con);
        }
    }
}
