package NurikWare;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Stream;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class05410;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class07742;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Matrix3x2fStack;
import org.joml.Vector2i;

public class class11703 extends class11807<AutoSwap> {
   public static Object y_0 = LogManager.getLogger(String.class);
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object y_5;
   public static Object y_6;
   public static Object L_0;
   public static Object L_1 = class09211.N(-29813);
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public boolean u_init;

   private void L(int var1) {
      this.i();
      if (var1 != -1) {
         ((class11685[])this.u_0)[var1] = null;
         Path path = ((File)((class06202)super.N_0).l_1).toPath().resolve("swap-item").resolve(var1 + ".nbt");

         try {
            Files.deleteIfExists(path);
         } catch (IOException ioexception) {
         }
      }
   }

   private static void L() {
   }

   private static void P() {
      y_0 = null;
      y_1 = 140.0F;
      y_2 = 84.0F;
      y_3 = 6.0F;
      y_4 = 8.0F;
      y_5 = 1.0F;
      y_6 = 20.0F;
      L_0 = 50.0F;
      L_1 = null;
   }

   private void T() {
      this.i();

      for (class11685 class11685 : (class11685[])this.u_0) {
         if (class11685 != null) {
            class11685.N(!class11281.y(class11281.R(class11685.L())));
         }
      }
   }

   public class11703(AutoSwap var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.i();
      this.u_0 = new class11685[3];
   }

   static {
      L();
      P();
   }

   private void i() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_1 = false;
      }
   }

   private static boolean y(class11685 var0) {
      return var0 != null && !var0.N();
   }

   @Override
   public void y(Object var1) {
      this.i();
      switch (var1) {
         case class11400 class11400:
            class12002 class12002 = ((class11527)((AutoSwap)super.N_1).u_0).i();
            if (class11400.y(class12002, ((class11527)((AutoSwap)super.N_1).u_0).L())) {
               class11923.N(() -> {
                  this.i();
                  this.u_1 = true;
                  ((class06220)((class06202)super.N_0).L_2).z();
                  this.T();
               });
               class11400.N();
            } else if (class11400.N(class12002)) {
               class11923.N(() -> {
                  this.i();
                  if ((class05096)((class06202)super.N_0).v_3 == null) {
                     ((class06202)super.N_0).N(null);
                     this.u_1 = false;
                  }
               });
               class11400.N();
            } else if (class11400.y(class12002.MOUSE_2) && (Boolean)this.u_1) {
               class11400.N();
               this.N(this::L);
            }
            break;
         case class11388 class11388:
            this.u_2 = null;
            if ((Boolean)this.u_1) {
               this.N(this::N);
            }

            this.u_1 = false;
            break;
         case class10967 class10967:
            if (!(Boolean)this.u_1) {
               return;
            }

            class11925.N(((class06202)super.N_0).e(), true);
            float f8 = class11938.i().u();
            float f9 = ((class06202)super.N_0).e().N / 2.0F;
            float f = ((class06202)super.N_0).e().y / 2.0F;
            Vector2i vector2i = class11307.N(((class06220)((class06202)super.N_0).L_2).i(), ((class06220)((class06202)super.N_0).L_2).R());
            float f1 = vector2i.x - f9;
            float f2 = vector2i.y - f;
            float f3 = (float)Math.hypot(f1, f2);
            int i = ((class11685[])this.u_0).length;
            int j = -1;
            if (f3 > 50.0F * f8) {
               j = N(f1, f2, i);
            }

            if (j != -1 && y(((class11685[])this.u_0)[j])) {
               j = -1;
            }

            float f4 = f9;
            float f5 = f;
            if (f3 > 0.0F) {
               float f6 = Math.min(f3 / (182.0F * f8), 1.0F);
               float f7 = 20.0F * f8 * f6 * f6;
               f4 = Math.round(f9 - f1 / f3 * f7);
               f5 = Math.round(f - f2 / f3 * f7);
            }

            float f10 = (float) (Math.PI * 2) / i;

            for (int i1 = 0; i1 < i; i1++) {
               class11685 class11685 = ((class11685[])this.u_0)[i1];
               int k = (int)(Math.sin(i1 * f10 + f10 / 2.0F) * 140.0 * f8 + f4);
               int l = (int)(-Math.cos(i1 * f10 + f10 / 2.0F) * 140.0 * f8 + f5);
               this.N(f4, f5, i1 * f10, (i1 + 1) * f10, f8, j == i1, y(class11685));
               if (class11685 != null) {
                  Matrix3x2fStack matrix3x2fstack = class10967.N().i();
                  matrix3x2fstack.pushMatrix();
                  matrix3x2fstack.translate(k, l);
                  matrix3x2fstack.scale(3.0F * f8);
                  matrix3x2fstack.translate(-k, -l);
                  class10967.N().N(class11685.y(), k - 8, l - 8);
                  matrix3x2fstack.popMatrix();
               } else {
                  class11176.N(
                     ((class11174)class11190.y_0).u(),
                     k - 16.0F * f8,
                     l - 16.0F * f8,
                     32.0F * f8,
                     32.0F * f8,
                     0.0F,
                     0.0F,
                     1.0F,
                     1.0F,
                     j == i1 ? (Integer)class09181.N_0 : -7171438
                  );
               }
            }

            ((class11174)class11190.y_2).y(var0 -> {
               var0.z("u_projection").N(class11925.L());
               var0.z("u_view").N(RenderSystem.getModelViewMatrix());
            });
            ((class11174)class11190.y_0).N(var0 -> {
               var0.z("u_projection").N(class11925.L());
               var0.z("u_view").N(RenderSystem.getModelViewMatrix());
               var0.M("texture_in").N(((class12031)class11998.N_3).N());
            });
            break;
         case class11368 class11368:
            if ((CompletableFuture)this.u_2 != null) {
               if (class11368.L() == null) {
                  return;
               }

               class06584 class06584 = class11368.L().i();
               if (class06584.R()) {
                  return;
               }

               ((CompletableFuture)this.u_2).complete(class06584);
               class11368.N();
               ((class06202)super.N_0).N(null);
            }
            break;
         case null:
         default:
      }
   }

   private void N(Consumer<Integer> var1) {
      this.i();
      float f = ((class06202)super.N_0).e().N / 2.0F;
      float f1 = ((class06202)super.N_0).e().y / 2.0F;
      Vector2i vector2i = class11307.N(((class06220)((class06202)super.N_0).L_2).i(), ((class06220)((class06202)super.N_0).L_2).R());
      float f2 = vector2i.x - f;
      float f3 = vector2i.y - f1;
      int i = ((class11685[])this.u_0).length;
      int j = -1;
      if (Math.hypot(f2, f3) > 50.0F * class11938.i().u()) {
         j = N(f2, f3, i);
      }

      var1.accept(j);
   }

   private void N(float var1, float var2, float var3, float var4, float var5, boolean var6, boolean var7) {
      int i;
      int j;
      if (var7) {
         i = ((class09211)L_1).L();
         j = ((class09211)L_1).R();
      } else if (var6) {
         class09211 class09211 = class09211.N(class09181.N());
         i = class09211.L();
         j = class09211.R();
      } else {
         i = (Integer)class09181.L_1;
         j = (Integer)class09181.L_2;
      }

      class11176.N(((class11174)class11190.y_2).u(), var1, var2, 140.0F * var5, 84.0F * var5, var3, var4, 6.0F * var5 / 2.0F, 8.0F * var5, 1.0F, i, j);
   }

   private void N(Integer var1) {
      this.i();
      if (var1 != -1 && !y(((class11685[])this.u_0)[var1])) {
         class11685 class11685 = ((class11685[])this.u_0)[var1];
         if (class11685 != null) {
            class11938.Z()
               .N(
                  () -> ((AutoSwap)super.N_1)
                     .N(var1xx -> var1xx.filter(var1xxx -> class11685.L().test(var1xxx.N())).mapToInt(class11297::y).findFirst().orElse(-1))
               );
         } else {
            this.u_2 = new CompletableFuture();
            ((CompletableFuture)this.u_2).thenAccept(var2x -> {
               this.i();
               ((class11685[])this.u_0)[var1] = class11685.N(var2x);
               this.N(var2x, var1);
            });
            class11923.N(() -> ((class06202)super.N_0).N(new class05410((class04453)((class06202)super.N_0).T_4)));
         }
      }
   }

   @Override
   public void N() {
      this.i();
      Path path = ((File)((class06202)super.N_0).l_1).toPath().resolve("swap-item");

      for (int i = 0; i < ((class11685[])this.u_0).length; i++) {
         Path path1 = path.resolve(i + ".nbt");
         if (Files.exists(path1)) {
            try {
               ((class11685[])this.u_0)[i] = class11685.N(class11894.y(path1));
            } catch (Exception exception) {
               class11303.y(class11921.N("error-please-report").N(class06541.field_1061));
               ((Logger)y_0).error(exception, exception);
            }
         }
      }
   }

   private void N(class06584 var1, int var2) {
      try {
         File file1 = ((File)((class06202)super.N_0).l_1).toPath().resolve("swap-item").toFile();
         if (!file1.exists()) {
            Files.createDirectories(file1.toPath());
         }

         File file2 = new File(file1, var2 + ".nbt");
         class07742.y(class11894.N(var1), file2.toPath());
      } catch (IOException ioexception) {
         class11303.y(class11921.N("error-please-report").N(class06541.field_1061));
         ((Logger)y_0).error(ioexception, ioexception);
      }
   }

   private static int N(float var0, float var1, int var2) {
      return (int)Math.floor((class11908.y(Math.atan2(-var0, var1)) + 180.0F) % 360.0F / (360.0F / var2));
   }
}
