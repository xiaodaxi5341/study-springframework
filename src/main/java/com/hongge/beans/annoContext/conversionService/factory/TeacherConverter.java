package com.hongge.beans.annoContext.conversionService.factory;

import com.hongge.beans.common.Teacher;
import org.springframework.core.convert.converter.Converter;

public class TeacherConverter<T extends Teacher> implements Converter<String, Teacher> {
    @Override
    public Teacher convert(String source) {
        Teacher teacher = new Teacher();
        String[] split = source.split("\\|");
        teacher.setName(split[0]);
        teacher.setGrade(split[1]);
        return teacher;
    }
}
