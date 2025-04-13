package com.hongge.beans.annoContext.aop;

import com.hongge.AnnoMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = AnnoMain.getContext("com.hongge.beans.annoContext.aop");
        ExecuteDemo bean = context.getBean(ExecuteDemo.class);
        bean.execute();
    }

}
