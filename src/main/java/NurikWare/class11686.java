package NurikWare;

public interface class11686 {
   default boolean y(String var1) {
      for (String s : this.N()) {
         if (var1.contains(s)) {
            return true;
         }
      }

      return false;
   }

   String[] N();

   void N(String var1);
}
