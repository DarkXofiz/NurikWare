package NurikWare;

import java.util.ArrayList;
import java.util.List;

public abstract class class11473<T extends class11481> {
   public Object N_0;

   public class11473() {
      super();
      this.u();
      this.N_0 = new ArrayList();
      class11938.L().y(this);
      class11938.L().N(class10996.class, var1 -> ((List)this.N_0).removeIf(class11481::z));
   }

   static {
      y();
   }

   private void u() {
   }

   public void y(T var1) {
      ((List)this.N_0).remove(var1);
   }

   private static void y() {
   }

   @class11782(
      y = class11777.AFTER
   )
   public abstract void N(class10967 var1);

   public void N(T var1) {
      ((List)this.N_0).add(var1);
   }

   public List<T> N() {
      return (List<T>)this.N_0;
   }

   @class11782
   public abstract void N(class10996 var1);

   @class11782(
      y = class11777.AFTER
   )
   public abstract void N(class09321 var1);
}
