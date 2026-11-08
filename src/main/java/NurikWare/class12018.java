package NurikWare;

import java.util.Objects;

public record class12018(String key) {


   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof class12018 class12018x) {
         class12018 class12018x = class12018x;

         try {
            s1 = class12018x.N();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         String s = s1;
         return Objects.equals(this.key, s);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.key);
   }

   public String y(String var1) {
      return var1 + "." + this.key;
   }

   public String N() {
      return this.key;
   }

   public class12018 N(String var1) {
      return new class12018(this.key + "." + var1);
   }

   public class12018 N(class12018 var1) {
      return new class12018(this.key + "." + var1.key);
   }
}
