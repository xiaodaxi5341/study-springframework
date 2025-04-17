package com.hongge.beans.annoContext.aop.introductions;

import org.springframework.stereotype.Component;

@Component
public class MockExternalSpringBeanService {

    public void executeSelf(){
        System.out.println("MockExternalSpringBeanService executeSelf");
    }

}
