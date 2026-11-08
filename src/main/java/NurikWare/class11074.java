package NurikWare;

import com.mojang.blaze3d.textures.GpuTexture;
import java.util.List;
import minecraft.class03269;
import minecraft.class03386;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;
import minecraft.class08893;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL33;

public class class11074 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public Object y_6;
   public Object y_7;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public boolean i_init;
   public static Object R_0;
   public static Object R_1 = new class09087(class09069.N(3), class09069.N(2), class09069.y(), class09069.N(2));

   private int M() {
      if ((Integer)this.N_3 == 0) {
         this.N_3 = GL33.glGenSamplers();
         GL33.glSamplerParameteri((Integer)this.N_3, 10241, 9728);
         GL33.glSamplerParameteri((Integer)this.N_3, 10240, 9728);
         GL33.glSamplerParameteri((Integer)this.N_3, 10242, 33071);
         GL33.glSamplerParameteri((Integer)this.N_3, 10243, 33071);
      }

      return (Integer)this.N_3;
   }

   public class11074() {
      super();
      this.i();
      this.y_0 = class06202.Nq();
      this.y_1 = class11213.N((class09087)R_1, 65536, 16384);
      this.y_2 = class11174.N()
         .N(
            class11204.L()
               .N(class12036.u().N((class12012)class12012.R_0).N((class12030)class12030.N_0).N((class12014)class12014.y_0).N((class11996)class11996.N_1).N())
               .N((class09322)class11185.i_3)
               .N(4)
               .N()
         )
         .N((class11213)this.y_1)
         .N();
      this.y_3 = ((class09322)class11185.i_3).z("u_projection");
      this.y_4 = ((class09322)class11185.i_3).z("u_view");
      this.y_5 = ((class09322)class11185.i_3).M("texture_in");
      this.y_6 = ((class09322)class11185.i_3).M("lightmap_in");
      this.y_7 = ((class09322)class11185.i_3).N("u_color");
      this.u_0 = new Matrix4f();
   }

   static {
      u();
   }

   private void i() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_6 = 0.0F;
      }

      if (!this.i_init) {
         this.i_init = true;
         this.i_0 = 0.0F;
         this.i_1 = 0;
         this.i_2 = 0.0F;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0.0F;
         this.L_1 = 0.0F;
         this.L_2 = 0.0F;
         this.L_3 = 0.0F;
         this.L_4 = 0.0F;
         this.L_5 = 0.0F;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
         this.N_2 = false;
         this.N_3 = 0;
      }
   }

   private int U() {
      GpuTexture gputexture = ((class03386)((class06202)this.y_0).i_5).T().N().texture();
      return gputexture instanceof class08893 ? ((class08893)gputexture).N() : 0;
   }

   private static void u() {
      R_0 = 3;
      R_1 = null;
   }

   private void y(class06889 var1) {
      float f = Math.min((float)Math.hypot(var1.M - ((class06889)this.u_4).M, var1.Z - ((class06889)this.u_4).Z) * 4.0F, 1.0F);
      this.L_5 = (Float)this.N_0;
      this.N_0 = (Float)this.N_0 + (f - (Float)this.N_0) * 0.4F;
      this.N_1 = (Float)this.N_1 + (Float)this.N_0;
   }

   public void N() {
      this.u_1 = null;
      this.u_2 = null;
      this.u_3 = null;
      this.u_4 = null;
      this.N_2 = false;
   }

   public void N(class07438 var1, class06889 var2) {
      this.u_1 = var1;
      class06889 class06889 = var2 != null ? var2 : var1.method_73189();
      this.u_3 = class06889;
      this.u_4 = class06889;
      this.u_5 = class06889;
      this.i_2 = var1.fields_4212a028292fd3c078969e3ee4c71d9e8_1;
      this.L_0 = var1.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
      this.L_1 = var1.fields_5212a028292fd3c078969e3ee4c71d9e8_0;
      this.L_2 = var1.fields_4212a028292fd3c078969e3ee4c71d9e8_2;
      this.L_3 = var1.field_6004;
      this.L_4 = var1.method_36455();
      this.u_6 = (Float)this.L_4;
      this.i_0 = (Float)this.L_2;
      this.i_1 = 0;
      class03269 class03269 = var1.fields_3212a028292fd3c078969e3ee4c71d9e8_3;
      this.L_5 = class03269.N;
      this.N_0 = class03269.y;
      this.N_1 = class03269.L;
      this.N_2 = true;
   }

   public void N(class06889 var1, float var2, float var3) {
      if ((Boolean)this.N_2 && var1 != null) {
         if (!var1.equals((class06889)this.u_5) || var2 != (Float)this.u_6 || var3 != (Float)this.i_0) {
            this.u_5 = var1;
            this.u_6 = var2;
            this.i_0 = var3;
            this.i_1 = 3;
         }

         this.u_3 = (class06889)this.u_4;
         this.i_2 = (Float)this.L_0;
         this.L_1 = (Float)this.L_2;
         this.L_3 = (Float)this.L_4;
         class06889 class06889 = (class06889)this.u_4;
         if ((Integer)this.i_1 > 0) {
            float f = 1.0F / ((Integer)this.i_1).intValue();
            class06889 = new class06889(
               ((class06889)this.u_4).M + (((class06889)this.u_5).M - ((class06889)this.u_4).M) * f,
               ((class06889)this.u_4).B + (((class06889)this.u_5).B - ((class06889)this.u_4).B) * f,
               ((class06889)this.u_4).Z + (((class06889)this.u_5).Z - ((class06889)this.u_4).Z) * f
            );
            this.L_2 = (Float)this.L_2 + class04995.R((Float)this.i_0 - (Float)this.L_2) * f;
            this.L_4 = (Float)this.L_4 + ((Float)this.u_6 - (Float)this.L_4) * f;
            this.i_1 = (Integer)this.i_1 - 1;
         }

         this.L_0 = this.N(class06889);
         this.y(class06889);
         this.u_4 = class06889;
      }
   }

   public void N(class09321 var1, int var2) {
      if ((Boolean)this.N_2) {
         float f = var1.u().N(true);
         this.N(f);
         if ((List)this.u_2 != null) {
            class06889 class06889x = var1.y().y();
            class06889 class06889x = ((class06889)this.u_3).N((class06889)this.u_4, f);
            ((Matrix4f)this.u_0)
               .translation((float)(class06889x.M - class06889x.M), (float)(class06889x.B - class06889x.B), (float)(class06889x.Z - class06889x.Z));
            class11925.N(((class06202)this.y_0).e(), true);

            for (class11904 class11904 : (List)this.u_2) {
               if (!class11904.i().isClosed() && class11904.i().texture() instanceof class08893 class08893) {
                  this.N(class11904);
                  ((class11174)this.y_2).N(var4x -> {
                     ((class12038)this.y_3).N(var1.i());
                     ((class12038)this.y_4).N(var1.N());
                     ((class12026)this.y_5).N(class08893.N());
                     GL33.glBindSampler(0, this.M());
                     ((class12026)this.y_6).N(33985, this.U());
                     GL33.glBindSampler(1, this.M());
                     ((class12043)this.y_7).N(var2);
                  });
               }
            }

            GL33.glBindSampler(0, 0);
            GL33.glBindSampler(1, 0);
         }
      }
   }

   private void N(class11904 var1) {
      class11184 class11184 = ((class11213)this.y_1).M();
      class11178 class11178 = ((class11213)this.y_1).N();
      float[] afloat = var1.M();
      float[] afloat1 = var1.u();
      int[] aint = var1.L();
      float[] afloat2 = var1.N();

      for (int i = 0; i < aint.length; i++) {
         class11184.N((Matrix4f)this.u_0, afloat[i * 3], afloat[i * 3 + 1], afloat[i * 3 + 2])
            .N(afloat1[i * 2], afloat1[i * 2 + 1])
            .y(aint[i])
            .N(afloat2[i * 2], afloat2[i * 2 + 1])
            .y();
      }

      for (int j : var1.y()) {
         class11178.N(j);
      }
   }

   private void N(float var1) {
      if ((class07438)this.u_1 != null && !((class07438)this.u_1).method_31481()) {
         float f = ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_0;
         float f1 = ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_1;
         float f2 = ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_2;
         float f3 = ((class07438)this.u_1).fields_5212a028292fd3c078969e3ee4c71d9e8_0;
         float f4 = ((class07438)this.u_1).method_36454();
         float f5 = ((class07438)this.u_1).field_5982;
         float f6 = ((class07438)this.u_1).method_36455();
         float f7 = ((class07438)this.u_1).field_6004;
         class03269 class03269 = ((class07438)this.u_1).fields_3212a028292fd3c078969e3ee4c71d9e8_3;
         float f8 = class03269.y;
         float f9 = class03269.N;
         float f10 = class03269.L;
         ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = (Float)this.L_0;
         ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_1 = (Float)this.i_2;
         ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = (Float)this.L_2;
         ((class07438)this.u_1).fields_5212a028292fd3c078969e3ee4c71d9e8_0 = (Float)this.L_1;
         ((class07438)this.u_1).method_36456((Float)this.L_2);
         ((class07438)this.u_1).field_5982 = (Float)this.L_1;
         ((class07438)this.u_1).method_36457((Float)this.L_4);
         ((class07438)this.u_1).field_6004 = (Float)this.L_3;
         class03269.y = (Float)this.N_0;
         class03269.N = (Float)this.L_5;
         class03269.L = (Float)this.N_1;

         try {
            class06889 class06889 = new class06889(
               class04995.u(var1, ((class07438)this.u_1).field_6014, ((class07438)this.u_1).method_23317()),
               class04995.u(var1, ((class07438)this.u_1).field_6036, ((class07438)this.u_1).method_23318()),
               class04995.u(var1, ((class07438)this.u_1).field_5969, ((class07438)this.u_1).method_23321())
            );
            List<class11904> list = class11890.N((class07438)this.u_1, class06889, var1);
            if (!list.isEmpty()) {
               this.u_2 = list;
            }
         } catch (Exception exception) {
         } finally {
            ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = f;
            ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_1 = f1;
            ((class07438)this.u_1).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = f2;
            ((class07438)this.u_1).fields_5212a028292fd3c078969e3ee4c71d9e8_0 = f3;
            ((class07438)this.u_1).method_36456(f4);
            ((class07438)this.u_1).field_5982 = f5;
            ((class07438)this.u_1).method_36457(f6);
            ((class07438)this.u_1).field_6004 = f7;
            class03269.y = f8;
            class03269.N = f9;
            class03269.L = f10;
         }
      }
   }

   private float N(class06889 var1) {
      double d0 = var1.M - ((class06889)this.u_4).M;
      double d1 = var1.Z - ((class06889)this.u_4).Z;
      float f = (Float)this.L_0;
      float f1 = f;
      if (d0 * d0 + d1 * d1 > 0.0025000002F) {
         f1 = (float)class04995.u(d1, d0) * (180.0F / (float)Math.PI) - 90.0F;
         float f2 = class04995.L(class04995.R((Float)this.L_2) - f1);
         if (95.0F < f2 && f2 < 265.0F) {
            f1 -= 180.0F;
         }
      }

      f += class04995.R(f1 - f) * 0.3F;
      float f3 = class04995.R((Float)this.L_2 - f);
      if (Math.abs(f3) > 50.0F) {
         f += f3 - class04995.U(f3) * 50.0F;
      }

      return f;
   }
}
