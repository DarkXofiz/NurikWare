package NurikWare;

import java.util.Comparator;
import java.util.Optional;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07438;
import minecraft.class07488;
import minecraft.class07843;

@class11080(
   L = "AutoPearl",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoPearl extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public boolean L_init;

   public AutoPearl() {
      super();
      this.b();
      this.L_0 = class11524.N(this, "only-in-pvp", false);
      this.L_1 = class11524.N(this, "target-follow", false);
      this.L_2 = class11524.N(this, "threshold", 6.0F, 1.0F, 8.0F, 0.5F);
      this.L_3 = class11524.N(this, "min-distance", 5.0F, 5.0F, 10.0F, 1.0F);
      this.L_4 = new class11228((class11225)class11225.L_2);
   }

   private void b() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_5 = 0;
         this.L_6 = 0;
         this.L_7 = 0;
      }
   }

   private boolean s() {
      this.b();
      if (((class11507)this.L_0).i() && !class11907.u()) {
         return true;
      } else {
         return ((class11799)((class03443)((class06202)super.y_0).T_2)).N() < 3 ? true : ((class04453)((class06202)super.y_0).T_4).method_6115();
      }
   }

   private Optional<class11499> N(class07049 var1) {
      this.b();
      Optional<class11223> optional = ((class11228)this.L_4).N(var1, var1.method_73189(), var1.method_18798()).N();
      if (optional.isEmpty()) {
         return Optional.empty();
      } else {
         class06889 class06889xxx = optional.get().N();
         if (((class04453)((class06202)super.y_0).T_4).method_73189().R(class06889xxx) <= ((class11504)this.L_3).i().floatValue()) {
            return Optional.empty();
         } else {
            float f = class04995.z(((class11504)this.L_2).i());
            class11499 class11499x = class11505.N(class06889xxx);
            float f1 = class11499x.y();
            float f2 = class11499x.R();
            class06889 class06889x = ((class04453)((class06202)super.y_0).T_4).method_60478();
            class06889 class06889xx = ((class04453)((class06202)super.y_0).T_4).method_33571();
            class11499 class11499x = null;
            double d0 = Double.MAX_VALUE;
            int i = -1;

            for (byte b0 = 0; b0 < 180; b0 += 3) {
               float f3 = (f2 - b0 - 90.0F) % 180.0F + 90.0F;
               class06889 class06889xxx = Trajectory.N((class04453)((class06202)super.y_0).T_4, class06889x, -f3, f1, 0.0F, 1.5F);
               Optional<class11223> optional1 = ((class11228)this.L_4).N(null, class06889xx, class06889xxx).N();
               if (!optional1.isEmpty()) {
                  double d1 = optional1.get().N().M(class06889xxx);
                  int j = optional1.get().L();
                  if (j <= optional.get().L() + 100 && d1 <= f && (d1 < d0 && (i == -1 || Math.abs(j - i) < 40) || j < i)) {
                     d0 = d1;
                     i = j;
                     class11499x = new class11499(f1, f3);
                  }
               }
            }

            return Optional.ofNullable(class11499x);
         }
      }
   }

   @class11782
   public void N(class11371 var1) {
      if (var1.N() instanceof class07488 class07488) {
         ((class03448)((class06202)super.y_0).T_3)
            .method_18456()
            .stream()
            .min(Comparator.comparingDouble(var1x -> var1x.method_5707(class07488.method_73189())))
            .ifPresent(var2x -> {
               this.b();
               int i = class07488.method_5628();
               if (var2x == (class04453)((class06202)super.y_0).T_4 || class11791.u().test(var2x)) {
                  this.L_5 = i;
               } else if (((class11507)this.L_1).i()) {
                  TargetEsp targetesp = class11938.u().r();
                  if (targetesp.m()) {
                     class07438 class07438 = targetesp.P();
                     if (class07438 instanceof class04477 && (class04477)class07438 == var2x) {
                        this.L_6 = i;
                        this.L_7 = 20;
                     }
                  }
               } else {
                  this.L_6 = i;
                  this.L_7 = 20;
               }
            });
      }
   }

   @class11782(
      y = class11777.AFTER
   )
   public void N(class10992 var1) {
      this.b();
      if ((Integer)this.L_6 != -1 && (Integer)this.L_5 != (Integer)this.L_6) {
         if (((class03448)((class06202)super.y_0).T_3).method_8469((Integer)this.L_6) instanceof class07488 class07488) {
            if (!this.s()) {
               int i = class11281.L(class06570.nz).min(Comparator.comparingInt(var0 -> var0.N().I() ? 1 : 0)).map(class11297::y).orElse(-1);
               if (class11281.y(i) || ((class04453)((class06202)super.y_0).T_4).method_7357().N(class06570.nz.E())) {
                  this.L_6 = -1;
               } else if ((Integer)this.L_7 <= 0) {
                  this.L_6 = -1;
               } else {
                  Optional<class11499> optional = this.N(class07488);
                  if (optional.isEmpty()) {
                     this.L_7 = (Integer)this.L_7 - 1;
                  } else {
                     class11499 class11499x = optional.get();
                     class11499 class11499x = new class11499(class11499x.y(), -class11499x.R())
                        .N(class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_0)
                        .u(true)
                        .N(true);
                     class11534.y(class11499x);
                     class11938.Z()
                        .N(
                           () -> {
                              this.b();
                              class11534.y(class11499);
                              class11322.N(i);
                              ((class03443)((class06202)super.y_0).T_2)
                                 .N(
                                    (class03448)((class06202)super.y_0).T_3,
                                    var1xx -> new class07843(class07050.field_5808, var1xx, class11499.y(), class11499.R())
                                 );
                              ((class04453)((class06202)super.y_0).T_4).method_6104(class07050.field_5808);
                              this.L_6 = -1;
                              this.L_7 = 0;
                              class11938.Z().y(4, class11322::L);
                           }
                        );
                  }
               }
            }
         } else {
            this.L_6 = -1;
         }
      }
   }
}
