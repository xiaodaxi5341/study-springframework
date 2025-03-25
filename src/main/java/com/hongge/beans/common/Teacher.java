package com.hongge.beans.common;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class Teacher extends Person {

    private String grade;

}
