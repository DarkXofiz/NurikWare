package NurikWare;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class07438;

public class class11265 {
   public Object N_0;
   public Object N_1;

   public class11265(class07438 var1) {
      super();
      this.u();
      this.N_0 = new ArrayList();
      this.N_1 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null && this.getClass() == var1.getClass()) {
         class11265 class11265 = (class11265)var1;
         return Objects.equals(((class07438)this.N_1).method_5628(), ((class07438)class11265.N_1).method_5628());
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(((class07438)this.N_1).method_5628());
   }

   private void u() {
   }

   public class07438 y() {
      return (class07438)this.N_1;
   }

   public List<class11232> N() {
      return (List<class11232>)this.N_0;
   }
}
