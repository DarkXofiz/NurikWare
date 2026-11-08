package NurikWare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import minecraft.class05623;

public class class10523 extends Thread {
   public class10523(class05623 var1, String var2) {
      super(var2);
      this.N = var1;
   }

   @Override
   public void run() {
      BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

      String s;
      try {
         while (!this.N.NX() && this.N.Nj() && (s = bufferedreader.readLine()) != null) {
            this.N.N(s, this.N.yu());
         }
      } catch (IOException ioexception) {
         class05623.N.error("Exception handling console input", ioexception);
      }
   }
}
