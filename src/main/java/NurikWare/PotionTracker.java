package NurikWare;

import com.mojang.serialization.Lifecycle;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00380;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00516;
import minecraft.class00734;
import minecraft.class00751;
import minecraft.class02484;
import minecraft.class03448;
import minecraft.class04227;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05018;
import minecraft.class05216;
import minecraft.class06145;
import minecraft.class06202;
import minecraft.class06517;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class06658;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07486;
import minecraft.class08036;
import minecraft.class08392;

@class11080(
   L = "PotionTracker",
   y = class11072.MISC,
   N = class11106.TRACKERS
)
public class PotionTracker extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;

   private void L(class11367 var1) {
      class11938.Z().N(() -> {
         this.v();
         this.y(var1);
         ((List)this.L_4).clear();
      });
   }

   public PotionTracker() {
      super();
      this.v();
      this.L_0 = class11524.N(this, "ignore-self", true);
      this.L_1 = class11524.N(this, "ignore-common-splash-potions", true);
      this.L_2 = class11524.N(this, "ft-bypass", true);
      this.L_3 = new ArrayList();
      this.L_4 = new ArrayList();
      class11805 class11805 = class11938.L();
      class11805.N(class11367.class, this::L);
      class11805.N(class10990.class, this::N);
      class11938.Z()
         .N(
            var0 -> (class03448)var0.T_3 != null
               && ((class03448)var0.T_3).method_30349().method_46759(class04227.yR).map(var0x -> var0x.R().equals(Lifecycle.experimental())).orElse(false),
            this::m
         );
   }

   private void m() {
      this.v();
      class11107.N(class11165.POTIONS).stream().map(class11664::N).forEach(((List)this.L_3)::add);
   }

   private void v() {
   }

   private void y(class11367 var1) {
      this.v();
      class07089 class07089 = var1.N();
      class07049 class07049 = class07089.N() == class07113.field_1331 ? ((class06145)class07089).L() : null;
      class07486 class07486 = var1.y();
      List<class08036> list = this.N(class07486.method_5829().L(4.0, 2.0, 4.0));
      if (!list.isEmpty()) {
         if (((class11507)this.L_2).i() && class11910.i()) {
            for (class11149 class11149 : (List)this.L_4) {
               for (class06584 class06584 : (List)this.L_3) {
                  class06517 class06517 = (class06517)class06584.a_(class02484.h, class06517.N);
                  int i = class11300.y(class11300.u(class11149.y()), class11300.N(class11149.y()), class11300.i(class11149.y()), 255);
                  if (!class06517.R().isEmpty() && class11300.N((Integer)class06517.R().get(), i, 10)) {
                     this.N(list, class07089.y(), class07049, true, class06584);
                     break;
                  }
               }
            }
         } else {
            this.N(list, class07486.method_73189(), class07049, false, class07486.L());
         }
      }
   }

   private void N(List<class08036> var1, class06889 var2, class07049 var3, boolean var4, class06584 var5) {
      this.v();
      Iterable<class07055> iterable = ((class06517)var5.a_(class02484.h, class06517.N)).N();

      for (class08036 class08036 : var1) {
         if (this.N(class08036)) {
            double d0 = this.N(var2.M(class08036.method_73189()), class08036, var3);
            ArrayList arraylist = new ArrayList();

            for (class07055 class07055 : iterable) {
               if (!((class07084)class07055.L().N()).N()) {
                  int i = class07055.N(var2x -> (int)(d0 * var2x + 0.5));
                  if (i > 20) {
                     arraylist.add(this.N(class07055, i));
                  }
               }
            }

            if (!arraylist.isEmpty() && this.U() && (!((class11507)this.L_1).i() || var4)) {
               int j = Math.clamp(Math.round(d0 * 100.0), 1, 100);
               this.N(class08036, var5, arraylist, j);
            }
         }
      }
   }

   private void N(class08036 var1, class06584 var2, List<class00392> var3, int var4) {
      int i = class04995.M(var4 / 100.0F * 0.33333334F, 1.0F, 1.0F);
      class05216 class05216x = class00392.y(" " + var4 + "%").L(class00405.N.N(i));
      class05216 class05216x = var1.yZ().L().i(" ").y(var2.Y()).y(class05216x).L(class00405.N.N(new class00380(var2)));

      for (class00392 class00392 : var3) {
         class05216x.i("\n● ").y(class00392);
      }

      class11303.y(class05216x.N(class06541.field_1080));
   }

   private double N(double var1, class08036 var3, class07049 var4) {
      if (var1 >= 16.0) {
         return 0.0;
      } else {
         return var3 == var4 ? 1.0 : 1.0 - Math.sqrt(var1) / 4.0;
      }
   }

   private List<class08036> N(class00734 var1) {
      return ((class03448)((class06202)super.y_0).T_3).N(class08036.class, var1);
   }

   private boolean N(class08036 var1) {
      this.v();
      if (!var1.method_6086()) {
         return false;
      } else {
         boolean flag = this.U();
         return !flag && var1 == (class04453)((class06202)super.y_0).T_4
            ? false
            : !flag || !((class11507)this.L_0).i() || var1 != (class04453)((class06202)super.y_0).T_4;
      }
   }

   private class00392 N(class07055 var1, int var2) {
      String s = class08392.N(var1.z(), new Object[0]);
      if (var1.i() >= 1 && var1.i() <= 9) {
         s = s + " " + class08392.N("enchantment.level." + (var1.i() + 1), new Object[0]);
      }

      String s1 = class05018.N(var2, ((class03448)((class06202)super.y_0).T_3).method_54719().R());
      class05216 class05216 = class00392.y(s).N(class06541.field_1061);
      return class00392.i().y(class05216).i(" " + s1);
   }

   private void N(class10990 var1) {
      this.v();
      switch (var1.u()) {
         case class06658 class06658:
            ((class06202)super.y_0).execute(() -> class06658.N().forEach(var1xx -> {
               class07049 class07049 = ((class03448)((class06202)super.y_0).T_3).method_8469(var1xx);
               if (class07049 instanceof class07486) {
                  ((class07486)class07049).method_5773();
               }
            }));
            break;
         case class00516 class00516:
            if (!((class11507)this.L_2).i() || !class11910.i()) {
               return;
            }

            ((class06202)super.y_0).execute(() -> {
               this.v();
               if (class00516.y() == 2002) {
                  ((List)this.L_4).add(new class11149(class00516.u(), class00516.L()));
               }
            });
            return;
         case null:
         default:
      }
   }
}
