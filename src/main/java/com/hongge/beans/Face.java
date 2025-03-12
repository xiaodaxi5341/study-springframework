package com.hongge.beans;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
public class Face {

    private String type;
    private String color;
    /**
     * @Bean标注的类里进行自动装配会报错
     */
//    @Autowired
//    private MyClass myClass;

//    public Face(String type, String color) {
//        this.type = type;
//        this.color = color;
//    }

    /**
     * 省流：确实会被调用
     */
    @PostConstruct
    public void init() {
        System.out.println("即使是@Bean注释，这个方法也会被调用");
    }

}
