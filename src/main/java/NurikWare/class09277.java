package NurikWare;

import java.util.HashMap;
import java.util.Map;

public enum class09277 {
   LIST_RESPONSE(1),
   CREATE_RESPONSE(2),
   UPDATE_RESPONSE(3),
   GET_RESPONSE(4),
   DELETE_RESPONSE(5),
   RENAME_RESPONSE(6),
   NACK(7);
   public static Map staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0 = new HashMap();
   // $VF: synthetic field
   private static final class09277[] $VALUES = M();
   public Integer fields_0d54b4a02dc4838eea56bc15fad4166ae_0;
   public boolean fields_0d54b4a02dc4838eea56bc15fad4166ae_init;

   private void L() {
      if (!this.fields_0d54b4a02dc4838eea56bc15fad4166ae_init) {
         this.fields_0d54b4a02dc4838eea56bc15fad4166ae_init = true;
         this.fields_0d54b4a02dc4838eea56bc15fad4166ae_0 = 0;
      }
   }

   private class09277(int var3) {
      this.L();
      this.fields_0d54b4a02dc4838eea56bc15fad4166ae_0 = var3;
   }

   static {
      class09277[] aclass09277 = values();
      staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(aclass09277[0].fields_0d54b4a02dc4838eea56bc15fad4166ae_0, (class09277)aclass09277[0]);
      staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(aclass09277[1].fields_0d54b4a02dc4838eea56bc15fad4166ae_0, (class09277)aclass09277[1]);
      staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(aclass09277[2].fields_0d54b4a02dc4838eea56bc15fad4166ae_0, (class09277)aclass09277[2]);
      staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(aclass09277[3].fields_0d54b4a02dc4838eea56bc15fad4166ae_0, (class09277)aclass09277[3]);
      staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(aclass09277[4].fields_0d54b4a02dc4838eea56bc15fad4166ae_0, (class09277)aclass09277[4]);
      staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(aclass09277[5].fields_0d54b4a02dc4838eea56bc15fad4166ae_0, (class09277)aclass09277[5]);
      staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(aclass09277[6].fields_0d54b4a02dc4838eea56bc15fad4166ae_0, (class09277)aclass09277[6]);
   }

   private static void u() {
      LIST_RESPONSE = null;
      CREATE_RESPONSE = null;
      UPDATE_RESPONSE = null;
      GET_RESPONSE = null;
      DELETE_RESPONSE = null;
      RENAME_RESPONSE = null;
      NACK = null;
      staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0 = null;
   }

   public static class09277 N(int var0) {
      return (class09277)staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.get(var0);
   }

   public int N() {
      return this.fields_0d54b4a02dc4838eea56bc15fad4166ae_0;
   }
}
