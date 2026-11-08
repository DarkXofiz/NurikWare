package NurikWare;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class class09945 extends Authenticator {
   public class09945(String var1, String var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   protected PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(this.N, this.y.toCharArray());
   }
}
