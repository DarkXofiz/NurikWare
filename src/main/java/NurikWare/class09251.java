package NurikWare;

import java.util.HashMap;
import java.util.Map;

public enum class09251 {
   LIST_RESPONSE(1),
   CREATE_RESPONSE(2),
   DELETE_RESPONSE(3),
   NACK(4),
   ACTIVATE_RESPONSE(5),
   REFRESH_RESPONSE(6);

   public Integer fields_0822dda253458373d948078be7148763e_0;
   public boolean fields_0822dda253458373d948078be7148763e_init;
   public static Map staticFields_0822dda253458373d948078be7148763e_6 = new HashMap();

   private static void M() {
      LIST_RESPONSE = null;
      CREATE_RESPONSE = null;
      DELETE_RESPONSE = null;
      NACK = null;
      ACTIVATE_RESPONSE = null;
      REFRESH_RESPONSE = null;
      staticFields_0822dda253458373d948078be7148763e_6 = null;
   }

   private class09251(int var3) {
      this.i();
      this.fields_0822dda253458373d948078be7148763e_0 = var3;
   }

   static {
      class09251[] aclass09251 = values();
      staticFields_0822dda253458373d948078be7148763e_6.put(aclass09251[0].fields_0822dda253458373d948078be7148763e_0, (class09251)aclass09251[0]);
      staticFields_0822dda253458373d948078be7148763e_6.put(aclass09251[1].fields_0822dda253458373d948078be7148763e_0, (class09251)aclass09251[1]);
      staticFields_0822dda253458373d948078be7148763e_6.put(aclass09251[2].fields_0822dda253458373d948078be7148763e_0, (class09251)aclass09251[2]);
      staticFields_0822dda253458373d948078be7148763e_6.put(aclass09251[3].fields_0822dda253458373d948078be7148763e_0, (class09251)aclass09251[3]);
      staticFields_0822dda253458373d948078be7148763e_6.put(aclass09251[4].fields_0822dda253458373d948078be7148763e_0, (class09251)aclass09251[4]);
      staticFields_0822dda253458373d948078be7148763e_6.put(aclass09251[5].fields_0822dda253458373d948078be7148763e_0, (class09251)aclass09251[5]);
   }

   private void i() {
      if (!this.fields_0822dda253458373d948078be7148763e_init) {
         this.fields_0822dda253458373d948078be7148763e_init = true;
         this.fields_0822dda253458373d948078be7148763e_0 = 0;
      }
   }

   public int N() {
      return this.fields_0822dda253458373d948078be7148763e_0;
   }

   public static class09251 N(int var0) {
      return (class09251)staticFields_0822dda253458373d948078be7148763e_6.get(var0);
   }
}
