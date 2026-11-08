package NurikWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public abstract class class09807<T extends class09807<T>> implements class09806 {
   private String N;
   private String y;
   private class09991 L = class09991.N;
   private final List<class09816> u = new ArrayList<>();
   private final List<class09992> i = new ArrayList<>();
   private class09793<class09904> R;

   protected final List<class09992> L() {
      return List.copyOf(this.i);
   }

   class09807() {
      super();
      this.N = null;
      this.y = null;
   }

   @Override
   public abstract class09798 i();

   protected final class09991 u() {
      return this.L;
   }

   protected final List<class09816> y() {
      return List.copyOf(this.u);
   }

   T y(String var1) {
      this.y = var1;
      return this.R();
   }

   public T N_1(class09836 var1) {
      return this.N(class09867.CLICK, var1);
   }

   protected final String N() {
      return this.N;
   }

   public T N(class09867 var1, class09836 var2, class09876 var3) {
      if (var1 != null && var2 != null) {
         this.u.add(new class09816(var1, var2, var3));
         return this.R();
      } else {
         return this.R();
      }
   }

   protected final class09798 N(class10049 var1, List<class09798> var2, String var3, String var4, String var5, class09938 var6) {
      return new class09798(this.N, this.y, var1, var2, this.y(), this.L(), this.L, var3, var4, var5, var6, this.R);
   }

   private static boolean N(List<class09992> var0, class09992 var1) {
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         if ((class09992)iterator.next() == var1) {
            return true;
         }
      }

      return false;
   }

   public T N(class09991 var1, class09991... var2) {
      if (var2 != null && var2.length != 0) {
         class09991[] aclass09991 = new class09991[var2.length + 1];
         aclass09991[0] = var1;
         System.arraycopy(var2, 0, aclass09991, 1, var2.length);
         return this.N(class09991.N(aclass09991));
      } else {
         return this.N(var1);
      }
   }

   public T N(class09991 var1) {
      this.L = var1 == null ? class09991.N : var1;
      return this.R();
   }

   public T N(class09793<class09904> var1) {
      this.R = var1;
      return this.R();
   }

   public T N(String var1) {
      this.N = var1;
      return this.R();
   }

   public T N(class09867 var1, class09836 var2) {
      return this.N(var1, var2, class09876.N);
   }

   public T N(class09992... var1) {
      if (var1 != null && var1.length != 0) {
         for (class09992 class09992 : var1) {
            this.N(class09992);
         }

         return this.R();
      } else {
         return this.R();
      }
   }

   public T N(class09992 var1) {
      if (var1 != null && !N(this.i, var1)) {
         this.i.add(var1);
      }

      return this.R();
   }

   public T N_2(UnaryOperator<class09991> var1) {
      if (var1 != null) {
         class09991 class09991 = var1.apply(this.L);
         this.N(class09991);
      }

      return this.R();
   }

   protected abstract T R();
}
