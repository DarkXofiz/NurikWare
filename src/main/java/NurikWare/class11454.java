package NurikWare;

import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public record class11454(class11405 client, class11410 connection) implements class09268 {
   public static Object N_0 = LogManager.getLogger(String.class);

   public class11405 L() {
      return this.client;
   }


   static {
      i();
   }

   private static void i() {
      N_0 = null;
   }

   public class11410 y() {
      return this.connection;
   }

   @Override
   public void N(class09288 var1) {
      this.connection.N(class11959.PLAY);
      this.connection.N(new class11408(this.client, this.connection));
      this.connection.N(class11847.N());
      class11938.I().N();
      class11938.J().y();
      class11938.d().N();
      class11938.T().N();
   }

   @Override
   public boolean N() {
      return this.connection.N();
   }

   @Override
   public void N(class09302 var1) {
      ((Logger)N_0).error(var1.N());
      class11303.N((class11287)class11311.N_0, var1.N());
      class06202.Nq().execute(() -> class11938.N().L());
      this.connection.u();
      class11938.z().m();
   }
}
