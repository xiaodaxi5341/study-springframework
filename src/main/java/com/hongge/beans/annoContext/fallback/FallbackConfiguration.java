package com.hongge.beans.annoContext.fallback;

import com.hongge.beans.Face;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Fallback;

@Configuration
public class FallbackConfiguration {

    @Bean
    @Fallback
    public Face face1() {
        return new Face("超人", "黑色");
    }

    @Bean
    @Fallback
    public Face face2() {
        return new Face("蜘蛛侠", "白色");
    }

    @Bean
    public Face face3() {
        return new Face("闪电侠", "紫色");
    }

}
