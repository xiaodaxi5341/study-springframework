package com.hongge.beans.annoContext.conversionService.factory;

import com.hongge.beans.common.Person;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class MyCustomConverterFactory implements ConverterFactory<String, Person> {

    @Override
    public <T extends Person> Converter<String, T> getConverter(Class<T> targetType) {
        System.out.println("targetType:" + targetType.getSimpleName());
        if (targetType.getSimpleName().equals("Teacher"))
            return new TeacherConverter();
        else
            return new CoachConverter();
    }
}
