package com.hongge.beans.annoContext.event;

import com.hongge.beans.Face;
import jakarta.annotation.Resource;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher {

    @Resource
    private ApplicationEventMulticaster applicationEventMulticaster;

    public void publishEvent(Face face) {
        applicationEventMulticaster.multicastEvent(new MyEvent(face));
    }

}
