package NurikWare;

import minecraft.class06889;

public record class11104(class06889 point, class11499 rotation, boolean released, boolean flicking) {

   public class11499 L() {
      return this.rotation;
   }


   public class06889 u() {
      return this.point;
   }

   public boolean y() {
      return this.flicking;
   }

   public static class11104 N(class06889 var0, class11499 var1) {
      return new class11104(var0, var1, false, false);
   }

   public boolean N() {
      return this.released;
   }
}
