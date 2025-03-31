package com.hongge.beans.annoContext.startup;

import com.hongge.AnnoMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.core.metrics.StartupStep;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = AnnoMain.getContext();
        // create a startup step and start recording
        ApplicationStartup applicationStartup = context.getApplicationStartup();
        System.out.println(applicationStartup.getClass().getSimpleName());
        StartupStep scanPackages = applicationStartup.start("spring.context.base-packages.scan");
// add tagging information to the current step
        scanPackages.tag("packages", () -> Arrays.toString(new String[]{"com.hongge"}));
// perform the actual phase we're instrumenting
        context.scan("com.hongge");
// end the current step
        scanPackages.end();
    }

}
