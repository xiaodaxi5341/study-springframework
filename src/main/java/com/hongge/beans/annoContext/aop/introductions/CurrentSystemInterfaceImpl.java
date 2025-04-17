package com.hongge.beans.annoContext.aop.introductions;

import org.springframework.stereotype.Component;

@Component
public class CurrentSystemInterfaceImpl implements MockExternalInterface {
    @Override
    public void execute() {
        System.out.println("current system interface");
    }
}
