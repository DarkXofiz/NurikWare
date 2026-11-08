package NurikWare;

import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;

@class11080(
   L = "ElytraTarget",
   y = class11072.MOVEMENT,
   N = class11106.BASE
)
public class ElytraTarget extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public boolean u_init;

   public ElytraTarget() {
      super();
      this.m();
      this.L_0 = class11524.N(this, "chase-distance", 50.0F, 10.0F, 200.0F, 5.0F);
      this.L_1 = class11524.N(this, "overtake", true);
      this.L_2 = (class11504)class11524.N(this, "overtake-distance", 5.0F, 0.0F, 6.0F, 1.0F).N(var1 -> {
         this.m();
         return ((class11507)this.L_1).i();
      });
      this.u_0 = new class10921(this, "timing-firework-use", false);
      this.u_1 = new class10901(this, "bind-firework-use", false);
      this.u_2 = class11524.N(
         this,
         "firework-use",
         new class10913(this, "none-firework-use", true),
         new class10924(this, "auto-firework-use", false),
         (class10901)this.u_1,
         (class10921)this.u_0
      );
      this.u_3 = (class11504)class11524.N(this, "delay-ticks", 20.0F, 2.0F, 60.0F, 1.0F).N(var1 -> {
         this.m();
         return ((class10921)this.u_0).U();
      });
      this.u_4 = (class11527)class11524.N(this, "manual-hotkey", class12002.UNKNOWN).N(var1 -> {
         this.m();
         return ((class10901)this.u_1).U();
      });
   }

   private void m() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_5 = false;
      }
   }

   @Override
   public void y() {
      this.m();
      this.u_5 = false;
      super.y();
   }

   @class11782
   public void N(class11810 var1) {
      this.m();
      if (class11919.N()) {
         var1.N(((class11504)this.L_0).i());
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.m();
      if (class11938.u().C().s()) {
         ((class10905)((class11517)this.u_2).i()).y(var1);
      }
   }

   @class11782
   public void N(class11820 var1) {
      this.m();
      if (class11919.N()) {
         class07438 class07438 = var1.y();
         class11499 class11499 = class11505.N(class11505.N(), class11895.N(class07438));
         if (!var1.L() && class07438.method_6128() && ((class11507)this.L_1).i()) {
            class06889 class06889x = class07438.method_73189();
            class06889 class06889x = class07438.method_5720().u().L(((class11504)this.L_2).i().floatValue()).i(class06889x);
            class07438.method_5814(class06889x.M, class06889x.B, class06889x.Z);
            class11499 = class11505.N(class11505.N(), class11895.N(class07438));
            class07438.method_5814(class06889x.M, class06889x.B, class06889x.Z);
         }

         var1.N(class11505.N().N(class11499.y() + class11908.y(-1.0F, 1.0F), class11499.R() + class11908.y(-1.0F, 1.0F)).N(true));
      }
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.m();
      if (((class11527)this.u_4).N(var1) && ((class04453)((class06202)super.y_0).T_4).method_6128()) {
         this.u_5 = true;
      }
   }
}
