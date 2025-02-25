package com.hongge.beans.annoContext.conversionService;

import com.hongge.beans.Face;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ConversionFace {

    @Value("converse1,飞扬跋扈")
    private Face face;

}
