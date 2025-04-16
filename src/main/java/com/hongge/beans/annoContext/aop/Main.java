package com.hongge.beans.annoContext.aop;

import com.hongge.AnnoMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = AnnoMain.getContext("com.hongge.beans.annoContext.aop");
//        ExecuteDemo bean = context.getBean(ExecuteDemo.class);
        /**
         * 目标：
         * 1，控制切面的顺序
         * 2，切面指定参数类型
         * 3，@DeclareParents是干啥的
         */
//        bean.execute();

//        BeanDemo bean1 = context.getBean(BeanDemo.class);
//        bean1.execute();

//        AnotherDemo bean = context.getBean(AnotherDemo.class);
//        bean.execute();

//        AroundDemo bean = context.getBean(AroundDemo.class);
//        bean.execute("hxh","19");

        ExecuteDemo bean = context.getBean(ExecuteDemo.class);
//        bean.executeWithArg(new Object());
        bean.executeWithArg(new Account());

    }



}
