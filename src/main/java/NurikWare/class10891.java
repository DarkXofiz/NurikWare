package NurikWare;

import java.util.function.Predicate;
import minecraft.class04453;

public class class10891 extends class11535 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0;
      }
   }

   public class10891(String var1, boolean var2, Predicate<class04453> var3, class11328 var4) {
      super(var1, var2);
      this.L();
      this.N_0 = var3;
      this.N_1 = var4;
   }

   public void N(int var1) {
      this.L();
      this.N_2 = class11938.j().y() + var1;
   }

   public boolean N() {
      this.L();
      return class11938.j().y() < (Integer)this.N_2;
   }
}
