package me.thijmenl98.validation.StartsWith;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: StartsWith</h5>
 * <h5>Package: me.thijmenl98.validation</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-09-03
 **/
@Constraint(validatedBy = StartsWithConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StartsWith {

    String value() default "CSE";

    String message() default ("Must start with CSE");

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
