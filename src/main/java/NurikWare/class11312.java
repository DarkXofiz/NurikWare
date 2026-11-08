package NurikWare;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class class11312 {
   public Object N_0;

   public void L() {
      ((List)this.N_0).clear();
   }

   public class11312() {
      super();
      this.u();
      this.N_0 = new ArrayList();
   }

   private void u() {
   }

   public void y(Consumer<class11282> var1) {
      for (int i = ((List)this.N_0).size() - 1; i >= 0; i--) {
         var1.accept((class11282)((List)this.N_0).get(i));
      }

      ((List)this.N_0).clear();
   }

   public boolean y() {
      return ((List)this.N_0).isEmpty();
   }

   public void N(int var1, int var2) {
      ((List)this.N_0).add(new class11282(var1, var2));
   }

   public void N() {
      if (!((List)this.N_0).isEmpty()) {
         ((List)this.N_0).removeLast();
      }
   }

   public void N(Consumer<class11282> var1) {
      for (int i = ((List)this.N_0).size() - 1; i >= 0; i--) {
         var1.accept((class11282)((List)this.N_0).get(i));
      }
   }
}
