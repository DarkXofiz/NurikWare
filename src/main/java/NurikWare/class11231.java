package NurikWare;

import java.util.Iterator;
import java.util.Set;
import minecraft.class04995;
import minecraft.class06889;

public class class11231 implements class11192<class09321> {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;

   class11231(KillEffect var1, class11213 var2) {
      super();
      this.i();
      this.N_5 = var1;
      this.N_3 = ((class09322)class11185.E_5).z("u_projection");
      this.N_4 = ((class09322)class11185.E_5).z("u_view");
      this.N_0 = var2;
      this.N_1 = class11174.N()
         .N(class11204.L().N(((class12036)class12019.N_1).L().N((class12030)class12030.N_0).N()).N((class09322)class11185.E_5).N(4).N())
         .N(var2)
         .N(6)
         .N();
      this.N_2 = class11174.N().N(class11204.L().N((class12036)class12019.N_1).N((class09322)class11185.E_5).N(4).N()).N(var2).N(6).N();
   }

   static {
      N();
   }

   private void i() {
   }

   private static void N() {
   }

   public void execute(class09321 var1) {
      class06889 class06889 = var1.y().y();
      float f = var1.u().N(true);
      class11184 class11184 = ((class11213)this.N_0).M();
      Iterator iterator = ((Set)((KillEffect)this.N_5).u_0).iterator();

      while (iterator.hasNext()) {
         for (class11232 class11232 : ((class11265)iterator.next()).N()) {
            double d0 = class04995.u(f, ((class06889)class11232.y_1).M, ((class06889)class11232.y_0).M);
            double d1 = class04995.u(f, ((class06889)class11232.y_1).B, ((class06889)class11232.y_0).B);
            double d2 = class04995.u(f, ((class06889)class11232.y_1).Z, ((class06889)class11232.y_0).Z);
            int i = (Integer)class11232.N_1 - (Integer)class11232.N_2;
            float f1 = Math.min(1.0F, i / 20.0F);
            int j = class11300.N(((class11515)((KillEffect)this.N_5).i_1).i(), (int)(255.0F * f1));
            class11184.N((float)(d0 - class06889.M), (float)(d1 - class06889.B), (float)(d2 - class06889.Z)).N((Float)class11232.N_0).y(j).y();
         }
      }

      class11174 class11174 = ((class11507)((KillEffect)this.N_5).i_0).i() ? (class11174)this.N_2 : (class11174)this.N_1;
      class11174.y(var2x -> {
         ((class12038)this.N_3).N(var1.i());
         ((class12038)this.N_4).N(var1.N());
      });
   }
}
