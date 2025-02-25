package com.hongge.beans.annoContext.lookup;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Scope(value = "prototype")
@Component
public class Command {

    private double num = Math.random();
    private Object state;

    public void execute() {
        System.out.println("command executed ：" + state + ", 地址：" + this + ", 当前num：" + num);
    }

}
