package com.hongge.beans.xmlContext.tx;

import com.hongge.XmlMain;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SimpleJdbcInsertMain {

    public static void main(String[] args) {
        AbstractApplicationContext context = XmlMain.getAbstractApplicationContext();
        SimpleJdbcInsert jdbcInsert = context.getBean("jdbcInsert", SimpleJdbcInsert.class);
        jdbcInsert.withTableName("actor");
        Map<String, Object> parameters = new HashMap<>(3);
        parameters.put("actor_id", 10086);
        parameters.put("first_name", "HXH");
        parameters.put("last_name", "LDH");
        parameters.put("last_update", new Date());
        jdbcInsert.execute(parameters);

    }

}
