package NurikWare;

import java.util.Optional;
import minecraft.class06889;

public record class10713(class06889 from, class06889 to, Optional<class06889> axisDependentOriginalMovement) {

   public Optional<class06889> L() {
      return this.axisDependentOriginalMovement;
   }

   public class10713(class06889 var1, class06889 var2, class06889 var3) {
      this(var1, var2, Optional.of(var3));
   }


   public class10713(class06889 var1, class06889 var2) {
      this(var1, var2, Optional.empty());
   }

   public class06889 y() {
      return this.to;
   }

   public class06889 N() {
      return this.from;
   }
}
