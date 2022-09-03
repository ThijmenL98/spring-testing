package me.thijmenl98.validation.StartsWith;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: StartsWithConstraintValidator</h5>
 * <h5>Package: me.thijmenl98.validation</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-09-03
 **/
public class StartsWithConstraintValidator implements ConstraintValidator<StartsWith, String> {

    private String prefix;

    @Override
    public void initialize(StartsWith constraintAnnotation) {
        prefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext validatorContext) {
        return value != null && value.startsWith(prefix);
    }
}
