package com.hongge.beans.annoContext.conversionService;

import com.hongge.beans.Face;
import org.springframework.core.convert.converter.Converter;

public class MyCustomConverter implements Converter<String, Face> {


    @Override
    public Face convert(String source) {
        String[] split = source.split(",");
        return new Face(split[0], split[1]);
    }
}
