package NurikWare;

import java.util.Optional;
import minecraft.class00405;
import minecraft.class01751;
import minecraft.class05216;
import minecraft.class05935;
import minecraft.class05977;

public class class11921 implements class01751 {
   public Object N_0;

   private void L() {
   }

   private class11921(String var1, Object... var2) {
      super();
      this.L();
      this.N_0 = class12020.N(var1).formatted(var2);
   }

   private class11921(String var1) {
      super();
      this.L();
      this.N_0 = class12020.N(var1);
   }

   @Override
   public String toString() {
      return "clientTranslatableText{" + (String)this.N_0 + "}";
   }

   public static class05216 N(String var0) {
      return class05216.N(new class11921(var0));
   }

   public static class05216 N(String var0, Object... var1) {
      return class05216.N(new class11921(var0, var1));
   }

   public String comp_737() {
      return (String)this.N_0;
   }

   public <T> Optional<T> method_27660(class05935<T> var1, class00405 var2) {
      return var1.accept(var2, (String)this.N_0);
   }

   public <T> Optional<T> method_27659(class05977<T> var1) {
      return var1.accept((String)this.N_0);
   }
}
