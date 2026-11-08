package NurikWare;

import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class07070;

@class11080(
   L = "SwingAnimations",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class SwingAnimations extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object u_0;
   public Object u_1;

   public SwingAnimations() {
      super();
      this.b();
      this.L_0 = new class11440(this, "swing-1", true);
      this.L_1 = new class11452(this, "swing-2", false);
      this.L_2 = new class11444(this, "swing-3", false);
      this.L_3 = new class11450(this, "swing-4", false);
      this.L_4 = class11524.N(this, "swing", (class11440)this.L_0, (class11452)this.L_1, (class11444)this.L_2, (class11450)this.L_3);
      this.L_5 = (class11504)class11524.N(this, "swing-strength", 8.0F, 1.0F, 10.0F, 1.0F).N(var1 -> {
         this.b();
         return ((class11442)((class11517)this.L_4).i()).N();
      });
      this.L_6 = (class11504)class11524.N(this, "spin-smoothness", 8.0F, 3.0F, 10.0F, 1.0F).N(var1 -> {
         this.b();
         return ((class11442)((class11517)this.L_4).i()).L();
      });
      this.u_0 = (class11507)class11524.N(this, "spinning", false).N(var1 -> {
         this.b();
         return ((class11452)this.L_1).U();
      });
      this.u_1 = class11524.N(this, "only-while-have-target", false);
   }

   private void b() {
   }

   public class11507 m() {
      this.b();
      return (class11507)this.u_0;
   }

   @class11782
   public void N(class10977 var1) {
      this.b();
      class07070 class07070 = var1.i();
      if (!AttackAura.y(((class11507)this.u_1).i()) && ((class04453)((class06202)super.y_0).T_4).method_6068() == class07070) {
         ((class11442)((class11517)this.L_4).i())
            .N(
               var1.u(),
               class07070 == class07070.field_6182 ? -1 : 1,
               class04995.m(var1.R() * (float) (Math.PI / 2) * 2.0F),
               ((class11504)this.L_6).i(),
               ((class11504)this.L_5).i() * 10.0F,
               var1.R(),
               var1.L()
            );
         var1.N();
      }
   }

   @class11782
   public void N(class09354 var1) {
      this.b();
      if (!AttackAura.y(((class11507)this.u_1).i())) {
         var1.N(((class11504)this.L_6).i().intValue());
      }
   }
}
