package NurikWare;

sealed interface class10034 permits class10059, class09933, class09900, class09921, class10042 {
   default String L() {
      return "";
   }

   default void L(String var1) {
      throw this.u("textureSrc");
   }

   private IllegalStateException u(String var1) {
      return new IllegalStateException("Element payload " + this.getClass().getSimpleName() + " does not support property '" + var1 + "'");
   }

   default String u() {
      return "";
   }

   default void y(String var1) {
      throw this.u("placeholder");
   }

   default String y() {
      return "";
   }

   default void N(class09938 var1) {
      throw this.u("canvasRenderer");
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static class10034 N(class10049 var0) {
      if (var0 == null) {
         return class10059.N;
      } else {
         return (class10034)(switch (class10065.N[var0.ordinal()]) {
            case 1 -> new class10042();
            case 2 -> new class09933();
            case 3 -> new class09900();
            case 4 -> new class09921();
            case 5 -> class10059.N;
            default -> throw new MatchException(null, null);
         });
      }
   }

   default void N(String var1) {
      throw this.u("text");
   }

   default class09938 N() {
      return null;
   }
}
