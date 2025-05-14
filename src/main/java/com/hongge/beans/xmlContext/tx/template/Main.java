package com.hongge.beans.xmlContext.tx.template;

import com.hongge.beans.annoContext.validator.Person;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:my-beans.xml");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//        Integer num = jdbcTemplate.queryForObject("select count(*) from people", Integer.class);
//        System.out.println(num);

//        Integer i = jdbcTemplate.queryForObject("select count(*) from people where card_id = ?", Integer.class, 20);
//        System.out.println(i);

//        String name = jdbcTemplate.queryForObject("select name from people where card_id = ?", String.class, 20);
//        System.out.println(name);

//        Person person = jdbcTemplate.queryForObject("select name,age from people where card_id = ?", (rs, rowNum) -> new Person(rs.getString("name"), rs.getInt("age"), null, null, null), 3);
//        System.out.println(person);

        List<Person> personList = jdbcTemplate.query("select name,age from people", (rs, rowNum) -> new Person(rs.getString("name"), rs.getInt("age"), null, null, null));
        personList.forEach(System.out::println);
    }


}
