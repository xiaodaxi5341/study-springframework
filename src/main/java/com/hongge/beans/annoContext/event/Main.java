package com.hongge.beans.annoContext.event;

import com.hongge.beans.Face;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.hongge.beans.annoContext.event");
        context.refresh();
        MyEventPublisher publisher = context.getBean(MyEventPublisher.class);
        publisher.publishEvent(new Face("event", "黑不溜秋"));
    }

}
