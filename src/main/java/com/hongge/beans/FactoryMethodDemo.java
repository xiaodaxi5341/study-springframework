package com.hongge.beans;

public class FactoryMethodDemo {

    public static Student generateStudent() {
        Student student = new Student();
        student.setAge((int) (Math.random() * 100));
        student.setName("name" + student.getAge());
        return student;
    }

}
