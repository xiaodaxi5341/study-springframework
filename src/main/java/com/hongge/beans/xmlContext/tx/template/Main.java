package com.hongge.beans.xmlContext.tx.template;

import com.hongge.beans.annoContext.validator.Person;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
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

//        List<Person> personList = jdbcTemplate.query("select name,age from people", (rs, rowNum) -> new Person(rs.getString("name"), rs.getInt("age"), null, null, null));
//        personList.forEach(System.out::println);

        /**
         * 批量操作
         */

        List<Person> personList = Arrays.asList(
                new Person(3, "韩晓宏", 13, null, null, null),
                new Person(10, "霜燕", 10, null, null, null)
        );

        jdbcTemplate.batchUpdate(
                "update people set name = ? , age = ? where card_id = ?",
                new BatchPreparedStatementSetter() {

                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        Person person = personList.get(i);
                        ps.setString(1, person.getName());
                        ps.setInt(2, person.getAge());
                        ps.setInt(3, person.getCardId());
                    }

                    @Override
                    public int getBatchSize() {
                        return personList.size();
                    }
                }
        );

    }


}
