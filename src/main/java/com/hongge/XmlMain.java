package com.hongge;

import com.hongge.beans.SetterDemo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:my-beans.xml");
        SetterDemo setterDemo = context.getBean("setterDemo", SetterDemo.class);
        System.out.println(setterDemo);
//        MyClass myClass = context.getBean("myClass", MyClass.class);
//        Student student1 = context.getBean("factoryMethodDemo", Student.class);
//        Student student2 = context.getBean("factoryMethodDemo", Student.class);

//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student1 == student2);


//        Face chinaFace = context.getBean("chinaFace", Face.class);
//        System.out.println(chinaFace);


    }

}
