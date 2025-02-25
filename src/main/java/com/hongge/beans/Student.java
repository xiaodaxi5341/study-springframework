package com.hongge.beans;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Student {

    private String name;
    private int age;

    public Face chinaFace() {
        return new Face("瓜子脸", "黄色");
    }
}
