package NurikWare;

import java.util.HashMap;
import java.util.Map;

public final class class11790 {
   private static String[] strings_0e32a81813f643834bbda8f07cef7f07f;
   private static String[] strings_2e32a81813f643834bbda8f07cef7f07f;
   private static String[] strings_3e32a81813f643834bbda8f07cef7f07f;
   private static String[] strings_1e32a81813f643834bbda8f07cef7f07f;
   public static class11790 staticFields_0e32a81813f643834bbda8f07cef7f07f_0 = new class11790(strings_0e32a81813f643834bbda8f07cef7f07f[1], 1);
   public static class11790 staticFields_0e32a81813f643834bbda8f07cef7f07f_1 = new class11790(strings_1e32a81813f643834bbda8f07cef7f07f[0], 2);
   public static class11790 staticFields_0e32a81813f643834bbda8f07cef7f07f_2 = new class11790(strings_1e32a81813f643834bbda8f07cef7f07f[2], 3);
   public static class11790 staticFields_0e32a81813f643834bbda8f07cef7f07f_3 = new class11790(strings_1e32a81813f643834bbda8f07cef7f07f[4], 4);
   public static class11790 staticFields_0e32a81813f643834bbda8f07cef7f07f_4 = new class11790(strings_2e32a81813f643834bbda8f07cef7f07f[1], 5);
   public static class11790 staticFields_0e32a81813f643834bbda8f07cef7f07f_5 = new class11790(strings_2e32a81813f643834bbda8f07cef7f07f[3], 6);
   public static class11790 staticFields_1e32a81813f643834bbda8f07cef7f07f_0 = new class11790(strings_2e32a81813f643834bbda8f07cef7f07f[5], 7);
   public static class11790 staticFields_1e32a81813f643834bbda8f07cef7f07f_1 = new class11790(strings_2e32a81813f643834bbda8f07cef7f07f[7], 8);
   public static class11790 staticFields_1e32a81813f643834bbda8f07cef7f07f_2 = new class11790(strings_3e32a81813f643834bbda8f07cef7f07f[1], 9);
   public static class11790 staticFields_1e32a81813f643834bbda8f07cef7f07f_3 = new class11790(strings_3e32a81813f643834bbda8f07cef7f07f[3], 10);
   public static class11790 staticFields_1e32a81813f643834bbda8f07cef7f07f_4 = new class11790(strings_3e32a81813f643834bbda8f07cef7f07f[5], 11);
   public static class11790 staticFields_1e32a81813f643834bbda8f07cef7f07f_5 = new class11790(strings_3e32a81813f643834bbda8f07cef7f07f[7], 12);
   public static Map staticFields_1e32a81813f643834bbda8f07cef7f07f_6 = new HashMap();
   public static class11790[] staticFields_1e32a81813f643834bbda8f07cef7f07f_7 = Z();
   public String fields_0e32a81813f643834bbda8f07cef7f07f_0;
   public Integer fields_0e32a81813f643834bbda8f07cef7f07f_1;
   public boolean fields_0e32a81813f643834bbda8f07cef7f07f_init;

   private static void L() {
   }

   private void M() {
      if (!this.fields_0e32a81813f643834bbda8f07cef7f07f_init) {
         this.fields_0e32a81813f643834bbda8f07cef7f07f_init = true;
         this.fields_0e32a81813f643834bbda8f07cef7f07f_1 = 0;
      }
   }

   private class11790(String var3, int var4) {
      this.M();
      this.fields_0e32a81813f643834bbda8f07cef7f07f_0 = var3;
      this.fields_0e32a81813f643834bbda8f07cef7f07f_1 = var4;
   }

   static {
      R();
      L();
      class11790[] aclass11790 = values();

      for (int i = 0; i < aclass11790.length; i++) {
         staticFields_1e32a81813f643834bbda8f07cef7f07f_6.put(aclass11790[i].fields_0e32a81813f643834bbda8f07cef7f07f_1, (class11790)aclass11790[i]);
      }
   }

   public String y() {
      return this.fields_0e32a81813f643834bbda8f07cef7f07f_0;
   }

   public int N() {
      return this.fields_0e32a81813f643834bbda8f07cef7f07f_1;
   }

   public static class11790 N(int var0) {
      return (class11790)staticFields_1e32a81813f643834bbda8f07cef7f07f_6.get(var0);
   }

   private static void R() {
      strings_0e32a81813f643834bbda8f07cef7f07f = new String[3];
      strings_0e32a81813f643834bbda8f07cef7f07f[0] = "CONFIG_NOT_FOUND";
      strings_0e32a81813f643834bbda8f07cef7f07f[1] = "preset.error.not-found";
      strings_0e32a81813f643834bbda8f07cef7f07f[2] = "CONFIG_ALREADY_EXISTS";
      strings_1e32a81813f643834bbda8f07cef7f07f = new String[5];
      strings_1e32a81813f643834bbda8f07cef7f07f[0] = "preset.error.already-exists";
      strings_1e32a81813f643834bbda8f07cef7f07f[1] = "NAME_INVALID";
      strings_1e32a81813f643834bbda8f07cef7f07f[2] = "preset.error.name-invalid";
      strings_1e32a81813f643834bbda8f07cef7f07f[3] = "DATA_INVALID";
      strings_1e32a81813f643834bbda8f07cef7f07f[4] = "preset.error.data-invalid";
      strings_2e32a81813f643834bbda8f07cef7f07f = new String[8];
      strings_2e32a81813f643834bbda8f07cef7f07f[0] = "DATA_TOO_LARGE";
      strings_2e32a81813f643834bbda8f07cef7f07f[1] = "preset.error.data-too-large";
      strings_2e32a81813f643834bbda8f07cef7f07f[2] = "QUOTA_EXCEEDED";
      strings_2e32a81813f643834bbda8f07cef7f07f[3] = "preset.error.quota-exceeded";
      strings_2e32a81813f643834bbda8f07cef7f07f[4] = "RATE_LIMITED";
      strings_2e32a81813f643834bbda8f07cef7f07f[5] = "preset.error.rate-limited";
      strings_2e32a81813f643834bbda8f07cef7f07f[6] = "SHARE_NOT_FOUND";
      strings_2e32a81813f643834bbda8f07cef7f07f[7] = "preset.error.share-not-found";
      strings_3e32a81813f643834bbda8f07cef7f07f = new String[8];
      strings_3e32a81813f643834bbda8f07cef7f07f[0] = "INTERNAL";
      strings_3e32a81813f643834bbda8f07cef7f07f[1] = "preset.error.internal";
      strings_3e32a81813f643834bbda8f07cef7f07f[2] = "SHARE_EXPIRED";
      strings_3e32a81813f643834bbda8f07cef7f07f[3] = "preset.error.share-expired";
      strings_3e32a81813f643834bbda8f07cef7f07f[4] = "SHARE_LIMIT_REACHED";
      strings_3e32a81813f643834bbda8f07cef7f07f[5] = "preset.error.share-limit-reached";
      strings_3e32a81813f643834bbda8f07cef7f07f[6] = "SHARE_ALREADY_EXISTS";
      strings_3e32a81813f643834bbda8f07cef7f07f[7] = "preset.error.share-already-exists";
   }
}
