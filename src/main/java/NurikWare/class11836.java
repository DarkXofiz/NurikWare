package NurikWare;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import minecraft.class01054;
import minecraft.class02484;
import minecraft.class02689;
import minecraft.class03386;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class08066;
import org.joml.Matrix3x2fStack;
import org.lwjgl.opengl.GL11;

public class class11836 {
   public static Object N_0 = class06202.Nq();
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public boolean u_init;

   private void L(int var1) {
      if (!((boolean[])this.u_4)[var1]) {
         ((boolean[])this.u_4)[var1] = true;
         ((IntArrayList)this.u_3).add(var1);
      }
   }

   private void L(class01054 var1) {
      class12027.N();
      ((class03386)((class06202)N_0).i_5).M.N((GpuBufferSlice)class11925.L_0);
      if (!(Boolean)this.L_1) {
         RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(((class08066)this.y_5).L(), 0, ((class08066)this.y_5).i(), 1.0);
         this.m();
         this.L_1 = true;
      }

      class09078.N((class08066)this.y_5);
      class11925.y(((Integer)this.y_2).intValue(), ((Integer)this.y_2).intValue());
      class09081.N(RenderSystem.getProjectionMatrixBuffer());

      try {
         class11925.N((class08066)this.y_5, true);
         this.Z();
         this.y(var1);
         ((class03386)((class06202)N_0).i_5).M.N((GpuBufferSlice)class11925.L_0);
      } finally {
         class09081.N();
         class09078.L();
         class11925.N(((class06202)N_0).e(), true);
         class11925.N();
      }

      for (int i = 0; i < ((IntArrayList)this.u_3).size(); i++) {
         ((boolean[])this.u_4)[((IntArrayList)this.u_3).getInt(i)] = false;
      }

      ((IntArrayList)this.u_3).clear();
      class12027.y();
   }

   public int L() {
      return (Integer)this.y_0;
   }

   public class11836() {
      this(32, 32);
   }

   public class11836(int var1, int var2) {
      super();
      this.R();
      this.y_6 = new Int2IntOpenHashMap();
      this.u_3 = new IntArrayList(64);
      this.L_2 = -1;
      this.L_3 = "glidfy:0";
      this.y_0 = var1;
      this.y_1 = var2;
      this.y_2 = var2 * var1;
      this.y_3 = 1.0F / var2;
      this.y_4 = var2 * var2;
      this.y_5 = new class10203(null, (Integer)this.y_2, (Integer)this.y_2, true);
      this.u_0 = new int[(Integer)this.y_4];
      this.u_1 = new int[(Integer)this.y_4];
      this.u_2 = new class06584[(Integer)this.y_4];
      this.u_4 = new boolean[(Integer)this.y_4];
      ((Int2IntOpenHashMap)this.y_6).defaultReturnValue(-1);
   }

   static {
      u();
   }

   private class11867 B(int var1) {
      int i = var1 % (Integer)this.y_1;
      int j = var1 / (Integer)this.y_1;
      float f = i * (Float)this.y_3;
      float f1 = j * (Float)this.y_3;
      float f2 = f + (Float)this.y_3;
      float f3 = f1 + (Float)this.y_3;
      return new class11867(var1, f, f1, f2, f3);
   }

   private void Z() {
      GL11.glColorMask(true, true, true, true);
      GL11.glDepthMask(true);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glEnable(3089);

      for (int i = 0; i < ((IntArrayList)this.u_3).size(); i++) {
         int j = ((IntArrayList)this.u_3).getInt(i);
         int k = j % (Integer)this.y_1;
         int l = j / (Integer)this.y_1;
         int i1 = k * (Integer)this.y_0;
         int j1 = l * (Integer)this.y_0;
         int k1 = (Integer)this.y_2 - j1 - (Integer)this.y_0;
         GL11.glScissor(i1, k1, (Integer)this.y_0, (Integer)this.y_0);
         GL11.glClear(16384);
      }

      GL11.glDisable(3089);
   }

   private void m() {
      GlStateManager._activeTexture(33984);
      GlStateManager._bindTexture(class11925.N((class08066)this.y_5));
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
   }

   private int z() {
      int i = -1;
      int j = Integer.MAX_VALUE;

      for (int k = 0; k < (Integer)this.y_4; k++) {
         if (((int[])this.u_1)[k] < j) {
            j = ((int[])this.u_1)[k];
            i = k;
            if (j == 0) {
               break;
            }
         }
      }

      return i;
   }

   private static void u() {
      N_0 = null;
      N_1 = 32;
      N_2 = 32;
      N_3 = 16;
   }

   private void y(Property var1) {
      for (int i = 0; i < (Integer)this.y_4; i++) {
         class06584 class06584 = ((class06584[])this.u_2)[i];
         if (class06584 != null && !class06584.R()) {
            class02689 class02689 = (class02689)class06584.method_58694(class02484.Nb);
            if (class02689 != null) {
               GameProfile gameprofile = class02689.y();
               if (gameprofile != null && gameprofile.properties().get("textures").contains(var1)) {
                  this.L(i);
               }
            }
         }
      }
   }

   private void y(class01054 var1) {
      class12027.N();
      Matrix3x2fStack matrix3x2fstack = var1.i();
      float f = ((Integer)this.y_0).intValue() / 16.0F;

      for (int i = 0; i < ((IntArrayList)this.u_3).size(); i++) {
         int j = ((IntArrayList)this.u_3).getInt(i);
         class06584 class06584 = ((class06584[])this.u_2)[j];
         if (class06584 != null && !class06584.R()) {
            int k = j % (Integer)this.y_1;
            int l = j / (Integer)this.y_1;
            float f1 = k * (Integer)this.y_0;
            float f2 = l * (Integer)this.y_0;
            matrix3x2fstack.pushMatrix();
            matrix3x2fstack.translate(f1, f2);
            matrix3x2fstack.scale(f);
            var1.N(class06584, 0, 0);
            matrix3x2fstack.popMatrix();
         }
      }
   }

   public String y() {
      int i = class11925.N((class08066)this.y_5);
      if (i != (Integer)this.L_2) {
         this.L_2 = i;
         this.L_3 = "glidfy:" + i;
      }

      return (String)this.L_3;
   }

   @class11782
   public void N(class11392 var1) {
      Property property = var1.N();
      if (property != null) {
         ((class06202)N_0).execute(() -> this.y(property));
      }
   }

   @class11782
   public void N(class09343 var1) {
      ((Int2IntOpenHashMap)this.y_6).clear();

      for (int i = 0; i < (Integer)this.y_4; i++) {
         ((int[])this.u_0)[i] = 0;
         ((int[])this.u_1)[i] = 0;
         ((class06584[])this.u_2)[i] = null;
         ((boolean[])this.u_4)[i] = false;
      }

      ((IntArrayList)this.u_3).clear();
      this.u_5 = 0;
      this.L_1 = false;
      this.L_2 = -1;
   }

   public void N(class06584 var1, float var2, float var3, float var4) {
      class11867 class11867 = this.N(var1);
      if (class11867.L()) {
         class11176.N(
            ((class11174)class11190.y_1).u(),
            class04995.y(var2),
            class04995.y(var3),
            var4,
            var4,
            class11867.y(),
            1.0F - class11867.N(),
            class11867.R(),
            1.0F - class11867.i(),
            -1
         );
      }
   }

   private int N(int var1, class06584 var2) {
      int i;
      if ((Integer)this.u_5 < (Integer)this.y_4) {
         int j = (Integer)this.u_5;
         this.u_5 = j + 1;
         i = j;
      } else {
         i = this.z();
         if (i < 0) {
            return -1;
         }

         ((Int2IntOpenHashMap)this.y_6).remove(((int[])this.u_0)[i]);
      }

      ((Int2IntOpenHashMap)this.y_6).put(var1, i);
      ((int[])this.u_0)[i] = var1;
      ((class06584[])this.u_2)[i] = var2;
      this.L(i);
      return i;
   }

   public void N(class01054 var1) {
      this.L_0 = (Integer)this.L_0 + 1;
      if (!((IntArrayList)this.u_3).isEmpty() || !(Boolean)this.L_1) {
         this.L(var1);
      }
   }

   public int N() {
      return class11925.N((class08066)this.y_5);
   }

   public class11867 N(class06584 var1) {
      if (var1 != null && !var1.R()) {
         int i = class11929.R(var1);
         int j = ((Int2IntOpenHashMap)this.y_6).get(i);
         if (j < 0) {
            j = this.N(i, var1);
            if (j < 0) {
               return (class11867)class11867.y_0;
            }
         } else {
            ((class06584[])this.u_2)[j] = var1;
         }

         ((int[])this.u_1)[j] = (Integer)this.L_0;
         return this.B(j);
      } else {
         return (class11867)class11867.y_0;
      }
   }

   private void R() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
         this.y_1 = 0;
         this.y_2 = 0;
         this.y_3 = 0.0F;
         this.y_4 = 0;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_5 = 0;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = false;
         this.L_2 = 0;
      }
   }
}
