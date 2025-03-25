package com.hongge.beans.annoContext.conversionService.factory;

import com.hongge.beans.common.Coach;
import com.hongge.beans.common.Teacher;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Demo {

    @Value("hxh|五年级")
    private Teacher teacher;
    @Value("lh,工作事件老长了")
    private Coach coach;

}
