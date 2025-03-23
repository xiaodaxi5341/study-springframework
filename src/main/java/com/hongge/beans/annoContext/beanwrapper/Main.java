package com.hongge.beans.annoContext.beanwrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class Main {

    public static void main(String[] args) {
        Company originCompany = new Company();
        BeanWrapper company = new BeanWrapperImpl(originCompany);
// setting the company name..
        company.setPropertyValue("name", "Some Company Inc.");
// ... can also be done like this:
//        PropertyValue value = new PropertyValue("name", "Some Company Inc.");
//        company.setPropertyValue(value);

// ok, let's create the director and tie it to the company:
        Employee originEmployee = new Employee();
        BeanWrapper jim = new BeanWrapperImpl(originEmployee);
        jim.setPropertyValue("name", "Jim Stravinsky");
        company.setPropertyValue("managingDirector", jim.getWrappedInstance());

// retrieving the salary of the managingDirector through the company
        Float salary = (Float) company.getPropertyValue("managingDirector.salary");
        System.out.println(originCompany);
        System.out.println(originEmployee);
    }

}
