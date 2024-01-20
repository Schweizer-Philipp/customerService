package customer_service.constraint;

import customer_service.validator.TaxIdValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = TaxIdValidator.class)
@Target({FIELD})
@Retention(RUNTIME)
@Documented
public @interface TaxIdConstraint {


    String message() default "Die angegeben Umsatzsteuer-ID wird nicht unterstützt.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}