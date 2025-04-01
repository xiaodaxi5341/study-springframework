package com.hongge.beans.annoContext.validator;

import jakarta.annotation.Resource;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MyService {

    @Resource
    private Validator validator;

    public void validate(PersonForm personForm){
        Set<ConstraintViolation<PersonForm>> validate = validator.validate(personForm);
        System.out.println(validate);
    }

}
