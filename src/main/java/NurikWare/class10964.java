package NurikWare;

import minecraft.class01054;
import minecraft.class06584;

public class class10964 extends class11784 {
   public static Object y_0 = new class10964();
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public boolean L_init;

   public class06584 L() {
      this.Z();
      return (class06584)this.L_1;
   }

   public class10964() {
      super();
      this.Z();
   }

   static {
      U();
   }

   private void Z() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_2 = 0;
         this.L_3 = 0;
      }
   }

   public int i() {
      this.Z();
      return (Integer)this.L_2;
   }

   private static void U() {
   }

   public class01054 u() {
      this.Z();
      return (class01054)this.L_0;
   }

   public class10964 y(int var1) {
      this.Z();
      this.L_3 = var1;
      return this;
   }

   public class10964 N(class06584 var1) {
      this.Z();
      this.L_1 = var1;
      return this;
   }

   public class10964 N(int var1) {
      this.Z();
      this.L_2 = var1;
      return this;
   }

   public static class10964 N(class01054 var0, class06584 var1, int var2, int var3) {
      ((class10964)y_0).L_0 = var0;
      ((class10964)y_0).L_1 = var1;
      ((class10964)y_0).L_2 = var2;
      ((class10964)y_0).L_3 = var3;
      return (class10964)y_0;
   }

   public class10964 N(class01054 var1) {
      this.Z();
      this.L_0 = var1;
      return this;
   }

   public int R() {
      this.Z();
      return (Integer)this.L_3;
   }
}
