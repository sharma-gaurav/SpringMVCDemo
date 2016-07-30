package com.spring.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsHobbyValid {

    String message() default "Please provide a valid Hobby";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}