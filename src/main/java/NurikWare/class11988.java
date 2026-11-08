package NurikWare;

import java.util.HashMap;
import java.util.Map;

public enum class11988 {
   REQUEST_LIST(1),
   REQUEST_CREATE(2),
   REQUEST_DELETE(3),
   REQUEST_ACTIVATE(4),
   REQUEST_REFRESH(5);

   public Integer fields_0ac290bb05b2c38d3be8b91c5c024efad_0;
   public boolean fields_0ac290bb05b2c38d3be8b91c5c024efad_init;
   public static Map staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5 = new HashMap();

   private static void L() {
      REQUEST_LIST = null;
      REQUEST_CREATE = null;
      REQUEST_DELETE = null;
      REQUEST_ACTIVATE = null;
      REQUEST_REFRESH = null;
      staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5 = null;
   }

   private class11988(int var3) {
      this.B();
      this.fields_0ac290bb05b2c38d3be8b91c5c024efad_0 = var3;
   }

   static {
      class11988[] aclass11988 = values();
      staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5.put(aclass11988[0].fields_0ac290bb05b2c38d3be8b91c5c024efad_0, (class11988)aclass11988[0]);
      staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5.put(aclass11988[1].fields_0ac290bb05b2c38d3be8b91c5c024efad_0, (class11988)aclass11988[1]);
      staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5.put(aclass11988[2].fields_0ac290bb05b2c38d3be8b91c5c024efad_0, (class11988)aclass11988[2]);
      staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5.put(aclass11988[3].fields_0ac290bb05b2c38d3be8b91c5c024efad_0, (class11988)aclass11988[3]);
      staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5.put(aclass11988[4].fields_0ac290bb05b2c38d3be8b91c5c024efad_0, (class11988)aclass11988[4]);
   }

   private void B() {
      if (!this.fields_0ac290bb05b2c38d3be8b91c5c024efad_init) {
         this.fields_0ac290bb05b2c38d3be8b91c5c024efad_init = true;
         this.fields_0ac290bb05b2c38d3be8b91c5c024efad_0 = 0;
      }
   }

   public static class11988 N(int var0) {
      return (class11988)staticFields_0ac290bb05b2c38d3be8b91c5c024efad_5.get(var0);
   }

   public int N() {
      return this.fields_0ac290bb05b2c38d3be8b91c5c024efad_0;
   }
}
