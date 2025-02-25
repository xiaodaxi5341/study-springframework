package com.hongge.beans;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class MyClass {

    private Student student;
    private String name;

}
