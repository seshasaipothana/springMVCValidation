package com.springDemo.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = IFSCCodeConstraintValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IFSCCode{

    //define default IFSC code
    public String value() default "SBIN";
    //define error message
    public String message() default "Must start with SBIN";
    //define default group
    public Class<?>[] groups() default {};
    //define default payloads
    public Class<? extends Payload>[] payload() default {};


}
