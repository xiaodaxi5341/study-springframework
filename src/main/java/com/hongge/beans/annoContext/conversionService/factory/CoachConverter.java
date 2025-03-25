package com.hongge.beans.annoContext.conversionService.factory;

import com.hongge.beans.common.Coach;
import org.springframework.core.convert.converter.Converter;

public class CoachConverter<T extends Coach> implements Converter<String, Coach> {
    @Override
    public Coach convert(String source) {
        String[] split = source.split(",");
        Coach coach = new Coach();
        coach.setName(split[0]);
        coach.setWorkTime(split[1]);
        return coach;
    }
}
