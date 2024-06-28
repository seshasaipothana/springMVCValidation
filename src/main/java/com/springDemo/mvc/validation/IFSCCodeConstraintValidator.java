package com.springDemo.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IFSCCodeConstraintValidator implements ConstraintValidator<IFSCCode,String> {

    private String IFSCPrefix;
    @Override
    public void initialize(IFSCCode ifscCode) {
        IFSCPrefix = ifscCode.value();

    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;
        if(code != null) {
            result = code.startsWith(IFSCPrefix);
            return result;
        }
        else{
            return true;
        }
    }
}
