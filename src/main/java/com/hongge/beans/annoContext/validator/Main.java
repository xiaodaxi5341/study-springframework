package com.hongge.beans.annoContext.validator;

import org.springframework.validation.BindException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.hongge.beans.annoContext.validator");
        context.refresh();
//        Person person = new Person();
//        person.setName("hxh");
//        person.setAge(-1);
//        SimpleErrors personobj = new SimpleErrors(person, "personobj");
//        new PersonValidator().validate(person, personobj);
//        System.out.println(personobj);

        MyService service = context.getBean(MyService.class);
//        service.validate(new PersonForm("hxh", 1));
//        System.out.println("success");
        service.validate(new PersonForm("hxh", -1));
        System.out.println("success");
        service.validate(new PersonForm("hxhasdfsdfsadf", 1));
        System.out.println("success");
        service.validate(new PersonForm("hxhasdfsdfsadf", -21));
        System.out.println("success");
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
