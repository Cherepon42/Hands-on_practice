package vlad.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CustomEmailValidator.class)
public @interface CustomEmail {
    String message() default "email should ends with: xxx.xx";
    String value() default "xxx.xx";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
