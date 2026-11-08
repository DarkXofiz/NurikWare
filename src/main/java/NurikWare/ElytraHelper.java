package NurikWare;

import minecraft.class02484;
import minecraft.class04453;
import minecraft.class04474;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07085;
import minecraft.class07510;

@class11080(
   L = "ElytraHelper",
   y = class11072.MISC,
   N = class11106.HELPER
)
public class ElytraHelper extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public boolean u_init;

   private void P() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_1 = 0;
         this.u_2 = false;
         this.u_3 = false;
         this.u_4 = false;
         this.u_5 = false;
      }
   }

   public ElytraHelper() {
      super();
      this.P();
      this.L_0 = class11524.N(this, "swap-key", class12002.UNKNOWN);
      this.L_1 = class11524.N(this, "firework-key", class12002.UNKNOWN);
      this.L_2 = new class11535("disabled", true);
      this.L_3 = new class11535("only-space", false);
      this.L_4 = new class11535("always", false);
      this.u_0 = class11524.N(this, "auto-launch", (class11535)this.L_2, (class11535)this.L_3, (class11535)this.L_4);
   }

   public boolean m() {
      this.P();
      return class11938.j().y() < (Integer)this.u_1;
   }

   private void v() {
      class06584 class06584 = ((class04453)((class06202)super.y_0).T_4).method_6118(class07085.field_6174);
      boolean flag = class06584.B() == class06570.sT;
      boolean flag1 = !class06584.R();
      if (flag) {
         class11896.N(class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_2).ifPresent(var1x -> this.y(var1x.y()));
      } else if (flag1) {
         class11896.N(class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_0).ifPresent(var1x -> this.y(var1x.y()));
      } else {
         class11896.N(class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_2)
            .ifPresentOrElse(
               var1x -> this.y(var1x.y()),
               () -> class11896.N(class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_0).ifPresent(var1x -> this.y(var1x.y()))
            );
      }
   }

   private void y(int var1, int var2) {
      class11938.Z().y(4, () -> class11938.m().N(0, var1, var2, class07510.field_7791).y());
   }

   @Override
   public void y() {
      this.P();
      this.u_5 = false;
      this.u_3 = false;
      this.u_2 = false;
      super.y();
   }

   private void y(int var1) {
      if (class11281.u(var1)) {
         class11322.N(var1);
         class11907.N(class07050.field_5808);
         class11322.i();
      } else {
         int i = class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_2.N();
         int j = class11281.L(var1);
         class11938.m().N(0, j, 0, class07510.field_7791).N(0, i, 0, class07510.field_7791).N(0, j, 0, class07510.field_7791).y();
      }
   }

   @class11782
   public void N(class11385 var1) {
      this.P();
      class11535 class11535 = (class11535)((class11517)this.u_0).i();
      if (class11535 != (class11535)this.L_2
         && !((class04453)((class06202)super.y_0).T_4).method_6128()
         && !((class04453)((class06202)super.y_0).T_4).method_31549().y
         && class11281.u((class11328)(var0 -> var0.L(class02484.K)))
         && ((class04453)((class06202)super.y_0).T_4).fields_17fa3311b0e9d3e9b883d09222919bf5a_1 == 0) {
         if (class11535 == (class11535)this.L_3) {
            if (!(Boolean)((class04453)((class06202)super.y_0).T_4).R_3 && (Boolean)this.u_4) {
               var1.i(false);
            }
         } else if ((Boolean)((class04453)((class06202)super.y_0).T_4).R_3) {
            var1.i(true);
         } else {
            this.u_5 = !(Boolean)this.u_5;
            var1.i((Boolean)this.u_5);
         }
      }
   }

   @class11782
   public void N(class11366 var1) {
      if (class11938.m().u()) {
         var1.N();
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.P();
      this.u_4 = ((class04474)((class04453)((class06202)super.y_0).T_4).L_1).field_54155.i();
      if ((Boolean)this.u_2 && !class11938.m().u()) {
         this.G();
         this.u_2 = false;
      }

      if ((Boolean)this.u_3 && !class11938.m().u()) {
         this.v();
         this.u_3 = false;
      }
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.P();
      if (((class11527)this.L_0).N(var1)) {
         this.u_3 = true;
      }

      if (((class11527)this.L_1).N(var1)) {
         this.u_2 = true;
      }
   }

   public void N(int var1) {
      this.P();
      this.u_1 = class11938.j().y() + var1;
   }

   private void G() {
      if (!this.m()) {
         class11919.N(() -> this.N(10), this::y);
      }
   }
}
