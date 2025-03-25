package com.hongge.beans.annoContext.conversionService.factory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.hongge.AnnoMain.getContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = getContext();
        Demo bean = context.getBean(Demo.class);

        System.out.println(bean.getTeacher());
        System.out.println(bean.getCoach());
    }

}
