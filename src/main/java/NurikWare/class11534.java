package NurikWare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05515;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07843;

public class class11534 {
   public static Object N_0 = class06202.Nq();
   public Object y_0;
   public Object y_1;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public boolean L_init;

   public boolean L() {
      return (Boolean)this.L_1;
   }

   private void L(class11499 var1) {
      if (!(Boolean)this.L_3) {
         this.L_4 = ((class04453)((class06202)N_0).T_4).method_36454();
         this.L_5 = ((class04453)((class06202)N_0).T_4).method_36455();
      }

      ((class04453)((class06202)N_0).T_4).method_36456(var1.y());
      ((class04453)((class06202)N_0).T_4).method_36457(var1.R());
      this.L_2 = class11938.j().y();
      this.L_3 = true;
   }

   public float M() {
      return (Float)this.L_4;
   }

   private static void P() {
      N_0 = null;
   }

   private void T() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = false;
         this.L_2 = 0;
         this.L_3 = false;
         this.L_4 = 0.0F;
         this.L_5 = 0.0F;
         this.L_6 = false;
         this.L_7 = false;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = false;
      }
   }

   public class11534() {
      super();
      this.T();
      this.L_0 = new ArrayList();
      class11938.L().y(this);
   }

   static {
      P();
   }

   public List<class11499> B() {
      return (List<class11499>)this.L_0;
   }

   public boolean Z() {
      return (Boolean)this.L_7;
   }

   public int i() {
      return (Integer)this.L_2;
   }

   public boolean z() {
      return (Boolean)this.y_0;
   }

   public boolean u() {
      return (Boolean)this.L_3;
   }

   private void y(class11375 var1) {
      class07050 class07050 = var1.i();
      if (this.N(((class04453)((class06202)N_0).T_4).method_5998(class07050))) {
         var1.N();
         class11499 class11499 = class11505.L().N(class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_0);
         this.L(class11499);
         y(class11499);
         class11938.Z()
            .y(
               2,
               () -> {
                  this.L(class11499);
                  y(class11499);
                  ((class03443)((class06202)N_0).T_2)
                     .N(
                        (class03448)((class06202)N_0).T_3,
                        var1xx -> new class07843(
                           class07050, var1xx, ((class04453)((class06202)N_0).T_4).method_36454(), ((class04453)((class06202)N_0).T_4).method_36455()
                        )
                     );
                  ((class04453)((class06202)N_0).T_4).method_6104(class07050);
               }
            );
      }
   }

   public boolean y() {
      return (Boolean)this.L_6;
   }

   public static void y(class11499 var0) {
      class11534 class11534 = class11938.v();
      if (!(Boolean)class11534.y_0) {
         ((List)class11534.L_0).add(var0);
         ((List)class11534.L_0).sort(Comparator.comparingInt(var0x -> var0x.z().N()));
      }
   }

   private void E() {
      if (class11938.j().y() - 20 <= (Integer)this.L_2 && (Boolean)this.L_6) {
         float f = ((class04453)((class06202)N_0).T_4).method_36454() + class04995.R((Float)this.L_4 - ((class04453)((class06202)N_0).T_4).method_36454());
         if (Math.abs(f - ((class04453)((class06202)N_0).T_4).method_36454()) < 2.0F
            && Math.abs((Float)this.L_5 - ((class04453)((class06202)N_0).T_4).method_36455()) < 2.0F) {
            this.W();
            return;
         }

         if ((class11538)this.y_1 == class11538.staticFields_002f846683278372c86f24838365e6c39_1) {
            float f1;
            if (class11938.j().y() - 10 < (Integer)this.L_2) {
               f1 = class11908.y(1.0F, 5.0F);
            } else {
               f1 = class11908.y(10.0F, 35.0F);
            }

            class11499 class11499x = new class11499(
                  ((class04453)((class06202)N_0).T_4).method_36454() + class04995.N(f - ((class04453)((class06202)N_0).T_4).method_36454(), -f1, f1),
                  ((class04453)((class06202)N_0).T_4).method_36455()
                     + class04995.N((Float)this.L_5 - ((class04453)((class06202)N_0).T_4).method_36455(), -f1, f1)
               )
               .N(true);
            ((class04453)((class06202)N_0).T_4).method_36456(class11499x.y());
            ((class04453)((class06202)N_0).T_4).method_36457(class11499x.R());
         } else {
            class11499 class11499 = new class11499(
                  class04995.B(0.5F, ((class04453)((class06202)N_0).T_4).method_36454(), f),
                  class04995.B(0.5F, ((class04453)((class06202)N_0).T_4).method_36455(), (Float)this.L_5)
               )
               .N(true);
            ((class04453)((class06202)N_0).T_4).method_36456(class11499.y());
            ((class04453)((class06202)N_0).T_4).method_36457(class11499.R());
         }
      } else {
         this.W();
      }
   }

   public float N() {
      return (Float)this.L_5;
   }

   @class11782(
      y = class11777.AFTER
   )
   public void N(class11384 var1) {
      if (!var1.y()) {
         if (!(Boolean)this.L_1 && (Boolean)this.L_3) {
            var1.N();
            this.L_4 = (Float)this.L_4 + (float)var1.u() * 0.15F;
            this.L_5 = (Float)this.L_5 + (float)var1.L() * 0.15F;
            this.L_5 = Math.clamp((Float)this.L_5, -90.0F, 90.0F);
         }
      }
   }

   @class11782
   public void N(class11375 var1) {
      if (!(Boolean)this.L_1 && (Boolean)this.L_3) {
         this.y(var1);
      }
   }

   @class11782
   public void N(class09316 var1) {
      if (!(Boolean)this.L_1 && (Boolean)this.L_3) {
         var1.N((Float)this.L_4);
         var1.y((Float)this.L_5);
      }
   }

   public static void N(class11499 var0) {
      class11534 class11534 = class11938.v();
      if ((class04453)((class06202)N_0).T_4 != null) {
         ((List)class11534.L_0).clear();
         class11534.L_1 = var0.B();
         class11534.L_7 = var0.u();
         class11534.L_6 = var0.E();
         class11534.y_1 = var0.N();
         class11534.L(var0);
         class11534.y_0 = true;
      }
   }

   @class11782
   public void N(class11394 var1) {
      if (!(Boolean)this.L_1 && (Boolean)this.L_3) {
         var1.y((Float)this.L_4);
         var1.N((Float)this.L_5);
      }
   }

   @class11782
   public void N(class11385 var1) {
      if (!(Boolean)this.L_1 && (Boolean)this.L_3 && !(Boolean)this.L_7) {
         class11902.N(var1, (Float)this.L_4);
      }
   }

   @class11782(
      y = class11777.LISTENER
   )
   public void N(class10992 var1) {
      this.y_0 = false;
      if ((class04453)((class06202)N_0).T_4 != null) {
         if (class11938.j().y() - 1 > (Integer)this.L_2 && (Boolean)this.L_3) {
            this.E();
         }

         Iterator iterator = ((List)this.L_0).iterator();

         while (iterator.hasNext()) {
            class11499 class11499 = (class11499)iterator.next();
            this.L_1 = class11499.B();
            this.L_7 = class11499.u();
            this.L_6 = class11499.E();
            this.y_1 = class11499.N();
            this.L(class11499);
            iterator.remove();
         }
      }
   }

   private boolean N(class06584 var1) {
      if (var1.N(class06570.nz)) {
         return true;
      } else if (var1.N(class06570.Gz)) {
         return true;
      } else if (var1.N(class06570.dw)) {
         return true;
      } else {
         return var1.N(class06570.GB) ? true : var1.B() instanceof class05515;
      }
   }

   private void W() {
      if ((Boolean)this.L_3) {
         ((class04453)((class06202)N_0).T_4)
            .method_36456(
               ((class04453)((class06202)N_0).T_4).method_36454() + class04995.R((Float)this.L_4 - ((class04453)((class06202)N_0).T_4).method_36454())
            );
         ((class04453)((class06202)N_0).T_4).u_0 = ((class04453)((class06202)N_0).T_4).method_36454();
         ((class04453)((class06202)N_0).T_4).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = ((class04453)((class06202)N_0).T_4).method_36454();
         ((class04453)((class06202)N_0).T_4).method_36457(class04995.N((Float)this.L_5, -90.0F, 90.0F));
      }

      this.L_1 = false;
      this.L_3 = false;
   }

   public class11538 R() {
      return (class11538)this.y_1;
   }
}
