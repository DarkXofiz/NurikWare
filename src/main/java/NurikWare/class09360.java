package NurikWare;

import minecraft.class00405;
import org.jspecify.annotations.Nullable;

public class class09360 {
   private boolean y;

   public class09360(class00405 var1, StringBuilder var2) {
      super();
      this.N = var2;
   }

   public void N(String var1, @Nullable Object var2) {
      if (var2 != null) {
         this.N();
         this.N.append(var1);
         this.N.append('=');
         this.N.append(var2);
      }
   }

   public void N(String var1, @Nullable Boolean var2) {
      if (var2 != null) {
         this.N();
         if (!var2) {
            this.N.append('!');
         }

         this.N.append(var1);
      }
   }

   private void N() {
      if (this.y) {
         this.N.append(',');
      }

      this.y = true;
   }
}
