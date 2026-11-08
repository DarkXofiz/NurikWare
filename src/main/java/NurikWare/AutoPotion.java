package NurikWare;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07050;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07482;
import minecraft.class07510;
import minecraft.class07843;

@class11080(
   L = "AutoPotion",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoPotion extends class11067 {
   public static Object L_0;
   public static Object L_1;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;
   public boolean i_init;
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object R_4;
   public Object R_5;
   public Object R_6;
   public Object R_7;
   public Object M_0;
   public Object M_1;
   public Object M_2;
   public Object M_3;
   public boolean M_init;

   private void P() {
      this.n();
      if ((Boolean)this.M_0 || !class11281.y((Integer)this.i_3)) {
         if (class11938.j().y() - (Integer)this.i_5 >= 1) {
            this.G();
            if (((class11535)this.i_0).U()) {
               this.N(false);
            }
         }
      }
   }

   private void Q() {
      this.n();
      if (!class11281.y((Integer)this.i_3)) {
         class11938.m().N(0, (Integer)this.i_4, (Integer)this.i_3, class07510.field_7791).y();
         this.i_4 = -1;
         this.i_3 = -1;
      }
   }

   public AutoPotion() {
      super();
      this.n();
      this.R_0 = new class10891("speed-potion", true, var0 -> !var0.method_6059(class07047.N), var1 -> var1.N(class06570.lO) && this.N(var1, class07047.N));
      this.R_1 = new class10891("strength-potion", true, var0 -> !var0.method_6059(class07047.i), var1 -> var1.N(class06570.lO) && this.N(var1, class07047.i));
      this.R_2 = new class10891(
         "fire-resistance-potion", true, var0 -> !var0.method_6059(class07047.E), var1 -> var1.N(class06570.lO) && this.N(var1, class07047.E)
      );
      this.R_3 = new class10891("healing-potion", false, var1 -> {
         this.n();
         return (Boolean)this.M_2 || var1.method_6032() < ((class11504)this.R_5).i();
      }, var1 -> var1.N(class06570.lO) && this.N(var1, class07047.R));
      this.R_4 = class11524.y(this, "potions", (class10891)this.R_1, (class10891)this.R_0, (class10891)this.R_2, (class10891)this.R_3);
      this.R_5 = (class11504)class11524.N(this, "heal-health", 10.0F, 0.0F, 20.0F, 0.5F).N(var1 -> {
         this.n();
         return ((class10891)this.R_3).U();
      });
      this.R_6 = (class11527)class11524.N(this, "heal-key", class12002.UNKNOWN).N(var1 -> {
         this.n();
         return ((class10891)this.R_3).U();
      });
      this.R_7 = new class11535("single", true);
      this.u_0 = new class11535("multi", false);
      this.u_1 = class11524.N(this, "mode", (class11535)this.R_7, (class11535)this.u_0);
      this.u_2 = class11524.N(this, "hotbar-only", false);
      this.u_3 = new class11535("only-in-pvp", false);
      this.i_0 = new class11535("disable-after-throw", false);
      this.i_1 = new class11535("exclude-donate-potions", true);
      this.i_2 = class11524.y(this, "addons", (class11535)this.u_3, (class11535)this.i_0, (class11535)this.i_1);
      this.i_3 = -1;
      this.i_4 = -1;
      this.i_5 = -1;
   }

   static {
      m();
   }

   private void b() {
      this.n();
      class11534.N(((class10927)this.M_3).y());
      if (class11938.j().y() - ((class10927)this.M_3).L() >= 1 && !(((class04453)((class06202)super.y_0).T_4).method_36455() < 80.0F)) {
         if (!((class11328)((class10927)this.M_3).N().N_1)
            .test((class06584)((class04453)((class06202)super.y_0).T_4).method_31548().u().get(((class10927)this.M_3).u()))) {
            this.Y();
         } else {
            this.N(((class10927)this.M_3).u(), ((class10927)this.M_3).y(), ((class10927)this.M_3).N());
            this.M_3 = null;
         }
      }
   }

   private void n() {
      if (!this.i_init) {
         this.i_init = true;
         this.i_3 = 0;
         this.i_4 = 0;
         this.i_5 = 0;
      }

      if (!this.M_init) {
         this.M_init = true;
         this.M_0 = false;
         this.M_1 = false;
         this.M_2 = false;
      }
   }

   private boolean l() {
      this.n();
      if (((class11535)this.u_3).U() && !class11907.u()) {
         return true;
      } else if (((class11799)((class03443)((class06202)super.y_0).T_2)).N() < 3) {
         return true;
      } else {
         return class11910.B() && ((class04453)((class06202)super.y_0).T_4).field_6012 < 110 ? true : ((class04453)((class06202)super.y_0).T_4).method_6115();
      }
   }

   private static void m() {
      L_0 = 1;
      L_1 = 1;
   }

   private boolean v() {
      this.n();
      return !((class11507)this.u_2).i();
   }

   private void y(int var1, class11499 var2, class10891 var3) {
      this.n();
      this.M_1 = true;
      boolean flag = class11281.y((Integer)this.i_3);
      int i = flag ? ((class04453)((class06202)super.y_0).T_4).method_31548().M() : (Integer)this.i_3;
      class11938.m().N(0, var1, i, class07510.field_7791).y((class12040)(var6 -> {
         this.n();
         if (flag) {
            this.i_4 = var1;
            this.i_3 = i;
         }

         this.M_3 = new class10927(i, var2, var3, class11938.j().y());
         this.M_1 = false;
      })).y();
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.n();
      if (((class10891)this.R_3).U() && ((class11527)this.R_6).N(var1)) {
         this.M_2 = true;
      }
   }

   private void N(int var1, class11499 var2, class10891 var3) {
      this.n();
      class11322.N(var1);
      ((class03443)((class06202)super.y_0).T_2)
         .N((class03448)((class06202)super.y_0).T_3, var1x -> new class07843(class07050.field_5808, var1x, var2.y(), var2.R()));
      ((class04453)((class06202)super.y_0).T_4).method_6104(class07050.field_5808);
      var3.N(10);
      if (var3 == (class10891)this.R_3) {
         this.M_2 = false;
      }

      this.M_0 = true;
      this.i_5 = class11938.j().y();
   }

   @class11782(
      y = class11777.AFTER
   )
   public void N(class10992 var1) {
      this.n();
      if (!(Boolean)this.M_1) {
         if ((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3
               == ((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2
            && !class11938.m().u()) {
            if ((class10927)this.M_3 != null) {
               if (this.l()) {
                  this.Y();
               } else {
                  this.b();
               }
            } else if (this.l()) {
               this.P();
            } else {
               class06889 class06889 = ((class04453)((class06202)super.y_0).T_4).method_73189();
               if (class11892.N(class06889, class06889.y(0.0, -1.0, 0.0), class05849.field_17558, class05835.field_1348)) {
                  this.P();
               } else {
                  boolean flag = false;

                  for (class10891 class10891 : (List)((class11523)this.R_4).i()) {
                     if (!class10891.N() && ((Predicate)class10891.N_0).test((class04453)((class06202)super.y_0).T_4)) {
                        int i = class11281.y((class11328)class10891.N_1);
                        int j = class11281.y(i) && this.v() ? class11281.R((class11328)class10891.N_1) : -1;
                        if (!class11281.y(i) || !class11281.y(j)) {
                           class11499 class11499 = new class11499(
                                 ((class04453)((class06202)super.y_0).T_4).method_36454()
                                    + class04995.m(((class04453)((class06202)super.y_0).T_4).field_6012) * 17.0F,
                                 90.0F
                              )
                              .N(class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_0);
                           class11534.N(class11499);
                           if (((class04453)((class06202)super.y_0).T_4).method_36455() < 80.0F) {
                              return;
                           }

                           if (class11281.y(i)) {
                              this.y(j, class11499, class10891);
                              return;
                           }

                           this.N(i, class11499, class10891);
                           flag = true;
                           if (((class11535)this.R_7).U()) {
                              return;
                           }
                        }
                     }
                  }

                  if (!flag) {
                     this.P();
                  }
               }
            }
         }
      }
   }

   @SafeVarargs
   private boolean N(class06584 var1, class03556<class07084>... var2) {
      this.n();
      if (!((class11535)this.i_1).U()) {
         return class11929.N(var1, var2);
      } else {
         Iterable<class07055> iterable = class11929.B(var1).N();
         if (!iterable.iterator().hasNext()) {
            return false;
         } else {
            for (class07055 class07055 : iterable) {
               if (Arrays.stream(var2).noneMatch(var1x -> class07055.L().N(var1x))) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private void G() {
      this.n();
      if ((Boolean)this.M_0) {
         class11322.i();
         this.M_0 = false;
      }

      this.Q();
   }

   private void Y() {
      this.n();
      this.M_3 = null;
      this.G();
   }
}
