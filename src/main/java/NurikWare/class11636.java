package NurikWare;

import java.util.function.Consumer;

public class class11636 {
   private static String[] R;
   private static String[] o;
   public static Object N_0;
   public static Object N_1;
   public static Object y_0 = class09227.N(var0 -> class09991.N().u(104.0F, 6.0F).Z(999.0F).y(var0.i()));
   public static Object y_1 = class09227.N(var0 -> class09991.N().y(class09962.y(6.0F)).Z(999.0F).N(class09969.FLOATING).E(0.0F).y(var0.B()));
   public static Object y_2 = class09991.N().N(class09692.N(class09994.E((class09743)class11636.u_1), class09994.B((class09743)class11636.u_1)));
   public static Object y_3 = class09227.N(var0 -> class09991.N().u(16.0F, 10.0F).Z(999.0F).N(class09969.FLOATING).N(-8.0F, -2.0F).y(var0.N()));
   public static Object y_4;
   public static Object y_5;
   public static Object L_0;
   public static Object L_1;
   public static Object u_0;
   public static Object u_1 = new class11863(360.0F, 27.0F, 1.0F, 0.1F, 2.0F, 0.008333334F);
   public static Object u_2 = class09991.N().N(class09962.N()).B(12.0F).y(class09973.CENTER).y(class09962.y(26.0F));
   public static Object u_3 = class09991.N().N(class09962.N()).y(class09973.CENTER).y(class09962.y(26.0F));
   public static Object i_0 = new class11636()::N;
   public static Object i_1;
   public static Object i_2;
   public static Object i_3;
   public static Object i_4;

   private static void L() {
      i_1 = 104.0F;
      i_2 = 6.0F;
      i_3 = 16;
      i_4 = 10;
      N_0 = -8.0F;
      N_1 = -2.0F;
      L_0 = 4.0F;
      L_1 = 999;
      u_0 = 1.0E-4F;
   }

   private class11636() {
      super();
   }

   static {
      N();
      y();
      L();
      class09991 class09991x = class09991.N()
         .u(40.0F, 26.0F)
         .y((Integer)class09181.L_1)
         .z(1.0F)
         .u((Integer)class09181.y_1)
         .i((Integer)class09181.N_4)
         .y(class09973.CENTER)
         .N(class09973.CENTER)
         .u(2.0F)
         .i(2.0F)
         .Z(8.0F)
         .N(class09692.N(class09994.L((class09743)class11644.N_0)));
      y_4 = class09991.N(class09991x.u(var0 -> var0.i((Integer)class09181.N_0)), class09221.N(14, class09079.REGULAR));
      class09991 class09991x = class09991.N();
      y_5 = class09991.N((class09991)y_4, class09991x.i((Integer)class09181.N_0));
   }

   private static void y() {
      o = new String[5];
      o[0] = "rangeSliderDrag";
      o[1] = "rangeSliderMinValue";
      o[2] = "rangeSliderMaxValue";
      o[3] = "rangeSliderActiveThumb";
      o[4] = "rangeSliderPointerDownX";
      R = new String[5];
      R[0] = "rangeSliderDragOffset";
      R[1] = "rangeSliderClickAnimating";
      R[2] = "rangeSliderMinInputText";
      R[3] = "rangeSliderMaxInputText";
      R[4] = "";
   }

   private float y(float var1, class11871 var2) {
      return Math.clamp((var1 - var2.u()) / var2.L(), 0.0F, 1.0F);
   }

   private float y(float var1, float var2) {
      return Math.clamp(var1 / var2, 0.0F, 1.0F);
   }

   private class09991 N(class09211 var1, float var2, float var3, boolean var4) {
      float f = Math.clamp(Math.min(var2, var3), 0.0F, 1.0F);
      float f1 = Math.clamp(Math.max(var2, var3), 0.0F, 1.0F);
      class09991 class09991 = class09991.N(((class09227)y_1).N(var1), class09991.N().N(class09962.y((f1 - f) * 104.0F)).U(f * 104.0F));
      if (!var4) {
         class09991 = class09991.N(class09991, (class09991)y_2);
      }

      return class09991;
   }

   private void N(
      Consumer<Consumer<class09814>> var1,
      class11871 var2,
      class09785<Boolean> var3,
      class09785<Float> var4,
      class09785<Float> var5,
      class09785<class11604> var6,
      class09785<String> var7,
      boolean var8
   ) {
      var1.accept(
         var8x -> {
            String s = this.N(var2);
            class11604 class11604 = var8
               ? class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0
               : class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1;
            float f = var3.L() ? this.N(var8 ? (Float)var4.L() : (Float)var5.L(), var2) : (var8 ? var2.B().N() : var2.B().L());
            var8x.L(var7.L() != null ? (String)var7.L() : class11602.N(f, s));
            var8x.N(var2.i().L() && var6.L() == class11604 ? (class09991)y_5 : (class09991)y_4);
            var8x.N(class09867.INPUT, var2xx -> {
               class09844 class09844 = (class09844)var2xx;
               String sx = class09844.y();
               var7.N(sx);
               String s1 = class11602.N(sx, s);
               if (!class11602.N(s1)) {
                  try {
                     Float.parseFloat(s1);
                  } catch (NumberFormatException numberformatexception) {
                     var7.N(class09844.N());
                     class09844.b();
                     class09844.j();
                     var2xx.z().N(class09844.N());
                  }
               }
            });
            var8x.N(class09867.BLUR, var7xx -> {
               String s1 = class11602.N(var7xx.z().B(), s);
               var7.N(null);
               if (!s1.isBlank() && !class11602.N(s1)) {
                  try {
                     this.N(Float.parseFloat(s1), var2, var4, var5, var8);
                  } catch (NumberFormatException numberformatexception) {
                  }
               } else {
                  this.N(var8 ? var2.u() : var2.N(), var2, var4, var5, var8);
               }
            });
            var8x.N(class09867.WHEEL, var6xx -> {
               if (var6xx.z().W()) {
                  class09837 class09837 = (class09837)var6xx;
                  var6xx.T();
                  var6xx.j();
                  float fx = this.N(var8 ? (Float)var4.L() : (Float)var5.L(), var2);
                  this.N(fx + Math.signum(class09837.L()) * var2.M(), var2, var4, var5, var8);
                  var7.N(null);
               }
            });
         }
      );
   }

   private class11604 N(float var1, class09785<Float> var2, class09785<Float> var3) {
      float f = Math.abs(var1 - (Float)var2.L());
      float f1 = Math.abs(var1 - (Float)var3.L());
      return f <= f1 ? class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0 : class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1;
   }

   private boolean N(class09904 var1, float var2, class11604 var3) {
      if (var3 != null && !var1.L().isEmpty()) {
         class09904 class09904x = var1.L().get(0);
         if (class09904x.L().isEmpty()) {
            return false;
         } else {
            class09904 class09904x = class09904x.L().get(0);
            float f = class09904x.c().y() - var1.c().y();
            float f1 = class09904x.c().y() - var1.c().y();
            float f2 = var3 == class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0 ? f1 : f1 + class09904x.c().u();
            if (!Float.isFinite(f2)) {
               f2 = f;
            }

            return Math.abs(var2 - f2) <= 4.0F;
         }
      } else {
         return false;
      }
   }

   private class09991 N(class09211 var1, float var2, boolean var3) {
      class09991 class09991 = class09991.N(((class09227)y_3).N(var1), class09991.N().U(Math.clamp(var2, 0.0F, 1.0F) * 104.0F + -8.0F));
      if (!var3) {
         class09991 = class09991.N(class09991, (class09991)y_2);
      }

      return class09991;
   }

   private static void N() {
   }

   private float N(float var1, class11871 var2) {
      return Math.clamp(class11908.N(var1 * var2.L() + var2.u(), var2.M()), var2.u(), var2.N());
   }

   private void N(class09785<Float> var1, class09785<Float> var2, class11871 var3, float var4, float var5, float var6, class11604 var7, boolean var8) {
      float f = Math.clamp((var4 - var6) / var5, 0.0F, 1.0F);
      if (var7 == class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0) {
         f = Math.min(f, (Float)var2.L());
         var1.N(var8 ? this.y(this.N(f, var3), var3) : f);
      } else if (var7 == class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1) {
         f = Math.max(f, (Float)var1.L());
         var2.N(var8 ? this.y(this.N(f, var3), var3) : f);
      }
   }

   private class11494 N(class09785<Float> var1, class09785<Float> var2, class11871 var3) {
      float f = this.N(Math.min((Float)var1.L(), (Float)var2.L()), var3);
      float f1 = this.N(Math.max((Float)var1.L(), (Float)var2.L()), var3);
      return new class11494(f, f1);
   }

   private boolean N(float var1, float var2) {
      float f = var2 * 104.0F + -8.0F;
      float f1 = f + 16.0F;
      return var1 >= f && var1 <= f1;
   }

   private class09798 N(class11871 var1, class09809 var2) {
      class09211 class09211 = var2.N((class09804<class09211>)class09211.N_6);
      class09785 class09785xxxxxxxx = var2.N(o[0], false);
      class09785 class09785x = var2.N(o[1], var1.U());
      class09785 class09785xx = var2.N(o[2], var1.y());
      class09785 class09785xxx = var2.N(o[3], (class11604)null);
      class09785 class09785xxxx = var2.N(o[4], 0.0F);
      class09785 class09785xxxxx = var2.N(R[0], 0.0F);
      class09785 class09785xxxxxx = var2.N(R[1], false);
      class09785 class09785xxxxxxx = var2.N(R[2], (String)null);
      class09785 class09785xxxxxxxx = var2.N(R[3], (String)null);
      return class09778.N(
         (class09991)u_2,
         var12x -> {
            this.N(var12x::u, var1, class09785xxxxxxxx, class09785xxxxxxx, class09785xxxxxx, class09785xxxxx, class09785x, true);
            var12x.N_3(
               (class09991)u_3,
               var10xx -> {
                  var10xx.N(
                     class09867.POINTER_DOWN,
                     var9xxx -> {
                        class09864 class09864 = (class09864)var9xxx;
                        if (class09864.L() == 0) {
                           class09785xxxxxxxx.N(true);
                           class09785xxxx.N(class09864.N());
                           class09904 class09904 = class09864.z();
                           float f = class09864.N() - class09904.c().y();
                           boolean flag = this.N(class09785xxxxxxx, class09785xxxxxx);
                           class11604 class11604x = flag ? null : this.N(f, (Float)class09785xxxxxxx.L(), (Float)class09785xxxxxx.L());
                           if (class11604x != null) {
                              class09785xxxxx.N(class11604x);
                              class09785xx.N(false);
                              float f1 = class11604x == class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0
                                    ? (Float)class09785xxxxxxx.L()
                                    : (Float)class09785xxxxxx.L()
                                 * 104.0F;
                              class09785xxx.N(f - f1);
                           } else {
                              class09785xxx.N(0.0F);
                              if (flag) {
                                 class09785xxxxx.N(null);
                                 class09785xx.N(false);
                              } else {
                                 class11604 class11604x = this.N(this.y(f, class09904.c().u()), class09785xxxxxxx, class09785xxxxxx);
                                 class09785xxxxx.N(class11604x);
                                 class09785xx.N(true);
                                 var1.i().N(false);
                                 this.N(class09785xxxxxxx, class09785xxxxxx, var1, f, class09904.c().u(), 0.0F, class11604x, true);
                                 var1.R().accept(this.N(class09785xxxxxxx, class09785xxxxxx, var1));
                              }
                           }
                        }
                     }
                  );
                  var10xx.N(
                     class09867.POINTER_UP,
                     var8xxx -> {
                        class09864 class09864 = (class09864)var8xxx;
                        if (class09864.L() == 0) {
                           class09785xxxxxxxx.N(false);
                           if (var1.i().L() && class09785xxxxx.L() != null) {
                              class09904 class09904 = class09864.z();
                              float f = class09864.N() - class09904.c().y();
                              this.N(
                                 class09785xxxxxxx,
                                 class09785xxxxxx,
                                 var1,
                                 f,
                                 class09904.c().u(),
                                 (Float)class09785xxx.L(),
                                 (class11604)class09785xxxxx.L(),
                                 true
                              );
                              var1.R().accept(this.N(class09785xxxxxxx, class09785xxxxxx, var1));
                           }

                           class09785xxxxx.N(null);
                           var1.i().N(false);
                           class09785xxx.N(0.0F);
                           class09785xx.N(false);
                        }
                     }
                  );
                  var10xx.N(class09867.POINTER_MOVE, var9xxx -> {
                     if ((Boolean)class09785xxxxxxxx.L()) {
                        class09864 class09864 = (class09864)var9xxx;
                        class09904 class09904 = class09864.z();
                        float f = class09864.N() - class09904.c().y();
                        if (class09785xxxxx.L() == null) {
                           float f1 = class09864.N() - (Float)class09785xxxx.L();
                           if (f1 > 0.0F) {
                              class09785xxxxx.N(class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1);
                           } else {
                              if (!(f1 < 0.0F)) {
                                 return;
                              }

                              class09785xxxxx.N(class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0);
                           }

                           class09785xxx.N(0.0F);
                        }

                        if ((Boolean)class09785xx.L() && this.N(class09904, f, (class11604)class09785xxxxx.L())) {
                           class09785xx.N(false);
                        }

                        this.N(
                           class09785xxxxxxx, class09785xxxxxx, var1, f, class09904.c().u(), (Float)class09785xxx.L(), (class11604)class09785xxxxx.L(), false
                        );
                        var1.R().accept(this.N(class09785xxxxxxx, class09785xxxxxx, var1));
                        if (!(Boolean)class09785xx.L()) {
                           var1.i().N(true);
                        }
                     }
                  });
                  var10xx.N_3(((class09227)y_0).N(class09211), var7xxx -> {
                     float f = class09785xxxxxxxx.L() ? (Float)class09785xxxxxxx.L() : var1.U();
                     float f1 = class09785xxxxxxxx.L() ? (Float)class09785xxxxxx.L() : var1.y();
                     boolean flag = var1.i().L() && !(Boolean)class09785xx.L();
                     var7xxx.N_3(this.N(class09211, f, f1, flag), var1xxxx -> var1xxxx.N(class09867.TRANSITION_END, var1xxxxx -> {
                        if (((class09842)var1xxxxx).y()) {
                           class09785xx.N(false);
                        }
                     }));
                     var7xxx.y(this.N(class09211, f, flag));
                     var7xxx.y(this.N(class09211, f1, flag));
                  });
               }
            );
            this.N(var12x::u, var1, class09785xxxxxxxx, class09785xxxxxxx, class09785xxxxxx, class09785xxxxx, class09785, false);
         }
      );
   }

   private class11604 N(float var1, float var2, float var3) {
      boolean flag = this.N(var1, var3);
      boolean flag1 = this.N(var1, var2);
      if (flag && flag1) {
         float f = var3 * 104.0F;
         float f1 = var2 * 104.0F;
         return Math.abs(var1 - f) <= Math.abs(var1 - f1)
            ? class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1
            : class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0;
      } else if (flag) {
         return class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1;
      } else {
         return flag1 ? class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0 : null;
      }
   }

   private void N(float var1, class11871 var2, class09785<Float> var3, class09785<Float> var4, boolean var5) {
      float f = Math.clamp(class11908.N(var1, var2.M()), var2.u(), var2.N());
      if (var5) {
         f = Math.min(f, this.N((Float)var4.L(), var2));
         var3.N(this.y(f, var2));
      } else {
         f = Math.max(f, this.N((Float)var3.L(), var2));
         var4.N(this.y(f, var2));
      }

      var2.R().accept(this.N(var3, var4, var2));
   }

   private String N(class11871 var1) {
      String s = var1.Z().get();
      return s == null ? R[4] : s;
   }

   private boolean N(class09785<Float> var1, class09785<Float> var2) {
      return Math.abs((Float)var1.L() - (Float)var2.L()) < 1.0E-4F;
   }
}
