package com.hongge;

import com.hongge.beans.annoContext.CustomComponentDemo;
import com.hongge.beans.annoContext.propertySource.MyPropertySource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

public class AnnoMain {

    protected static AnnotationConfigApplicationContext getContext(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.scan("com.hongge.beans.annoContext");

        annotationConfigApplicationContext.refresh();
        return annotationConfigApplicationContext;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = annotationConfigApplicationContext.getEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();
        propertySources.addFirst(new MyPropertySource());
        /**
         * bean post processor 执行顺序
         *
         */
//        annotationConfigApplicationContext.getBeanFactory().addBeanPostProcessor(new CodeBeanPostProcessor());

        annotationConfigApplicationContext.scan("com.hongge.beans.annoContext");

        annotationConfigApplicationContext.refresh();

        /**
         * 自定义注解
         */
//        CustomComponentDemo bean = annotationConfigApplicationContext.getBean(CustomComponentDemo.class);
//        bean.print();

        /**
         * lookup案例
         */
//        CommandManager commandExecutor = annotationConfigApplicationContext.getBean("commandManager", CommandManager.class);
//        commandExecutor.process(111);
//        CommandManager commandExecutor1 = annotationConfigApplicationContext.getBean("commandManager", CommandManager.class);
//        commandExecutor1.process(222);
//        CommandManager commandExecutor2 = annotationConfigApplicationContext.getBean("commandManager", CommandManager.class);
//        commandExecutor2.process(333);

        /**
         * lifecycle案例
         */
//        LifeDemo bean = annotationConfigApplicationContext.getBean(LifeDemo.class);
//        System.out.println(bean);
//        annotationConfigApplicationContext.registerShutdownHook();


        /**
         * @Fallback和@Primary测试
         */
//        Face face = annotationConfigApplicationContext.getBean(Face.class);
//        System.out.println(face);

        /**
         * 当Resource的默认名称不是@Primary标注的bean时
         * 1, 当被注解的字段名存在时，优先注入，即使同类的其他bean被@Primary标注
         * 2，名字匹配不到时，优先匹配@Primary
         */
//        ResourceDemo resourceDemo = annotationConfigApplicationContext.getBean("resourceDemo", ResourceDemo.class);
//        System.out.println(resourceDemo.getResourceFace1());

        /**
         * 自定义propertySource
         */
        String zheshishenme = environment.getProperty("zheshishenme");
        System.out.println(zheshishenme);

    }

}
