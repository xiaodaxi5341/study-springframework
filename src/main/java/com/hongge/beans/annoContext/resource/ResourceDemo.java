package com.hongge.beans.annoContext.resource;

import com.hongge.beans.Face;
import jakarta.annotation.Resource;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ResourceDemo {

    @Resource
    private Face resourceFace1;

}
