package NurikWare;

public class class11624 {
   private static String[] I;
   public static Object N_0 = new class11624()::N;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object N_5;
   public static Object N_6;
   public static Object N_7;
   public static Object y_0 = class09227.N(var0 -> class09991.N().u(104.0F, 6.0F).Z(999.0F).y(var0.i()));
   public static Object y_1 = class09227.N(var0 -> class09991.N().y(class09962.y(6.0F)).Z(999.0F).y(var0.B()));
   public static Object y_2 = new class11863(360.0F, 27.0F, 1.0F, 0.1F, 2.0F, 0.008333334F);
   public static Object y_3 = class09991.N().N(class09692.N(class09994.E((class09743)y_2)));
   public static Object y_4 = class09227.N(
      var0 -> class09991.N().u(16.0F, 10.0F).Z(999.0F).N(class09969.FLOATING).v(8.0F).L(class09662.N(-16777216, 0.2F)).N(-8.0F, -2.0F).y(var0.N())
   );
   public static Object y_5 = class09991.N().N(class09692.N(class09994.E((class09743)y_2), class09994.W((class09743)y_2), class09994.B((class09743)y_2)));
   public static Object y_6;
   public static Object y_7;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2 = class09991.N().N(class09962.N()).B(12.0F).y(class09973.CENTER).y(class09962.y(26.0F));
   public static Object L_3 = class09991.N().N(class09962.N()).y(class09973.CENTER).y(class09962.y(26.0F));

   private static void L() {
      I = new String[6];
      I[0] = "sliderDrag";
      I[1] = "sliderValue";
      I[2] = "sliderDragOffset";
      I[3] = "sliderClickAnimating";
      I[4] = "sliderInputText";
      I[5] = "";
   }

   private class11624() {
      super();
   }

   static {
      N();
      y();
      L();
      u();
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
      y_6 = class09991.N(class09991x.u(var0 -> var0.i((Integer)class09181.N_0)), class09221.N(14, class09079.REGULAR));
      class09991 class09991x = class09991.N();
      y_7 = class09991.N((class09991)y_6, class09991x.i((Integer)class09181.N_0));
   }

   private static void u() {
      N_1 = 104.0F;
      N_2 = 6.0F;
      N_3 = 16;
      N_4 = 10;
      N_5 = -8.0F;
      N_6 = -2.0F;
      N_7 = 3.0F;
      L_0 = 4.0F;
      L_1 = 999;
   }

   private static void y() {
   }

   private boolean N(float var1, float var2) {
      float f = var2 * 104.0F + -8.0F;
      float f1 = f + 16.0F;
      return var1 >= f && var1 <= f1;
   }

   private float N(float var1, class11830 var2) {
      return Math.clamp(class11908.N(var1 * var2.L() + var2.i(), var2.y()), var2.i(), var2.R());
   }

   private static void N() {
   }

   private void N(class09785<Float> var1, class11830 var2, float var3, float var4, float var5, boolean var6) {
      float f = Math.clamp((var3 - var5) / var4, 0.0F, 1.0F);
      if (var6) {
         var1.N((class11908.N(f * var2.L() + var2.i(), var2.y()) - var2.i()) / var2.L());
      } else {
         var1.N(f);
      }
   }

   private class09798 N(class11830 var1, class09809 var2) {
      class09211 class09211 = var2.N((class09804<class09211>)class09211.N_6);
      class09785 class09785xxxx = var2.N(I[0], false);
      class09785 class09785x = var2.N(I[1], var1.N());
      class09785 class09785xx = var2.N(I[2], 0.0F);
      class09785 class09785xxx = var2.N(I[3], false);
      class09785 class09785xxxx = var2.N(I[4], (String)null);
      return class09778.N(
         (class09991)L_2,
         var8x -> {
            var8x.N_3(
               (class09991)L_3,
               var7xx -> {
                  var7xx.N(class09867.POINTER_DOWN, var6xxx -> {
                     class09864 class09864 = (class09864)var6xxx;
                     if (class09864.L() == 0) {
                        class09785xxxx.N(true);
                        class09904 class09904 = class09864.z();
                        float f = class09864.N() - class09904.c().y();
                        float f1 = var1.N() * 104.0F;
                        if (this.N(f, var1.N())) {
                           class09785x.N(false);
                           class09785xx.N(f - f1);
                        } else {
                           class09785x.N(true);
                           var1.M().N(false);
                           class09785xx.N(0.0F);
                           this.N(class09785xxx, var1, f, class09904.c().u(), 0.0F, true);
                           var1.Z().accept(this.N((Float)class09785xxx.L(), var1));
                        }
                     }
                  });
                  var7xx.N(class09867.POINTER_UP, var6xxx -> {
                     class09864 class09864 = (class09864)var6xxx;
                     if (class09864.L() == 0) {
                        class09785xxxx.N(false);
                        if (var1.M().L()) {
                           class09904 class09904 = class09864.z();
                           float f = class09864.N() - class09904.c().y();
                           this.N(class09785xxx, var1, f, class09904.c().u(), (Float)class09785xx.L(), true);
                           var1.Z().accept(this.N((Float)class09785xxx.L(), var1));
                        }

                        var1.M().N(false);
                        class09785xx.N(0.0F);
                        class09785x.N(false);
                     }
                  });
                  var7xx.N(class09867.POINTER_MOVE, var6xxx -> {
                     if ((Boolean)class09785xxxx.L()) {
                        class09864 class09864 = (class09864)var6xxx;
                        class09904 class09904 = class09864.z();
                        float f = class09864.N() - class09904.c().y();
                        if ((Boolean)class09785x.L() && this.N(class09904, f)) {
                           class09785x.N(false);
                        }

                        this.N(class09785xxx, var1, f, class09904.c().u(), (Float)class09785xx.L(), false);
                        var1.Z().accept(this.N((Float)class09785xxx.L(), var1));
                        if (!(Boolean)class09785x.L()) {
                           var1.M().N(true);
                        }
                     }
                  });
                  var7xx.N_3(
                     ((class09227)y_0).N(class09211),
                     var5xxx -> {
                        class09991 class09991x = class09991.N(
                           ((class09227)y_1).N(class09211), class09991.N().N(class09962.N((class09785xxxx.L() ? (Float)class09785xxx.L() : var1.N()) * 100.0F))
                        );
                        if ((Boolean)class09785x.L() || !var1.M().L()) {
                           class09991x = class09991.N(class09991x, (class09991)y_3);
                        }

                        var5xxx.N_3(class09991x, var1xxxx -> var1xxxx.N(class09867.TRANSITION_END, var1xxxxx -> {
                           if (((class09842)var1xxxxx).y()) {
                              class09785x.N(false);
                           }
                        }));
                        class09991 class09991x = class09991.N(((class09227)y_4).N(class09211), class09991.N().u(16.0F, 10.0F).N(-8.0F, -2.0F), (class09991)y_5);
                        var5xxx.N(var1xxxx -> var1xxxx.y(class09991));
                     }
                  );
               }
            );
            var8x.u(
               var5xx -> {
                  String s = this.N(var1);
                  var5xx.L(
                     class09785.L() != null ? (String)class09785.L() : class11602.N(class09785xxxx.L() ? this.N((Float)class09785xxx.L(), var1) : var1.B(), s)
                  );
                  var5xx.N(var1.M().L() ? (class09991)y_7 : (class09991)y_6);
                  var5xx.N(class09867.INPUT, var2xxx -> {
                     class09844 class09844 = (class09844)var2xxx;
                     String s1 = class09844.y();
                     class09785.N(s1);
                     String s2 = class11602.N(s1, s);
                     if (!class11602.N(s2)) {
                        try {
                           Float.parseFloat(s2);
                        } catch (NumberFormatException numberformatexception) {
                           class09785.N(class09844.N());
                           class09844.b();
                           class09844.j();
                           var2xxx.z().N(class09844.N());
                        }
                     }
                  });
                  var5xx.N(class09867.BLUR, var4xxx -> {
                     String s1 = class11602.N(var4xxx.z().B(), s);
                     class09785.N(null);
                     if (!s1.isBlank() && !class11602.N(s1)) {
                        try {
                           float f = Math.clamp(class11908.N(Float.parseFloat(s1), var1.y()), var1.i(), var1.R());
                           var1.Z().accept(f);
                           class09785xxx.N((f - var1.i()) / var1.L());
                        } catch (NumberFormatException numberformatexception) {
                        }
                     } else {
                        var1.Z().accept(var1.i());
                        class09785xxx.N(0.0F);
                     }
                  });
                  var5xx.N(class09867.WHEEL, var3xxx -> {
                     if (var3xxx.z().W()) {
                        class09837 class09837 = (class09837)var3xxx;
                        var3xxx.T();
                        var3xxx.j();
                        float f = Math.clamp(class11908.N(var1.B() + Math.signum(class09837.L()) * var1.y(), var1.y()), var1.i(), var1.R());
                        var1.Z().accept(f);
                        class09785xxx.N((f - var1.i()) / var1.L());
                        class09785.N(null);
                     }
                  });
               }
            );
         }
      );
   }

   private boolean N(class09904 var1, float var2) {
      if (var1.L().isEmpty()) {
         return false;
      } else {
         class09904 class09904x = var1.L().getFirst();
         if (class09904x.L().isEmpty()) {
            return false;
         } else {
            class09904 class09904x = class09904x.L().getFirst();
            float f = class09904x.c().y() - var1.c().y() + class09904x.c().u();
            return Math.abs(var2 - f) <= 4.0F;
         }
      }
   }

   private String N(class11830 var1) {
      String s = var1.u().get();
      return s == null ? I[5] : s;
   }
}
