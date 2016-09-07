package com.cefothe.contraint.annotation;

import com.cefothe.contraint.validator.ZipCodeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by cefothe on 07.09.16.
 */
@Constraint(validatedBy = {ZipCodeValidator.class})
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ZipCode {
    String message() default "Invalid zip code";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
