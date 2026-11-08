package NurikWare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;

public abstract class class11053 extends class11535 {
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public boolean y_init;

   public boolean L(class06183 var1) {
      return var1.N() == class07113.field_1333;
   }

   public void L() {
      this.P();
      if ((Integer)this.y_2 >= 0) {
         this.y_2 = (Integer)this.y_2 - 1;
      }

      if (!this.u()) {
         this.B();
         class11019 class11019 = this.N();
         if (class11019 != null) {
            for (class07050 class07050 : class07050.values()) {
               if (this.N(((class04453)((class06202)this.y_0).T_4).method_5998(class07050))) {
                  class06889 class06889 = this.N(class11019.N(), ((class04453)((class06202)this.y_0).T_4).method_73189().y(0.0, -0.5, 0.0));
                  class11499 class11499xx = class11505.N();
                  class11499 class11499x = class11505.N(class11499xx, class06889);
                  class11499 class11499xx = this.N(class11019, class06889, class11499x);
                  class06183 class06183x = this.N(class11499xx.y(), class11499xx.R(), class11019);
                  class06183 class06183x = this.N(class11499xx.y(), class11499xx.R(), class11019);
                  if (this.N(class06183x, class06183x)) {
                     class06183x = class06183x;
                     class11499xx = class11499xx;
                  }

                  if (this.y(class06183x, class07050)) {
                     this.N(class06183x, class07050);
                     this.N(class11499xx, true);
                  }

                  this.N(class11499xx, false);
                  break;
               }
            }
         }
      }
   }

   public boolean M() {
      class11322.i();
      return true;
   }

   private void P() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_2 = 0;
      }
   }

   public class11053(Scaffold var1, String var2, boolean var3) {
      super(var2, var3);
      this.P();
      this.y_0 = class06202.Nq();
      this.y_1 = var1;
   }

   public void B() {
      this.P();
      class06584 class06584 = ((class04453)((class06202)this.y_0).T_4).method_6047();
      if (!this.N(class06584)) {
         Optional<class11297> optional = class11281.i(this::N).max(Comparator.comparingInt(var0 -> var0.N().c()));
         if (!optional.isEmpty()) {
            class11322.u(optional.get().y());
         }
      }
   }

   public boolean i() {
      return true;
   }

   public boolean u() {
      return false;
   }

   public boolean y(class06183 var1) {
      this.P();
      return !((Scaffold)this.y_1).P() ? false : var1.i() == class07211.field_11036 && !this.R() && !((class04453)((class06202)this.y_0).T_4).method_24828();
   }

   public boolean y(class06183 var1, class07050 var2) {
      this.P();
      if (this.L(var1)) {
         return false;
      } else if (this.y(var1)) {
         return false;
      } else {
         return !this.N(var1) ? false : this.N(((class04453)((class06202)this.y_0).T_4).method_5998(var2), var1, var2);
      }
   }

   private boolean N(class06584 var1) {
      this.P();
      class06581 class06581 = var1.B();
      if (!(class06581 instanceof class06918)) {
         return false;
      } else {
         class00734 class00734 = ((class06918)class06581).L().W().R((class03448)((class06202)this.y_0).T_3, class07209.field_10980).method_1107();
         return class00734.y() == 1.0 && class00734.u() == 1.0;
      }
   }

   public void N(class11499 var1, boolean var2) {
      class11534.y(var1);
   }

   public boolean N(class06183 var1, class06183 var2) {
      if (var1.N() == class07113.field_1333 || var2.N() == class07113.field_1333) {
         return false;
      } else {
         return !var1.u().equals(var2.u()) ? false : var1.i() == class07211.field_11036 || var1.i() == var2.i();
      }
   }

   public boolean N(class06183 var1) {
      this.P();
      return (Integer)this.y_2 <= 0;
   }

   public class06183 N(float var1, float var2, class11019 var3) {
      this.P();
      class06889 class06889xx = ((class04453)((class06202)this.y_0).T_4).method_5631(var2, var1);
      class06889 class06889x = ((class04453)((class06202)this.y_0).T_4).method_33571();
      class06889 class06889xx = class06889x.i(class06889xx.L(((class04453)((class06202)this.y_0).T_4).method_55754()));
      class06183 class06183 = ((class03448)((class06202)this.y_0).T_3)
         .method_8320(var3.y())
         .R((class03448)((class06202)this.y_0).T_3, var3.y())
         .method_1092(class06889x, class06889xx, var3.y());
      return class06183 == null ? class06183.N(class06889x, class07211.field_11036, var3.y()) : class06183;
   }

   public void N(class06183 var1, class07050 var2) {
      this.P();
      class11907.N(var2, var1);
      class11494 class11494 = ((Scaffold)this.y_1).m();
      this.y_2 = class11908.N((int)class11494.N(), (int)class11494.L());
   }

   public class11019 N() {
      this.P();
      class06889 class06889x = ((class04453)((class06202)this.y_0).T_4).method_73189();
      class06889 class06889x = new class06889(
         ((class04453)((class06202)this.y_0).T_4).method_23317(),
         Math.floor(((class04453)((class06202)this.y_0).T_4).method_23318()) - 0.5,
         ((class04453)((class06202)this.y_0).T_4).method_23321()
      );
      double d0 = ((class04453)((class06202)this.y_0).T_4).method_55754();
      return this.N(class06889x, d0).stream().min(Comparator.comparingDouble(var3x -> this.N(var3x.N(), class06889x).M(class06889))).orElse(null);
   }

   public boolean N(class06584 var1, class06183 var2, class07050 var3) {
      this.P();
      if (var1.B() instanceof class06918 class06918) {
         class06942 class06942 = new class06942((class03448)((class06202)this.y_0).T_3, (class04453)((class06202)this.y_0).T_4, var3, var1, var2);
         if (!class06942.N()) {
            return false;
         } else {
            return ((class03448)((class06202)this.y_0).T_3).method_31606(class06942.method_8037()) ? false : ((class12010)class06918).N(class06942) != null;
         }
      } else {
         return false;
      }
   }

   public List<class11019> N(class06889 var1, double var2) {
      this.P();
      class07218 class07218 = new class07218();
      ArrayList arraylist = new ArrayList();

      for (int i = (int)(-var2); i <= (int)var2; i++) {
         for (int j = (int)(-var2); j <= (int)var2; j++) {
            for (int k = 0;
               k <= (int)var2 - ((class04453)((class06202)this.y_0).T_4).method_18381(((class04453)((class06202)this.y_0).T_4).method_18376());
               k++
            ) {
               class07218.N(var1.M + i, var1.B - k, var1.Z + j);
               class00494 class00494 = ((class03448)((class06202)this.y_0).T_3).method_8320(class07218).R((class03448)((class06202)this.y_0).T_3, class07218);
               if (!class00494.method_1110()) {
                  class00494 = class00494.method_1096(class07218.method_10263(), class07218.method_10264(), class07218.method_10260());
                  arraylist.add(new class11019(class07218.method_10062(), class00494));
               }
            }
         }
      }

      return arraylist;
   }

   public abstract class11499 N(class11019 var1, class06889 var2, class11499 var3);

   public class06889 N(class00494 var1, class06889 var2) {
      class06889 class06889 = null;
      Iterator<class00734> iterator = var1.method_1090().iterator();

      while (iterator.hasNext()) {
         class00734 class00734 = iterator.next().L(0.0, -0.15F, 0.0);
         double d0 = class04995.N(var2.N(), class00734.N, class00734.u);
         double d1 = class04995.N(var2.y(), class00734.y, class00734.i);
         double d2 = class04995.N(var2.L(), class00734.L, class00734.R);
         if (class06889 == null || var2.L(d0, d1, d2) < var2.M(class06889)) {
            class06889 = new class06889(d0, d1, d2);
         }
      }

      return class06889 == null ? var2 : class06889;
   }

   public boolean R() {
      this.P();
      return !((class04453)((class06202)this.y_0).T_4).k() || ((class04453)((class06202)this.y_0).T_4).field_5976;
   }
}
