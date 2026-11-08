package NurikWare;

import java.util.Comparator;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07209;
import minecraft.class07314;
import minecraft.class07482;
import minecraft.class07510;

@class11080(
   L = "AutoTool",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoTool extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public boolean L_init;

   public AutoTool() {
      super();
      this.b();
      this.L_0 = new class11312();
      this.L_4 = -1;
      this.L_5 = class11524.N(this, "hotbar-only", false);
   }

   private void b() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = false;
         this.L_2 = false;
         this.L_3 = 0;
         this.L_4 = 0;
      }
   }

   private void s() {
      this.b();
      this.L_4 = class11938.j().y();
      this.N(class11938.j().y() - (Integer)this.L_3 > 0, (Boolean)this.L_1, false);
   }

   @class11782
   public void N(class11393 var1) {
      this.s();
   }

   @class11782
   public void N(class11375 var1) {
      this.s();
   }

   @class11782
   public void N(class10992 var1) {
      this.b();
      this.N((Boolean)this.L_1, class11938.j().y() - (Integer)this.L_3 > 10, true);
   }

   private Optional<class11297> N(class07209 var1) {
      class00500 class00500 = ((class03448)((class06202)super.y_0).T_3).method_8320(var1);
      return class11281.L((class11328)(var2x -> this.N(var2x, class00500) > 1.0F))
         .max(Comparator.<class11297>comparingDouble(var1x -> var1x.N().y(class00500) ? 1.0 : 0.0).thenComparing(var2x -> this.N(var2x.N(), class00500)));
   }

   @class11782
   public void N(class11399 var1) {
      this.b();
      if ((Boolean)this.L_1) {
         class11322.M();
      }
   }

   private void N(boolean var1, boolean var2, boolean var3) {
      this.b();
      if (var1 && var2 && !(Boolean)this.L_2) {
         if (!((class11312)this.L_0).y()) {
            if ((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3
                  != ((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2
               || class11938.m().u()) {
               return;
            }

            class12029 class12029 = class11938.m();
            ((class11312)this.L_0).y(var1x -> class12029.N(0, var1x.N(), var1x.y(), class07510.field_7791));
            class12029.y();
         }

         if (var3) {
            class11322.i();
         } else {
            class11322.y();
         }

         this.L_1 = false;
      }
   }

   @class11782
   public void N(class09343 var1) {
      this.b();
      ((class11312)this.L_0).y(var0 -> {});
      this.L_1 = false;
      this.L_2 = false;
   }

   private float N(class06584 var1, class00500 var2) {
      float f = var1.N(var2);
      if (f > 1.0F) {
         f += class11929.N(var1, class07314.n);
      }

      return f;
   }

   @class11782
   public void N(class09355 var1) {
      this.b();
      if ((Integer)this.L_4 != class11938.j().y()) {
         this.L_3 = class11938.j().y();
         if ((Boolean)this.L_2) {
            var1.N();
         } else {
            this.N(var1.L()).ifPresent(var2 -> {
               this.b();
               int i = var2.y();
               int j = ((class04453)((class06202)super.y_0).T_4).method_31548().N();
               if (i != j) {
                  if (class11281.u(i)) {
                     class11322.u(i);
                  } else if (!((class11507)this.L_5).i()) {
                     var1.N();
                     this.L_2 = true;
                     ((class11312)this.L_0).N(j, i);
                     class06584 class06584 = var2.N();
                     class11938.m().N(0, i, j, class07510.field_7791).y((class12040)(var3x -> {
                        this.b();
                        this.L_2 = false;
                        if (!class06584.L(((class04453)((class06202)super.y_0).T_4).method_31548().method_5438(j), class06584)) {
                           ((class11312)this.L_0).N();
                        }
                     })).y();
                  }

                  this.L_1 = true;
               }
            });
         }
      }
   }

   @class11782
   public void N(class11382 var1) {
      this.s();
   }
}
