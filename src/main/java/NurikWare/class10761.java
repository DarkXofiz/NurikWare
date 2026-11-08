package NurikWare;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import minecraft.class00392;

public class class10761 implements ArgumentType<String> {
   public static Object N_0 = new DynamicCommandExceptionType(var0 -> class00392.y(class12020.N("argument.out-of-bounds").formatted(var0)));
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public boolean y_init;

   public int L() {
      return (Integer)this.y_2;
   }

   private class10761(class10717 var1, int var2, int var3) {
      super();
      this.R();
      this.y_0 = var1;
      this.y_1 = var2;
      this.y_2 = var3;
   }

   static {
      Z();
   }

   @Override
   public String toString() {
      return ((class10717)this.y_0).name() + " minLimit: " + (Integer)this.y_1 + " maxLimit: " + (Integer)this.y_2;
   }

   private static void Z() {
      N_0 = null;
   }

   public class10717 y() {
      return (class10717)this.y_0;
   }

   public static class10761 y(int var0, int var1) {
      return new class10761(class10717.GREEDY_PHRASE, var0, var1);
   }

   public static class10761 N(int var0, int var1) {
      return new class10761(class10717.SINGLE_WORD, var0, var1);
   }

   public static class10761 N(int var0) {
      return y(0, var0);
   }

   public int N() {
      return (Integer)this.y_1;
   }

   public String parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.readString();
      if (s.length() <= (Integer)this.y_2 && s.length() >= (Integer)this.y_1) {
         var1 = new StringReader(s);
         if ((class10717)this.y_0 == class10717.GREEDY_PHRASE) {
            String s1 = var1.getRemaining();
            var1.setCursor(var1.getTotalLength());
            return s1;
         } else {
            return (class10717)this.y_0 == class10717.SINGLE_WORD ? var1.readUnquotedString() : var1.readString();
         }
      } else {
         throw ((DynamicCommandExceptionType)N_0).create(s);
      }
   }

   private void R() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_1 = 0;
         this.y_2 = 0;
      }
   }
}
