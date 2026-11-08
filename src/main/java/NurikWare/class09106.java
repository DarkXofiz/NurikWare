package NurikWare;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.Arrays;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class05194;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.MemoryUtil;

public class class09106 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;
   public static Object y_0 = LogManager.getLogger(String.class);
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object y_5 = class09079.values();
   public static Object y_6 = class11174.N()
      .N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.W_0).N(4).N())
      .N(class11213.N((class09087)class09063.N_6, 65536))
      .N(6)
      .N();
   public static Object y_7 = class11174.N()
      .N(class11204.L().N((class12036)class12019.N_0).N((class09322)class11185.Z_1).N(4).N())
      .N(class11213.N((class09087)class09063.N_2, 4096, 1024))
      .N();

   private void L() {
      this.N_5 = 0;
      ((ByteBuffer)this.N_3).position(0);
   }

   public class09106() {
      super();
      this.u();
      this.N_0 = new class09090();
      this.N_1 = new class09059(this);
      this.N_2 = new class09075(this);
      this.N_3 = MemoryUtil.memAlloc(512 * (Integer)class09077.y_1);
      this.N_4 = new Object[512];
      this.N_6 = -1;
      this.N_7 = -1;
   }

   static {
      y();
      N();
   }

   private void B(int var1) {
      if (((Object[])this.N_4).length < var1) {
         int i = ((Object[])this.N_4).length;

         while (i < var1) {
            i *= 2;
         }

         this.N_4 = Arrays.copyOf((Object[])this.N_4, i);
      }

      int k = var1 * (Integer)class09077.y_1;
      if (((ByteBuffer)this.N_3).capacity() < k) {
         int j = ((ByteBuffer)this.N_3).capacity();

         while (j < k) {
            j *= 2;
         }

         this.N_3 = MemoryUtil.memRealloc((ByteBuffer)this.N_3, j);
      }
   }

   void U() {
      if ((Integer)this.N_7 != -1) {
         ((class11174)y_7).N(var1 -> {
            var1.z("u_projection").N(class11925.L());
            var1.z("u_view").N(RenderSystem.getModelViewMatrix());
            var1.M("texture_in").N((Integer)this.N_7);
         });
      }
   }

   private void z() {
      ((class11174)y_6).y(var1 -> {
         var1.z("u_projection").N(class11925.L());
         var1.M("texture_in").N((Integer)this.N_6);
      });
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_5 = 0;
         this.N_6 = 0;
         this.N_7 = 0;
      }
   }

   private static void y() {
   }

   private class09079 y(int var1) {
      int i = var1 >>> 8 & 0xFF;
      return i >= ((class09079[])y_5).length ? class09079.REGULAR : ((class09079[])y_5)[i];
   }

   private int N(class09079 var1, boolean var2, boolean var3) {
      int i = (var1.ordinal() & 0xFF) << 8;
      if (var2) {
         i |= 1;
      }

      if (var3) {
         i |= 2;
      }

      return i;
   }

   public void N(String var1, float var2, float var3, byte var4, class09079 var5, boolean var6, int var7, int var8, int var9, byte var10) {
      this.N(var1, var2, var3, var4, var7, var8, this.N(var5, var6, var9 != 0), var9, var10);
   }

   public void N(class09093 var1) {
      if ((Integer)this.N_5 != 0) {
         this.N_6 = -1;
         this.N_7 = -1;

         for (int i = 0; i < (Integer)this.N_5; i++) {
            Object object = ((Object[])this.N_4)[i];
            if (object != null) {
               int j = i * (Integer)class09077.y_1;
               int k = ((ByteBuffer)this.N_3).getInt(j + (Integer)class09077.N_4);
               if ((k & 2) != 0) {
                  float f = ((ByteBuffer)this.N_3).getFloat(j + (Integer)class09077.N_1);
                  float f1 = ((ByteBuffer)this.N_3).getFloat(j + (Integer)class09077.N_2);
                  int l = ((ByteBuffer)this.N_3).getInt(j + (Integer)class09077.N_5);
                  byte b0 = ((ByteBuffer)this.N_3).get(j + (Integer)class09077.N_7);
                  byte b1 = ((ByteBuffer)this.N_3).get(j + (Integer)class09077.y_0);
                  class09071 class09071 = var1.y(this.y(k));
                  int i1 = class09071.R();
                  if (i1 != (Integer)this.N_6) {
                     this.z();
                     this.N_6 = i1;
                  }

                  ((class09075)this.N_2).N(class09071, b0, f1, l, b1);
                  this.N(class09071, b0, object, f, f1, (class09075)this.N_2);
               }
            }
         }

         this.z();

         for (int j1 = 0; j1 < (Integer)this.N_5; j1++) {
            Object object1 = ((Object[])this.N_4)[j1];
            ((Object[])this.N_4)[j1] = null;
            if (object1 != null) {
               int k1 = j1 * (Integer)class09077.y_1;
               float f4 = ((ByteBuffer)this.N_3).getFloat(k1 + (Integer)class09077.N_1);
               float f5 = ((ByteBuffer)this.N_3).getFloat(k1 + (Integer)class09077.N_2);
               int l1 = ((ByteBuffer)this.N_3).getInt(k1 + (Integer)class09077.N_3);
               int i2 = ((ByteBuffer)this.N_3).getInt(k1 + (Integer)class09077.N_6);
               int j2 = ((ByteBuffer)this.N_3).getInt(k1 + (Integer)class09077.N_4);
               byte b2 = ((ByteBuffer)this.N_3).get(k1 + (Integer)class09077.N_7);
               class09071 class09071x = var1.y(this.y(j2));
               int k2 = class09071x.R();
               if (k2 != (Integer)this.N_6) {
                  this.z();
                  this.N_6 = k2;
               }

               float f2 = class09071x.L() / Math.max(1, class09071x.u());
               float f3 = class09071x.L() / Math.max(1, class09071x.M());
               ((class09059)this.N_1).N(l1, i2, f2, f3);
               this.N(class09071x, b2, object1, f4, f5, (class09059)this.N_1);
            }
         }

         this.L();
         this.z();
         this.U();
      }
   }

   static int N(class00405 var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         class05194 class05194 = var0.N();
         return class05194 == null ? var1 : var1 & 0xFF000000 | class05194.N() & 16777215;
      }
   }

   private void N(Object var1, float var2, float var3, byte var4, int var5, int var6, int var7, int var8, byte var9) {
      int i = (Integer)this.N_5 + 1;
      this.B(i);
      int j = (Integer)this.N_5 * (Integer)class09077.y_1;
      ((ByteBuffer)this.N_3).putFloat(j + (Integer)class09077.N_1, var2);
      ((ByteBuffer)this.N_3).putFloat(j + (Integer)class09077.N_2, var3);
      ((ByteBuffer)this.N_3).putInt(j + (Integer)class09077.N_3, var5);
      ((ByteBuffer)this.N_3).putInt(j + (Integer)class09077.N_6, var6);
      ((ByteBuffer)this.N_3).putInt(j + (Integer)class09077.N_4, var7);
      ((ByteBuffer)this.N_3).putInt(j + (Integer)class09077.N_5, var8);
      ((ByteBuffer)this.N_3).put(j + (Integer)class09077.N_7, var4);
      ((ByteBuffer)this.N_3).put(j + (Integer)class09077.y_0, var9);
      ((ByteBuffer)this.N_3).position(i * (Integer)class09077.y_1);
      ((Object[])this.N_4)[(Integer)this.N_5] = var1;
      this.N_5 = i;
   }

   void N(float var1, float var2, float var3, float var4, int var5) {
      ((class11174)y_6).R().N(var1).N(var2).N(var3).N(var4).N(0.0F).N(0.0F).N(0.0F).N(0.0F).y(var5).N(0.0F).N(0.0F).y(0).y();
   }

   private void N(class09071 var1, float var2, Object var3, float var4, float var5, class09102 var6) {
      switch (var3) {
         case String s:
            ((class09090)this.N_0).N(var1, var2, 1.0F, s, var4, var5, var6);
            break;
         case class01028 class01028:
            ((class09090)this.N_0).N(var1, var2, 1.0F, class01028, var4, var5, var6);
            break;
         default:
            ((Logger)y_0).warn("Unknown payload type: {}", var3.getClass().getSimpleName());
      }
   }

   private static void N() {
      y_0 = null;
      y_1 = 512;
      y_2 = 1;
      y_3 = 2;
      y_4 = 8;
      y_5 = null;
      y_6 = null;
      y_7 = null;
   }

   public void N(class01028 var1, float var2, float var3, byte var4, class09079 var5, boolean var6, int var7, int var8, int var9, byte var10) {
      this.N(var1, var2, var3, var4, var7, var8, this.N(var5, var6, var9 != 0), var9, var10);
   }

   void N(class09719 var1, int var2, int var3, float var4, float var5) {
      float f = ((class09090)this.N_0).y() + (((class09090)this.N_0).R() - ((class09090)this.N_0).N());
      float f1 = ((class09090)this.N_0).u();
      float f2 = f + var1.N;
      float f3 = f + var1.L;
      float f4 = f1 - var1.u;
      float f5 = f1 - var1.y;
      float f6 = var1.i;
      float f7 = var1.B;
      float f8 = var1.M;
      float f9 = var1.R;
      ((class11174)y_6).R().N(f2).N(f4).N(f3).N(f5).N(f6).N(f7).N(f8).N(f9).y(var2).N(var4).N(var5).y(var3).y();
   }
}
