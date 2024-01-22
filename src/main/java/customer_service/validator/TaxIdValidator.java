package customer_service.validator;


import customer_service.constraint.TaxIdConstraint;
import customer_service.constraint.TaxIdConstraints;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaxIdValidator implements ConstraintValidator<TaxIdConstraint, String> {

    @Override

    public boolean isValid(String taxId, ConstraintValidatorContext constraintValidatorContext) {
        constraintValidatorContext.disableDefaultConstraintViolation();
        constraintValidatorContext.buildConstraintViolationWithTemplate(generateErrorMessage()).addConstraintViolation();

        if (Objects.isNull(taxId)) return false;

        return Stream.of(TaxIdConstraints.values()).anyMatch(c -> taxId.matches(c.getRegex()));
    }

    private String generateErrorMessage() {
        return "Die angegeben Umsatzsteuer-ID muss in einem der folgenden Ländern gültig sein: " + Arrays.stream(TaxIdConstraints.values())
                .map(Enum::name)
                .collect(Collectors.joining(", ")) + ".";
    }
}
