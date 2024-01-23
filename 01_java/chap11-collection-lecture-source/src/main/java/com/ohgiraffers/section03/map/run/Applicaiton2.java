package com.ohgiraffers.section03.map.run;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Properties;

public class Applicaiton2 {
    public static void main(String[] args) {

        /* 수업목표. Properties에 대해 이해하고 사용할 수 있다. */
        /* 필기.
         *  Properties란?
         *   HashMap과 거의 유사하지만 key와 value 모두를 String으로만 사용할 수 있는 자료구조이다.
         *   주로 설정 파일 관련된 파일과 입출력에 사용된다.(store, load 등)
        * */
        Properties prop = new Properties();

        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:127.0.1:1521:xe");
        prop.setProperty("user", "swcamp");
        prop.setProperty("password", "swcamp");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver2");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver3");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* 설명. 저장한 파일에서부터 읽어온 데이터를 담을 Properties 객체 */
        Properties prop2 = new Properties();


        try {
//            prop2.load(new FileInputStream("driver.dat"));
//            prop2.load(new FileInputStream("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("읽어온 후");
        System.out.println("driver: " + prop2.getProperty("driver"));
        System.out.println("url: " + prop2.getProperty("url"));
        System.out.println("user: " + prop2.getProperty("user"));
        System.out.println("password: " + prop2.getProperty("password"));
    }
}
