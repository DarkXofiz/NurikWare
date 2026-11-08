package NurikWare;

import java.nio.FloatBuffer;
import java.util.List;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08844;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.lwjgl.BufferUtils;

public class class11476 extends class11473<class11483> {
   public static Object y_0;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4 = new class12012(true, 1, 1, 1, 1);
   public static Object y_5 = class12036.u().N((class12012)y_4).N();
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;

   public class11476() {
      super();
      this.B();
      this.L_0 = class06202.Nq();
      this.L_1 = BufferUtils.createFloatBuffer(40);
      this.L_2 = class11213.N((class09087)class09063.N_2, 4096, 1024);
      this.L_3 = class09097.i(() -> {
         this.B();
         return ((class06202)this.L_0).e().N;
      }, () -> {
         this.B();
         return ((class06202)this.L_0).e().y;
      });
      this.L_4 = class11218.<class09321>N().N(new class11465(this, (class11213)this.L_2)).y((class09064)this.L_3).N(33990, () -> {
         this.B();
         return class11925.y(((class06202)this.L_0).e());
      }).N(new class11470(this, (class11213)this.L_2)).L(((class06202)this.L_0)::e).L((class09064)this.L_3).N();
   }

   static {
      U();
   }

   private void B() {
   }

   private static void U() {
      y_0 = 5;
      y_1 = 40.0F;
      y_2 = 500.0F;
      y_3 = Math.PI * 10;
      y_4 = null;
      y_5 = null;
   }

   private boolean N(List<class11483> var1, class06889 var2) {
      this.B();
      ((FloatBuffer)this.L_1).clear();
      int i = 0;

      for (class11483 class11483 : var1) {
         if (i >= 5) {
            break;
         }

         class11934 class11934 = class11483.M();
         if (!this.N(class11483, class11934, var2)) {
            float f = class11934.E().floatValue();
            float f1 = 40.0F * f;
            if (!(f1 < 0.1F)) {
               class06889 class06889 = class11483.B();
               int j = class11483.i();
               long k = (System.nanoTime() - class11934.z()) / 1000000L;
               float f2 = Math.clamp((float)(class11934.y().toMillis() - k) / 500.0F, 0.0F, 1.0F) * class11300.y(j) / 255.0F;
               ((FloatBuffer)this.L_1).put((float)(class06889.M - var2.M));
               ((FloatBuffer)this.L_1).put((float)(class06889.B - var2.B));
               ((FloatBuffer)this.L_1).put((float)(class06889.Z - var2.Z));
               ((FloatBuffer)this.L_1).put(f1);
               ((FloatBuffer)this.L_1).put(f2);
               ((FloatBuffer)this.L_1).put(class11300.u(j) / 255.0F);
               ((FloatBuffer)this.L_1).put(class11300.N(j) / 255.0F);
               ((FloatBuffer)this.L_1).put(class11300.i(j) / 255.0F);
               i++;
            }
         }
      }

      for (int l = i; l < 5; l++) {
         ((FloatBuffer)this.L_1).put(0.0F).put(0.0F).put(0.0F).put(0.0F).put(0.0F).put(0.0F).put(0.0F).put(0.0F);
      }

      return i > 0;
   }

   @Override
   public void N(class09321 var1) {
      this.B();
      List<class11483> list = this.N();
      if (!list.isEmpty()) {
         if (this.N(list, var1.y().y())) {
            ((class11218)this.L_4).execute(var1);
         }
      }
   }

   @Override
   public void N(class10967 var1) {
      this.B();
      List<class11483> list = this.N();
      if (!list.isEmpty()) {
         byte b0 = 16;
         byte b1 = 14;
         float f = 8.0F;
         class08844 class08844 = ((class06202)this.L_0).Nt();
         float f1 = class08844.U();
         float f2 = class08844.E();
         float f3 = 0.15F;
         float f4 = Math.min(f1, f2) * 0.15F;
         class09093 class09093 = class09080.u();
         class06889 class06889xxx = ((class03386)((class06202)this.L_0).i_5).s().y();

         for (class11483 class11483 : list) {
            class11483.L().N();
            class11483.M().N();
            class06889 class06889x = class11483.W();
            boolean flag = false;
            if (class11483.R()) {
               class07049 class07049 = ((class03448)((class06202)this.L_0).T_3).method_8469(class11483.y());
               if (class07049 != null) {
                  class06889x = new class06889(class07049.field_6014, class07049.field_6036 + class07049.method_17682(), class07049.field_5969)
                     .N(class07049.method_73189().y(0.0, class07049.method_17682(), 0.0), var1.y().N(true));
                  class11483.N(class06889x);
                  flag = true;
               }
            }

            class06889 class06889xx = class06889x.u(class06889xxx);
            class06889 class06889xxx = class06889x.y(0.0, flag ? 1.0 : 2.0, 0.0).u(class06889xxx);
            class11893 class11893 = class11925.y((float)class06889xx.M, (float)class06889xx.B, (float)class06889xx.Z);
            class11893 class11893x = class11925.y((float)class06889xxx.M, (float)class06889xxx.B, (float)class06889xxx.Z);
            if (class11893 != null && class11893x != null) {
               Vector2f vector2f = class11893.N().round();
               Vector2f vector2f1 = class11893x.N().round();
               boolean flag1 = class11893.y() && vector2f.x >= f4 && vector2f.x <= f1 - f4 && vector2f.y >= f4 && vector2f.y <= f2 - f4;
               int i = class11483.i();
               String s = class11483.E() + " m";
               float f5 = class11483.L().E().floatValue();
               float f6 = (vector2f.y - vector2f1.y) * f5;
               float f7 = (vector2f1.y - vector2f.y) * f5;
               float f8 = vector2f.y + f7;
               float f9 = vector2f.x;
               float f10 = f8;
               if (flag1) {
                  class11176.N(((class11174)class11190.y_3).u(), (Matrix4f)class11925.y_3, vector2f.x, f8, 2.0F, f6, i, class11300.N(i, 0));
               } else {
                  Vector2f vector2f2 = class11925.N(vector2f, f1, f2, f4);
                  f9 = vector2f2.x;
                  f10 = vector2f2.y;
               }

               float f14 = f9 - class09093.y(s, 14.0F, class09079.REGULAR, false) / 2.0F;
               float f11 = f10 - 28.0F;
               class11176.N(class09093, s, f14, f11, 14.0F, i, -16777216);
               s = class11483.m();
               float f12 = f9 - class09093.y(s, 16.0F, class09079.REGULAR, false) / 2.0F;
               float f13 = f10 - 48.0F;
               class11176.N(class09093, s, f12, f13, 16.0F, i, -16777216);
               class11176.N(((class11174)class11190.y_3).u(), (Matrix4f)class11925.y_3, f9 + 1.0F, f10, 8.0F, i);
            }
         }
      }
   }

   private boolean N(class11483 var1, class11934 var2, class06889 var3) {
      return var2.N(class11903.FORWARDS) ? true : var3.R(var1.u()) > 200.0;
   }

   @Override
   public void N(class10996 var1) {
      this.B();
      List<class11483> list = this.N();
      if (!list.isEmpty()) {
         class06889 class06889 = ((class03386)((class06202)this.L_0).i_5).s().y();

         for (class11483 class11483 : list) {
            class11483.N((int)class06889.R(class11483.W()));
         }
      }
   }
}
