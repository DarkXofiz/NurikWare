package NurikWare;

import minecraft.class06889;

public class class11481 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public boolean L_init;

   private void L() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_3 = 0;
         this.L_4 = false;
         this.L_5 = false;
      }
   }

   public void P() {
      this.L_5 = true;
   }

   public boolean T() {
      return (Boolean)this.L_5;
   }

   public class11481(String var1, class06889 var2, String var3) {
      super();
      this.L();
      this.L_0 = var1;
      this.L_2 = var2;
      this.L_1 = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof class11481 class11481)) {
         return false;
      } else if (!class11481.N(this)) {
         return false;
      } else {
         String s = this.m();
         String s1 = class11481.m();
         return s == null ? s1 == null : s.equals(s1);
      }
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      byte b1 = 1;
      String s = this.m();
      return b1 * 59 + (s == null ? 43 : s.hashCode());
   }

   public boolean b() {
      return (Boolean)this.L_4;
   }

   public String s() {
      return (String)this.L_1;
   }

   public String m() {
      return (String)this.L_0;
   }

   public boolean U() {
      return true;
   }

   public boolean z() {
      return (Boolean)this.L_5;
   }

   public class11481 y(boolean var1) {
      this.L_4 = var1;
      return this;
   }

   public int E() {
      return (Integer)this.L_3;
   }

   public class11481 N(int var1) {
      this.L_3 = var1;
      return this;
   }

   public class11481 N(boolean var1) {
      this.L_5 = var1;
      return this;
   }

   public boolean N(Object var1) {
      return var1 instanceof class11481;
   }

   public class11481 N(class06889 var1) {
      this.L_2 = var1;
      return this;
   }

   public Class<? extends class11473<?>> N() {
      return class11484.class;
   }

   public class06889 W() {
      return (class06889)this.L_2;
   }
}
