package NurikWare;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class01054;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class03063;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04790;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class08066;
import minecraft.class08133;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL13;

public class class11002 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;
   public Object N_7;
   public boolean N_init;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object u_7;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public static Object R_0;
   public static Object R_1;
   public Object M_0;
   public Object M_1;

   private static void L() {
   }

   private void L(class11257 var1) {
      int i = ((class06202)this.L_0).Nt().U();
      int j = ((class06202)this.L_0).Nt().E();
      var1.y(i).L(j).N((float)i).y((float)j);
      var1.z().set(class11925.L());
   }

   private class09064 M() {
      return class09097.N(() -> this.i(((class06202)this.L_0).e().N), () -> this.i(((class06202)this.L_0).e().y), false);
   }

   private class09064 T() {
      return class09097.L(() -> ((class06202)this.L_0).e().N / 2, () -> ((class06202)this.L_0).e().y / 2);
   }

   public class11002(EntityESP var1) {
      super();
      this.z();
      this.L_0 = class06202.Nq();
      this.L_1 = new class10203(null, 1, 1, true);
      this.L_2 = new class10203(null, 1, 1, true);
      this.L_3 = BufferUtils.createFloatBuffer(7);
      this.L_4 = class11213.N((class09087)class09063.N_2, 4096, 1024);
      this.M_0 = new class11257();
      this.M_1 = this.T();
      this.u_0 = this.M();
      this.u_1 = this.M();
      this.u_2 = class11218.<class11257>N()
         .N(new class11235((class11213)this.L_4))
         .y((class09064)this.M_1)
         .N(this::N)
         .N(new class11224((class11213)this.L_4))
         .L(((class06202)this.L_0)::e)
         .L((class09064)this.M_1)
         .N(33990, this::N)
         .N(new class11274((class11213)this.L_4, this::y))
         .L(((class06202)this.L_0)::e)
         .N(this::N)
         .N();
      this.u_4 = -1;
      this.u_5 = this.N((class09322)class11185.i_2, true);
      this.u_6 = ((class09322)class11185.i_2).z("u_projection");
      this.u_7 = ((class09322)class11185.i_2).z("u_view");
      this.i_0 = ((class09322)class11185.i_2).L("texture_in");
      this.i_1 = ((class09322)class11185.i_2).L("depth_in");
      this.i_2 = ((class09322)class11185.i_2).L("depth_entity_in");
      this.y_0 = ((class09322)class11185.i_2).R("texel_size");
      this.y_1 = ((class09322)class11185.i_2).R("near_far");
      this.y_2 = var1;
      this.y_3 = (class11535)var1.L_5;
      this.N_0 = (class11535)var1.z_0;
      class11245 class11245x = new class11245("blur", true, this::y, var0 -> {});
      class11245 class11245x = new class11245("waves", false, this::N, var0 -> {});
      this.N_6 = class11524.N(var1, "shader-effect", class11245x, class11245x);
      ((class11517)this.N_6).N(var1x -> ((class11535)this.y_3).U());
      this.N_1 = (class11507)class11524.N(var1, "glow-outline", true).N(var2x -> ((class11535)this.y_3).U() && class11245x.U());
      this.N_2 = (class11507)class11524.N(var1, "pulse", true).N(var2x -> ((class11535)this.y_3).U() && class11245.U());
      this.N_3 = (class11515)class11524.N(var1, "glow-color", -12025345).N(var1x -> ((class11535)this.y_3).U());
      this.N_5 = (class11504)class11524.N(var1, "radius", 6.0F, 6.0F, 32.0F, 1.0F).N(var2x -> class11245.U() && ((class11535)this.y_3).U());
      this.N_4 = (class11515)class11524.N(var1, "chams-color", -12025345).N(var1x -> ((class11535)this.N_0).U());
      this.u();
   }

   static {
      L();
      Z();
   }

   private static void Z() {
      R_0 = 6.0F;
      R_1 = 2;
   }

   private int i(int var1) {
      return Math.max(1, (var1 + 2 - 1) / 2);
   }

   private class11218<class11257> s() {
      int i = Math.max(1, ((class11504)this.N_5).i().intValue());
      if ((class11218)this.u_3 == null || (Integer)this.u_4 != i) {
         this.u_4 = i;
         this.u_3 = this.N(i);
      }

      return (class11218<class11257>)this.u_3;
   }

   private double j() {
      return !((class11507)this.N_2).i() ? 0.0 : -(class11938.j().y() + ((class06202)this.L_0).NK().N(true));
   }

   private void z() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_4 = 0;
      }

      if (!this.N_init) {
         this.N_init = true;
         this.N_7 = false;
      }
   }

   private void u() {
      ((FloatBuffer)this.L_3).clear();

      for (int i = 0; i <= 6.0F; i++) {
         ((FloatBuffer)this.L_3).put((float)this.N((float)i, 3.0F));
      }

      ((FloatBuffer)this.L_3).rewind();
   }

   private boolean y() {
      return ((class11507)this.N_1).i();
   }

   private void y(class01054 var1, int var2, int var3, int var4) {
      this.N(var2, var3, var4);
      ((class11218)this.u_2).execute((class11257)this.M_0);
   }

   private void N(class11174 var1, class12038 var2, class12038 var3, float var4, float var5, float var6, float var7, int var8, Consumer<class09322> var9) {
      class11176.N((class11213)this.L_4, var4, var5, 0.0F, var6, var7, var8);
      var1.N(var3x -> {
         var2.N(class11925.L());
         var3.N(RenderSystem.getModelViewMatrix());
         var9.accept(var3x);
      });
   }

   private class11257 N(int var1, int var2, int var3) {
      ((class11257)this.M_0).y(var2).L(var3).N((float)var2).y((float)var3).N(var1).u(((class11504)this.N_5).i()).N((FloatBuffer)this.L_3);
      ((class11257)this.M_0).z().set(class11925.L());
      ((class11257)this.M_0).N().set((Matrix4f)class11925.y_3);
      return (class11257)this.M_0;
   }

   private class11218<class11257> N(int var1) {
      class11187 class11187 = class11218.N();
      class11187.N(new class11243((class11213)this.L_4)).y(this::N).y(var0 -> GL13.glClearColor(-1.0F, -1.0F, -1.0F, 1.0F)).y((class09064)this.u_0).N(this::N);
      class09064[] aclass09064 = new class09064[]{(class09064)this.u_1, (class09064)this.u_0};
      int i = this.i(var1 + 2);

      int j;
      for (j = 0; i >= 1; i /= 2) {
         class09064 class09064xx = aclass09064[j % 2];
         class09064 class09064x = aclass09064[(j + 1) % 2];
         class11187.N(new class11248((class11213)this.L_4, i)).y(var0 -> GL13.glClearColor(-1.0F, -1.0F, -1.0F, 1.0F)).y(class09064xx).L(class09064x);
         j++;
      }

      class09064 class09064 = aclass09064[(j + 1) % 2];
      return class11187.N(new class11240((class11213)this.L_4, this::j)).y(this::L).L(((class06202)this.L_0)::e).L(class09064).N(33990, this::N).N();
   }

   private class11174 N(class09322 var1, boolean var2) {
      return class11174.N().N(class11204.L().N(var2 ? (class12036)class12019.N_0 : (class12036)class12019.N_3).N(var1).N(4).N()).N((class11213)this.L_4).N();
   }

   public void N(class09321 var1) {
      this.N_7 = false;
      if (((class11535)this.y_3).U() || ((class11535)this.N_0).U()) {
         class08066 class08066 = ((class06202)this.L_0).e();
         class12027.N();
         class11925.N((class08066)this.L_1, class08066.N, class08066.y);
         class11925.N((class08066)this.L_2, class08066.N, class08066.y);
         class04790 class04790 = ((class03063)((class06202)this.L_0).B_2).Z;
         class08133 class08133 = ((class03063)((class06202)this.L_0).B_2).z;
         class06959 class06959 = ((class03063)((class06202)this.L_0).B_2).B.N;
         class01422 class01422 = ((class03063)((class06202)this.L_0).B_2).u.L();
         class06889 class06889 = var1.y().y();
         class01421 class01421 = new class01421();
         class01421.L().N().mul(var1.N());
         ((class08066)this.L_2).N(class08066);
         RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(((class08066)this.L_1).L(), 0, ((class08066)this.L_1).i(), 1.0);
         class09078.N((class08066)this.L_1);

         for (class07049 class07049 : ((class03448)class06202.Nq().T_3).M()) {
            if (class11925.y(class07049)) {
               Iterator iterator = ((List)((class11523)((EntityESP)this.y_2).i_2).i()).iterator();

               while (iterator.hasNext()) {
                  if (((class11051)iterator.next()).test(class07049)) {
                     this.N_7 = true;
                     ((class11792)((class06202)this.L_0).Ng())
                        .N(
                           class07049,
                           class06959,
                           class06889.M,
                           class06889.B,
                           class06889.Z,
                           var1.u().N(((class03448)((class06202)this.L_0).T_3).method_54719().N(class07049)),
                           class01421,
                           class04790
                        );
                  }
               }
            }
         }

         class11925.N((class08066)this.L_1, true);
         class08133.N();
         class01422.u();
         class09078.L();
         class11925.N(class08066, true);
         GlStateManager._depthFunc(515);
         class12027.y();
      }
   }

   public void N(class01054 var1) {
      if ((Boolean)this.N_7) {
         int i = ((class06202)this.L_0).Nt().U();
         int j = ((class06202)this.L_0).Nt().E();
         int k = ((class11515)this.N_3).i();
         GlStateManager._depthMask(false);
         if (((class11535)this.y_3).U()) {
            ((class11227)((class11535)((class11517)this.N_6).i())).draw(var1, k, i, j);
         }

         class11925.N(((class06202)this.L_0).e(), true);
         if (((class11535)this.N_0).U()) {
            this.N((class11174)this.u_5, (class12038)this.u_6, (class12038)this.u_7, 0.0F, 0.0F, i, j, ((class11515)this.N_4).i(), var3x -> {
               this.N(33984, class11925.N((class08066)this.L_1));
               this.N(33990, class11925.y((class08066)this.L_2));
               this.N(33991, class11925.y((class08066)this.L_1));
               ((class12003)this.i_0).N(0);
               ((class12003)this.i_1).N(6);
               ((class12003)this.i_2).N(7);
               ((class11993)this.y_0).N(3.0F / i, 3.0F / j);
               ((class11993)this.y_1).N(0.05F, ((class03386)((class06202)this.L_0).i_5).P());
            });
         }

         GlStateManager._depthMask(false);
      }
   }

   private void N(class11257 var1) {
      int i = this.i(var1.Z());
      int j = this.i(var1.i());
      var1.y(i).L(j).N((float)i).y((float)j);
      var1.z().setOrtho(0.0F, i, j, 0.0F, -1.0F, 1.0F);
   }

   private int N() {
      return class11925.N((class08066)this.L_1);
   }

   private void N(class01054 var1, int var2, int var3, int var4) {
      this.N(var2, var3, var4).u(((class11504)this.N_5).i());
      this.s().execute((class11257)this.M_0);
   }

   private double N(float var1, float var2) {
      double d0 = Math.pow(var2, 2.0);
      return org.joml.Math.invsqrt((Math.PI * 2) * d0) * Math.exp(-Math.pow(var1, 2.0) / (2.0 * d0));
   }

   private void N(int var1, int var2) {
      GlStateManager._activeTexture(var1);
      GlStateManager._bindTexture(var2);
   }
}
