package com.hongge.beans.annoContext.i18n;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MessageSourceConfiguration.class);
        context.refresh();

        MessageSource bean = context.getBean(MessageSource.class);
        String message = bean.getMessage("testMessage", new Object[]{"h", "xh"}, "shayemeiyong", Locale.CHINA);
        System.out.println(message);
    }

}
