package NurikWare;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import org.lwjgl.BufferUtils;

@class11080(
   L = "JumpEffect",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class JumpEffect extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public static Object i_0;

   public JumpEffect() {
      super();
      this.t();
      this.u_0 = class11524.N(this, "radius", 2.0F, 1.0F, 2.5F, 0.1F);
      this.u_1 = class11524.N(this, "wave-amplitude", 1.0F, 0.1F, 3.0F, 0.05F);
      this.u_2 = class11524.N(this, "first-color", -11104513);
      this.u_3 = class11524.N(this, "second-color", -11104513);
      this.u_4 = new ArrayList();
      this.L_0 = BufferUtils.createFloatBuffer(40);
      this.L_2 = class11213.N((class09087)class09063.N_2, 4096, 1024);
      this.L_3 = class09097.i(() -> ((class06202)super.y_0).e().N, () -> ((class06202)super.y_0).e().y);
      this.L_4 = class11218.<class09321>N()
         .N(new class11041(this, (class11213)this.L_2))
         .N((class09064)this.L_3)
         .N(() -> class11925.N(((class06202)super.y_0).e()))
         .N(33990, () -> class11925.y(((class06202)super.y_0).e()))
         .N(new class11049(this, (class11213)this.L_2))
         .L(((class06202)super.y_0)::e)
         .L((class09064)this.L_3)
         .N();
   }

   static {
      l();
   }

   private static void l() {
      i_0 = 8;
   }

   private void t() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = 0;
      }
   }

   @class11782
   public void N(class10959 var1) {
      this.t();
      ((List)this.u_4).add(new class11037(((class04453)((class06202)super.y_0).T_4).method_73189()));
   }

   @class11782(
      y = class11777.AFTER_ALL
   )
   public void N(class09321 var1) {
      this.t();
      if (!((List)this.u_4).isEmpty()) {
         ((class11218)this.L_4).execute(var1);
      }
   }

   void N(class06889 var1, float var2) {
      this.t();
      ((FloatBuffer)this.L_0).clear();
      int i = Math.max(0, ((List)this.u_4).size() - 8);

      for (int j = 0; j < 8; j++) {
         int k = i + j;
         if (k < ((List)this.u_4).size()) {
            class11037 class11037 = (class11037)((List)this.u_4).get(k);
            ((FloatBuffer)this.L_0).put((float)(((class06889)class11037.N_0).M - var1.M));
            ((FloatBuffer)this.L_0).put((float)(((class06889)class11037.N_0).B - var1.B));
            ((FloatBuffer)this.L_0).put((float)(((class06889)class11037.N_0).Z - var1.Z));
            ((FloatBuffer)this.L_0).put(((class11504)this.u_0).i() * class11037.N(var2));
            ((FloatBuffer)this.L_0).put(class11037.y(var2));
         } else {
            ((FloatBuffer)this.L_0).put(0.0F).put(0.0F).put(0.0F).put(0.0F).put(0.0F);
         }
      }
   }

   @class11782
   public void N(class10996 var1) {
      this.t();
      this.L_1 = (Integer)this.L_1 + 1;
      Iterator iterator = ((List)this.u_4).iterator();

      while (iterator.hasNext()) {
         class11037 class11037 = (class11037)iterator.next();
         class11037.L();
         if (class11037.N()) {
            iterator.remove();
         }
      }
   }
}
