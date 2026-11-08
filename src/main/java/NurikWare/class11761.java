package NurikWare;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface class11761 {
   boolean L() default false;

   float i();

   String u();

   class11616 y() default class11616.FULL;

   float N();
}
