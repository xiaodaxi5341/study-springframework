package com.hongge.beans.annoContext.spel.evaluation.parserConfiguration;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 参数1：自动空引用初始化
        // 参数2：自动扩充Collection
        SpelParserConfiguration configuration = new SpelParserConfiguration(true, true);
        SpelExpressionParser parser = new SpelExpressionParser(configuration);
        Expression expression = parser.parseExpression("list[3]");
        Demo demo = new Demo();
        Object value = expression.getValue(demo);
        System.out.println(value);

    }


    static class Demo{
        public List<String> list;
    }

}
