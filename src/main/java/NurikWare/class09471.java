package NurikWare;

import java.io.DataInput;
import java.io.IOException;
import minecraft.class01424;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class06997;
import minecraft.class07726;

public class class09471 implements class01424<class06997> {
   private IOException L() {
      return new IOException("Invalid tag id: " + this.N);
   }

   public class09471(int var1) {
      super();
      this.N = var1;
   }

   public void y(DataInput var1, class07726 var2) throws IOException {
      throw this.L();
   }

   public String y() {
      return "UNKNOWN_" + this.N;
   }

   public String N() {
      return "INVALID[" + this.N + "]";
   }

   public void N(DataInput var1, int var2, class07726 var3) throws IOException {
      throw this.L();
   }

   public class06997 L(DataInput var1, class07726 var2) throws IOException {
      throw this.L();
   }

   public class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException {
      throw this.L();
   }
}
