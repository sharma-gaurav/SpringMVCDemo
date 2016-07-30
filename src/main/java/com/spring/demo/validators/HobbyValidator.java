package com.spring.demo.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class HobbyValidator implements ConstraintValidator<IsHobbyValid, String> {

    @Override
    public void initialize(IsHobbyValid constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return Arrays.asList("cricket", "football", "reading").contains(value.toLowerCase());
    }
}
