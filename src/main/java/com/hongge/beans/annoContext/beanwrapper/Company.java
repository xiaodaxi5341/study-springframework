package com.hongge.beans.annoContext.beanwrapper;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Company {

    private String name;
    private Employee managingDirector;

}
