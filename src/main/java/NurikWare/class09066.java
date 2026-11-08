package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class08844;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;

public class class09066 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public Object y_7;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object R_4;
   public Object R_5;
   public boolean R_init;
   public Object M_0;
   public Object M_1;
   public Object M_2;
   public Object M_3;
   public Object M_4;
   public Object M_5;
   public boolean M_init;
   public static Object B_0;
   public static Object B_1;

   private void L(class09101 var1) {
      GL11.glViewport(0, 0, (Integer)this.R_3, (Integer)this.R_4);
   }

   public float L() {
      return (((Integer)this.R_3).intValue() - 0.5F) / ((Integer)this.R_5).intValue();
   }

   private int M() {
      return (class09057)this.y_5 != null ? ((class09057)this.y_5).i() : class11925.N(((class06202)this.i_0).e());
   }

   private int T() {
      return (class09057)this.y_6 != null ? ((class09057)this.y_6).i() : this.M();
   }

   public class09066() {
      super();
      this.E();
      this.i_0 = class06202.Nq();
      this.i_1 = class11213.N((class09087)class09063.N_2, 4096, 1024);
      this.i_2 = new class09101();
      this.i_3 = class09072.N((class11213)this.i_1, (float[])class09072.N_0);
      this.R_0 = class09072.N((class11213)this.i_1, (float[])class09072.N_1);
      this.R_1 = 1;
      this.R_2 = 1;
      this.R_3 = 1;
      this.R_4 = 1;
      this.R_5 = 32;
      this.y_0 = 32;
      this.y_1 = 1;
      this.y_2 = 1;
      this.y_3 = 1;
      this.y_4 = 1;
      this.y_7 = 1;
      this.M_0 = 1;
      this.M_3 = 1;
      this.M_4 = 1;
      this.N_0 = 1.0F;
      this.N_2 = 1.0F;
      this.N_4 = 1.0F;
      this.L_0 = 1.0F;
      this.L_1 = class09097.L(() -> (Integer)this.R_1, () -> (Integer)this.R_2);
      this.L_2 = class09097.L(() -> (Integer)this.R_1, () -> (Integer)this.R_2);
      this.L_3 = class09097.L(() -> (Integer)this.R_5, () -> (Integer)this.y_0);
      this.L_4 = new class09056((class11213)this.i_1, 6.0F);
      this.L_5 = new class09089((class11213)this.i_1, 6.0F);
      this.L_6 = new class09056((class11213)this.i_1, 0.0F);
      this.u_0 = this.N((class09056)this.L_4, false);
      this.u_1 = this.N((class09089)this.L_5, true);
      this.u_5 = new int[4];
   }

   static {
      b();
   }

   private void i(class09101 var1) {
      GL11.glViewport(0, 0, (Integer)this.R_1, (Integer)this.R_2);
   }

   private static void b() {
      B_0 = 6;
      B_1 = 32;
   }

   private int z(int var1) {
      return Math.floorDiv(var1, 6) * 6;
   }

   public float u() {
      return 0.0F;
   }

   private void u(int var1) {
      if (var1 != (Integer)this.u_3 || (FloatBuffer)this.u_2 == null) {
         this.u_3 = var1;
         if ((FloatBuffer)this.u_2 == null) {
            this.u_2 = MemoryUtil.memAllocFloat(var1);
         } else if (var1 > ((FloatBuffer)this.u_2).capacity()) {
            this.u_2 = MemoryUtil.memRealloc((FloatBuffer)this.u_2, var1);
         }

         class11925.N((FloatBuffer)this.u_2, var1 - 1);
      }
   }

   private void u(class09101 var1) {
      var1.z().setOrtho(0.0F, ((Integer)this.y_7).intValue(), ((Integer)this.M_0).intValue(), 0.0F, -1.0F, 1.0F);
      var1.y((Integer)this.M_1)
         .N((Integer)this.M_2)
         .i((Integer)this.M_3)
         .u((Integer)this.M_4)
         .u((float)((Integer)this.R_1).intValue())
         .R(((Integer)this.R_2).intValue())
         .y((Float)this.M_5)
         .N((Float)this.N_2)
         .L((Float)this.N_0)
         .i((Float)this.N_1);
   }

   public float y() {
      return (((Integer)this.R_4).intValue() - 0.5F) / ((Integer)this.y_0).intValue();
   }

   private void y(class09101 var1) {
      var1.z().setOrtho(0.0F, ((Integer)this.y_1).intValue(), ((Integer)this.y_2).intValue(), 0.0F, -1.0F, 1.0F);
      var1.y(0)
         .N(0)
         .i((Integer)this.y_1)
         .u((Integer)this.y_2)
         .u((float)((Integer)this.R_1).intValue())
         .R(((Integer)this.R_2).intValue())
         .y(0.0F)
         .N(1.0F)
         .L(1.0F)
         .i(0.0F);
   }

   private int y(int var1, int var2) {
      return Math.min(this.R(var1), var2);
   }

   private void E() {
      if (!this.R_init) {
         this.R_init = true;
         this.R_1 = 0;
         this.R_2 = 0;
         this.R_3 = 0;
         this.R_4 = 0;
         this.R_5 = 0;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0;
         this.y_1 = 0;
         this.y_2 = 0;
         this.y_3 = 0;
         this.y_4 = 0;
         this.y_7 = 0;
      }

      if (!this.M_init) {
         this.M_init = true;
         this.M_0 = 0;
         this.M_1 = 0;
         this.M_2 = 0;
         this.M_3 = 0;
         this.M_4 = 0;
         this.M_5 = 0.0F;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
         this.N_4 = 0.0F;
         this.N_5 = 0.0F;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0F;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_3 = 0;
         this.u_4 = 0;
      }
   }

   public class09057 N(class09057 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return this.N(var1, null, var2, var3, var4, var5, var6, var7, var8);
   }

   private class09057 N(class09057 var1, class09057 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var7 > 0 && var8 > 0) {
         this.y_5 = var1;
         this.y_6 = var2;
         this.y_3 = Math.max(1, var3);
         this.y_4 = Math.max(1, var4);
         int i = Math.min(30, var9);
         this.u(i);
         int j = class04995.N(var5, 0, (Integer)this.y_3);
         int k = class04995.N(var6, 0, (Integer)this.y_4);
         int l = class04995.N(var5 + var7, 0, (Integer)this.y_3);
         int i1 = class04995.N(var6 + var8, 0, (Integer)this.y_4);
         int j1 = l - j;
         int k1 = i1 - k;
         if (j1 > 0 && k1 > 0) {
            int l1 = this.y(j1, (Integer)this.y_3);
            int i2 = this.y(k1, (Integer)this.y_4);
            if (l1 > 0 && i2 > 0) {
               int j2 = this.N(j, l1, (Integer)this.y_3);
               int k2 = this.N(k, i2, (Integer)this.y_4);
               int l2 = j2 + l1;
               int i3 = k2 + i2;
               int j3 = this.N(l1);
               int k3 = this.N(i2);
               int l3 = this.N(var7);
               int i4 = this.N(var8);
               float f = (float)class04995.N(j - j2, 0, l1) / l1;
               float f1 = 1.0F - (float)class04995.N(l2 - l, 0, l1) / l1;
               float f2 = (float)class04995.N(i3 - i1, 0, i2) / i2;
               float f3 = 1.0F - (float)class04995.N(k - k2, 0, i2) / i2;
               this.R_1 = j3;
               this.R_2 = k3;
               this.R_3 = l3;
               this.R_4 = i4;
               this.R_5 = this.N((Integer)this.R_5, (Integer)this.R_3);
               this.y_0 = this.N((Integer)this.y_0, (Integer)this.R_4);
               this.y_1 = l1;
               this.y_2 = i2;
               this.y_7 = var7;
               this.M_0 = var8;
               this.M_1 = j - var5;
               this.M_2 = k - var6;
               this.M_3 = j1;
               this.M_4 = k1;
               this.M_5 = f;
               this.N_0 = f1;
               this.N_1 = f2;
               this.N_2 = f3;
               this.N_3 = (float)j2 / ((Integer)this.y_3).intValue();
               this.N_4 = (float)l2 / ((Integer)this.y_3).intValue();
               this.N_5 = 1.0F - (float)k2 / ((Integer)this.y_4).intValue();
               this.L_0 = 1.0F - (float)i3 / ((Integer)this.y_4).intValue();
               ((class09101)this.i_2).L(i).N((FloatBuffer)this.u_2);
               ((class09101)this.i_2).y().set(RenderSystem.getModelViewMatrix());
               this.u_4 = GL11.glGetInteger(36006);
               GL11.glGetIntegerv(2978, (int[])this.u_5);
               ((class09057)this.y_6 != null ? (class11218)this.u_1 : (class11218)this.u_0).execute((class09101)this.i_2);
               GlStateManager._glBindFramebuffer(36160, (Integer)this.u_4);
               GL11.glViewport(((int[])this.u_5)[0], ((int[])this.u_5)[1], ((int[])this.u_5)[2], ((int[])this.u_5)[3]);
               return ((class09064)this.L_3).U();
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void N(class09101 var1) {
      var1.z().setOrtho(0.0F, ((Integer)this.y_1).intValue(), ((Integer)this.y_2).intValue(), 0.0F, -1.0F, 1.0F);
      var1.y(0)
         .N(0)
         .i((Integer)this.y_1)
         .u((Integer)this.y_2)
         .u((float)((Integer)this.y_3).intValue())
         .R(((Integer)this.y_4).intValue())
         .y((Float)this.N_3)
         .N((Float)this.N_5)
         .L((Float)this.N_4)
         .i((Float)this.L_0);
   }

   public class09057 N(int var1, int var2, int var3, int var4, int var5) {
      class08844 class08844 = ((class06202)this.i_0).Nt();
      return this.N(null, null, class08844.U(), class08844.E(), var1, var2, var3, var4, var5);
   }

   public class09057 N(class09057 var1, int var2, int var3, int var4, int var5, int var6) {
      class08844 class08844 = ((class06202)this.i_0).Nt();
      return this.N(null, var1, class08844.U(), class08844.E(), var2, var3, var4, var5, var6);
   }

   private int N(int var1) {
      return Math.max(1, (var1 + 6 - 1) / 6);
   }

   private int N(int var1, int var2, int var3) {
      return var2 >= var3 ? 0 : class04995.N(this.z(var1), 0, var3 - var2);
   }

   public float N() {
      return 0.0F;
   }

   private class11218<class09101> N(class11192<class09101> var1, boolean var2) {
      class11206 class11206 = class11218.<class09101>N().N(var1).y(this::N).y((class09064)this.L_1, false).N_3(this::i).N(33984, this::M);
      if (var2) {
         class11206.N(33985, this::T);
      }

      return class11206.N((class09072)this.i_3)
         .y(this::y)
         .y((class09064)this.L_2, false)
         .N_3(this::i)
         .L((class09064)this.L_1)
         .N((class09072)this.R_0)
         .y(this::y)
         .y((class09064)this.L_1, false)
         .N_3(this::i)
         .L((class09064)this.L_2)
         .N((class09056)this.L_6)
         .y(this::u)
         .N((class09064)this.L_3, false)
         .N_3(this::L)
         .L((class09064)this.L_1)
         .N();
   }

   private int N(int var1, int var2) {
      return var2 <= var1 ? var1 : Math.max(32, (var2 + 32 - 1) / 32 * 32);
   }

   private int R(int var1) {
      return (Math.max(0, var1) + 6 - 1) / 6 * 6;
   }
}
