package NurikWare;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Collection;

public class class11321<T> extends ObjectArraySet<T> {
   public class11321() {
      super();
   }

   public boolean add(T var1) {
      boolean flag = super.add(var1);
      if (!flag) {
         this.N((T)var1);
         flag = super.add(var1);
      }

      return flag;
   }

   public boolean addAll(Collection<? extends T> var1) {
      boolean flag = false;

      for (Object object : var1) {
         boolean flag1 = super.add(object);
         if (!flag1) {
            this.N((T)object);
            flag1 = super.add(object);
         }

         if (flag1) {
            flag = true;
         }
      }

      return flag;
   }

   public void N(T var1) {
      this.remove(var1);
   }
}
