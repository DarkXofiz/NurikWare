package NurikWare;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

public class class11845 {
   public static Object N_0;
   public static Object N_1;
   public Object y_0;
   public Object y_1;
   public Object y_2;

   public void L() {
      ((AtomicLong)this.y_2).incrementAndGet();
   }

   private static void M() {
      N_0 = 5;
      N_1 = 250L;
   }

   public class11845() {
      super();
      this.z();
      this.y_0 = new CopyOnWriteArrayList();
      this.y_1 = new AtomicInteger();
      this.y_2 = new AtomicLong();
   }

   static {
      M();
   }

   public class11852 i() {
      return new class11852(this);
   }

   private void U() {
      List list = ((List)this.y_0).stream().filter(class11834::E).toList();
      int i = list.size() - 5;

      for (class11834 class11834 : list) {
         if (i <= 0) {
            return;
         }

         if (!class11834.W()) {
            class11834.R();
            i--;
         }
      }
   }

   private void z() {
   }

   public List<class11834> u() {
      this.R();
      return ((List)this.y_0).stream().filter(class11834::E).toList();
   }

   private class11834 u(int var1) {
      if (var1 <= 0) {
         return null;
      } else {
         for (class11834 class11834 : (List)this.y_0) {
            if (class11834.N() == var1) {
               return class11834.E() ? class11834 : null;
            }
         }

         return null;
      }
   }

   public long y() {
      return ((AtomicLong)this.y_2).get();
   }

   public boolean y(int var1) {
      return this.u(var1) != null;
   }

   public int N(class11852 var1) {
      class11834 class11834 = var1.N(((AtomicInteger)this.y_1).incrementAndGet());
      this.R();
      ((List)this.y_0).add(class11834);
      this.U();
      this.L();
      return class11834.N();
   }

   public boolean N(int var1) {
      class11834 class11834 = this.u(var1);
      if (class11834 == null) {
         return false;
      } else {
         class11834.R();
         return true;
      }
   }

   public int N(int var1, Consumer<class11834> var2, Consumer<class11852> var3) {
      if (this.N(var1, var2)) {
         return var1;
      } else {
         class11852 class11852 = this.i();
         var3.accept(class11852);
         return class11852.N();
      }
   }

   public boolean N(int var1, Consumer<class11834> var2) {
      class11834 class11834 = this.u(var1);
      if (class11834 == null) {
         return false;
      } else {
         var2.accept(class11834);
         this.L();
         return true;
      }
   }

   public List<class11834> N() {
      this.R();
      return List.copyOf((List)this.y_0);
   }

   private void R() {
      long i = System.currentTimeMillis();
      ((List)this.y_0).removeIf(var2 -> !var2.E() && i - var2.z() >= 250L);
   }
}
