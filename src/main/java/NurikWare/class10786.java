package NurikWare;

import java.io.DataOutput;
import java.io.IOException;
import java.io.UTFDataFormatException;
import minecraft.class03138;
import minecraft.class07536;

public class class10786 extends class03138 {
   public class10786(DataOutput var1) {
      super(var1);
   }

   public void writeUTF(String var1) throws IOException {
      try {
         super.writeUTF(var1);
      } catch (UTFDataFormatException utfdataformatexception) {
         class07536.N("Failed to write NBT String", utfdataformatexception);
         super.writeUTF("");
      }
   }
}
