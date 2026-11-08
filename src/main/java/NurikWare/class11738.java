package NurikWare;

import java.util.ArrayList;
import java.util.List;
import minecraft.class06202;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class class11738 {
   public Object N_0;
   public static Object y_0 = new class11738();
   public static Object y_1;
   public static Object y_2;
   public static Object y_3 = class11300.N(-1, 100);
   public static Object y_4 = class09991.N().N(false);
   public static Object y_5 = class09991.N()
      .N(class09969.FLOATING)
      .U(0.0F)
      .E(0.0F)
      .N(class09962.N(100.0F))
      .y(class09962.N(100.0F))
      .L(true)
      .N(Integer.MAX_VALUE);

   private class11738() {
      super();
      this.Z();
      this.N_0 = new ArrayList();
   }

   static {
      B();
   }

   private static void B() {
      y_0 = null;
      y_1 = 5.0F;
      y_2 = 1.0F;
      y_3 = 1694498815;
      y_4 = null;
      y_5 = null;
   }

   private void Z() {
   }

   private void y(float var1, Vector2f var2, float var3) {
      float f = this.N(var1, var2.x, var3);
      if (!Float.isNaN(f)) {
         var2.x = f;
         ((List)this.N_0).add(new Vector2f(var1, -1.0F));
      }
   }

   private float N(float var1, float var2, float var3) {
      if (Math.abs(var1 - var2) < 5.0F) {
         return var1;
      } else if (Math.abs(var1 - (var2 + var3)) < 5.0F) {
         return var1 - var3;
      } else {
         return Math.abs(var1 - (var2 + var3 / 2.0F)) < 5.0F ? var1 - var3 / 2.0F : Float.NaN;
      }
   }

   public static class09798 N(Void var0, class09809 var1) {
      var1.L("hudSnapLines", ((List)((class11738)y_0).N_0)::hashCode);
      List list = (List)((class11738)y_0).N_0;
      if (list.isEmpty()) {
         return class09778.N(var0x -> var0x.N("snapGuides").N((class09991)y_4));
      } else {
         float f = N(true);
         float f1 = N(false);
         return class09778.N((class09991)y_5, var3x -> {
            var3x.N("snapGuides");

            for (int i = 0; i < list.size(); i++) {
               Vector2f vector2f = (Vector2f)list.get(i);
               float f2 = vector2f.x == -1.0F ? 1.0F : f1 + 1.0F;
               float f3 = vector2f.y == -1.0F ? 1.0F : f + 1.0F;
               class09991 class09991 = class09991.N().N(class09969.FLOATING).U(vector2f.x).E(vector2f.y).u(f3, f2).y((Integer)y_3);
               String s = "snapLine-" + i;
               var3x.N_3(class09991, var1xx -> var1xx.N(s));
            }
         });
      }
   }

   private static float N(boolean var0) {
      class11753 class11753 = class11938.i();
      float f = class11753 != null ? class11753.u() : 1.0F;
      class06202 class06202 = class06202.Nq();
      int i = var0 ? class06202.Nt().U() : class06202.Nt().E();
      return Math.max(1, i) / f;
   }

   public void N(String var1, Vector2f var2, float var3, float var4, float var5, float var6, boolean var7, boolean var8) {
      for (class11769 class11769 : (List)class11730.N_7) {
         if (!class11769.E().equals(var1)) {
            Vector4f vector4f = class11769.R();
            if (vector4f != null) {
               if (var7) {
                  this.y(vector4f.x(), var2, var3);
                  this.y(vector4f.x() + vector4f.z(), var2, var3);
               }

               if (var8) {
                  this.N(vector4f.y(), var2, var4);
                  this.N(vector4f.y() + vector4f.w(), var2, var4);
               }
            }
         }
      }

      if (var7) {
         this.y(var5 / 2.0F, var2, var3);
      }

      if (var8) {
         this.N(var6 / 2.0F, var2, var4);
      }
   }

   private void N(float var1, Vector2f var2, float var3) {
      float f = this.N(var1, var2.y, var3);
      if (!Float.isNaN(f)) {
         var2.y = f;
         ((List)this.N_0).add(new Vector2f(-1.0F, var1));
      }
   }

   public void N() {
      ((List)this.N_0).clear();
   }
}
