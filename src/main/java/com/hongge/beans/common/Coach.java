package com.hongge.beans.common;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class Coach extends Person {

    private String workTime;

}
