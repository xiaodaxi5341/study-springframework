package com.hongge.beans.annoContext.propertySource;

import org.springframework.core.env.PropertySource;

public class MyPropertySource extends PropertySource {
    public MyPropertySource(String name, Object source) {
        super(name, source);
    }

    public MyPropertySource(String name) {
        super(name);
    }

    public MyPropertySource(){
        super("myPropertySource");

    }

    @Override
    public Object getProperty(String name) {
        return "zheshishenme";
    }
}
