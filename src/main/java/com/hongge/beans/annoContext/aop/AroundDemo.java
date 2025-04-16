package com.hongge.beans.annoContext.aop;

import org.springframework.stereotype.Component;

@Component
public class AroundDemo {

    public void execute(String name, String age){
        System.out.println(name+":"+age);
    }

}
