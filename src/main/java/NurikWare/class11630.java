package NurikWare;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00405;
import minecraft.class05194;

public class class11630 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;

   private class09991 L() {
      class09079 class09079 = (Boolean)this.N_6 && ((class09079)this.N_3).N() < class09079.BOLD.N() ? class09079.BOLD : (class09079)this.N_3;
      class09870 class09870 = (Boolean)this.N_7 ? class09870.ITALIC : class09870.NORMAL;
      return class09221.N((Integer)this.N_2, class09079, class09870).i((Integer)this.N_5);
   }

   private void M() {
      if (((StringBuilder)this.N_1).length() != 0) {
         ((List)this.N_0).add(class09778.N(((StringBuilder)this.N_1).toString(), this.L()));
         ((StringBuilder)this.N_1).setLength(0);
      }
   }

   public class11630(int var1, class09079 var2, int var3) {
      super();
      this.i();
      this.N_0 = new ArrayList();
      this.N_1 = new StringBuilder();
      this.N_2 = var1;
      this.N_3 = var2;
      this.N_4 = var3;
      this.N_5 = var3;
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0;
         this.N_4 = 0;
         this.N_5 = 0;
         this.N_6 = false;
         this.N_7 = false;
      }
   }

   private void y(class00405 var1) {
      int i = this.N(var1);
      boolean flag = var1 != null && var1.L();
      boolean flag1 = var1 != null && var1.u();
      if (((StringBuilder)this.N_1).length() > 0 && (i != (Integer)this.N_5 || flag != (Boolean)this.N_6 || flag1 != (Boolean)this.N_7)) {
         this.M();
      }

      this.N_5 = i;
      this.N_6 = flag;
      this.N_7 = flag1;
   }

   public void N(class00405 var1, int var2) {
      this.y(var1);
      ((StringBuilder)this.N_1).appendCodePoint(var2);
   }

   public List<class09798> N() {
      this.M();
      return (List<class09798>)this.N_0;
   }

   private int N(class00405 var1) {
      class05194 class05194 = var1 == null ? null : var1.N();
      return class05194 == null ? (Integer)this.N_4 : (Integer)this.N_4 & 0xFF000000 | class05194.N() & 16777215;
   }

   public void N(class00405 var1, String var2) {
      if (!var2.isEmpty()) {
         this.y(var1);
         ((StringBuilder)this.N_1).append(var2);
      }
   }
}
