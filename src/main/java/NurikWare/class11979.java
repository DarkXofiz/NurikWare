package NurikWare;

import java.util.HashMap;
import java.util.Map;

public enum class11979 {
   REQUEST_LIST(1),
   REQUEST_PULL(2),
   REQUEST_PUSH(3);

   public static Map staticFields_0e216cba4bdb837199db281281e4a83a3_3 = new HashMap();
   public Integer fields_0e216cba4bdb837199db281281e4a83a3_0;
   public boolean fields_0e216cba4bdb837199db281281e4a83a3_init;

   private void M() {
      if (!this.fields_0e216cba4bdb837199db281281e4a83a3_init) {
         this.fields_0e216cba4bdb837199db281281e4a83a3_init = true;
         this.fields_0e216cba4bdb837199db281281e4a83a3_0 = 0;
      }
   }

   private class11979(int var3) {
      this.M();
      this.fields_0e216cba4bdb837199db281281e4a83a3_0 = var3;
   }

   static {
      class11979[] aclass11979 = values();
      staticFields_0e216cba4bdb837199db281281e4a83a3_3.put(aclass11979[0].fields_0e216cba4bdb837199db281281e4a83a3_0, (class11979)aclass11979[0]);
      staticFields_0e216cba4bdb837199db281281e4a83a3_3.put(aclass11979[1].fields_0e216cba4bdb837199db281281e4a83a3_0, (class11979)aclass11979[1]);
      staticFields_0e216cba4bdb837199db281281e4a83a3_3.put(aclass11979[2].fields_0e216cba4bdb837199db281281e4a83a3_0, (class11979)aclass11979[2]);
   }

   private static void B() {
      REQUEST_LIST = null;
      REQUEST_PULL = null;
      REQUEST_PUSH = null;
      staticFields_0e216cba4bdb837199db281281e4a83a3_3 = null;
   }

   public int N() {
      return this.fields_0e216cba4bdb837199db281281e4a83a3_0;
   }

   public static class11979 N(int var0) {
      return (class11979)staticFields_0e216cba4bdb837199db281281e4a83a3_3.get(var0);
   }
}
