package vlad.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomEmailValidator implements ConstraintValidator<CustomEmail, String> {
    CustomEmail customEmail;
    @Override
    public void initialize(CustomEmail constraintAnnotation) {
        customEmail = constraintAnnotation;
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return email.endsWith(customEmail.value());
    }
}
