package NurikWare;

import java.util.LinkedList;
import java.util.function.Supplier;
import minecraft.class00269;
import minecraft.class00381;
import minecraft.class00475;
import minecraft.class00495;
import minecraft.class00501;
import minecraft.class00516;
import minecraft.class01785;
import minecraft.class01938;
import minecraft.class02046;
import minecraft.class02459;
import minecraft.class02565;
import minecraft.class03053;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04459;
import minecraft.class04464;
import minecraft.class06202;
import minecraft.class06642;
import minecraft.class06644;
import minecraft.class06652;
import minecraft.class06663;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07232;
import minecraft.class07268;
import minecraft.class07280;
import minecraft.class07438;
import minecraft.class08049;
import minecraft.class08062;
import minecraft.class08073;
import minecraft.class08090;
import minecraft.class08091;
import minecraft.class08095;

@class11080(
   L = "Backtrack",
   y = class11072.COMBAT,
   N = class11106.TOOLS
)
public class Backtrack extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public static Object i_0;
   public static Object i_1;
   public Object R_0;
   public Object R_1;
   public Object R_2;

   private void L(class00381<?> var1) {
      this.d();
      if (var1 instanceof class00269 class00269 && class00269.N() == (Integer)this.L_0) {
         this.L_5 = class00269.y().N();
         this.L_7 = class00269.y().L();
         this.L_6 = class00269.y().u();
      } else {
         if (var1 instanceof class06644 class06644) {
            class07049 class07049x = class06644.N((class03448)((class06202)super.y_0).T_3);
            if (class07049x instanceof class07049 && class07049x.method_5628() == (Integer)this.L_0) {
               this.L_7 = class06644.N();
               return;
            }
         }

         if (var1 instanceof class00475 class00475) {
            class07049 class07049 = class00475.N((class03448)((class06202)super.y_0).T_3);
            if (class07049 instanceof class07049 && class07049.method_5628() == (Integer)this.L_0) {
               if (class00475.B()) {
                  this.L_7 = class00475.u();
                  this.L_6 = class00475.M();
               }

               if (class00475.Z()) {
                  class06889 class06889 = (class06889)this.L_5 != null ? (class06889)this.L_5 : class07049.method_43389().N();
                  this.L_5 = class06889.y(class00475.N() / 4096.0, class00475.y() / 4096.0, class00475.L() / 4096.0);
               }

               return;
            }
         }
      }
   }

   private boolean T() {
      this.d();
      if ((class06889)this.L_5 != null) {
         class07049 class07049 = ((class03448)((class06202)super.y_0).T_3).method_8469((Integer)this.L_0);
         if (class07049 instanceof class07049) {
            class06889 class06889 = ((class04453)((class06202)super.y_0).T_4).method_73189();
            return ((class06889)this.L_5).M(class06889) < class07049.method_73189().M(class06889);
         }
      }

      return false;
   }

   public Backtrack() {
      super();
      this.d();
      this.u_0 = class11524.N(this, "distance", 4.0F, 3.0F, 10.0F, 0.1F);
      this.u_1 = class11524.N(this, "delay", 4.0F, 1.0F, 20.0F, 1.0F).N((Supplier<String>)class11502.N_3);
      this.u_2 = class11524.N(this, "hold-after-attack", 10.0F, 0.0F, 20.0F, 1.0F).N((Supplier<String>)class11502.N_3);
      this.R_0 = class11524.N(this, "color", -1258337204);
      this.R_1 = new LinkedList();
      this.R_2 = new class11074();
      this.L_0 = -1;
   }

   static {
      G();
   }

   private boolean i(class00381<?> var1) {
      return var1 instanceof class04459
         || var1 instanceof class04464
         || var1 instanceof class02046
         || var1 instanceof class02459
         || var1 instanceof class03053
         || var1 instanceof class07232
         || var1 instanceof class08073
         || var1 instanceof class08062
         || var1 instanceof class08090
         || var1 instanceof class00495
         || var1 instanceof class00516
         || var1 instanceof class07268
         || var1 instanceof class01938
         || var1 instanceof class08095
         || var1 instanceof class02565
         || var1 instanceof class08091
         || var1 instanceof class08049
         || var1 instanceof class01785
         || var1 instanceof class06642
         || var1 instanceof class00501
         || var1 instanceof class06663;
   }

   private void n() {
      this.d();
      if ((class03448)((class06202)super.y_0).T_3 != null
         && ((class03448)((class06202)super.y_0).T_3).method_8469((Integer)this.L_0) instanceof class07438 class07438
         && class07438.method_5805()) {
         this.L_5 = class07438.method_43389().N();
         this.L_6 = class07438.method_36455();
         this.L_7 = class07438.fields_4212a028292fd3c078969e3ee4c71d9e8_2;
         ((class11074)this.R_2).N(class07438, (class06889)this.L_5);
      }
   }

   private boolean l() {
      this.d();
      synchronized ((LinkedList)this.R_1) {
         return !((LinkedList)this.R_1).isEmpty();
      }
   }

   private void d() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = 0;
         this.L_2 = 0;
         this.L_3 = false;
         this.L_4 = false;
         this.L_6 = 0.0F;
         this.L_7 = 0.0F;
      }
   }

   private boolean m() {
      this.d();
      if ((class03448)((class06202)super.y_0).T_3 != null
         && (class04453)((class06202)super.y_0).T_4 != null
         && (Integer)this.L_0 != -1
         && (class06889)this.L_5 != null) {
         class07049 class07049 = ((class03448)((class06202)super.y_0).T_3).method_8469((Integer)this.L_0);
         return class07049 instanceof class07438 && ((class07438)class07049).method_5805()
            ? ((class06889)this.L_5).R(((class04453)((class06202)super.y_0).T_4).method_73189()) <= ((class11504)this.u_0).i().floatValue()
            : false;
      } else {
         return false;
      }
   }

   private boolean u(class00381<?> var1) {
      return !(var1 instanceof class00501) && !(var1 instanceof class06663) ? var1 instanceof class08095 && ((class08095)var1).N() <= 0.0F : true;
   }

   @Override
   public void y() {
      this.d();
      this.L_0 = -1;
      this.L_1 = 0;
      this.L_2 = 0;
      this.L_3 = false;
      this.L_4 = false;
      this.L_5 = null;
      ((class11074)this.R_2).N();
      this.y(true);
      super.y();
   }

   private void y(boolean var1) {
      ((class06202)super.y_0).execute(() -> {
         this.d();
         if (((class06202)super.y_0).NE() != null) {
            synchronized ((LinkedList)this.R_1) {
               long i = System.currentTimeMillis();
               long j = ((class11504)this.u_1).i().longValue() * 50L;
               ((LinkedList)this.R_1).removeIf(var6 -> {
                  if (!var1 && i - var6.N() < j) {
                     return false;
                  } else {
                     try {
                        this.y(var6.y());
                     } catch (Exception exception) {
                     }

                     return true;
                  }
               });
            }
         }
      });
   }

   private void y(class00381<?> var1) {
      var1.method_65081(((class06202)super.y_0).NE());
   }

   @class11782
   public void N(class11382 var1) {
      this.d();
      if (var1.L() instanceof class07438 class07438) {
         if (!class11791.u().test(class07438)) {
            this.L_2 = ((class11504)this.u_2).i().intValue();
            if (class07438.method_5628() != (Integer)this.L_0) {
               this.L_0 = class07438.method_5628();
               if ((class06889)this.L_5 == null) {
                  this.L_5 = class07438.method_43389().N();
                  this.L_6 = class07438.method_36455();
                  this.L_7 = class07438.fields_4212a028292fd3c078969e3ee4c71d9e8_2;
                  this.L_4 = false;
                  ((class11074)this.R_2).N();
               }
            }
         }
      }
   }

   @class11782
   public void N(class09343 var1) {
      this.d();
      this.L_0 = -1;
      this.L_1 = 0;
      this.L_2 = 0;
      this.L_3 = false;
      this.L_4 = false;
      this.L_5 = null;
      ((class11074)this.R_2).N();
      synchronized ((LinkedList)this.R_1) {
         ((LinkedList)this.R_1).clear();
      }
   }

   @class11782(
      y = class11777.AFTER_ALL,
      u = true
   )
   public void N(class10990 var1) {
      this.d();
      if ((class03448)((class06202)super.y_0).T_3 != null
         && (class04453)((class06202)super.y_0).T_4 != null
         && (Integer)this.L_0 != -1
         && (Integer)this.L_1 <= 0) {
         if (var1.L().method_10744() instanceof class07280) {
            class00381<?> class00381 = var1.u();
            if (this.i(class00381)) {
               if (this.u(class00381)) {
                  this.L_3 = true;
               }
            } else {
               if (class00381 instanceof class06652 class06652
                  && (class04453)((class06202)super.y_0).T_4 != null
                  && ((class04453)((class06202)super.y_0).T_4).method_5628() == class06652.N()) {
                  this.L_2 = ((class11504)this.u_2).i().intValue();
               }

               synchronized ((LinkedList)this.R_1) {
                  var1.N();
                  ((LinkedList)this.R_1).add(new class11099(class00381, System.currentTimeMillis()));
               }

               if (!(Boolean)this.L_4) {
                  this.L_4 = true;
                  ((class06202)super.y_0).execute(this::n);
               }

               ((class06202)super.y_0).execute(() -> this.L(class00381));
            }
         }
      }
   }

   @class11782
   public void N(class09321 var1) {
      this.d();
      if (this.l()) {
         ((class11074)this.R_2).N(var1, ((class11515)this.R_0).i());
      }
   }

   @class11782
   public void N(class11380 var1) {
      this.d();
      ((class11074)this.R_2).N((class06889)this.L_5, (Float)this.L_6, (Float)this.L_7);
      if ((Integer)this.L_1 > 0) {
         this.L_1 = (Integer)this.L_1 - 1;
      }

      if ((Integer)this.L_2 > 0) {
         this.L_2 = (Integer)this.L_2 - 1;
      }

      if (!this.m()) {
         this.L_0 = -1;
         this.L_5 = null;
         this.L_3 = false;
         this.L_4 = false;
         ((class11074)this.R_2).N();
         this.y(true);
      } else if ((Boolean)this.L_3) {
         this.L_3 = false;
         this.L_1 = 5;
         this.L_4 = false;
         this.y(true);
      } else if ((Integer)this.L_2 == 0 && this.T()) {
         this.L_1 = 5;
         this.L_4 = false;
         this.y(true);
      } else {
         this.y(false);
      }
   }

   private static void G() {
      i_0 = 4096.0;
      i_1 = 5;
   }
}
