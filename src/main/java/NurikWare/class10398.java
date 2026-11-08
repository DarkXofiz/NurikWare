package NurikWare;

import java.util.List;
import minecraft.class00067;
import minecraft.class04468;

public class class10398<T> implements class04468<T> {
   public Object N_0;
   public Object N_1;

   public class10398(class00067 var1, class00067 var2) {
      super();
      this.y();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   public List<T> y(String var1) {
      return ((class00067)this.N_0).N(var1);
   }

   private void y() {
   }

   public List<T> N(String var1) {
      return ((class00067)this.N_1).N(var1);
   }
}
