package NurikWare;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import minecraft.class06069;
import minecraft.class06091;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07623;
import minecraft.class07830;

public class class10555<T extends class06091> extends class07473 {
   private static final int N = 200;
   private final T y;
   private final double L;
   private final double u;
   private long i;

   public void L() {
   }

   private List<class06091> M() {
      return this.y.method_73183().N(class06091.class, this.y.method_5829().M(16.0), var1 -> var1.O() && !var1.method_5779(this.y));
   }

   public class10555(T var1, double var2, double var4) {
      super();
      this.y = (T)var1;
      this.L = var2;
      this.u = var4;
      this.i = -1L;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   private boolean Z() {
      class06069 class06069 = this.y.method_59922();
      class07209 class07209 = this.y
         .method_73183()
         .N(class07830.field_13203, this.y.method_24515().method_10069(-8 + class06069.y(16), 0, -8 + class06069.y(16)));
      return this.y.f().N(class07209.method_10263(), class07209.method_10264(), class07209.method_10260(), this.L);
   }

   public void i() {
      boolean flag = this.y.Q();
      class07623 class07623 = this.y.f();
      if (class07623.U()) {
         List<class06091> list = this.M();
         if (this.y.o() && list.isEmpty()) {
            this.y.B(false);
         } else if (flag && this.y.l().method_19769(this.y.method_73189(), 10.0)) {
            this.y.I();
         } else {
            class06889 class06889x = class06889.L(this.y.l());
            class06889 class06889x = this.y.method_73189();
            class06889x = class06889x.u(class06889x).y(90.0F).L(0.4).i(class06889x);
            class07209 class07209 = class07209.method_49638(class06889x.u(class06889x).u().L(10.0).i(class06889x));
            class07209 = this.y.method_73183().N(class07830.field_13203, class07209);
            if (!class07623.N(class07209.method_10263(), class07209.method_10264(), class07209.method_10260(), flag ? this.u : this.L)) {
               this.Z();
               this.i = this.y.method_73183().N() + 200L;
            } else if (flag) {
               Iterator<class06091> iterator = list.iterator();

               while (iterator.hasNext()) {
                  iterator.next().N(class07209);
               }
            }
         }
      }
   }

   public void u() {
   }

   public boolean N() {
      boolean flag = this.y.method_73183().N() < this.i;
      return this.y.o() && this.y.T() == null && !this.y.method_42148() && this.y.d() && !flag;
   }
}
