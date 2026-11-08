package NurikWare;

import java.util.Arrays;

public enum class11072 {
   COMBAT("combat", class11106.FIGHTING, class11106.TOOLS, class11106.BASE, class11106.OTHER),
   MOVEMENT("movement", class11106.BASE, class11106.TOOLS),
   VISUAL("visual", class11106.INTERFACE, class11106.WORLD, class11106.SCREEN),
   PLAYER("player", class11106.AUTO, class11106.BASE),
   MISC("misc", class11106.BASE, class11106.CLIENT, class11106.TRACKERS, class11106.HELPER);
   public class12018 fields_0537b6d18c54a384692f322b8728c3a85_0;
   public class11106[] fields_0537b6d18c54a384692f322b8728c3a85_1;

   private class11072(String var3, class11106... var4) {
      this.i();
      this.fields_0537b6d18c54a384692f322b8728c3a85_0 = new class12018("category").N(var3);
      this.fields_0537b6d18c54a384692f322b8728c3a85_1 = var4;
   }

   static {
      B();
   }

   private static void B() {
   }

   private void i() {
   }

   public class11106[] y() {
      return this.fields_0537b6d18c54a384692f322b8728c3a85_1;
   }

   public static class11072 N(String var0) {
      return Arrays.stream(values()).filter(var1 -> var1.fields_0537b6d18c54a384692f322b8728c3a85_0.N().equals(var0)).findFirst().orElse(null);
   }

   public class12018 N() {
      return this.fields_0537b6d18c54a384692f322b8728c3a85_0;
   }
}
