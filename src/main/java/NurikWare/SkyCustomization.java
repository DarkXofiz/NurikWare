package NurikWare;

import minecraft.class06202;

@class11080(
   L = "SkyCustomization",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class SkyCustomization extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object u_7;
   public boolean u_init;
   public static Object i_0;
   public static Object i_1;

   public class11504 P() {
      this.J();
      return (class11504)this.L_5;
   }

   public class11504 T() {
      this.J();
      return (class11504)this.L_4;
   }

   public SkyCustomization() {
      super();
      this.J();
      this.L_0 = class11524.N(this, "mode", new class11420("chroma", true, true), new class11420("borealis", false, false));
      this.L_1 = class11524.N(this, "aurora-first", -14425478);
      this.L_2 = class11524.N(this, "aurora-second", -8766209);
      this.L_3 = (class11504)class11524.N(this, "intensity", 1.5F, 0.0F, 3.0F, 0.05F).N(var1 -> {
         this.J();
         return ((class11420)((class11517)this.L_0).i()).N();
      });
      this.L_4 = (class11504)class11524.N(this, "softness", 0.4F, 0.0F, 1.0F, 0.01F).N(var1 -> {
         this.J();
         return ((class11420)((class11517)this.L_0).i()).N();
      });
      this.L_5 = (class11504)class11524.N(this, "coverage", 0.5F, 0.0F, 0.67F, 0.01F).N(var1 -> {
         this.J();
         return ((class11420)((class11517)this.L_0).i()).N();
      });
      this.u_0 = class11524.N(this, "speed", 1.0F, 0.0F, 5.0F, 0.05F);
      this.u_1 = class11524.N(
         this, "downscale", new class11443("_1x", 1, true), new class11443("_2x", 2, false), new class11443("_4x", 4, false), new class11443("_8x", 8, false)
      );
      this.u_2 = class11213.N((class09087)class09063.N_2, 4096, 1024);
      this.u_3 = class09097.i(() -> {
         this.J();
         return ((class06202)super.y_0).e().N / ((class11443)((class11517)this.u_1).i()).N();
      }, () -> {
         this.J();
         return ((class06202)super.y_0).e().y / ((class11443)((class11517)this.u_1).i()).N();
      });
      this.u_4 = class09097.i(() -> {
         this.J();
         return ((class06202)super.y_0).e().N / (((class11443)((class11517)this.u_1).i()).N() * 3);
      }, () -> {
         this.J();
         return ((class06202)super.y_0).e().y / (((class11443)((class11517)this.u_1).i()).N() * 3);
      });
      this.u_5 = class11218.<class09317>N()
         .N(new class11425(this, (class11213)this.u_2))
         .N((class09064)this.u_3)
         .N(new class11409((class11213)this.u_2))
         .L(((class06202)super.y_0)::e)
         .L((class09064)this.u_3)
         .N();
      this.u_6 = class11218.<class09317>N()
         .N(new class11430(this, (class11213)this.u_2))
         .N((class09064)this.u_4)
         .N(new class11456((class11213)this.u_2))
         .L(((class06202)super.y_0)::e)
         .L((class09064)this.u_4)
         .N();
   }

   static {
      Y();
   }

   private void J() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_7 = 0.0F;
      }
   }

   public class09064 b() {
      this.J();
      return (class09064)this.u_3;
   }

   public class11504 s() {
      this.J();
      return (class11504)this.u_0;
   }

   public class11515 n() {
      this.J();
      return (class11515)this.L_1;
   }

   public class11504 m() {
      this.J();
      return (class11504)this.L_3;
   }

   public class11515 t() {
      this.J();
      return (class11515)this.L_2;
   }

   public class09064 v() {
      this.J();
      return (class09064)this.u_4;
   }

   public class11517<class11420> j() {
      this.J();
      return (class11517<class11420>)this.L_0;
   }

   @class11782
   public void N(class10996 var1) {
      this.J();
      this.u_7 = ((Float)this.u_7 + 0.05F * ((class11504)this.u_0).i()) % 100000.0F;
   }

   public float N(float var1) {
      this.J();
      return (Float)this.u_7 + var1 * 0.05F * ((class11504)this.u_0).i();
   }

   @class11782
   public void N(class09317 var1) {
      this.J();
      if (((class11420)((class11517)this.L_0).i()).N()) {
         ((class11218)this.u_5).execute(var1);
      } else {
         ((class11218)this.u_6).execute(var1);
      }
   }

   private static void Y() {
      i_0 = 3;
      i_1 = 0.05F;
   }
}
