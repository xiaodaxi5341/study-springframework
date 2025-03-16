package com.hongge.beans.annoContext.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {

    @EventListener
    public void myEvent(MyEvent event) {
        System.out.println("MyEventListener : " + event.getSource());
    }

}
