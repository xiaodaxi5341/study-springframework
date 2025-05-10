package com.hongge.beans.annoContext.aop.apis.jdkRegexp;

import org.springframework.stereotype.Component;

@Component
public class JdkRegexpComponent {

    public void setName(){
        System.out.println("setName");
    }

    public void doAbsquatulate(){
        System.out.println("doAbsquatulate");
    }

    public void print(){
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        System.out.println(stackTrace);
    }

}
