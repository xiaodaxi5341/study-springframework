package com.hongge.beans.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Inventor {

    private String name;
    private Date birthday;
    private String nationality;
}
