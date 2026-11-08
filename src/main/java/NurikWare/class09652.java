package NurikWare;

import it.unimi.dsi.fastutil.chars.CharList;
import minecraft.class02165;

public class class09652 extends class02165 {
   public class09652(CharList var1, char var2, char var3) {
      super(var1);
      this.N = var2;
      this.y = var3;
   }

   protected boolean N(char var1) {
      return var1 == this.N || var1 == this.y;
   }
}
