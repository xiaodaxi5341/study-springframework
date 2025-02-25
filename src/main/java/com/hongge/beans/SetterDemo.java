package com.hongge.beans;

import lombok.ToString;

@ToString
public class SetterDemo {

    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

}
