package com.hongge.beans.annoContext.validator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.hongge.beans.annoContext.validator");
        context.refresh();

        MyService service = context.getBean(MyService.class);
//        service.validate(new PersonForm("hxh", 1));
//        System.out.println("success");
        service.validate(new PersonForm("hxh", -1));
        System.out.println("success");
        service.validate(new PersonForm("hxhasdfsdfsadf", 1));
        System.out.println("success");
        service.validate(new PersonForm("hxhasdfsdfsadf", -21));
        System.out.println("success");
    }

}
