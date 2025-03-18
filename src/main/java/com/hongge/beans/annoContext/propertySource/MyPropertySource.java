package com.hongge.beans.annoContext.propertySource;

import org.springframework.core.env.PropertySource;

import java.util.Map;

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
    public Object getProperty(String key) {
        Map params = (Map) this.source;
        return params.get(key);
    }
}
