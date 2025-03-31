package com.hongge.beans.annoContext.spel.evaluation;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        /**
         * 基本使用
         */
        // 注意这里还有个单引号，原因暂不清楚
//        Expression exp = parser.parseExpression("'hello world'");
//        System.out.println(exp.getValue());

        /**
         * 可以调用字符串的方法
         */
//        Expression exp = parser.parseExpression("'hello world'.concat('!')");
//        Expression exp2 = parser.parseExpression("'hello world'.split(' ')");
//        System.out.println(((String[])exp2.getValue())[0]);

        // 这里是执行getBytes()，为什么可以不用getBytes()呢？莫非是默认的get？
//        Expression exp = parser.parseExpression("'hello world'.bytes");
//        byte[] bytes = (byte[]) exp.getValue();
//        System.out.println(bytes);

        /**
         * 自建对象
         */
        // Create and set a calendar
//        GregorianCalendar c = new GregorianCalendar();
//        c.set(1856, 7, 9);
//
//// The constructor arguments are name, birthday, and nationality.
//        Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");
//
//        Expression exp = parser.parseExpression("name"); // Parse name as an expression
//        String name = (String) exp.getValue(tesla);
//        System.out.println(name);
//
//// name == "Nikola Tesla"
//        exp = parser.parseExpression("name == 'Nikola Tesla'");
//        boolean result = exp.getValue(tesla, Boolean.class);
//        System.out.println(result);

    }

}
