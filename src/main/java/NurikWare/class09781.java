package NurikWare;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public final class class09781 {
   private final class09803 N;
   private final class09868 y;
   private final class09667 L;
   private final class09794 u = new class09794();
   private final Map<Class<?>, Object> i = new HashMap<>();
   private final class09869 R;

   public class09667 L() {
      return this.L;
   }

   public class09781(class09803 var1, class09868 var2, class09667 var3) {
      super();
      this.N = Objects.requireNonNull(var1, "clipboard");
      this.y = Objects.requireNonNull(var2, "fontMetrics");
      this.L = Objects.requireNonNull(var3, "textMeasurer");
      this.R = new class09786(this);
   }

   public class09869 i() {
      return this.R;
   }

   public class09794 u() {
      return this.u;
   }

   public class09868 y() {
      return this.y;
   }

   public <T> Optional<T> N(Class<T> var1) {
      Object object = this.i.get(Objects.requireNonNull(var1, "type"));
      return object == null ? Optional.empty() : Optional.of((T)var1.cast(object));
   }

   public <T> void N(Class<T> var1, T var2) {
      this.i.put(Objects.requireNonNull(var1, "type"), Objects.requireNonNull(var2, "service"));
   }

   public class09803 N() {
      return this.N;
   }
}
