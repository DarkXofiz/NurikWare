package NurikWare;

import java.util.Comparator;
import java.util.List;
import minecraft.class00509;
import minecraft.class00676;
import minecraft.class00743;
import minecraft.class02484;
import minecraft.class02575;
import minecraft.class02830;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05462;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07510;

@class11080(
   L = "AutoTotem",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoTotem extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object i_0;
   public Object i_1;
   public static Object R_0;

   private void P() {
      this.j();
      if (!class11938.m().u()) {
         class06584 class06584 = ((class04453)((class06202)super.y_0).T_4).method_6079();
         if (((Integer)this.L_0 == -1 && (Integer)this.L_1 == -1 || (Boolean)this.L_3) && (!class06584.y().N(class02484.e) || class06584.L(class02484.b))) {
            class11297 class11297 = class11281.L((class11328)(var0 -> var0.y().N(class02484.e))).min((Comparator<? super class11297>)this.L_4).orElse(null);
            if (class11297 != null && !class11297.N().L(class02484.b)) {
               this.N(class11297, class06584);
            } else if (!this.N(class06584, false)) {
               if (class11297 != null) {
                  this.N(class11297, class06584);
               } else {
                  this.N(class06584, true);
               }
            }
         }
      }
   }

   private int T() {
      class00743<class06584> class00743 = ((class04453)((class06202)super.y_0).T_4).method_31548().u();

      for (int i = 9; i < class00743.size(); i++) {
         if (((class06584)class00743.get(i)).R()) {
            return i;
         }
      }

      for (int j = 0; j < 9; j++) {
         if (((class06584)class00743.get(j)).R()) {
            return j;
         }
      }

      return -1;
   }

   public AutoTotem() {
      super();
      this.j();
      this.i_0 = new class11701("health-trigger", true);
      this.i_1 = new class11713("elytra-health-trigger", false);
      this.u_0 = new class11711("crystal-trigger", false);
      this.u_1 = new class11699("tnt-trigger", false);
      this.u_2 = new class11692("falling-dripstone-trigger", false);
      this.u_3 = new class11681("falling-trigger", false);
      this.u_4 = new class11694("trident-trigger", true);
      this.u_5 = new class11678("mace-smash-trigger", false);
      this.u_6 = class11524.y(
         this,
         "triggers",
         (class11701)this.i_0,
         (class11713)this.i_1,
         (class11681)this.u_3,
         (class11711)this.u_0,
         (class11699)this.u_1,
         (class11692)this.u_2,
         (class11694)this.u_4,
         (class11678)this.u_5
      );
      this.L_0 = -1;
      this.L_1 = -1;
      this.L_4 = Comparator.comparingInt(var0 -> var0.N().L(class02484.b) ? 1 : 0);
      ((class11523)this.u_6).L().forEach(var1 -> {
         if (var1 instanceof class11801) {
            var1.N(this);
         }
      });
   }

   static {
      d();
   }

   private boolean s() {
      return ((class04453)((class06202)super.y_0).T_4).method_7357().N(class06570.la.E());
   }

   private void n() {
      this.j();
      if (!class11938.m().u()) {
         if ((Integer)this.L_1 != -1) {
            this.l();
         } else if ((Integer)this.L_0 != -1) {
            if (this.N((Integer)this.L_0, 0) != -1) {
               this.L_0 = -1;
            }
         }
      }
   }

   private void l() {
      this.j();
      if ((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3
            == ((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2
         && ((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R()) {
         class06584 class06584 = (class06584)((class04453)((class06202)super.y_0).T_4).method_31548().u().get((Integer)this.L_1);
         class02830 class02830 = (class02830)class06584.method_58694(class02484.D);
         if (class02830 != null && !class02830.M()) {
            int i = class11281.L((Integer)this.L_1);
            if (class02830.Z() && class02830.B() != 0) {
               class05462.N(class06584, 0);
               ((class06202)super.y_0).NE().N(new class02575(i, 0));
            }

            boolean flag = !((class04453)((class06202)super.y_0).T_4).method_6079().R();
            class12029 class12029 = class11938.m().N(0, i, 1, class07510.field_7790).N(0, 45, 0, class07510.field_7790);
            if (flag) {
               class12029.N(0, i, 0, class07510.field_7790);
            }

            class12029.y((class12040)(var1x -> {
               this.j();
               this.L_2 = class11938.j().y();
            })).y();
            this.L_1 = -1;
         } else {
            this.L_1 = -1;
         }
      }
   }

   private static void d() {
      R_0 = 45;
   }

   private boolean k() {
      this.j();
      return class11938.j().y() - (Integer)this.L_2 < 5 && ((Integer)this.L_0 != -1 || (Integer)this.L_1 != -1);
   }

   private boolean t() {
      this.j();
      return ((List)((class11523)this.u_6).i()).stream().anyMatch(class11697::N);
   }

   private void j() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
         this.L_1 = 0;
         this.L_2 = 0;
         this.L_3 = false;
      }
   }

   private int y(int var1) {
      for (class06937 class06937 : ((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).T) {
         if (class06937.L == ((class04453)((class06202)super.y_0).T_4).method_31548() && class06937.B() == var1) {
            return class06937.u;
         }
      }

      return -1;
   }

   private boolean y(class06584 var1, boolean var2) {
      class02830 class02830 = (class02830)var1.method_58694(class02484.D);
      return class02830 == null ? false : class02830.y().anyMatch(var1x -> var1x.y().N(class02484.e) && (var2 || !var1x.L(class02484.b)));
   }

   private int N(class02830 var1) {
      int i = -1;

      for (int j = 0; j < var1.i(); j++) {
         class06584 class06584 = var1.N(j);
         if (class06584.y().N(class02484.e)) {
            if (!class06584.L(class02484.b)) {
               return j;
            }

            if (i == -1) {
               i = j;
            }
         }
      }

      return i;
   }

   @class11782
   public void N(class11371 var1) {
      if (var1.N() instanceof class00676) {
         if (!((class04453)((class06202)super.y_0).T_4).method_6047().L(class02484.e) && !this.k() && !this.s()) {
            if (this.t()) {
               this.P();
            }
         }
      }
   }

   private boolean N(class06584 var1, boolean var2) {
      this.j();
      if ((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3
            == ((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2
         && ((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R()) {
         class11297 class11297 = class11281.L((class11328)(var2x -> this.y(var2x, var2))).findFirst().orElse(null);
         if (class11297 == null) {
            return false;
         } else {
            class02830 class02830 = (class02830)class11297.N().method_58694(class02484.D);
            int i = this.N(class02830);
            if (this.N(var1) && class02830.N(i).L(class02484.b)) {
               return false;
            } else {
               boolean flag = class02830.i() == 1 && class02830.y(var1);
               int j = !var1.R() && !flag ? this.T() : -1;
               if (!var1.R() && !flag && class11281.y(j)) {
                  return false;
               } else {
                  int k = class11281.L(class11297.y());
                  if (class02830.B() != i) {
                     class05462.N(class11297.N(), i);
                     ((class06202)super.y_0).NE().N(new class02575(k, i));
                  }

                  class12029 class12029 = class11938.m().N(0, k, 1, class07510.field_7790).N(0, 45, 0, class07510.field_7790);
                  if (!var1.R()) {
                     if (flag) {
                        class12029.N(0, k, 0, class07510.field_7790);
                        this.L_1 = class11297.y();
                     } else {
                        class12029.N(0, class11281.L(j), 0, class07510.field_7790);
                        this.L_0 = j;
                     }
                  }

                  int l = this.Y();
                  class12029.y((class12040)(var2x -> {
                     this.j();
                     this.L_2 = class11938.j().y() + l;
                  })).y();
                  this.L_3 = false;
                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   @class11782
   public void N(class10996 var1) {
      if (!((class04453)((class06202)super.y_0).T_4).method_6047().L(class02484.e) && !this.k()) {
         if (this.s()) {
            this.n();
         } else if (this.t()) {
            this.P();
         } else {
            this.n();
         }
      }
   }

   @class11782
   public void N(class10990 var1) {
      this.j();
      if ((class03448)((class06202)super.y_0).T_3 != null
         && var1.u() instanceof class00509 class00509
         && class00509.N((class03448)((class06202)super.y_0).T_3) == (class04453)((class06202)super.y_0).T_4
         && class00509.N() == 35) {
         this.L_3 = true;
         this.L_2 = class11938.j().y() - 5;
      }
   }

   private boolean N(class06584 var1) {
      return var1.y().N(class02484.e) && var1.L(class02484.b);
   }

   private void N(class11297 var1, class06584 var2) {
      this.j();
      if (!this.N(var2) || !var1.N().L(class02484.b)) {
         int i = var1.y();
         int j = this.Y();
         if ((Integer)this.L_0 == -1 && !var2.R()) {
            this.L_0 = this.N(i, j);
            if ((Integer)this.L_0 != -1) {
               this.L_3 = false;
            }
         } else {
            if (this.N(i, j) != -1) {
               this.L_3 = false;
            }
         }
      }
   }

   private int N(int var1, int var2) {
      int i = this.y(var1);
      if (i == -1) {
         return -1;
      } else {
         class11938.m()
            .N(((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, i, 40, class07510.field_7791)
            .y((class12040)(var2x -> {
               this.j();
               this.L_2 = class11938.j().y() + var2;
            }))
            .y();
         return var1;
      }
   }

   private int Y() {
      this.j();
      return !((class11711)this.u_0).N() && !((class11699)this.u_1).N() ? 0 : 160;
   }
}
