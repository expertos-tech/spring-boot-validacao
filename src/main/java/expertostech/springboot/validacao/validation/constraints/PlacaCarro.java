package expertostech.springboot.validacao.validation.constraints;

import expertostech.springboot.validacao.validation.PlacaCarroValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PlacaCarroValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PlacaCarro {

    String message() default "Placa de carro inválida";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
