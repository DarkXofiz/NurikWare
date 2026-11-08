package NurikWare;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import minecraft.class01054;
import minecraft.class06202;
import minecraft.class08844;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Matrix3x2f;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.lwjgl.opengl.GL11;

public class class11749 implements class09911 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public boolean i_init;
   public static Object R_0;
   public static Object R_1;
   public static Object R_2 = class11213.N((class09087)class09063.N_5, 98304);
   public static Object R_3 = class11213.N((class09087)class09063.N_2, 4096, 1024);
   public static Object R_4 = class11213.N((class09087)class09063.N_2, 256, 6);
   public static Object R_5 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.E_1).N(4).N()).N((class11213)R_2).N(6).N();
   public static Object R_6 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.E_2).N(4).N()).N((class11213)R_2).N(6).N();
   public static Object R_7 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.E_3).N(4).N()).N((class11213)R_2).N(6).N();
   public Object M_0;
   public Object M_1;
   public Object M_2;
   public Object M_3;
   public Object M_4;
   public Object M_5;
   public Object M_6;
   public Object M_7;
   public boolean M_init;
   public Object B_0;
   public Object B_1;
   public boolean B_init;
   public static Object Z_0 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.E_4).N(4).N()).N((class11213)R_2).N(6).N();
   public static Object Z_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.R_3).N(4).N()).N((class11213)R_3).N();
   public static Object Z_2 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.Z_0).N(4).N()).N((class11213)R_3).N();
   public static Object Z_3 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.Z_2).N(4).N()).N((class11213)R_4).N();
   public static Object Z_4 = new String[8];
   public Object z_0;
   public Object z_1;
   public Object z_2;
   public Object z_3;
   public Object z_4;
   public Object z_5;
   public Object z_6;
   public boolean z_init;
   public Object U_0;
   public Object U_1;
   public Object U_2;
   public Object E_0;
   public Object E_1;
   public Object E_2;
   public boolean E_init;
   public Object W_0;
   public Object W_1;
   public Object W_2;
   public Object W_3;
   public boolean W_init;
   public Object m_0;
   public Object m_1;
   public Object m_2;
   public Object m_3;
   public static Object P_0;
   public static Object P_1;
   public static Object P_2;
   public static Object P_3;
   public static Object P_4;
   public Object s_0;
   public Object s_1;
   public Object s_2;
   public Object s_3;
   public Object s_4;
   public Object s_5;
   public Object s_6;
   public Object s_7;
   public Object T_0;
   public Object T_1;
   public Object T_2;
   public Object T_3;
   public Object T_4;
   public Object T_5;
   public Object T_6;
   public Object T_7;
   public boolean T_init;
   public Object b_0;
   public Object b_1;
   public boolean b_init;
   public static Object j_0 = LogManager.getLogger(String.class);
   public static Object j_1;
   public static Object j_2;
   public static Object j_3;

   private void w() {
      if ((Integer)this.W_1 > 0) {
         while ((Integer)this.W_1 > 0) {
            this.W_1 = (Integer)this.W_1 - 1;
            ((class11739[])this.W_2)[(Integer)this.W_1].N_0 = null;
         }

         this.T_4 = (Integer)this.T_4 + 1;
      }

      GL11.glDisable(2960);
   }

   private float L(float var1) {
      float f = (Float)this.M_4 > 0.0F ? (Float)this.M_4 : 1.0F;
      return Math.round(var1 * f) / f;
   }

   public String L() {
      return "count:" + (Integer)this.z_6 + " " + (StringBuilder)this.z_5;
   }

   @Override
   public void M() {
      if (!((Deque)this.m_1).isEmpty()) {
         this.I("spop");
         ((Deque)this.m_1).pop();
         this.I();
      }
   }

   private void Q() {
      ((Deque)this.m_1).clear();
      GL11.glDisable(3089);
   }

   public class11749(class11742 var1) {
      super();
      this.G();
      this.m_0 = class06202.Nq();
      this.m_1 = new ArrayDeque();
      this.m_2 = new Matrix3x2f().identity();
      this.m_3 = new Matrix4f();
      this.L_0 = new Vector2f();
      this.L_1 = new Vector2f();
      this.L_2 = new Vector2f();
      this.L_3 = new Vector2f();
      this.L_4 = new Vector2f();
      this.L_5 = new Vector4f();
      this.L_6 = new Vector4f();
      this.L_7 = new Vector4f();
      this.s_0 = new Vector4f();
      this.s_1 = new Vector4f();
      this.s_2 = new Vector4f();
      this.s_3 = new Vector4f();
      this.s_4 = new Vector4f();
      this.s_5 = new Vector4f();
      this.s_6 = new class11762(64);
      this.s_7 = new class11762(64);
      this.U_0 = new class11762(64);
      this.U_1 = new class11762(64);
      this.U_2 = new int[8];
      this.u_0 = new class09066();
      this.u_2 = new class11775(this, 128, 0.75F, true);
      this.T_5 = -1;
      this.W_2 = new class11739[16];
      this.W_3 = new Matrix3x2f[16];
      this.b_1 = new float[16];
      this.B_1 = 1.0F;
      this.i_0 = 1.0F;
      this.i_1 = 1.0F;
      this.z_3 = new class11746[8];
      this.z_4 = new ArrayList();
      this.z_5 = new StringBuilder();
      this.u_1 = new class11643(var1);
   }

   static {
      j();
      ((String[])Z_4)[0] = "font_in" + 0;
      ((String[])Z_4)[1] = "font_in1";
      ((String[])Z_4)[2] = "font_in2";
      ((String[])Z_4)[3] = "font_in3";
      ((String[])Z_4)[4] = "font_in4";
      ((String[])Z_4)[5] = "font_in5";
      ((String[])Z_4)[6] = "font_in6";
      ((String[])Z_4)[7] = "font_in7";
   }

   private int B() {
      return ((Integer)this.E_0 & 7) << 7;
   }

   private void I(String var1) {
      this.W(var1);
   }

   private void I() {
      if (((Deque)this.m_1).isEmpty()) {
         GL11.glDisable(3089);
      } else {
         class08844 class08844 = ((class06202)this.m_0).Nt();
         int i = Math.max(1, class08844.U());
         int j = Math.max(1, class08844.E());
         class11625 class11625 = (class11625)((Deque)this.m_1).peek();
         int k = Math.clamp((long)((int)Math.floor(class11625.L())), 0, i);
         int l = Math.clamp((long)((int)Math.floor(class11625.u())), 0, j);
         int i1 = Math.clamp((long)((int)Math.ceil(class11625.y())), 0, i);
         int j1 = Math.clamp((long)((int)Math.ceil(class11625.N())), 0, j);
         int k1 = Math.max(0, i1 - k);
         int l1 = Math.max(0, j1 - l);
         int i2 = j - j1;
         GL11.glEnable(3089);
         GL11.glScissor(k, i2, k1, l1);
      }
   }

   private int J() {
      return ((class12037)class11998.N_0).N();
   }

   private int Z(int var1) {
      return (Float)this.B_1 >= 1.0F ? var1 : class09662.N(var1, (Float)this.B_1);
   }

   @Override
   public void i() {
      float f;
      if ((Integer)this.B_0 == 0) {
         f = 1.0F;
      } else {
         float[] afloat = (float[])this.b_1;
         int i = (Integer)this.B_0 - 1;
         this.B_0 = i;
         f = afloat[i];
      }

      this.B_1 = f;
   }

   private class11599 s() {
      return (Integer)this.W_1 == 0 ? null : this.N(((class11739[])this.W_2)[(Integer)this.W_1 - 1]);
   }

   private void l() {
      if ((class09086)this.z_1 != null) {
         ((class09086)this.z_1).N(true);
      } else {
         this.d();
      }
   }

   private void d() {
      if ((class09086)this.z_0 != null) {
         ((class09086)this.z_0).N(true);
      } else {
         class11925.N(((class06202)this.m_0).e(), true);
      }
   }

   private void k() {
      if ((Integer)this.b_0 == ((Matrix3x2f[])this.W_3).length) {
         Matrix3x2f[] amatrix3x2f = new Matrix3x2f[((Matrix3x2f[])this.W_3).length * 2];
         System.arraycopy((Matrix3x2f[])this.W_3, 0, amatrix3x2f, 0, ((Matrix3x2f[])this.W_3).length);
         this.W_3 = amatrix3x2f;
      }

      Matrix3x2f matrix3x2f = ((Matrix3x2f[])this.W_3)[(Integer)this.b_0];
      if (matrix3x2f == null) {
         matrix3x2f = new Matrix3x2f();
         ((Matrix3x2f[])this.W_3)[(Integer)this.b_0] = matrix3x2f;
      }

      matrix3x2f.set((Matrix3x2f)this.m_2);
      this.b_0 = (Integer)this.b_0 + 1;
   }

   private class11599 v() {
      class11599 class11599x = null;
      if (!((Deque)this.m_1).isEmpty()) {
         class11625 class11625 = (class11625)((Deque)this.m_1).peek();
         class11599x = new class11599(class11625.L(), class11625.u(), class11625.i(), class11625.R(), new Vector4f());
      }

      for (int i = 0; i < (Integer)this.W_1; i++) {
         class11599 class11599x = this.N(((class11739[])this.W_2)[i]);
         if (class11599x != null) {
            class11599x = class11599x == null ? class11599x : class11599x.N(class11599x);
            if (class11599x == null) {
               return null;
            }
         }
      }

      return class11599x;
   }

   private void j(String var1) {
      this.z_6 = (Integer)this.z_6 + 1;
      if ((Integer)this.z_6 > 1) {
         ((StringBuilder)this.z_5).append(", ");
      }

      ((StringBuilder)this.z_5).append(var1);
   }

   private static void j() {
      j_0 = null;
      j_1 = 512;
      j_2 = 64;
      j_3 = 1.0E-4F;
      P_0 = 0.85F;
      P_1 = 1;
      P_2 = 4;
      P_3 = 8;
      P_4 = 16;
      N_0 = 32;
      N_1 = 64;
      N_2 = 1024;
      N_3 = 1;
      N_4 = 8;
      R_0 = 7;
      R_1 = 7;
      R_2 = null;
      R_3 = null;
      R_4 = null;
      R_5 = null;
      R_6 = null;
      R_7 = null;
      Z_0 = null;
      Z_1 = null;
      Z_2 = null;
      Z_3 = null;
      Z_4 = null;
   }

   private boolean U() {
      if (((Deque)this.m_1).isEmpty()) {
         return false;
      } else {
         class11625 class11625 = (class11625)((Deque)this.m_1).peek();
         return this.N(class11625.i(), class11625.R());
      }
   }

   private class09057 U(int var1) {
      if ((class09057)this.M_5 != null) {
         return (class09057)this.M_5;
      } else {
         class08844 class08844 = ((class06202)this.m_0).Nt();
         this.M_6 = Math.max(1, class08844.U());
         this.M_7 = Math.max(1, class08844.E());
         this.M_5 = this.N(0, 0, (Integer)this.M_6, (Integer)this.M_7, var1);
         this.i_0 = ((class09066)this.u_0).L() - ((class09066)this.u_0).N();
         this.i_1 = ((class09066)this.u_0).y() - ((class09066)this.u_0).u();
         if ((class09057)this.M_5 != null) {
            this.j("blur");
         }

         return (class09057)this.M_5;
      }
   }

   private void z() {
      if ((Integer)this.b_0 == 0) {
         ((Matrix3x2f)this.m_2).identity().scale((Float)this.M_4);
      } else {
         this.b_0 = (Integer)this.b_0 - 1;
         ((Matrix3x2f)this.m_2).set(((Matrix3x2f[])this.W_3)[(Integer)this.b_0]);
      }
   }

   @Override
   public void u() {
      if ((Integer)this.W_1 > 0) {
         this.W_1 = (Integer)this.W_1 - 1;
         ((class11739[])this.W_2)[(Integer)this.W_1].N_0 = null;
         this.T_4 = (Integer)this.T_4 + 1;
      }
   }

   private boolean u(int var1) {
      if (var1 <= 0) {
         return false;
      } else {
         this.E_0 = this.N((int[])this.U_2, var1);
         return (Boolean)this.M_2;
      }
   }

   public class01054 y() {
      return (class01054)this.i_2;
   }

   private void y(class09322 var1) {
      int i = (class09057)this.M_5 != null ? ((class09057)this.M_5).i() : this.J();
      var1.M("blur_in").N(33992, i);
      class08844 class08844 = ((class06202)this.m_0).Nt();
      var1.R("u_blur_size").N(Math.max(1, class08844.U()), Math.max(1, class08844.E()));
      var1.R("u_blur_uv_scale").N((Float)this.i_0, (Float)this.i_1);
   }

   private void y(boolean var1) {
      if ((Boolean)this.M_1 != var1) {
         this.W("clip");
         this.M_1 = var1;
      }
   }

   private void y(float var1) {
      float f = ((Vector2f)this.L_2).x - ((Vector2f)this.L_1).x;
      float f1 = ((Vector2f)this.L_2).y - ((Vector2f)this.L_1).y;
      float f2 = f * f + f1 * f1;
      if (f2 > 1.0E-4F) {
         float f3 = (float)(1.0 / Math.sqrt(f2));
         f *= f3;
         f1 *= f3;
      }

      float f10 = ((Vector2f)this.L_4).x - ((Vector2f)this.L_1).x;
      float f4 = ((Vector2f)this.L_4).y - ((Vector2f)this.L_1).y;
      float f5 = f10 * f10 + f4 * f4;
      if (f5 > 1.0E-4F) {
         float f6 = (float)(1.0 / Math.sqrt(f5));
         f10 *= f6;
         f4 *= f6;
      }

      float f11 = f * var1;
      float f7 = f1 * var1;
      float f8 = f10 * var1;
      float f9 = f4 * var1;
      ((Vector2f)this.L_1).set(((Vector2f)this.L_1).x - f11 - f8, ((Vector2f)this.L_1).y - f7 - f9);
      ((Vector2f)this.L_2).set(((Vector2f)this.L_2).x + f11 - f8, ((Vector2f)this.L_2).y + f7 - f9);
      ((Vector2f)this.L_3).set(((Vector2f)this.L_3).x + f11 + f8, ((Vector2f)this.L_3).y + f7 + f9);
      ((Vector2f)this.L_4).set(((Vector2f)this.L_4).x - f11 + f8, ((Vector2f)this.L_4).y - f7 + f9);
   }

   private boolean E(int var1) {
      return var1 >>> 24 != 0;
   }

   private void E() {
      if ((Integer)this.T_4 == (Integer)this.T_5) {
         this.E_1 = (Integer)this.T_6;
         this.E_2 = (Integer)this.T_7;
         this.M_0 = (Integer)this.W_0;
         ((Vector4f)this.s_0).set((Vector4f)this.s_4);
         ((Vector4f)this.s_1).set((Vector4f)this.s_5);
      } else {
         this.E_1 = 0;
         this.E_2 = 0;
         this.M_0 = 0;
         ((Vector4f)this.L_6).set(0.0F);
         ((Vector4f)this.L_7).set(0.0F);
         ((Vector4f)this.s_0).set(0.0F);
         ((Vector4f)this.s_1).set(0.0F);
         this.N((class11762)this.U_0, (class11762)this.U_1);
         if (((class11762)this.U_0).isEmpty()) {
            this.y(false);
         } else if (((class11762)this.U_0).size() == 1) {
            this.y(false);
            this.E_2 = 1;
            this.M_0 = 64;
            ((Vector4f)this.s_0).set((Vector4fc)((class11762)this.U_0).getFirst());
            ((Vector4f)this.s_1).set((Vector4fc)((class11762)this.U_1).getFirst());
         } else {
            if (((class11762)this.U_0).size() > 64) {
               ((Logger)j_0).warn("UI shader clip stack overflow: {} clips, max {}", ((class11762)this.U_0).size(), 64);

               while (((class11762)this.U_0).size() > 64) {
                  ((class11762)this.U_0).removeLast();
                  ((class11762)this.U_1).removeLast();
               }
            }

            this.y(true);
            if (((class11762)this.s_6).size() + ((class11762)this.U_0).size() > 64) {
               this.W("clip");
            }

            this.E_1 = ((class11762)this.s_6).size();
            this.E_2 = ((class11762)this.U_0).size();

            for (int i = 0; i < (Integer)this.E_2; i++) {
               ((class11762)this.s_6).N(((class11762)this.U_0).get(i));
               ((class11762)this.s_7).N(((class11762)this.U_1).get(i));
            }
         }

         this.T_5 = (Integer)this.T_4;
         this.T_6 = (Integer)this.E_1;
         this.T_7 = (Integer)this.E_2;
         this.W_0 = (Integer)this.M_0;
         ((Vector4f)this.s_4).set((Vector4f)this.s_0);
         ((Vector4f)this.s_5).set((Vector4f)this.s_1);
      }
   }

   private class11599 N(class11739 var1) {
      return !this.N((class09926)var1.N_0, (Matrix3x2f)var1.N_1, (Vector4f)this.s_2, (Vector4f)this.s_3)
         ? null
         : new class11599((Vector4f)this.s_2, (Vector4f)this.s_3);
   }

   private void N(class09086 var1, class09086 var2, float var3) {
      if ((Integer)this.z_2 == ((class11746[])this.z_3).length) {
         class11746[] aclass11746 = new class11746[((class11746[])this.z_3).length * 2];
         System.arraycopy((class11746[])this.z_3, 0, aclass11746, 0, ((class11746[])this.z_3).length);
         this.z_3 = aclass11746;
      }

      class11746 class11746 = ((class11746[])this.z_3)[(Integer)this.z_2];
      if (class11746 == null) {
         class11746 = new class11746();
         ((class11746[])this.z_3)[(Integer)this.z_2] = class11746;
      }

      class11746.N_0 = var1;
      class11746.N_1 = var2;
      class11746.N_2 = var3;
      this.z_2 = (Integer)this.z_2 + 1;
   }

   public void N(class01054 var1, class09936 var2, float var3) {
      this.i_2 = var1;

      try {
         this.M_4 = var3;
         this.E_0 = 0;
         this.M_1 = false;
         this.M_5 = null;
         this.M_6 = 0;
         this.M_7 = 0;
         this.i_0 = 1.0F;
         this.i_1 = 1.0F;
         Arrays.fill((int[])this.U_2, 0);
         ((class11762)this.s_6).clear();
         ((class11762)this.s_7).clear();
         this.w();
         this.Q();
         this.Y();
         this.z_6 = 0;
         ((StringBuilder)this.z_5).setLength(0);
         this.b_0 = 0;
         this.B_0 = 0;
         this.B_1 = 1.0F;
         ((Matrix3x2f)this.m_2).identity().scale((Float)this.M_4);
         ((class11643)this.u_1).y();
         class09923.N(var2.y(), this);
         this.I("ui");
         this.w();
         this.Q();
         this.Y();
      } finally {
         this.i_2 = null;
      }
   }

   private int N(int[] var1, int var2) {
      this.M_2 = false;

      for (int i = 0; i < var1.length; i++) {
         if (var1[i] == var2) {
            return i;
         }
      }

      for (int j = 0; j < var1.length; j++) {
         if (var1[j] == 0) {
            var1[j] = var2;
            return j;
         }
      }

      if (((class11213)R_2).M().i() > 0) {
         this.W("tex");
         this.M_2 = true;
      }

      Arrays.fill(var1, 0);
      var1[0] = var2;
      return 0;
   }

   private void N(Vector4fc var1, float var2, float var3, float var4, Vector4f var5) {
      float f = Math.max(0.0F, var1.x() * var4);
      float f1 = Math.max(0.0F, var1.y() * var4);
      float f2 = Math.max(0.0F, var1.z() * var4);
      float f3 = Math.max(0.0F, var1.w() * var4);
      float f4 = 1.0F;
      f4 = this.N(f4, var2, f3 + f2);
      f4 = this.N(f4, var2, f1 + f);
      f4 = this.N(f4, var3, f3 + f1);
      f4 = this.N(f4, var3, f2 + f);
      var5.set(f * f4, f1 * f4, f2 * f4, f3 * f4);
   }

   private void N(Matrix3x2f var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11) {
      this.E();
      if (this.u(var11)) {
         this.E();
      }

      this.N(var1, var2, var3, var4, var5);
      class11176.N(
         (class11213)R_2,
         (Vector2f)this.L_1,
         (Vector2f)this.L_2,
         (Vector2f)this.L_3,
         (Vector2f)this.L_4,
         var10,
         var6,
         var7,
         var8,
         var9,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0,
         0,
         (Integer)this.E_1,
         (Integer)this.E_2,
         (Vector4f)this.s_0,
         (Vector4f)this.s_1,
         1 | (Integer)this.M_0 | this.B()
      );
   }

   private void N(Matrix3x2f var1, float var2, float var3, Vector2f var4) {
      var4.set(var2, var3);
      var1.transformPosition(var4);
   }

   @Override
   public void N(float var1, float var2, float var3, float var4) {
      class11625 class11625x = this.N(var1, var2, var3, var4, (Matrix3x2f)this.m_2);
      if (!((Deque)this.m_1).isEmpty()) {
         class11625 class11625x = ((class11625)((Deque)this.m_1).peek()).N(class11625x);
         class11625x = class11625x == null ? new class11625(0.0F, 0.0F, 0.0F, 0.0F) : class11625x;
      }

      this.I("spush");
      ((Deque)this.m_1).push(class11625x);
      this.I();
   }

   private void N(class09057 var1, float var2) {
      this.N(var1, var2, 0.0F, 1.0F, 1.0F, 0.0F);
   }

   private void N(
      Matrix3x2f var1, float var2, float var3, float var4, float var5, Vector4fc var6, int var7, float var8, int var9, int var10, float var11, int var12
   ) {
      this.E();
      this.N(var1, var2, var3, var4, var5);
      float f = ((Vector2f)this.L_1).distance((Vector2f)this.L_2);
      float f1 = ((Vector2f)this.L_1).distance((Vector2f)this.L_4);
      if (!(f <= 1.0E-4F) && !(f1 <= 1.0E-4F)) {
         float f2 = var4 <= 1.0E-4F ? 1.0F : f / var4;
         float f3 = var5 <= 1.0E-4F ? 1.0F : f1 / var5;
         float f4 = Math.min(f2, f3);
         float f5 = Math.max(0.0F, var8 * f4);
         float f6 = Math.max(0.0F, var11 * f4);
         this.N(var6, f, f1, f4, (Vector4f)this.L_5);
         float f7 = 0.0F;
         if ((var12 & 16) != 0) {
            f7 = f6 * 0.85F;
         }

         if (f7 > 0.0F) {
            this.y(f7);
         }

         class11176.N(
            (class11213)R_2,
            (Vector2f)this.L_1,
            (Vector2f)this.L_2,
            (Vector2f)this.L_3,
            (Vector2f)this.L_4,
            var7,
            ((Vector4f)this.L_5).z(),
            ((Vector4f)this.L_5).w(),
            ((Vector4f)this.L_5).y(),
            ((Vector4f)this.L_5).x(),
            f,
            f1,
            f5,
            f6,
            var9,
            var10,
            (Integer)this.E_1,
            (Integer)this.E_2,
            (Vector4f)this.s_0,
            (Vector4f)this.s_1,
            var12 | (Integer)this.M_0
         );
      }
   }

   private void N(class09057 var1, class09888 var2, float var3) {
      class08844 class08844 = ((class06202)this.m_0).Nt();
      int i = Math.max(1, class08844.U());
      int j = Math.max(1, class08844.E());
      int k = Math.max(1, Math.round(var2.y() * (Float)this.M_4));
      class09057 class09057 = this.N(var1, i, j, 0, 0, i, j, k);
      if (class09057 == null) {
         this.N(var1, var3);
      } else {
         this.N(class09057, var3, ((class09066)this.u_0).N(), ((class09066)this.u_0).y(), ((class09066)this.u_0).L(), ((class09066)this.u_0).u());
      }
   }

   private void N(class09891 var1) {
      if (!this.U()) {
         this.N((class11762)this.U_0, (class11762)this.U_1);
         class11599 class11599x = this.s();
         class11599 class11599x = this.v();
         this.I("cflush");
         class11625 class11625 = this.N(var1.y(), var1.L(), var1.u(), var1.i(), (Matrix3x2f)this.m_2);
         class11620.N((class11762)this.U_0, (class11762)this.U_1, class11599x, class11599x);
         class08844 class08844 = ((class06202)this.m_0).Nt();

         try {
            var1.N()
               .render(
                  new class09912(
                     class11625.L(), class11625.u(), class11625.i(), class11625.R(), Math.max(1, class08844.U()), Math.max(1, class08844.E()), (Float)this.M_4
                  )
               );
         } finally {
            class11620.L();
            this.l();
         }

         this.j("canvas");
      }
   }

   private void N(class09931 var1) {
      this.N(var1.N(), var1.y(), var1.L(), var1.u(), var1.i(), var1.R(), var1.M(), var1.B());
   }

   private void N(class09322 var1, int[] var2, int var3) {
      if ((class09322)this.T_3 != var1) {
         this.T_3 = var1;
         this.T_2 = new class12026[8];
      }

      for (int i = 0; i < 8; i++) {
         class12026 class12026 = ((class12026[])this.T_2)[i];
         if (class12026 == null) {
            class12026 = var1.M(((String[])Z_4)[i]);
            ((class12026[])this.T_2)[i] = class12026;
         }

         int j = var2[i] == 0 ? var3 : var2[i];
         class12026.N(33984 + i, j);
      }
   }

   private void N(class09322 var1, List<Vector4f> var2, List<Vector4f> var3, boolean var4) {
      int i = Math.min(Math.min(var2.size(), var3.size()), 64);
      if (!var4) {
         if (i == 1) {
            Vector4f vector4f2 = (Vector4f)var2.getFirst();
            Vector4f vector4f3 = (Vector4f)var3.getFirst();
            var1.L("u_clip_flags").N(1);
            var1.N("u_clip_rect").N(vector4f2.x(), vector4f2.y(), vector4f2.z(), vector4f2.w());
            var1.N("u_clip_round").N(vector4f3.x(), vector4f3.y(), vector4f3.z(), vector4f3.w());
         } else {
            var1.L("u_clip_flags").N(0);
         }
      } else {
         if ((class09322)this.T_1 != var1) {
            this.T_1 = var1;
            this.y_3 = new class12043[64];
            this.T_0 = new class12043[64];
         }

         var1.L("u_clip_count").N(i);
         var1.L("u_clip_flags").N(0);

         for (int j = 0; j < i; j++) {
            class12043 class12043x = ((class12043[])this.y_3)[j];
            if (class12043x == null) {
               class12043x = var1.N("u_clip_rects[" + j + "]");
               ((class12043[])this.y_3)[j] = class12043x;
            }

            class12043 class12043x = ((class12043[])this.T_0)[j];
            if (class12043x == null) {
               class12043x = var1.N("u_clip_rounds[" + j + "]");
               ((class12043[])this.T_0)[j] = class12043x;
            }

            Vector4f vector4f = (Vector4f)var2.get(j);
            Vector4f vector4f1 = (Vector4f)var3.get(j);
            class12043x.N(vector4f.x(), vector4f.y(), vector4f.z(), vector4f.w());
            class12043x.N(vector4f1.x(), vector4f1.y(), vector4f1.z(), vector4f1.w());
         }
      }
   }

   private void N(Matrix3x2f var1, float var2, float var3, float var4, float var5) {
      this.N(var1, var2, var3, (Vector2f)this.L_1);
      this.N(var1, var2 + var4, var3, (Vector2f)this.L_2);
      this.N(var1, var2 + var4, var3 + var5, (Vector2f)this.L_3);
      this.N(var1, var2, var3 + var5, (Vector2f)this.L_4);
   }

   @Override
   public void N(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.k();
      ((Matrix3x2f)this.m_2).translate(var1, var2);
      if (var5 != 1.0F || var6 != 0.0F) {
         ((Matrix3x2f)this.m_2).translate(var3, var4).rotate((float)Math.toRadians(var6)).scale(var5, var5).translate(-var3, -var4);
      }
   }

   private class11625 N(float var1, float var2, float var3, float var4, Matrix3x2f var5) {
      this.N(var5, var1, var2, var3, var4);
      float f = Math.min(Math.min(((Vector2f)this.L_1).x, ((Vector2f)this.L_2).x), Math.min(((Vector2f)this.L_3).x, ((Vector2f)this.L_4).x));
      float f1 = Math.min(Math.min(((Vector2f)this.L_1).y, ((Vector2f)this.L_2).y), Math.min(((Vector2f)this.L_3).y, ((Vector2f)this.L_4).y));
      float f2 = Math.max(Math.max(((Vector2f)this.L_1).x, ((Vector2f)this.L_2).x), Math.max(((Vector2f)this.L_3).x, ((Vector2f)this.L_4).x));
      float f3 = Math.max(Math.max(((Vector2f)this.L_1).y, ((Vector2f)this.L_2).y), Math.max(((Vector2f)this.L_3).y, ((Vector2f)this.L_4).y));
      return new class11625(f, f1, f2, f3);
   }

   private void N(class09057 var1, float var2, float var3, float var4, float var5, float var6) {
      this.N(var1, var2, var3, var4, var5, var6, RenderSystem.getModelViewMatrix());
   }

   @Override
   public boolean N(class09916 var1, class09914 var2) {
      if (var1 != null && !var1.N()) {
         this.I("lbegin");
         class09086 class09086 = this.R((Integer)this.z_2);
         this.N(class09086, (class09086)this.z_1, (Float)this.B_1);
         this.z_1 = class09086;
         this.B_1 = 1.0F;
         class09086.N(true);
         GL11.glDisable(3089);
         GL11.glColorMask(true, true, true, true);
         GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
         class09086.N(true, false);
         this.I();
         return true;
      } else {
         return false;
      }
   }

   private void N(class09902 var1) {
      this.N(var1.N(), var1.y(), var1.L(), var1.u(), var1.i(), var1.R(), 0, 0.0F);
   }

   private void N(class09906 var1) {
      float f = var1.u();
      float f1 = var1.i();
      if (!this.N(f, f1) && !this.U() && this.E(var1.R())) {
         class11596 class11596 = ((class11643)this.u_1).N(var1.N());
         if (class11596.Z()) {
            int i = this.Z(var1.R());
            class09689 class09689 = var1.M();
            float f2 = class11596.z();
            float f3 = class11596.i();
            float f4 = class11596.L();
            float f5 = class11596.R();
            float f6;
            float f7;
            float f8;
            float f9;
            if (class09689 != null && !class09689.N()) {
               f6 = f2 + (f4 - f2) * class09689.y();
               f7 = f3 + (f5 - f3) * class09689.L();
               f8 = f2 + (f4 - f2) * class09689.u();
               f9 = f3 + (f5 - f3) * class09689.i();
            } else {
               f6 = f2;
               f7 = f3;
               f8 = f4;
               f9 = f5;
            }

            switch (((int[])class11744.N_0)[class11596.U().ordinal()]) {
               case 1:
                  float f10 = class11596.N();
                  float f11 = f1 <= 1.0E-4F ? 1.0F : f / f1;
                  float f12;
                  float f13;
                  if (f10 >= f11) {
                     f12 = f;
                     f13 = f10 <= 1.0E-4F ? f1 : f / f10;
                  } else {
                     f13 = f1;
                     f12 = f1 * f10;
                  }

                  float f14 = var1.y() + (f - f12) * 0.5F;
                  float f15 = var1.L() + (f1 - f13) * 0.5F;
                  float f16 = Math.max(class11596.M(), 1.0F);
                  this.N(
                     (Matrix3x2f)this.m_2,
                     f14,
                     f15,
                     f12,
                     f13,
                     f6,
                     f7,
                     f8,
                     f9,
                     i,
                     class11596.u(),
                     f16 / Math.max(1, class11596.y()),
                     f16 / Math.max(1, class11596.B())
                  );
                  break;
               case 2:
                  this.N((Matrix3x2f)this.m_2, var1.y(), var1.L(), f, f1, f6, f7, f8, f9, i, class11596.u());
            }
         }
      }
   }

   public int N() {
      return (Integer)this.z_6;
   }

   private void N(String var1, float var2, float var3, int var4, float var5, class09838 var6, int var7, float var8) {
      if (var1 != null && !var1.isEmpty() && !this.U() && this.E(var4)) {
         class09093 class09093 = class09080.N(var6.N());
         if (class09093 != null) {
            class09093.u();
            class09079 class09079 = class09079.N(var6.y()).orElse(class09079.REGULAR);
            boolean flag = var6.L() == class09870.ITALIC;
            class11768 class11768 = new class11768(var1, var6.N(), class09079, flag, var5, (Float)this.M_4);
            List list = (List)((LinkedHashMap)this.u_2).get(class11768);
            float f = this.L(var2);
            float f1 = this.L(var3);
            int i = this.Z(var4);
            int j = this.Z(var7);
            float f2 = var8 > 0.0F && this.E(j) ? var8 * (Float)this.M_4 : 0.0F;
            if (list != null && N(class09093, list)) {
               for (class11728 class11728 : list) {
                  this.N(class09093, class11728, f, f1, i, j, f2);
               }
            } else {
               ArrayList arraylist = new ArrayList(var1.length());
               boolean flag1 = class09093.N(
                  var1,
                  0.0F,
                  0.0F,
                  var5,
                  (Float)this.M_4,
                  class09079,
                  flag,
                  i,
                  var8x -> {
                     class11728 class11728x = new class11728(
                        var8x.m(), var8x.b(), var8x.s(), var8x.N(), var8x.L(), var8x.z(), var8x.i(), var8x.R(), var8x.j(), var8x.M(), var8x.W(), var8x.y()
                     );
                     arraylist.add(class11728x);
                     this.N(class09093, class11728x, f, f1, i, j, f2);
                  }
               );
               if (flag1) {
                  ((LinkedHashMap)this.u_2).put(class11768, arraylist);
               }
            }
         }
      }
   }

   private void N(class09093 var1, class11728 var2, float var3, float var4, int var5, int var6, float var7) {
      int i = var1.u(var2.R());
      this.E();
      if (this.u(i)) {
         this.E();
      }

      float f = var2.Z() + var3;
      float f1 = var2.U() + var4;
      float f2 = var2.N() + var3;
      float f3 = var2.E() + var4;
      this.N((Matrix3x2f)this.m_2, f, f1, f2 - f, f3 - f1);
      float f4 = var2.y() / Math.max(1, var2.B());
      float f5 = var2.y() / Math.max(1, var2.z());
      int j = var7 > 0.0F && this.E(var6) ? 8 : 0;
      class11176.N(
         (class11213)R_2,
         (Vector2f)this.L_1,
         (Vector2f)this.L_2,
         (Vector2f)this.L_3,
         (Vector2f)this.L_4,
         var5,
         var2.M(),
         var2.u(),
         var2.i(),
         var2.L(),
         f4,
         f5,
         var6,
         var7,
         (Integer)this.E_1,
         (Integer)this.E_2,
         (Vector4f)this.s_0,
         (Vector4f)this.s_1,
         32 | j | (Integer)this.M_0 | this.B()
      );
   }

   private float N(float var1, float var2, float var3) {
      return var3 <= 1.0E-4F ? var1 : Math.min(var1, Math.min(1.0F, var2 / var3));
   }

   @Override
   public void N(class09926 var1) {
      if ((Integer)this.W_1 == ((class11739[])this.W_2).length) {
         class11739[] aclass11739 = new class11739[((class11739[])this.W_2).length * 2];
         System.arraycopy((class11739[])this.W_2, 0, aclass11739, 0, ((class11739[])this.W_2).length);
         this.W_2 = aclass11739;
      }

      class11739 class11739 = ((class11739[])this.W_2)[(Integer)this.W_1];
      if (class11739 == null) {
         class11739 = new class11739();
         ((class11739[])this.W_2)[(Integer)this.W_1] = class11739;
      }

      class11739.N_0 = var1;
      ((Matrix3x2f)class11739.N_1).set((Matrix3x2f)this.m_2);
      this.W_1 = (Integer)this.W_1 + 1;
      this.T_4 = (Integer)this.T_4 + 1;
   }

   private boolean N(float var1, float var2) {
      return var1 <= 1.0E-4F || var2 <= 1.0E-4F;
   }

   private void N(class09925 var1) {
      float f = var1.L();
      float f1 = var1.u();
      if (!this.N(f, f1) && !this.U()) {
         int i = this.Z(var1.R());
         int j = this.Z(var1.M());
         int k = this.Z(var1.z());
         byte b0 = 4;
         boolean flag = this.E(i);
         if (var1.B() > 1.0E-4F && this.E(j)) {
            b0 |= 8;
         }

         if (var1.U() > 1.0E-4F) {
            b0 |= 16;
         }

         if (flag || (b0 & 24) != 0) {
            this.N((Matrix3x2f)this.m_2, var1.N(), var1.y(), f, f1, var1.i(), i, var1.B(), j, k, var1.U(), b0);
         }
      }
   }

   private void N(
      Matrix3x2f var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      float var12,
      float var13
   ) {
      this.E();
      if (this.u(var11)) {
         this.E();
      }

      this.N(var1, var2, var3, var4, var5);
      class11176.N(
         (class11213)R_2,
         (Vector2f)this.L_1,
         (Vector2f)this.L_2,
         (Vector2f)this.L_3,
         (Vector2f)this.L_4,
         var10,
         var6,
         var7,
         var8,
         var9,
         var12,
         var13,
         0,
         0.0F,
         (Integer)this.E_1,
         (Integer)this.E_2,
         (Vector4f)this.s_0,
         (Vector4f)this.s_1,
         32 | (Integer)this.M_0 | this.B()
      );
   }

   public void N(class01054 var1, class09936 var2, float var3, class09086 var4) {
      this.z_0 = var4;

      try {
         if (var4 != null) {
            var4.N(true);
            GL11.glColorMask(true, true, true, true);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            var4.N(true, false);
         }

         this.N(var1, var2, var3);
      } finally {
         this.z_0 = null;
      }
   }

   @Override
   public void N(class09924 var1) {
      switch (var1) {
         case class09906 class09906:
            this.N(class09906);
            break;
         case class09902 class09902:
            this.N(class09902);
            break;
         case class09931 class09931:
            this.N(class09931);
            break;
         case class09925 class09925:
            this.N(class09925);
            break;
         case class09907 class09907:
            this.N(class09907);
            break;
         case class09891 class09891:
            this.N(class09891);
            break;
         default:
            throw new MatchException(null, null);
      }
   }

   private void N(class09057 var1, float var2, float var3, float var4, float var5, float var6, Matrix4f var7) {
      if (var1 != null) {
         int i = Math.round(Math.clamp(var2, 0.0F, 1.0F) * 255.0F);
         if (i > 0) {
            int j = i << 24 | i << 16 | i << 8 | i;
            class08844 class08844 = ((class06202)this.m_0).Nt();
            int k = Math.max(1, class08844.U());
            int l = Math.max(1, class08844.E());
            class11176.N((class11213)R_4, 0.0F, 0.0F, k, l, var3, var4, var5, var6, j);
            ((class11174)Z_3).N(var2x -> {
               var2x.z("u_projection").N(class11925.L());
               var2x.z("u_view").N(var7);
               var2x.M("texture_in").N(var1);
            });
            this.j("comp");
         }
      }
   }

   private class09057 N(int var1, int var2, int var3, int var4, int var5) {
      this.W();

      class09057 class09057;
      try {
         class09057 = (class09086)this.z_0 != null
            ? ((class09066)this.u_0).N(((class09086)this.z_0).N(), var1, var2, var3, var4, var5)
            : ((class09066)this.u_0).N(var1, var2, var3, var4, var5);
      } finally {
         this.I();
      }

      return class09057;
   }

   @Override
   public void N(class09914 var1) {
      if ((Integer)this.z_2 != 0) {
         this.I("lend");
         class11746[] aclass11746 = (class11746[])this.z_3;
         int i = (Integer)this.z_2 - 1;
         this.z_2 = i;
         class11746 class11746 = aclass11746[i];
         class09057 class09057 = ((class09086)class11746.N_0).N();
         this.z_1 = (class09086)class11746.N_1;
         this.B_1 = (Float)class11746.N_2;
         this.l();
         this.I();
         switch (var1) {
            case class09932 class09932:
               this.N(class09057, class09932.y() * (Float)this.B_1);
               break;
            case class09888 class09888:
               this.N(class09057, class09888, (Float)this.B_1);
               break;
            case class09901 class09901:
               this.N(class09057, class09901, (Float)this.B_1);
               break;
            default:
               throw new MatchException(null, null);
         }
      }
   }

   @Override
   public void N(float var1) {
      if ((Integer)this.B_0 == ((float[])this.b_1).length) {
         this.b_1 = Arrays.copyOf((float[])this.b_1, ((float[])this.b_1).length * 2);
      }

      float[] afloat = (float[])this.b_1;
      int i = (Integer)this.B_0;
      this.B_0 = i + 1;
      afloat[i] = (Float)this.B_1;
      this.B_1 = (Float)this.B_1 * Math.clamp(var1, 0.0F, 1.0F);
   }

   public void N(boolean var1) {
      this.M_3 = var1;
   }

   private void N(class09322 var1, List<Vector4f> var2, List<Vector4f> var3) {
      if ((class09322)this.y_2 != var1) {
         this.y_2 = var1;
         this.y_0 = new class12043[64];
         this.y_1 = new class12043[64];
      }

      int i = var2.size();

      for (int j = 0; j < i; j++) {
         class12043 class12043x = ((class12043[])this.y_0)[j];
         if (class12043x == null) {
            class12043x = var1.N("u_clip_rects[" + j + "]");
            ((class12043[])this.y_0)[j] = class12043x;
         }

         class12043 class12043x = ((class12043[])this.y_1)[j];
         if (class12043x == null) {
            class12043x = var1.N("u_clip_rounds[" + j + "]");
            ((class12043[])this.y_1)[j] = class12043x;
         }

         Vector4f vector4f = (Vector4f)var2.get(j);
         Vector4f vector4f1 = (Vector4f)var3.get(j);
         class12043x.N(vector4f.x(), vector4f.y(), vector4f.z(), vector4f.w());
         class12043x.N(vector4f1.x(), vector4f1.y(), vector4f1.z(), vector4f1.w());
      }
   }

   private void N(class09907 var1) {
      float f = var1.L();
      float f1 = var1.u();
      if (!this.N(f, f1) && !this.U() && !(var1.i() <= 1.0E-4F) && this.E(var1.R())) {
         class11625 class11625 = this.N(var1.N(), var1.y(), f, f1, (Matrix3x2f)this.m_2);
         float f2 = class11625.i();
         float f3 = class11625.R();
         if (!this.N(f2, f3)) {
            int i = (int)Math.floor(class11625.L());
            int j = (int)Math.floor(class11625.u());
            int k = (int)Math.ceil(class11625.y());
            int l = (int)Math.ceil(class11625.N());
            int i1 = k - i;
            int j1 = l - j;
            if (i1 > 0 && j1 > 0) {
               float f4 = f <= 1.0E-4F ? 1.0F : f2 / f;
               float f5 = f1 <= 1.0E-4F ? 1.0F : f3 / f1;
               int k1 = Math.max(1, Math.round(var1.i() * Math.min(f4, f5)));
               if (!(Boolean)this.M_3) {
                  this.N(var1.M(), f2, f3, Math.min(f4, f5), (Vector4f)this.L_5);
                  this.N((class11762)this.U_0, (class11762)this.U_1);
                  this.I("bflush");
                  class09057 class09057 = this.N(i, j, i1, j1, k1);
                  if (class09057 != null) {
                     float f6 = ((class09066)this.u_0).N();
                     float f7 = ((class09066)this.u_0).L();
                     float f8 = ((class09066)this.u_0).u();
                     float f9 = ((class09066)this.u_0).y();
                     class11176.N((class11213)R_3, i, j, i1, j1, f6, 1.0F - f9, f7, 1.0F - f8, var1.R());
                     boolean flag = ((class11762)this.U_0).size() > 1;
                     (flag ? (class11174)Z_2 : (class11174)Z_1).N(var6x -> {
                        var6x.z("u_projection").N(class11925.L());
                        var6x.z("u_view").N(RenderSystem.getModelViewMatrix());
                        var6x.M("texture_in").N(class09057);
                        var6x.R("u_size").N(f2, f3);
                        var6x.N("u_round").N(((Vector4f)this.L_5).z(), ((Vector4f)this.L_5).w(), ((Vector4f)this.L_5).y(), ((Vector4f)this.L_5).x());
                        var6x.R("u_pos").N(class11625.L(), class11625.u());
                        this.N(var6x, (class11762)this.U_0, (class11762)this.U_1, flag);
                     });
                     this.j("blur");
                  }
               } else if (this.U(k1) != null) {
                  this.N((Matrix3x2f)this.m_2, var1.N(), var1.y(), f, f1, var1.M(), var1.R(), 0.0F, 0, 0, 0.0F, 1024);
               }
            }
         }
      }
   }

   private static boolean N(class09093 var0, List<class11728> var1) {
      for (class11728 class11728 : var1) {
         if (var0.L(class11728.R()) != class11728.B() || var0.R(class11728.R()) != class11728.z()) {
            return false;
         }
      }

      return true;
   }

   private void N(class09057 var1, class09901 var2, float var3) {
      ((Vector2f)this.L_0).set(var2.y(), var2.L());
      ((Matrix3x2f)this.m_2).transformPosition((Vector2f)this.L_0);
      ((Matrix4f)this.m_3)
         .set(RenderSystem.getModelViewMatrix())
         .translate(((Vector2f)this.L_0).x, ((Vector2f)this.L_0).y, 0.0F)
         .rotateZ((float)Math.toRadians(var2.i()))
         .scale(var2.u(), var2.u(), 1.0F)
         .translate(-((Vector2f)this.L_0).x, -((Vector2f)this.L_0).y, 0.0F);
      this.N(var1, var3, 0.0F, 1.0F, 1.0F, 0.0F, (Matrix4f)this.m_3);
   }

   private class09057 N(class09057 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.W();

      class09057 class09057;
      try {
         class09057 = ((class09066)this.u_0).N(var1, var2, var3, var4, var5, var6, var7, var8);
      } finally {
         this.I();
      }

      return class09057;
   }

   private void N(class11762 var1, class11762 var2) {
      var1.clear();
      var2.clear();

      for (int i = 0; i < (Integer)this.W_1; i++) {
         class11739 class11739 = ((class11739[])this.W_2)[i];
         if (this.N((class09926)class11739.N_0, (Matrix3x2f)class11739.N_1, (Vector4f)this.L_6, (Vector4f)this.L_7)) {
            var1.N((Vector4f)this.L_6);
            var2.N((Vector4f)this.L_7);
         }
      }
   }

   private boolean N(class09926 var1, Matrix3x2f var2, Vector4f var3, Vector4f var4) {
      if (var1 instanceof class09893 class09893x) {
         class09893 class09893x = class09893x;

         try {
            f4 = class09893x.N();
         } catch (Throwable throwable4) {
            throw new MatchException(throwable4.toString(), throwable4);
         }

         float f = f4;
         class09893x = class09893x;

         try {
            f5 = class09893x.y();
         } catch (Throwable throwable3) {
            throw new MatchException(throwable3.toString(), throwable3);
         }

         f = f5;
         class09893x = class09893x;

         try {
            f6 = class09893x.L();
         } catch (Throwable throwable2) {
            throw new MatchException(throwable2.toString(), throwable2);
         }

         f = f6;
         class09893x = class09893x;

         try {
            f7 = class09893x.u();
         } catch (Throwable throwable1) {
            throw new MatchException(throwable1.toString(), throwable1);
         }

         f = f7;
         class09893x = class09893x;

         try {
            vector4fc1 = class09893x.i();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         Vector4fc vector4fc = vector4fc1;
         class11625 class11625 = this.N(f, f, f, f, var2);
         f = class11625.i();
         float f1 = class11625.R();
         if (!(f <= 1.0E-4F) && !(f1 <= 1.0E-4F)) {
            float f2 = f <= 1.0E-4F ? 1.0F : f / f;
            float f3 = f <= 1.0E-4F ? 1.0F : f1 / f;
            this.N(vector4fc, f, f1, Math.min(f2, f3), var4);
            var3.set(class11625.L(), class11625.u(), f, f1);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void W() {
      if (!((Deque)this.m_1).isEmpty()) {
         GL11.glDisable(3089);
      }
   }

   private void W(String var1) {
      if (((class11213)R_2).M().i() == 0) {
         ((class11762)this.s_6).clear();
         ((class11762)this.s_7).clear();
         this.T_5 = -1;
      } else {
         ((Boolean)this.M_3 ? ((Boolean)this.M_1 ? (class11174)Z_0 : (class11174)R_7) : ((Boolean)this.M_1 ? (class11174)R_6 : (class11174)R_5)).y(var1x -> {
            var1x.z("u_projection").N(class11925.L());
            this.N(var1x, (int[])this.U_2, this.J());
            if ((Boolean)this.M_3) {
               this.y(var1x);
            }

            if ((Boolean)this.M_1) {
               this.N(var1x, (class11762)this.s_6, (class11762)this.s_7);
            }
         });
         this.j(var1);
         ((class11762)this.s_6).clear();
         ((class11762)this.s_7).clear();
         this.T_5 = -1;
      }
   }

   private class09086 R(int var1) {
      while (((List)this.z_4).size() <= var1) {
         ((List)this.z_4).add(class09097.i(() -> ((class06202)this.m_0).e().N, () -> ((class06202)this.m_0).e().y));
      }

      return ((class09065)class09065.y_0).L((class09064)((List)this.z_4).get(var1));
   }

   @Override
   public void R() {
      this.z();
   }

   private void G() {
      if (!this.T_init) {
         this.T_init = true;
         this.T_4 = 0;
         this.T_5 = 0;
         this.T_6 = 0;
         this.T_7 = 0;
      }

      if (!this.W_init) {
         this.W_init = true;
         this.W_0 = 0;
         this.W_1 = 0;
      }

      if (!this.b_init) {
         this.b_init = true;
         this.b_0 = 0;
      }

      if (!this.B_init) {
         this.B_init = true;
         this.B_0 = 0;
         this.B_1 = 0.0F;
      }

      if (!this.E_init) {
         this.E_init = true;
         this.E_0 = 0;
         this.E_1 = 0;
         this.E_2 = 0;
      }

      if (!this.M_init) {
         this.M_init = true;
         this.M_0 = 0;
         this.M_1 = false;
         this.M_2 = false;
         this.M_3 = false;
         this.M_4 = 0.0F;
         this.M_6 = 0;
         this.M_7 = 0;
      }

      if (!this.i_init) {
         this.i_init = true;
         this.i_0 = 0.0F;
         this.i_1 = 0.0F;
      }

      if (!this.z_init) {
         this.z_init = true;
         this.z_2 = 0;
         this.z_6 = 0;
      }
   }

   private void Y() {
      this.z_2 = 0;
      this.z_1 = null;
   }
}
