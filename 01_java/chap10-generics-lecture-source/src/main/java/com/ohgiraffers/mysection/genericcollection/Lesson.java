package com.ohgiraffers.mysection.genericcollection;

public class Lesson<T extends MainSubject> {
    private T subject;

    public Lesson() {
    }

    public Lesson(T subject) {
        this.subject = subject;
    }

    public T getSubject() {
        return subject;
    }

    public void setSubject(T subject) {
        this.subject = subject;
    }
}
