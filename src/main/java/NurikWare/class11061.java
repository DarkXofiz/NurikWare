package NurikWare;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00743;
import minecraft.class02484;
import minecraft.class02824;
import minecraft.class02833;
import minecraft.class04453;
import minecraft.class05298;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07469;
import minecraft.class07471;
import minecraft.class07510;

public class class11061 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object y_5;
   public boolean y_init;

   public void L() {
      if (this.B()) {
         this.N((Integer)this.y_1);
      }

      this.s();
   }

   private boolean L(class06584 var1) {
      return var1.B() == class06570.la || var1.B() == class06570.Gw;
   }

   public void M() {
      if (!class11281.y((Integer)this.y_1)) {
         this.P();
      }
   }

   private void P() {
      this.N((Integer)this.y_1);
      this.s();
   }

   public class11061() {
      super();
      this.E();
      this.y_0 = class06202.Nq();
      this.y_1 = -1;
      this.y_2 = class06584.E;
   }

   static {
      W();
   }

   private boolean B() {
      return (class04453)((class06202)this.y_0).T_4 != null && !class11281.y((Integer)this.y_1) && (this.u() || class11938.m().u());
   }

   public void i() {
      if (!class11281.y((Integer)this.y_1)) {
         this.y_3 = (Integer)this.y_3 + 1;
         int i = (Integer)this.y_5 - 1;
         this.y_5 = i;
         if (i <= 0) {
            this.P();
         }
      }
   }

   private void s() {
      this.y_1 = -1;
      this.y_2 = class06584.E;
      this.y_3 = 0;
      this.y_5 = 0;
   }

   private int z() {
      class07469 class07469 = ((class04453)((class06202)this.y_0).T_4).method_5996(class05298.u);
      if (class07469 == null) {
         return -1;
      } else {
         List<class07471> list = this.N(((class04453)((class06202)this.y_0).T_4).method_6079());
         Set set = list.stream().map(class07471::N).collect(Collectors.toSet());
         List<class07471> list1 = class07469.L().stream().filter(var1x -> !set.contains(var1x.N())).toList();
         double d0 = class07469.y();
         double d1 = this.N(d0, list1, list);
         int i = -1;
         class00743<class06584> class00743 = ((class04453)((class06202)this.y_0).T_4).method_31548().u();
         int j = ((class04453)((class06202)this.y_0).T_4).method_31548().N();

         for (int k = 0; k < class00743.size(); k++) {
            if (k != j) {
               class06584 class06584 = (class06584)class00743.get(k);
               if (!class06584.R() && this.L(class06584)) {
                  List<class07471> list2 = this.N(class06584);
                  if (!list2.isEmpty()) {
                     double d2 = this.N(d0, list1, list2);
                     if (d2 > d1) {
                        d1 = d2;
                        i = k;
                     }
                  }
               }
            }
         }

         return i;
      }
   }

   public boolean u() {
      return !class11281.y((Integer)this.y_1)
         && (class04453)((class06202)this.y_0).T_4 != null
         && !((class06584)this.y_2).R()
         && ((class04453)((class06202)this.y_0).T_4).method_6079().N(((class06584)this.y_2).B());
   }

   private boolean y(class06584 var1) {
      return var1.B() == class06570.la || var1.L(class02484.e);
   }

   public boolean y() {
      return class11281.y((Integer)this.y_1) || (Integer)this.y_3 >= (Integer)this.y_4;
   }

   private void E() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_1 = 0;
         this.y_3 = 0;
         this.y_4 = 0;
         this.y_5 = 0;
      }
   }

   private double N(double var1, List<class07471> var3, List<class07471> var4) {
      Set set = var4.stream().map(class07471::N).collect(Collectors.toSet());
      double d0 = 0.0;
      double d1 = 0.0;
      double d2 = 1.0;

      for (class07471 class07471 : Stream.concat(var3.stream().filter(var1x -> !set.contains(var1x.N())), var4.stream()).toList()) {
         switch (((int[])class11092.N_0)[class07471.L().ordinal()]) {
            case 1:
               d0 += class07471.y();
               break;
            case 2:
               d1 += class07471.y();
               break;
            case 3:
               d2 *= 1.0 + class07471.y();
         }
      }

      double d3 = var1 + d0;
      return (d3 + d3 * d1) * d2;
   }

   public void N() {
      if (!class11281.y((Integer)this.y_1) && !class11938.m().u()) {
         if (!this.u()) {
            this.s();
         }
      }
   }

   private List<class07471> N(class06584 var1) {
      return ((class02833)var1.a_(class02484.b, class02833.N))
         .y()
         .stream()
         .filter(var0 -> var0.N() == class05298.u && var0.L().y(class07085.field_6171))
         .<class07471>map(class02824::y)
         .toList();
   }

   private void N(int var1) {
      class11938.m().N(0, class11281.L(var1), 40, class07510.field_7791).y();
   }

   private static void W() {
      N_0 = 40;
      N_1 = 5;
      N_2 = 1;
      N_3 = 2;
   }

   public void R() {
      if (!class11281.y((Integer)this.y_1)) {
         this.y_5 = 5;
      } else if (!this.y(((class04453)((class06202)this.y_0).T_4).method_6079())) {
         int i = this.z();
         if (!class11281.y(i)) {
            this.y_2 = (class06584)((class04453)((class06202)this.y_0).T_4).method_31548().u().get(i);
            this.N(i);
            this.y_1 = i;
            this.y_3 = 0;
            this.y_4 = class11938.m().u() ? 2 : 1;
            this.y_5 = 5;
         }
      }
   }
}
