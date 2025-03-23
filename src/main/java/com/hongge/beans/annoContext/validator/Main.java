package com.hongge.beans.annoContext.validator;

import org.springframework.validation.BindException;

public class Main {

    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("hxh");
//        person.setAge(-1);
//        SimpleErrors personobj = new SimpleErrors(person, "personobj");
//        new PersonValidator().validate(person, personobj);
//        System.out.println(personobj);

        /**
         * 复杂对象的校验
         */
        Person person = new Person();
        person.setFirstName("有了firstname了");
        person.setAddress(new Address());
        Person person2 = new Person();
        BindException personobj = new BindException(person2, "personobj2");

        new CustomerValidator(new AddressValidator()).validate(person, personobj);
        System.out.println(personobj);
    }

}
