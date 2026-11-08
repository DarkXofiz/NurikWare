package NurikWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class01421;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04499;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07488;
import minecraft.class07517;
import minecraft.class08007;
import minecraft.class08045;
import minecraft.class08591;
import org.joml.Matrix4fStack;
import org.joml.Vector2f;

@class11080(
   L = "Predictions",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class Predictions extends class11067 {
   public static Object L_0;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object i_0;
   public Object i_1;

   private boolean L(class07049 var1) {
      if (var1.method_24828()) {
         return false;
      } else if (var1.field_6014 == var1.method_23317() && var1.field_5969 == var1.method_23321()) {
         return false;
      } else if (var1.field_5960) {
         return false;
      } else if (!var1.method_5805()) {
         return false;
      } else {
         return var1 instanceof class07517 ? !((class03448)((class06202)super.y_0).T_3).method_8600(var1, var1.method_5829()).iterator().hasNext() : true;
      }
   }

   public Predictions() {
      super();
      this.v();
      this.i_0 = new class11254("pearl", true, new class11228((class11225)class11225.L_2));
      this.i_1 = new class11254("trident", true, new class11249((class11225)class11225.L_1));
      this.u_0 = new class11254("arrow", true, new class11249((class11225)class11225.L_0));
      this.u_1 = new class11254("potions", true, new class11228((class11225)class11225.L_3));
      this.u_2 = new class11254("snowball", true, new class11228((class11225)class11225.L_4));
      this.u_3 = new class11254("windcharge", true, new class11228((class11225)class11225.L_5));
      this.u_4 = class11524.y(
         this,
         "predict-entity",
         (class11254)this.i_1,
         (class11254)this.i_0,
         (class11254)this.u_0,
         (class11254)this.u_1,
         (class11254)this.u_2,
         (class11254)this.u_3
      );
      this.u_5 = class11524.N(this, "line-color", -11104513);
      this.u_6 = new ArrayList();
   }

   static {
      n();
   }

   private static void n() {
      L_0 = 4.0F;
   }

   private void v() {
   }

   private class06584 y(class07049 var1) {
      if (var1 instanceof class07488) {
         return class06570.nz.E();
      } else if (var1 instanceof class07517) {
         return class06570.db.E();
      } else if (var1 instanceof class08007 class08007) {
         return class08007.B();
      } else if (var1 instanceof class08591 class08591) {
         return class08591.L();
      } else if (var1 instanceof class08045) {
         return class06570.jP.E();
      } else {
         return var1 instanceof class04499 ? class06570.Gz.E() : class06584.E;
      }
   }

   private class11254 N(class07049 var1) {
      this.v();
      if (var1 instanceof class07488) {
         return (class11254)this.i_0;
      } else if (var1 instanceof class07517) {
         return (class11254)this.i_1;
      } else if (var1 instanceof class08007) {
         return (class11254)this.u_0;
      } else if (var1 instanceof class08591) {
         return (class11254)this.u_1;
      } else if (var1 instanceof class08045) {
         return (class11254)this.u_2;
      } else {
         return var1 instanceof class04499 ? (class11254)this.u_3 : null;
      }
   }

   @class11782
   public void N(class10996 var1) {
      this.v();
      ((List)this.u_6).clear();

      for (class07049 class07049 : ((class03448)((class06202)super.y_0).T_3).M()) {
         class11254 class11254 = this.N(class07049);
         if (class11254 != null && class11254.U() && this.L(class07049)) {
            ((List)this.u_6).add(class11254.N().N(class07049, class07049.method_73189(), class07049.method_18798()));
         }
      }
   }

   @class11782
   public void N(class09321 var1) {
      this.v();
      if (!((List)this.u_6).isEmpty()) {
         class11174 class11174 = (class11174)class11190.N_2;
         class01421 class01421 = var1.L();
         class01421.N();
         class06889 class06889xxxx = var1.y().y();
         Matrix4fStack matrix4fstack = var1.R();
         int i = ((class11515)this.u_5).i();
         int j = class11300.y(i);

         for (class11241 class11241 : (List)this.u_6) {
            class11241.N().ifPresent(var2x -> {
               if (var2x.u() instanceof class08591) {
                  class11226.N(class06889xxxx, var2x.N(), 4.0F, i);
               }
            });
            List<class06889> list = class11241.y();
            if (!list.isEmpty()) {
               class06889 class06889x = list.getFirst();

               for (int k = 1; k < list.size(); k++) {
                  class06889 class06889xx = list.get(k);
                  class06889 class06889xxx = class06889x.u(class06889xxxx);
                  class06889 class06889xxxx = class06889xx.u(class06889xxxx);
                  class11174.R()
                     .N(matrix4fstack, (float)class06889xxx.M, (float)class06889xxx.B, (float)class06889xxx.Z)
                     .N(matrix4fstack, (float)class06889xxxx.M, (float)class06889xxxx.B, (float)class06889xxxx.Z)
                     .y(class11300.N(i, (int)(Math.min(1.0F, (k - 1) / 5.0F) * j)))
                     .y(class11300.N(i, (int)(Math.min(1.0F, k / 5.0F) * j)))
                     .N(0.0F)
                     .y();
                  class06889x = class06889xx;
               }
            }
         }

         class01421.y();
         class11226.N(var1);
      }
   }

   @class11782
   public void N(class10967 var1) {
      this.v();
      if (!((List)this.u_6).isEmpty()) {
         class11174 class11174 = (class11174)class11190.y_3;
         class09093 class09093 = class09080.u();
         Iterator iterator = ((List)this.u_6).iterator();

         while (iterator.hasNext()) {
            ((class11241)iterator.next()).N().ifPresent(var3x -> {
               class06889 class06889 = var3x.N().u(((class03386)((class06202)super.y_0).i_5).s().y());
               Vector2f vector2f = class11925.N((float)class06889.M, (float)class06889.B, (float)class06889.Z);
               if (vector2f != null) {
                  vector2f = vector2f.round();
                  int i = var3x.L();
                  float f = i <= 0 ? 0.0F : (float)i / (var3x.u().field_6012 + i);
                  class11925.N(class09093, class11174.u(), "", 16, vector2f.x, vector2f.y, this.y(var3x.u()), i, f);
               }
            });
         }
      }
   }
}
