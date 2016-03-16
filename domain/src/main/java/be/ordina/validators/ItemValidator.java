package be.ordina.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Created by MaBa on 16/03/16.
 */
@Documented
@Constraint(validatedBy = ItemValidatorImpl.class)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ItemValidator {

    String message() default "{Version}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
