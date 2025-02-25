package com.hongge.beans.annoContext.lifecycle;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class LifeDemo implements SmartLifecycle {

    private boolean isRunning = false;


    @Override
    public void start() {
        System.out.println("LifeDemo start");
        isRunning = true;
    }

    @Override
    public void stop() {
        System.out.println("LifeDemo stop");
        isRunning = false;
    }

    @Override
    public boolean isRunning() {
        System.out.println("LifeDemo isRunning");
        return isRunning;
    }

}
