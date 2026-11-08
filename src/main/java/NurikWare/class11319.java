package NurikWare;

import java.util.Collection;
import java.util.LinkedList;

public class class11319<E> extends LinkedList<E> {
   public Object N_0;

   public class11319(int var1) {
      super();
      this.u();
      if (var1 <= 0) {
         throw new IllegalArgumentException("maxSize должен быть больше 0");
      } else {
         this.N_0 = var1;
      }
   }

   @Override
   public boolean add(E var1) {
      super.add((E)var1);
      this.i();
      return true;
   }

   @Override
   public void add(int var1, E var2) {
      super.add(var1, (E)var2);
      this.i();
   }

   private void i() {
      while (this.N(this.size())) {
         this.removeFirst();
      }
   }

   @Override
   public boolean addAll(int var1, Collection<? extends E> var2) {
      boolean flag = super.addAll(var1, var2);
      if (flag) {
         this.i();
      }

      return flag;
   }

   @Override
   public boolean addAll(Collection<? extends E> var1) {
      boolean flag = super.addAll(var1);
      if (flag) {
         this.i();
      }

      return flag;
   }

   private void u() {
      this.N_0 = 0;
   }

   public boolean N(int var1) {
      return var1 > (Integer)this.N_0;
   }
}
