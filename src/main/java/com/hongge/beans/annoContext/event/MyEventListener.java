package com.hongge.beans.annoContext.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {

    @EventListener
    public MySecondEvent myEvent(MyEvent event) {
        System.out.println("监听到了 : " + event.getSource());
        return new MySecondEvent("二次传播机制");
    }

    @EventListener
    public void myEvent2(MySecondEvent event) {
        System.out.println("二次传播事件监测： : " + event.getSource());
    }

}
