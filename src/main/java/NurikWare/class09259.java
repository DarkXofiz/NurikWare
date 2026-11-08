package NurikWare;

import java.util.HashMap;
import java.util.Map;

public enum class09259 {
   LIST_RESPONSE(1),
   BLOB(2),
   ACK(3),
   NACK(4);

   public Integer fields_011b43d235ff23c79a8f05a92e0b76308_0;
   public boolean fields_011b43d235ff23c79a8f05a92e0b76308_init;
   public static Map staticFields_011b43d235ff23c79a8f05a92e0b76308_4 = new HashMap();

   private class09259(int var3) {
      this.y();
      this.fields_011b43d235ff23c79a8f05a92e0b76308_0 = var3;
   }

   static {
      class09259[] aclass09259 = values();
      staticFields_011b43d235ff23c79a8f05a92e0b76308_4.put(aclass09259[0].fields_011b43d235ff23c79a8f05a92e0b76308_0, (class09259)aclass09259[0]);
      staticFields_011b43d235ff23c79a8f05a92e0b76308_4.put(aclass09259[1].fields_011b43d235ff23c79a8f05a92e0b76308_0, (class09259)aclass09259[1]);
      staticFields_011b43d235ff23c79a8f05a92e0b76308_4.put(aclass09259[2].fields_011b43d235ff23c79a8f05a92e0b76308_0, (class09259)aclass09259[2]);
      staticFields_011b43d235ff23c79a8f05a92e0b76308_4.put(aclass09259[3].fields_011b43d235ff23c79a8f05a92e0b76308_0, (class09259)aclass09259[3]);
   }

   private static void B() {
      LIST_RESPONSE = null;
      BLOB = null;
      ACK = null;
      NACK = null;
      staticFields_011b43d235ff23c79a8f05a92e0b76308_4 = null;
   }

   private void y() {
      if (!this.fields_011b43d235ff23c79a8f05a92e0b76308_init) {
         this.fields_011b43d235ff23c79a8f05a92e0b76308_init = true;
         this.fields_011b43d235ff23c79a8f05a92e0b76308_0 = 0;
      }
   }

   public static class09259 N(int var0) {
      return (class09259)staticFields_011b43d235ff23c79a8f05a92e0b76308_4.get(var0);
   }

   public int N() {
      return this.fields_011b43d235ff23c79a8f05a92e0b76308_0;
   }
}
