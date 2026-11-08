package NurikWare;

import minecraft.class04453;
import minecraft.class06202;

@class11080(
   L = "AntiAFK",
   y = class11072.PLAYER,
   N = class11106.BASE
)
public class AntiAFK extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public boolean L_init;

   public AntiAFK() {
      super();
      this.b();
      this.L_0 = new class11478();
      this.L_1 = new class11705("camera-shake", true);
      this.L_2 = new class11688("click", true);
      this.L_3 = new class11672(this, (class11688)this.L_2, (class11705)this.L_1, "custom", true);
      this.L_4 = new class11696(this, (class11688)this.L_2, (class11705)this.L_1, "ft", false);
      this.L_5 = class11524.N(this, "mode", (class11807)this.L_3, (class11807)this.L_4);
      ((class11517)this.L_5).L().forEach(var1 -> {
         if (var1 instanceof class11801) {
            ((class11801)var1).N(this);
         }
      });
   }

   private void b() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_6 = false;
      }
   }

   @class11782
   public void N(class11385 var1) {
      this.b();
      if ((Boolean)this.L_6) {
         ((class11807)((class11517)this.L_5).i()).y(var1);
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.b();
      this.L_6 = false;
      if (!((class06202)super.y_0).q()) {
         if (!((class04453)((class06202)super.y_0).T_4).k() && !class11907.u()) {
            if (((class11478)this.L_0).N(class11464.u(30))) {
               this.L_6 = true;
               ((class11478)this.L_0).y();
            }

            if ((Boolean)this.L_6) {
               ((class11807)((class11517)this.L_5).i()).y(var1);
            }
         } else {
            ((class11478)this.L_0).y();
         }
      }
   }
}
