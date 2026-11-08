package NurikWare;

import minecraft.class06202;

@class11080(
   L = "AspectRatio",
   y = class11072.VISUAL,
   N = class11106.SCREEN
)
public class AspectRatio extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;

   public AspectRatio() {
      super();
      this.b();
      this.L_0 = new class11535("_16_9", true);
      this.L_1 = new class11535("_16_10", false);
      this.L_2 = new class11535("_21_9", false);
      this.L_3 = new class11535("_4_3", false);
      this.L_4 = new class11535("custom", false);
      this.L_5 = class11524.N(
         this, "aspect-ratio", (class11535)this.L_0, (class11535)this.L_1, (class11535)this.L_2, (class11535)this.L_3, (class11535)this.L_4
      );
      this.L_6 = (class11504)class11524.N(this, "custom-ratio", 1.0F, 0.5F, 2.0F, 0.01F).N(var1 -> {
         this.b();
         return ((class11535)this.L_4).U();
      });
   }

   private void b() {
   }

   public float N(float var1) {
      this.b();
      float f = ((class06202)super.y_0).Nt().U();
      float f1 = ((class06202)super.y_0).Nt().E();
      if (!this.U()) {
         return var1;
      } else if (((class11535)this.L_0).U()) {
         return 1.7777778F;
      } else if (((class11535)this.L_1).U()) {
         return 1.6F;
      } else if (((class11535)this.L_2).U()) {
         return 2.3888888F;
      } else if (((class11535)this.L_3).U()) {
         return 1.3F;
      } else {
         return ((class11535)this.L_4).U() ? f / ((class11504)this.L_6).i() / f1 : var1;
      }
   }
}
