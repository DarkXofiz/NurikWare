package NurikWare;

import minecraft.class04803;
import minecraft.class06584;
import minecraft.class08036;

public class class10864 implements class04803 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public class10864(class08036 var1, int var2) {
      super();
      this.y();
      this.N_1 = var1;
      this.N_0 = var2;
   }

   private void y() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0;
      }
   }

   public boolean N(class06584 var1) {
      ((class08036)this.N_1).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.T().method_5447((Integer)this.N_0, var1);
      ((class08036)this.N_1).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y(((class08036)this.N_1).fields_07fa3311b0e9d3e9b883d09222919bf5a_0);
      return true;
   }

   public class06584 N() {
      return ((class08036)this.N_1).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.T().method_5438((Integer)this.N_0);
   }
}
