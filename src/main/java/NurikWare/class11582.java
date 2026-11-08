package NurikWare;

import minecraft.class04453;
import minecraft.class06202;

public class class11582 extends class11546 {
   private void L(class10963 var1) {
      String s = var1.N();
      String[] astring = new String[]{" full", " max", " all"};
      String[] astring1 = new String[]{"pay ", "clan invest "};
      long i = class11910.y().orElse(10L) - 10L;

      for (String s1 : astring) {
         if (s.endsWith(s1)) {
            for (String s2 : astring1) {
               if (s.startsWith(s2)) {
                  var1.N(s.replace(s1, " " + i));
                  return;
               }
            }
         }
      }
   }

   public class11582(ChatHelper var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class10963 class10963) {
         if (!this.y(class10963)) {
            if (!this.N(class10963)) {
               this.L(class10963);
            }
         }
      }
   }

   private boolean y(class10963 var1) {
      if (var1.N().equals("ah me")) {
         var1.N("ah " + ((class04453)((class06202)super.y_0).T_4).method_5820());
         return true;
      } else {
         return false;
      }
   }

   private boolean N(class10963 var1) {
      String s = var1.N();
      class09345 class09345 = class11938.N();

      for (String s1 : new String[]{"tpa ", "call "}) {
         if (s.startsWith(s1)) {
            for (class09295 class09295 : class09345.i()) {
               if (s.equals(s1 + class09295.y())) {
                  var1.N(s1 + class09295.N());
                  return true;
               }
            }

            return false;
         }
      }

      return false;
   }
}
