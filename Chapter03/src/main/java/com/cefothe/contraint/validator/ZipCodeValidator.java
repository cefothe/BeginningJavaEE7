package com.cefothe.contraint.validator;

import com.cefothe.contraint.annotation.ZipCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by cefothe on 07.09.16.
 */
public class ZipCodeValidator implements ConstraintValidator<ZipCode, String> {

    public void initialize(ZipCode zipCode) {

    }

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
