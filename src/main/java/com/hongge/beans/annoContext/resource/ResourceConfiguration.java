package com.hongge.beans.annoContext.resource;

import com.hongge.beans.Face;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ResourceConfiguration {

    @Bean
    public Face resourceFace1(){
        return new Face("resource", "五彩斑斓");
    }

    @Bean
    @Primary
    public Face resourceFace2(){
        return new Face("resource2", "黑漆麻乌");
    }

}
