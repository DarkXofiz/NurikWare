package NurikWare;

import java.util.List;

public class class11730 {
   public static Object N_0 = new EffectsHud();
   public static Object N_1 = new HotkeysHud();
   public static Object N_2 = new InventoryHud();
   public static Object N_3 = new TargetInfoHud();
   public static Object N_4 = new LogoHud();
   public static Object N_5 = new CooldownsHud();
   public static Object N_6 = new NotifyHud();
   public static Object N_7 = List.of(N_4, N_0, N_2, N_1, N_3, N_5, N_6);

   private class11730() {
      super();
   }

   static {
      N();
      u();
   }

   private static void u() {
      N_0 = null;
      N_1 = null;
      N_2 = null;
      N_3 = null;
      N_4 = null;
      N_5 = null;
      N_6 = null;
      N_7 = null;
   }

   private static void N() {
   }

   public static class11769 N(String var0) {
      return ((List)N_7).stream().filter(var1 -> var1.E().equals(var0)).findFirst().orElse(null);
   }
}
