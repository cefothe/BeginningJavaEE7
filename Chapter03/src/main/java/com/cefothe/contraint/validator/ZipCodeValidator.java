package com.cefothe.contraint.validator;

import com.cefothe.contraint.annotation.ZipCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by cefothe on 07.09.16.
 */
public class ZipCodeValidator implements ConstraintValidator<ZipCode, String> {

    private Pattern zipPattern = Pattern.compile("\\d{5}(-\\d{5})?");

    public void initialize(ZipCode zipCode) {

    }

    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(value == null){
            return true;
        }
        Matcher m = zipPattern.matcher(value);
        if (!m.matches())
            return false;

        return true;
    }
}
