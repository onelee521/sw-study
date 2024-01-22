package com.ohgiraffers.mysection.genericcollection;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

//        Lesson<MainSubject> lesson1 = new Lesson<>();
        Lesson<Math> lesson2 = new Lesson<>();
        lesson2.setSubject(new Math(5));
//        Lesson<Math> lesson2 = new Lesson<>(new Math(5));
        Lesson<English> lesson3 = new Lesson<>(new English("Hello"));
//        Lesson<Morality> lesson4 = new Lesson<>();        // MainSubject만 가능


        List firstSemester = new ArrayList<>();
        firstSemester.add(lesson2.getSubject().getNum());       // getSubject()를 하고 getNum()을 할 수 있다.
        firstSemester.add(lesson3.getSubject().getEng());
        System.out.println(firstSemester.get(0));
        System.out.println(firstSemester.get(1));
        System.out.println(firstSemester.size());


        Lesson<English> lesson5 = new Lesson<>();
        Lesson<Math> lesson6 = new Lesson<>();
        Lesson<English> lesson7 = new Lesson<>();

        List secondSemester = new ArrayList<Lesson>();
        secondSemester.add(lesson5);
        secondSemester.add(lesson6);
        System.out.println(secondSemester.get(0));      // com.ohgiraffers.mysection.genericcollection.Lesson@404b9385
        lesson5.setSubject(new English());
        System.out.println(secondSemester.get(0));      // com.ohgiraffers.mysection.genericcollection.Lesson@404b9385

        lesson5.getSubject().solved();
//        secondSemester.get(0).getSubject().solved(); // 컴파일에러
        System.out.println(secondSemester.get(0).getClass());   // class com.ohgiraffers.mysection.genericcollection.Lesson

        secondSemester.set(0, lesson7);
        secondSemester.remove(1);

    }
}
