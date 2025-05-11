package com.hongge.beans.xmlContext.tx;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:my-beans.xml");
//        FooService fooService = context.getBean(FooService.class);
        com.hongge.beans.xmlContext.tx.reactive.FooService fooService = context.getBean(com.hongge.beans.xmlContext.tx.reactive.FooService.class);
        fooService.insertFoo(new Foo());
    }

}
