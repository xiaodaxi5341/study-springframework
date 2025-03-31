package com.hongge.beans.annoContext.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class CustomerValidator implements Validator {
    private final Validator addressValidator;

    public CustomerValidator(Validator addressValidator) {
        if (addressValidator == null) {
            throw new IllegalArgumentException("The supplied [Validator] is " +
                    "required and must not be null.");
        }
        if (!addressValidator.supports(Address.class)) {
            throw new IllegalArgumentException("The supplied [Validator] must " +
                    "support the validation of [Address] instances.");
        }
        this.addressValidator = addressValidator;
    }

    /**
     * This Validator validates Customer instances, and any subclasses of Customer too
     */
    public boolean supports(Class clazz) {
        return Person.class.isAssignableFrom(clazz);
    }

    public void validate(Object target, Errors errors) {
        // ValidationUtils校验的是errors里传入的对象
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "必须要fn");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "surname", "必须有姓氏");
        Person customer = (Person) target;
        try {
            errors.pushNestedPath("address");
            ValidationUtils.invokeValidator(this.addressValidator, customer.getAddress(), errors);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            errors.popNestedPath();
        }
    }
}
