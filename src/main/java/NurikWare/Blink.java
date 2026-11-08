package NurikWare;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import minecraft.class00381;
import minecraft.class00535;
import minecraft.class00541;
import minecraft.class00559;
import minecraft.class00734;
import minecraft.class01635;
import minecraft.class02275;
import minecraft.class03448;
import minecraft.class04187;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07816;
import minecraft.class07839;
import minecraft.class07848;

@class11080(
   L = "Blink",
   y = class11072.PLAYER,
   N = class11106.BASE
)
public class Blink extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public boolean L_init;

   private void P() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_7 = 0;
      }
   }

   public Blink() {
      super();
      this.P();
      this.L_0 = class11524.N(this, "release-packets-on-hit", true);
      this.L_1 = class11524.N(this, "render-server-position", true);
      this.L_2 = (class11515)class11524.N(this, "render-color", -11104513).N(var1 -> {
         this.P();
         return ((class11507)this.L_1).i();
      });
      this.L_3 = (class11507)class11524.N(this, "auto-release-packets", true).N_6((var1, var2) -> {
         this.P();
         this.L_7 = class11938.j().y();
      });
      this.L_4 = (class11504)class11524.N(this, "release-packets-ticks", 20.0F, 5.0F, 100.0F, 5.0F).N(var1 -> {
         this.P();
         return ((class11507)this.L_3).i();
      });
      this.L_5 = new LinkedList();
   }

   @Override
   public boolean Z() {
      this.P();
      if ((class03448)((class06202)super.y_0).T_3 != null) {
         ((List)this.L_5).clear();
         this.j();
         this.L_7 = class11938.j().y();
         return super.Z();
      } else {
         return false;
      }
   }

   @Override
   public boolean i() {
      this.t();
      return super.i();
   }

   private void t() {
      this.P();
      synchronized ((List)this.L_5) {
         if ((class04453)((class06202)super.y_0).T_4 == null) {
            ((List)this.L_5).clear();
         } else {
            Iterator iterator = ((List)this.L_5).iterator();

            while (iterator.hasNext()) {
               class11910.N((class00381<?>)iterator.next());
            }

            ((List)this.L_5).clear();
            this.L_7 = class11938.j().y();
            this.j();
         }
      }
   }

   private void j() {
      this.P();
      if ((class04453)((class06202)super.y_0).T_4 != null) {
         class00734 class00734 = ((class04453)((class06202)super.y_0).T_4).method_5829();
         this.L_6 = class11884.N(class00734);
      }
   }

   @class11782
   public void N(class09321 var1) {
      this.P();
      if (((class11507)this.L_1).i() && (class11884)this.L_6 != null) {
         class11207.N(
            var1.R(), ((class11174)class11190.N_2).u(), ((class11174)class11190.y_3).u(), var1.y().y(), (class11884)this.L_6, ((class11515)this.L_2).i()
         );
      }
   }

   @class11782
   public void N(class10996 var1) {
      this.P();
      if (((class11507)this.L_3).i()) {
         if (class11938.j().y() - (Integer)this.L_7 > ((class11504)this.L_4).i().intValue()) {
            this.t();
         }
      }
   }

   @class11782(
      y = class11777.AFTER_ALL
   )
   public void N(class10965 var1) {
      this.P();
      if (!var1.y()) {
         class00381<?> class00381 = var1.L();
         if (!(class00381 instanceof class00535)
            && !(class00381 instanceof class07848)
            && !(class00381 instanceof class07816)
            && !(class00381 instanceof class04187)
            && !(class00381 instanceof class00541)
            && !(class00381 instanceof class00559)
            && !(class00381 instanceof class02275)
            && !(class00381 instanceof class01635)
            && !(class00381 instanceof class07839)) {
            var1.N();
            synchronized ((List)this.L_5) {
               ((List)this.L_5).add(class00381);
            }
         } else {
            this.t();
         }
      }
   }

   @class11782
   public void N(class11382 var1) {
      this.P();
      if (((class11507)this.L_0).i()) {
         this.t();
      }
   }
}
