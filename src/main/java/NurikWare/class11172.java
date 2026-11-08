package NurikWare;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class class11172 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;

   public class11172 L() {
      ((List)this.N_1).add(class11208.N(null));
      return this;
   }

   public class11172 L(String var1) {
      ((List)this.N_1).add(class11208.N(var1, null));
      return this;
   }

   private void M() {
   }

   class11172(String var1) {
      super();
      this.M();
      this.N_1 = new ArrayList();
      this.N_2 = "default.vert";
      this.N_0 = var1;
   }

   private String B(String var1) {
      String s = var1.replace('\\', '/');
      return s.startsWith((String)this.N_0) ? s : (String)this.N_0 + s;
   }

   public class11172 y(String var1) {
      this.N_2 = Objects.requireNonNull(var1, "file");
      return this;
   }

   public class09322 y() {
      return this.N().N().N((List<class11208>)this.N_1).y();
   }

   public class11172 N(String var1, String var2) {
      return this.y(var1).N(var2);
   }

   public class11172 N(Object var1) {
      ((List)this.N_1).add(class11208.N(var1));
      return this;
   }

   public class11172 N(class11169 var1) {
      ((List)this.N_1).add(class11208.N(var1));
      return this;
   }

   public class11193 N() {
      if ((String)this.N_3 != null && !((String)this.N_3).isBlank()) {
         return new class11193(this.B((String)this.N_2), this.B((String)this.N_3));
      } else {
         throw new IllegalStateException("Fragment shader file was not set");
      }
   }

   public class11172 N(String var1, Object var2) {
      ((List)this.N_1).add(class11208.N(var1, var2));
      return this;
   }

   public class11172 N(String var1, class11169 var2) {
      ((List)this.N_1).add(class11208.N(var1, var2));
      return this;
   }

   public class11172 N(String var1) {
      this.N_3 = Objects.requireNonNull(var1, "file");
      return this;
   }
}
