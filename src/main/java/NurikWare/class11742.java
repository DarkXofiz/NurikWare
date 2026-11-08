package NurikWare;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11742 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public Object y_0;

   private static void L() {
      N_0 = null;
   }

   public class11742() {
      super();
      this.y();
      this.y_0 = new HashMap();
   }

   static {
      L();
   }

   private void y() {
   }

   public void N(String var1, String var2) {
      class11731 class11731 = (class11731)((Map)this.y_0).remove(var1);
      if (class11731 != null) {
         class11731.N();
      }

      try {
         ((Map)this.y_0).put(var1, class11752.N(var2));
      } catch (Exception exception) {
         ((Logger)N_0).error("Failed to register icon atlas '{}' at '{}': {}", var1, var2, exception.getMessage(), exception);
      }
   }

   public class11731 N(String var1) {
      return (class11731)((Map)this.y_0).get(var1);
   }
}
