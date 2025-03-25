package com.hongge.beans.annoContext.conversionService;

import com.hongge.beans.annoContext.conversionService.factory.MyCustomConverterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;

@Configuration
public class ConversionConfiguration {

    @Bean
    public ConversionService conversionService() {
        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
        conversionService.addConverterFactory(new MyCustomConverterFactory());
        conversionService.addConverter(new MyCustomConverter());
        return conversionService;
    }

}
