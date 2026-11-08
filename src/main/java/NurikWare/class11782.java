package NurikWare;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface class11782 {
   Class<?>[] L() default {};

   boolean u() default false;

   class11777 y() default class11777.NOW;

   Class<?>[] N() default {};
}
