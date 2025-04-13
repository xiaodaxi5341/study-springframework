package com.hongge.beans.annoContext.aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

@Component
public class ExecuteDemo {

    public void execute() {
        ExecuteDemo executeDemo = (ExecuteDemo) (AopContext.currentProxy());
        // private不会被aop增强
        executeDemo.internalExecute();
        executeDemo.execute2();
    }

    public void execute2() {
        System.out.println("execute2");
    }

    private void internalExecute() {
        System.out.println("internalExecute");
    }

}
