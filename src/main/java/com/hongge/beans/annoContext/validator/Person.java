package com.hongge.beans.annoContext.validator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

    private int cardId;
    private String name;
    private int age;


    private String firstName;
    private String surname;
    private Address address;

}
