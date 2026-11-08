package NurikWare;

import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;

public abstract class class11553<T extends class11067 & class11542> implements class11819 {
   public Object N_0;
   public Object N_1;
   public Object N_2;

   public abstract class11328 L();

   private void M() {
   }

   public class11553(T var1, String var2) {
      super();
      this.M();
      this.N_0 = class06202.Nq();
      this.N_1 = var1;
      this.N_2 = class11524.N(var1, var2, class12002.UNKNOWN);
   }

   public abstract String u();

   @Override
   public void y(Object var1) {
      if (var1 instanceof class11400 class11400) {
         if (class11400.y(((class11527)this.N_2).i(), ((class11527)this.N_2).L())) {
            if (((class11067)this.N_1).U() && (class04453)((class06202)this.N_0).T_4 != null && (class03448)((class06202)this.N_0).T_3 != null) {
               ((class11542)((class11067)this.N_1)).N(this.L());
            }
         }
      }
   }

   public abstract class06584 y();

   public abstract String N();
}
