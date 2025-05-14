package com.hongge.beans.xmlContext.tx.jdbcClient;

import com.hongge.XmlMain;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.simple.JdbcClient;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = XmlMain.getAbstractApplicationContext();
        JdbcClient jdbcClient = context.getBean(JdbcClient.class);
//        Integer num = jdbcClient.sql("select count(*) from actor where first_name =  ?")
//                .param("NICK")
//                .query(Integer.class)
//                .single();
//        System.out.println(num);

//        Integer num = jdbcClient.sql("select count(*) from actor where first_name =  :name")
//                .param("name", "NICK")
//                .query(Integer.class)
//                .single();
//        System.out.println(num);

        List<Actor> actors = jdbcClient.sql("select first_name, last_name from actor")
                .query(Actor.class)
                .list();
        actors.forEach(System.out::println);
    }

}
