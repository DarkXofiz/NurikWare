package NurikWare;

import java.util.List;
import java.util.WeakHashMap;
import minecraft.class00380;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class02998;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06586;
import minecraft.class06660;
import minecraft.class07050;
import minecraft.class08036;

public class class11572 extends class11590 {
   public Object y_0;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;
   public static Object L_4;

   private static void M() {
      L_0 = 8;
      L_1 = (byte)1;
      L_2 = (byte)0;
      L_3 = (byte)3;
      L_4 = (byte)2;
   }

   public class11572(UseTracker var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.i();
      this.y_0 = new WeakHashMap();
   }

   static {
      N();
      M();
   }

   private void i() {
   }

   // $VF: One or more variable merging failures!
   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void y(Object var1) {
      this.i();
      switch (var1) {
         case class11396 class11396:
            if (((class11396)var1).N() instanceof class08036 class08036) {
               ((WeakHashMap)this.y_0).remove(class08036);
            }
            break;
         case class10990 class10990:
            label73: {
               if (!(class10990.u() instanceof class06660 class06660x)) {
                  return;
               }

               class06660 class06660 = class06660x;

               try {
                  k = class06660.N();
               } catch (Throwable throwable1) {
                  throw new MatchException(throwable1.toString(), throwable1);
               }

               int var10 = k;
               class06660 = class06660x;

               try {
                  class06660.y();
               } catch (Throwable throwable) {
                  throw new MatchException(throwable.toString(), throwable);
               }

               if ((class04453)((class06202)super.N_0).T_4 == null
                  || ((class04453)((class06202)super.N_0).T_4).method_5628() == var10
                  || !(((class03448)((class06202)super.N_0).T_3).method_8469(var10) instanceof class04477 class04477)) {
                  return;
               }

               int j = class11938.j().y();
               List<class02998<?>> class11543 = (class11543)((WeakHashMap)this.y_0).get(class04477);

               <unknown> ;
               for (class02998<?> class02998 : x) {
                  if (class02998.N() == 8) {
                     byte b0 = (Byte)class02998.L();
                     if (class11543 != null) {
                        if (j - class11543.y() >= 32) {
                           this.N(class04477, class11543, b0);
                        } else {
                           ((WeakHashMap)this.y_0).remove(class04477);
                        }
                     }

                     this.N(class04477, b0, j);
                  }
               }
               break label73;
            }
         case null:
         default:
      }
   }

   private boolean N(class06584 var1) {
      return !class11929.U(var1) && !(var1.B() instanceof class06586) && var1.B() != class06570.jT;
   }

   private void N(class04477 var1, class11543 var2, byte var3) {
      this.i();

      for (class07050 class07050 : class07050.values()) {
         class06584 class06584xx = var1.method_5998(class07050);
         class06584 class06584x = var2.N();
         boolean flag = class06584xx.B() != class06570.nP || this.N(class06584x);
         if (!flag || !this.N(class06584xx)) {
            if (!flag) {
               class06584xx = class06584x;
            }

            if (var3 == (class07050 == class07050.field_5808 ? 0 : 2)) {
               class06584 class06584xx = class06584xx;
               class11923.N(() -> this.N((class08036)var1, class06584));
               ((WeakHashMap)this.y_0).remove(var1);
               break;
            }
         }
      }
   }

   private static void N() {
   }

   private void N(class08036 var1, class06584 var2) {
      class00380 class00380 = new class00380(var2);
      class05216 class05216x = var1.method_5476().L();
      class00392 class00392 = var2.B() instanceof class06586 ? var2.k() : var2.Y();
      Object object = class06541.N(class05216x.getString()).endsWith(" ") ? "" : " ";
      class05216 class05216x = class05216x.i(class06541.field_1080 + object + class12020.N("food-used") + " ").y(class00392).y(class00405.N.N(class00380));
      class11303.N(new class11288((UseTracker)super.u_0), (class00392)class05216x);
   }

   private void N(class04477 var1, byte var2, int var3) {
      this.i();

      for (class07050 class07050 : class07050.values()) {
         class06584 class06584 = var1.method_5998(class07050);
         if (!this.N(class06584) && var2 == (class07050 == class07050.field_5808 ? 1 : 3)) {
            ((WeakHashMap)this.y_0).put(var1, new class11543(var3, class06584));
            break;
         }
      }
   }
}
