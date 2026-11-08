package NurikWare;

import java.util.ArrayList;
import java.util.List;

public class class11198 {
   public Object N_0;
   public Object N_1;

   private void L() {
   }

   class11198(class11193 var1) {
      super();
      this.L();
      this.N_1 = new ArrayList();
      this.N_0 = var1;
   }

   public class09322 y() {
      class11167 class11167 = new class11167((List<class11208>)this.N_1);
      return new class09322(
         (String)((class11193)this.N_0).y_0,
         (String)((class11193)this.N_0).y_1,
         class11167,
         "template:" + Integer.toHexString(System.identityHashCode(class11167))
      );
   }

   public class11198 N() {
      ((List)this.N_1).add(class11208.N(null));
      return this;
   }

   public class11198 N(Object var1) {
      ((List)this.N_1).add(class11208.N(var1));
      return this;
   }

   public class11198 N(class11169 var1) {
      ((List)this.N_1).add(class11208.N(var1));
      return this;
   }

   class11198 N(List<class11208> var1) {
      ((List)this.N_1).addAll(var1);
      return this;
   }

   public class11198 N(String var1, class11169 var2) {
      ((List)this.N_1).add(class11208.N(var1, var2));
      return this;
   }

   public class11198 N(String var1, Object var2) {
      ((List)this.N_1).add(class11208.N(var1, var2));
      return this;
   }

   public class11198 N(String var1) {
      ((List)this.N_1).add(class11208.N(var1, null));
      return this;
   }
}
