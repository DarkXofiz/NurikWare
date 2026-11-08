package NurikWare;

import java.util.HashMap;
import java.util.Map;

public enum class11794 {
   CREATED(1),
   ALREADY_ACTIVATED(2),
   OWN_LINK(3),
   UPDATED(4);

   public static Map staticFields_0f06a2832f8fa3cf9a97efc5703133649_4 = new HashMap();
   public Integer fields_0f06a2832f8fa3cf9a97efc5703133649_0;
   public boolean fields_0f06a2832f8fa3cf9a97efc5703133649_init;

   private class11794(int var3) {
      this.i();
      this.fields_0f06a2832f8fa3cf9a97efc5703133649_0 = var3;
   }

   static {
      class11794[] aclass11794 = values();
      staticFields_0f06a2832f8fa3cf9a97efc5703133649_4.put(aclass11794[0].fields_0f06a2832f8fa3cf9a97efc5703133649_0, (class11794)aclass11794[0]);
      staticFields_0f06a2832f8fa3cf9a97efc5703133649_4.put(aclass11794[1].fields_0f06a2832f8fa3cf9a97efc5703133649_0, (class11794)aclass11794[1]);
      staticFields_0f06a2832f8fa3cf9a97efc5703133649_4.put(aclass11794[2].fields_0f06a2832f8fa3cf9a97efc5703133649_0, (class11794)aclass11794[2]);
      staticFields_0f06a2832f8fa3cf9a97efc5703133649_4.put(aclass11794[3].fields_0f06a2832f8fa3cf9a97efc5703133649_0, (class11794)aclass11794[3]);
   }

   private static void B() {
      CREATED = null;
      ALREADY_ACTIVATED = null;
      OWN_LINK = null;
      UPDATED = null;
      staticFields_0f06a2832f8fa3cf9a97efc5703133649_4 = null;
   }

   private void i() {
      if (!this.fields_0f06a2832f8fa3cf9a97efc5703133649_init) {
         this.fields_0f06a2832f8fa3cf9a97efc5703133649_init = true;
         this.fields_0f06a2832f8fa3cf9a97efc5703133649_0 = 0;
      }
   }

   public int N() {
      return this.fields_0f06a2832f8fa3cf9a97efc5703133649_0;
   }

   public static class11794 N(int var0) {
      return (class11794)staticFields_0f06a2832f8fa3cf9a97efc5703133649_4.get(var0);
   }
}
