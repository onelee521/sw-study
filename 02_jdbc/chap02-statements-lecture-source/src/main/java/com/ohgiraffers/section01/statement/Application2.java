package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

/* 설명. 사원번호을 입력받아 한명의 사원을 조회하는 기능 작성 */
public class Application2 {
    public static void main(String[] args) {

        Connection con = getConnection();
        Statement stmt = null;
        ResultSet rset = null;

        try {
            stmt = con.createStatement();

            /* 설명. 사용자로부터 조회하고자 하는 사원의 사원번호를 입력받음 */
            Scanner sc = new Scanner(System.in);
            System.out.print("사원번호를 입력하세요: ");
            int empId = sc.nextInt();
            String entYn = "N";

            /* 설명. 입력받은 사원번호를 활용한 쿼리 작성 */
            String query = "SELECT EMP_ID, EMP_NAME FROM EMPLOYEE WHERE EMP_ID = '" + empId + "' AND ENT_YN = '" + entYn + "'";      // 문자열이 되도록 싱글쿼테이션 사용
            System.out.println("query = " + query);

            rset = stmt.executeQuery(query);

            if(rset.next()) {
                System.out.println(rset.getString("EMP_ID")
                            + ", " + rset.getString("EMP_NAME"));
            } else {
                System.out.println("해당 사원의 조회 결과가 없습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(rset);
            close(stmt);
            close(con);
        }


    }
}
