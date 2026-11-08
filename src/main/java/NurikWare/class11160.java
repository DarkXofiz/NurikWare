package NurikWare;

import java.util.function.Predicate;
import minecraft.class01463;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class06202;

public class class11160 extends class11535 implements Predicate<class06202> {
   public Object N_0;

   public static class11160 L(boolean var0) {
      return new class11160("block-breaking", var0, var0x -> ((class03443)var0x.T_2).E());
   }

   private void L() {
   }

   public class11160(String var1, boolean var2, Predicate<class06202> var3) {
      super(var1, var2);
      this.L();
      this.N_0 = var3;
   }

   static {
      i();
      u();
   }

   public static class11160 i(boolean var0) {
      return new class11160("moving-items", var0, var0x -> (class05096)var0x.v_3 instanceof class01463 || class11938.m().u());
   }

   private static void i() {
   }

   public static class11160 u(boolean var0) {
      return new class11160("using-item", var0, var0x -> ((class04453)var0x.T_4).method_6115() && !((class04453)var0x.T_4).method_6039());
   }

   private static void u() {
   }

   public static class11160 y(boolean var0) {
      return new class11160(
         "no-weapon", var0, var0x -> !class11929.u(((class04453)var0x.T_4).method_6047()) && !class11929.u(((class04453)var0x.T_4).method_6079())
      );
   }

   public static class11160 N(boolean var0) {
      return new class11160("using-shield", var0, var0x -> ((class04453)var0x.T_4).method_6039());
   }

   public boolean test(class06202 var1) {
      this.L();
      return ((Predicate)this.N_0).test(var1);
   }

   public static class11160 R(boolean var0) {
      return new class11160("elytra-gliding", var0, var0x -> class11919.N());
   }
}
