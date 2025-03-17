package com.hongge.beans.annoContext.event;

import org.springframework.context.ApplicationEvent;

public class MySecondEvent extends ApplicationEvent {
    public MySecondEvent(Object source) {
        super(source);
    }
}
