package NurikWare;

import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07510;

public class class11048 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public boolean N_init;

   public void L() {
      this.N_6 = (Integer)this.N_6 - 1;
      if ((Integer)this.N_6 == 0) {
         this.N();
      }
   }

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_4 = 0;
         this.N_5 = 0;
         this.N_6 = 0;
      }
   }

   public class11048(class11328 var1, String var2, QuickUse var3) {
      super();
      this.M();
      this.N_4 = -1;
      this.N_5 = -1;
      this.N_6 = -1;
      this.N_1 = var1;
      this.N_3 = var3.W();
      this.N_0 = var3;
      this.N_2 = class11524.N(var3, var2, class12002.UNKNOWN);
   }

   public void u() {
      class11297 class11297 = class11281.N((class11328)this.N_1);
      if (class11297 != null) {
         int i = class11297.y();
         class06584 class06584 = ((class04453)((class06202)this.N_3).T_4).method_31548().method_5438(i);
         if (!((class04453)((class06202)this.N_3).T_4).method_7357().N(class06584)) {
            int j = class11297.y();
            if (!class11281.u(i)) {
               j = ((class04453)((class06202)this.N_3).T_4).method_31548().M();
               this.N_5 = j;
               class11938.m().N(0, i, j, class07510.field_7791).y((class12040)(var1x -> this.N((Integer)this.N_5))).y();
               this.N_4 = i;
            } else {
               this.N(j);
            }
         }
      }
   }

   public void y() {
      this.N_6 = 4;
      ((QuickUse)this.N_0).L_1 = false;
   }

   public void N(class11389 var1) {
      if ((class04453)((class06202)this.N_3).T_4 != null && (class03448)((class06202)this.N_3).T_3 != null) {
         if (var1.y(((class11527)this.N_2).i(), ((class11527)this.N_2).L())) {
            class11938.Z().N(this::u);
         } else if (var1.N(((class11527)this.N_2).i())) {
            class11938.Z().N(this::y);
         }
      }
   }

   public void N() {
      class11322.L();
      if ((Integer)this.N_4 != -1 && (Integer)this.N_5 != -1) {
         class11938.m().N(0, (Integer)this.N_4, (Integer)this.N_5, class07510.field_7791).y();
         this.N_5 = -1;
         this.N_4 = -1;
      }
   }

   public void N(int var1) {
      class11322.N(var1);
      this.N_6 = -1;
      ((QuickUse)this.N_0).L_1 = true;
   }
}
