package NurikWare;

import java.util.function.Predicate;
import minecraft.class04453;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07542;

public class class11791 {
   public static Predicate<class07049> L() {
      return var0 -> var0 instanceof class07079 && !U().test(var0);
   }

   public static Predicate<class07049> M() {
      return var0 -> var0.method_5864() == class07078.Nt;
   }

   private class11791() {
      super();
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static Predicate<class07049> B() {
      return var0 -> var0.method_5864() == class07078.Ly;
   }

   public static Predicate<class07049> Z() {
      return var0 -> ((class11783)var0).dataManager().M().N();
   }

   public static Predicate<class07049> i() {
      return var0 -> var0 instanceof class07079;
   }

   public static Predicate<class07049> U() {
      return var0 -> var0 instanceof class07542;
   }

   public static Predicate<class07049> z() {
      return var0 -> ((class11783)var0).dataManager().B().N();
   }

   public static Predicate<class07049> u() {
      return var0 -> {
         NoFriendDamage nofrienddamage = class11938.u().Ng();
         return !nofrienddamage.U() ? false : E().test(var0) || z().test(var0) || nofrienddamage.N(var0);
      };
   }

   public static Predicate<class07049> y() {
      return var0 -> var0 instanceof class04453;
   }

   public static Predicate<class07049> E() {
      return var0 -> ((class11783)var0).dataManager().i().N();
   }

   public static Predicate<class07049> N() {
      return class07049::method_5805;
   }

   public static Predicate<class07049> R() {
      return var0 -> var0.method_5864() == class07078.ye;
   }
}
