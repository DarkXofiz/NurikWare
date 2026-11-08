package NurikWare;

import com.mojang.serialization.Lifecycle;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01683;
import minecraft.class02484;
import minecraft.class03448;
import minecraft.class04227;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07356;
import minecraft.class07364;
import minecraft.class07510;

@class11080(
   L = "AutoSwap",
   y = class11072.COMBAT,
   N = class11106.BASE
)
public class AutoSwap extends class11067 {
   public Object L_0;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object R_4;
   public Object R_5;
   public Object R_6;
   public Object R_7;

   private void L(int var1) {
      this.s();
      if (class11281.u(var1) && class11938.j().y() - (Integer)this.L_0 > 15) {
         class11322.N(var1);
         ((class01683)((class04453)((class06202)super.y_0).T_4).y_0)
            .M()
            .method_10743(new class07364(class07356.field_12969, class07209.field_10980, class07211.field_11033));
         class11322.L();
         this.L_0 = class11938.j().y();
      } else {
         class11938.m().N(0, class11281.L(var1), 40, class07510.field_7791).y();
      }
   }

   public AutoSwap() {
      super();
      this.s();
      this.u_0 = class11524.N(this, "swap-key", class12002.UNKNOWN);
      this.u_1 = new class11703(this, "multi", false);
      this.i_0 = class11524.N(this, "mode", new class11687(this, "default", true), (class11703)this.u_1);
      this.i_1 = () -> new class11679("shield", true, class11328.N(class06570.lo));
      this.i_2 = () -> new class11679("g-apples", false, class11328.N(class06570.bV));
      this.R_0 = () -> new class11679("any-food", false, class11929::U);
      this.R_1 = () -> new class11679("totem", false, class11328.N(class06570.la));
      this.R_2 = () -> new class11679("fireworks", false, class11328.N(class06570.GJ));
      this.R_3 = () -> new class11679("sunrise-runes", false, var0 -> (var0.B() == class06570.Go || var0.B() == class06570.lG) && var0.I());
      this.R_4 = () -> new class11679(
         "sphere", false, var0 -> var0.B() == class06570.Gw && (var0.y().N(class02484.b) || class11929.N(var0, "sphereEffect"))
      );
      this.R_5 = (class11517)class11524.N(
            this,
            "first-item",
            (class11679)((Supplier)this.i_1).get(),
            (class11679)((Supplier)this.R_1).get(),
            (class11679)((Supplier)this.R_2).get(),
            (class11679)((Supplier)this.R_0).get(),
            (class11679)((Supplier)this.i_2).get(),
            (class11679)((Supplier)this.R_4).get(),
            (class11679)((Supplier)this.R_3).get()
         )
         .N(var1 -> {
            this.s();
            return !((class11703)this.u_1).U();
         });
      this.R_6 = (class11517)class11524.N(
            this,
            "second-item",
            (class11679)((Supplier)this.i_1).get(),
            (class11679)((Supplier)this.R_1).get(),
            (class11679)((Supplier)this.R_2).get(),
            (class11679)((Supplier)this.R_0).get(),
            (class11679)((Supplier)this.i_2).get(),
            (class11679)((Supplier)this.R_4).get(),
            (class11679)((Supplier)this.R_3).get()
         )
         .N(var1 -> {
            this.s();
            return !((class11703)this.u_1).U();
         });
      this.R_7 = class11524.N(this, "log-swapped-item", false);
      class11938.Z()
         .N(
            var0 -> (class03448)var0.T_3 != null
               && ((class03448)var0.T_3).method_30349().method_46759(class04227.yR).map(var0x -> var0x.R().equals(Lifecycle.experimental())).orElse(false),
            ((class11703)this.u_1)::N
         );
   }

   private void s() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = 0;
      }
   }

   @class11782(
      u = true
   )
   public void N(class11400 var1) {
      this.s();
      ((class11807)((class11517)this.i_0).i()).y(var1);
   }

   @class11782
   public void N(class11368 var1) {
      this.s();
      ((class11807)((class11517)this.i_0).i()).y(var1);
   }

   @class11782
   public void N(class10967 var1) {
      this.s();
      ((class11807)((class11517)this.i_0).i()).y(var1);
   }

   public boolean N(Function<Stream<class11297>, Integer> var1) {
      this.s();
      int i = (Integer)var1.apply(class11281.L((class11328)(var0 -> !var0.R())));
      if (class11281.y(i)) {
         return false;
      } else {
         if (((class11507)this.R_7).i()) {
            class06584 class06584 = (class06584)((class04453)((class06202)super.y_0).T_4).method_31548().u().get(i);
            class11938.g().i().y().N(new class11869(class06584.t())).N(new class11857(class06584.Y().L().getString())).N(1500L).N();
         }

         this.L(i);
         return true;
      }
   }

   @class11782
   public void N(class11388 var1) {
      this.s();
      ((class11807)((class11517)this.i_0).i()).y(var1);
   }
}
