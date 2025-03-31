package com.hongge.beans.annoContext.spel.evaluation.context;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Simple simple = new Simple();
        simple.booleanList.add(true);

        ExpressionParser parser = new SpelExpressionParser();

        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        parser.parseExpression("booleanList[0]").setValue(context, simple, "false");

        System.out.println(simple.booleanList.get(0));

    }

    static class Simple {
        public List<Boolean> booleanList = new ArrayList<>();
    }

}
