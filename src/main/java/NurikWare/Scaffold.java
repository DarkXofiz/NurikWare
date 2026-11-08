package NurikWare;

import minecraft.class04453;
import minecraft.class06202;

@class11080(
   L = "Scaffold",
   y = class11072.PLAYER,
   N = class11106.BASE
)
public class Scaffold extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;

   public boolean P() {
      this.b();
      return ((class11507)this.L_4).i();
   }

   public Scaffold() {
      super();
      this.b();
      this.L_0 = new class11022(this, "telly", false);
      this.L_1 = class11524.N(this, "mode", new class11027(this, "grim", true), new class11003(this, "basic", false), (class11022)this.L_0);
      this.L_2 = (class11507)class11524.N(this, "auto-jump", true).N(var1 -> {
         this.b();
         return ((class11022)this.L_0).U();
      });
      this.L_3 = class11524.N(this, "safe-walk", new class11024(this, "sneak", true), new class11006(this, "none", false));
      this.L_4 = class11524.N(this, "save-y", true);
      this.L_5 = class11524.N(this, "delay", new class11494(0.0F, 6.0F), new class11494(0.0F, 3.0F), 1.0F);
   }

   @Override
   public boolean Z() {
      this.b();
      return ((class11053)((class11517)this.L_1).i()).i();
   }

   @Override
   public boolean i() {
      this.b();
      return (class04453)((class06202)super.y_0).T_4 == null ? super.i() : ((class11053)((class11517)this.L_1).i()).M();
   }

   private void b() {
   }

   public class11494 m() {
      this.b();
      return ((class11525)this.L_5).i();
   }

   private boolean y(class11385 var1) {
      this.b();
      if (!((class11022)this.L_0).U() || !((class11507)this.L_2).i() || var1.R()) {
         return false;
      } else if (!var1.i() && !var1.M() && !var1.u() && !var1.Z()) {
         return false;
      } else {
         if (((class04453)((class06202)super.y_0).T_4).method_24828()) {
            var1.i(true);
         }

         return true;
      }
   }

   @class11782
   public void N(class11385 var1) {
      this.b();
      if (!this.y(var1)) {
         ((class11807)((class11517)this.L_3).i()).y(var1);
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.b();
      ((class11053)((class11517)this.L_1).i()).L();
   }
}
