package NurikWare;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00496;
import minecraft.class00524;
import minecraft.class01488;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class05410;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07482;
import minecraft.class07510;
import org.apache.commons.lang3.RandomUtils;

@class11080(
   L = "AutoArmor",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoArmor extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public boolean L_init;

   private boolean P() {
      return ((class07482)((class04453)((class06202)super.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b == 0
         && !((class05096)((class06202)super.y_0).v_3 instanceof class01488);
   }

   public AutoArmor() {
      super();
      this.m();
      this.L_0 = class11524.N(this, "delay-in-ticks", new class11494(0.0F, 10.0F), new class11494(2.0F, 5.0F), 1.0F);
      this.L_1 = class11524.N(this, "swap-only-while-standing", false);
      this.L_2 = class11524.N(this, "swap-only-while-inventory-open", false);
      this.L_3 = new class11478();
   }

   private void m() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_4 = false;
         this.L_5 = 0;
      }
   }

   private void v() {
      this.m();
      this.L_5 = RandomUtils.insecure().randomInt((int)((class11525)this.L_0).i().N(), (int)((class11525)this.L_0).i().L());
   }

   private void N(class00524 var1) {
      this.m();
      if (var1.N() == 0) {
         if (var1.L().stream().anyMatch(var0 -> !var0.R())) {
            this.L_4 = true;
         }
      }
   }

   private void N(int var1, class11933 var2) {
      if (class11281.u(var1)) {
         class11322.N(var1);
         class11907.N(class07050.field_5808);
         class11322.i();
      } else if (((class04453)((class06202)super.y_0).T_4).method_6118(var2.y()).R()) {
         class11938.m().N(0, var1, 0, class07510.field_7794).y();
      } else {
         int i = ((class04453)((class06202)super.y_0).T_4).method_31548().N() % 8 + 1;
         class11938.m().N(0, var1, i, class07510.field_7791).N(0, var2.N(), i, class07510.field_7791).N(0, var1, i, class07510.field_7791).y();
      }
   }

   @class11782
   public void N(class10992 var1) {
      this.m();
      if (((class04453)((class06202)super.y_0).T_4).field_6012 % 20 == 0) {
         this.L_4 = true;
      }

      if ((Boolean)this.L_4 && this.P()) {
         if (!class11938.m().u()) {
            if ((class05096)((class06202)super.y_0).v_3 instanceof class05410 || !((class11507)this.L_2).i()) {
               if (!((class04453)((class06202)super.y_0).T_4).k() || !((class11507)this.L_1).i()) {
                  ArrayList arraylist = new ArrayList<>(
                     List.of(
                        class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_1,
                        class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_3,
                        class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_4
                     )
                  );
                  if (!class11281.y(class06570.sT)) {
                     arraylist.add(class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_2);
                  }

                  if (arraylist.stream().allMatch(var0 -> class11896.N(var0).isEmpty())) {
                     this.L_4 = false;
                  } else {
                     for (class11933 class11933 : arraylist) {
                        if (((class11478)this.L_3).N((Integer)this.L_5)) {
                           class11896.N(class11933).ifPresent(var2x -> {
                              this.m();
                              this.N(var2x.y(), class11933);
                              this.v();
                              ((class11478)this.L_3).y();
                           });
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @class11782
   private void N(class10990 var1) {
      this.m();
      switch (var1.u()) {
         case class00524 class00524:
            this.N(class00524);
            break;
         case class00496 class00496:
            this.L_4 = true;
            break;
         default:
      }
   }
}
