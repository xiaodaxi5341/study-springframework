package com.hongge.beans.annoContext.conversionService;

import com.hongge.AnnoMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 将string类型自动转换成自定义的类型，进行注入
 */
public class Main extends AnnoMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = getContext();

        ConversionFace bean = context.getBean(ConversionFace.class);
        System.out.println(bean.getFace());
    }

}
