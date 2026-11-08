package NurikWare;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import minecraft.class00496;
import minecraft.class02484;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06937;

public class class11428 extends class11807<Notifications> {
   public Object y_0;
   public static Object L_0;
   public static Object L_1;

   private void L() {
   }

   private static void M() {
      L_0 = 10000L;
      L_1 = 4000L;
   }

   public class11428(Notifications var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.L();
      this.y_0 = new HashMap();
   }

   static {
      N();
      M();
   }

   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void y(Object var1) {
      this.L();
      Objects.requireNonNull(var1);
      switch (var1) {
         case class10990 class10990 when ((class10990)).u() instanceof Object object:
            this.N((class00496)object);
            break;
         case class10996 var6:
            ((Map)this.y_0).entrySet().removeIf(var0 -> System.currentTimeMillis() - (Long)var0.getValue() > 10000L);
            break;
         default:
      }
   }

   private static void N() {
   }

   private void N(class00496 var1) {
      this.L();
      if (var1.N() == 0 && (class04453)((class06202)super.N_0).T_4 != null) {
         class06584 class06584xx = var1.L();
         int i = var1.y();
         class06937 class06937 = ((class04453)((class06202)super.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.L(i);
         if (class06937.R() && class06584xx.W()) {
            class06581 class06581 = class06584xx.B();
            float f = class11929.M(class06584xx);
            if (!(f < 0.0F) && !(f > 7.0F)) {
               class06584 class06584x = class06937.i();
               if (class06584x.W() && class06584x.P() < class06584xx.P()) {
                  long j = System.currentTimeMillis();
                  Long olong = (Long)((Map)this.y_0).get(i);
                  if (olong == null || j - olong >= 10000L) {
                     ((Map)this.y_0).put(i, j);
                     if (i > 4 && i < 9 && class06581.R().N(class02484.o)) {
                        N(class06584xx, "item-almost-break");
                     } else if (((class04453)((class06202)super.N_0).T_4).method_31548().N() + 36 == i) {
                        class06584 class06584xx = ((class04453)((class06202)super.N_0).T_4).method_6047();
                        if (!class06584xx.R()) {
                           N(class06584xx, "item-in-hand-almost-break");
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static void N(class06584 var0, String var1) {
      class11938.g().i().L().N(new class11869(var0.t())).N(new class11857(class12020.N(var1))).N(4000L).N();
   }
}
