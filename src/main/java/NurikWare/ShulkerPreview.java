package NurikWare;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import minecraft.class00392;
import minecraft.class00717;
import minecraft.class00891;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02118;
import minecraft.class02128;
import minecraft.class02484;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06563;
import minecraft.class06584;
import minecraft.class06922;
import minecraft.class06937;
import minecraft.class07027;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07510;
import minecraft.class08394;
import org.joml.Vector2ic;
import org.joml.Vector4f;

@class11080(
   L = "ShulkerPreview",
   y = class11072.VISUAL,
   N = class11106.SCREEN
)
public class ShulkerPreview extends class11067 {
   public Object L_0;
   public Object L_1;
   public static Object u_0;
   public static Object u_1;
   public static Object u_2;

   private void P() {
   }

   public ShulkerPreview() {
      super();
      this.P();
      this.L_0 = class11911.N("icons/3x9.png");
      this.L_1 = class11524.N(this, "show-in-world", true);
   }

   static {
      v();
   }

   private static void v() {
      u_0 = 8;
      u_1 = -12698050;
      u_2 = -16777216;
   }

   private void N(class01054 var1, int var2, int var3, int var4, class06584 var5) {
      this.P();
      var1.N(class08394.Na, (class01894)this.L_0, var2 - 4, var3 + var4 + 5, 0.0F, 0.0F, 256, 256, 256, 256, this.N(var5, false));
   }

   private void N(class09093 var1, class06584 var2, int var3, int var4) {
      int i = var2.c();
      if (i > 1) {
         String s = Integer.toString(i);
         float f = var1.y(s, 8.0F, class09079.REGULAR, false);
         class11176.N(var1, s, var3 + 17 - f, (float)(var4 + 9), 8.0F, -1, -12698050);
      }
   }

   private class00392 N(List<class06584> var1) {
      return class11921.N("shulker.contains", var1.size()).N(class06541.field_1080);
   }

   @class11782(
      y = class11777.AFTER
   )
   public void N(class10967 var1) {
      this.P();
      if (((class11507)this.L_1).i()) {
         boolean flag = false;

         for (class07049 class07049 : ((class03448)((class06202)super.y_0).T_3).M()) {
            if (class07049.method_5864() == class07078.Nt && class11925.y(class07049)) {
               class06584 class06584 = ((class00717)class07049).N();
               if (class11929.y(class06584)) {
                  Vector4f vector4f = class11925.N(class07049, true);
                  if (vector4f != null) {
                     List<class06584> list = class11929.i(class06584);
                     if (!list.isEmpty()) {
                        int i = (int)(vector4f.x() + (vector4f.z() - vector4f.x()));
                        int j = (int)vector4f.y();
                        i += 12;
                        byte b0 = 18;
                        j -= b0;
                        class11176.N(((class11174)class11190.y_0).u(), i - 4, j + b0 + 5, 256.0F, 256.0F, 0.0F, 0.0F, 1.0F, 1.0F, this.N(class06584, true));
                        flag = true;
                        this.N(list, i, j, b0);
                     }
                  }
               }
            }
         }

         if (flag) {
            class11925.N(((class06202)super.y_0).e(), true);
            ((class11174)class11190.y_0).N(var0 -> {
               var0.z("u_projection").N(class11925.L());
               var0.z("u_view").N(RenderSystem.getModelViewMatrix());
               var0.M("texture_in").N(((class12031)class11998.N_4).N());
            });
         }
      }
   }

   private void N(List<class06584> var1, int var2, int var3, int var4) {
      class09093 class09093 = class09080.i();

      for (int i = 0; i < var1.size(); i++) {
         int j = var2 + 4 + i % 9 * 18;
         int k = var3 + var4 + 13 + i / 9 * 18;
         class06584 class06584 = (class06584)var1.get(i);
         class11938.k().N(class06584, j, k, 16.0F);
         this.N(class06584, j, k);
         this.N(class09093, class06584, j, k);
      }
   }

   private void N(class06584 var1, int var2, int var3) {
      if (var1.m()) {
         int i = var1.s();
         if (i > 0) {
            float f = 1.0F - (float)var1.P() / i;
            class11213 class11213 = ((class11174)class11190.N_0).u();
            class11176.N(class11213, var2 + 2, var3 + 13, 13.0F, 2.0F, -16777216);
            int j = Math.round(f * 13.0F);
            if (j > 0) {
               class11176.N(class11213, var2 + 2, var3 + 13, j, 1.0F, class11300.N(f));
            }
         }
      }
   }

   @class11782
   public void N(class11361 var1) {
      if (!class11929.i(var1.y()).isEmpty() && !((class06202)super.y_0).s()) {
         List<class00392> list = var1.N();
         list.add(1, class11921.N("shulker.holdControl").N(class06541.field_1080));
         list.add(2, class00392.y(" "));
      }
   }

   private void N(class01054 var1, List<class06584> var2, int var3, int var4, int var5) {
      for (int i = 0; i < var2.size(); i++) {
         int j = var3 + 4 + i % 9 * 18;
         int k = var4 + var5 + 13 + i / 9 * 18;
         class06584 class06584 = (class06584)var2.get(i);
         class11925.N(var1, class06584, j, k);
         var1.N((class01590)((class06202)super.y_0).i_3, class06584, j, k);
      }
   }

   @class11782
   public void N(class11368 var1) {
      if (var1.u() == -111) {
         var1.N();
      }

      class06937 class06937 = var1.L();
      if (class06937 != null && class06937.R()) {
         class06584 class06584 = class06937.i();
         List<class06584> list = class11929.i(class06584);
         if (!list.isEmpty() && ((class06202)super.y_0).s()) {
            if (var1.M() == class07510.field_7790 && var1.R() == 1) {
               var1.N();
               class06922 class06922 = new class06922(-111, ((class04453)((class06202)super.y_0).T_4).method_31548());
               class06922.L().addAll(list);

               for (int i = 0; i < list.size(); i++) {
                  ((class06937)class06922.T.get(i)).u(list.get(i));
               }

               class05096 class05096 = (class05096)((class06202)super.y_0).v_3;
               class05096 class05096x = (class05096)((class06202)super.y_0).v_3;
               if (class05096x instanceof class11031) {
                  class05096 = (class05096)((class11031)class05096x).N_0;
               }

               ((class06202)super.y_0).N(new class11031(class06922, ((class04453)((class06202)super.y_0).T_4).method_31548(), class06584.d(), class05096));
            }
         }
      }
   }

   private int N(class06584 var1, boolean var2) {
      class00891 class00891 = class00891.N(var1.B());
      if (class00891 instanceof class07027) {
         class06563 class06563 = ((class07027)class00891).y();
         if (class06563 != null) {
            return class11300.N(class06563.u().NU, var2 ? 100 : 255);
         }
      }

      return class11300.N(class06563.field_7945.u().NU, var2 ? 100 : 255);
   }

   @class11782
   public void N(class10964 var1) {
      class06584 class06584 = var1.L();
      List<class06584> list = class11929.i(class06584);
      if (!list.isEmpty() && ((class06202)super.y_0).s()) {
         var1.N();
         class00392 class00392x = this.N(list);
         class00392 class00392x = class06584.d();
         int i = Math.max(((class01590)((class06202)super.y_0).i_3).N(class00392x), ((class01590)((class06202)super.y_0).i_3).N(class00392x));
         byte b0 = 18;
         int j = var1.i();
         int k = var1.R() - b0;
         class01054 class01054 = var1.u();
         Vector2ic vector2ic = class02128.N.method_47944(class01054.N(), class01054.y(), j, k, i, b0);
         j = vector2ic.x();
         k = vector2ic.y();
         class02118.N(class01054, j, k, i, b0, (class01894)class06584.method_58694(class02484.V));
         this.N(class01054, j, k, b0, class06584);
         class01054.y((class01590)((class06202)super.y_0).i_3, class00392x.method_30937(), j, k, -1);
         class01054.y((class01590)((class06202)super.y_0).i_3, class00392x.method_30937(), j, k + 10, -1);
         this.N(class01054, list, j, k, b0);
      }
   }
}
