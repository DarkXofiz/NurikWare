package NurikWare;

public record class09791(int maxDepth, String subtreeKey, boolean fullStyle) {
   public String L() {
      return this.subtreeKey;
   }


   public boolean u() {
      return this.fullStyle;
   }

   public int y() {
      return this.maxDepth;
   }

   public static class09791 N() {
      return new class09791(Integer.MAX_VALUE, null, false);
   }

   public class09791 N(boolean var1) {
      return new class09791(this.maxDepth, this.subtreeKey, var1);
   }

   public class09791 N(int var1) {
      return new class09791(var1, this.subtreeKey, this.fullStyle);
   }

   public class09791 N(String var1) {
      return new class09791(this.maxDepth, var1, this.fullStyle);
   }
}
