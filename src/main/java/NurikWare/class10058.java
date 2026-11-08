package NurikWare;

import java.util.ArrayList;
import java.util.Objects;

final class class10058 {
   private class10058() {
      super();
   }

   private static float y(class09868 var0, String var1, float var2, class09838 var3) {
      float f = 0.0F;
      int i = -1;
      int j = 0;

      while (j < var1.length()) {
         int k = var1.codePointAt(j);
         j += Character.charCount(k);
         if (k != 13 && k != 10) {
            if (i >= 0) {
               f += var0.N(i, k, var2, var3);
            }

            f += var0.N(k, var2, var3);
            i = k;
         } else {
            i = -1;
         }
      }

      return Math.max(0.0F, f);
   }

   private static class10026 N(class09868 var0, String var1, float var2, class09838 var3, float var4) {
      String[] astring = var1.split("\\n", -1);
      float f = 0.0F;

      for (String s : astring) {
         f = Math.max(f, y(var0, s, var2, var3));
      }

      return new class10026(var1, f, astring.length * var4, astring.length);
   }

   private static float N(class09868 var0, String var1, float var2, class09838 var3) {
      float f = 0.0F;
      int i = -1;

      for (int j = 0; j < var1.length(); j++) {
         if (!Character.isWhitespace(var1.charAt(j))) {
            if (i < 0) {
               i = j;
            }
         } else if (i >= 0) {
            f = Math.max(f, y(var0, var1.substring(i, j), var2, var3));
            i = -1;
         }
      }

      if (i >= 0) {
         f = Math.max(f, y(var0, var1.substring(i), var2, var3));
      }

      return f;
   }

   static class10056 N(class09781 var0, String var1, float var2, class09838 var3) {
      Objects.requireNonNull(var0, "context");
      String s = var1 == null ? "" : var1.replace("\r", "");
      class09868 class09868 = var0.y();
      float f = class09868.N(var2, var3);
      float f1 = N(class09868, s, var2, var3, f).y();
      float f2 = N(class09868, s, var2, var3);
      return new class10056(f1, f, f2);
   }

   static class10026 N(class09781 var0, String var1, float var2, float var3, class09838 var4, class10056 var5) {
      Objects.requireNonNull(var0, "context");
      class10056 class10056 = var5 == null ? N(var0, var1, var3, var4) : var5;
      String s = var1 == null ? "" : var1.replace("\r", "");
      float f = class10056.y();
      if (s.isEmpty()) {
         return new class10026("", 0.0F, f, 1);
      } else if (Float.isInfinite(var2)) {
         return N(var0.y(), s, var3, var4, f);
      } else {
         ArrayList arraylist = new ArrayList();
         StringBuilder stringbuilder = new StringBuilder();
         StringBuilder stringbuilder1 = new StringBuilder();
         float f1 = 0.0F;
         float f2 = 0.0F;
         float f3 = 0.0F;
         boolean flag = false;
         int i = 0;

         while (i < s.length()) {
            char c0 = s.charAt(i);
            if (c0 == '\n') {
               f3 = Math.max(f3, f1);
               arraylist.add(stringbuilder.toString());
               stringbuilder.setLength(0);
               stringbuilder1.setLength(0);
               f1 = 0.0F;
               f2 = 0.0F;
               flag = false;
               i++;
            } else {
               boolean flag1 = Character.isWhitespace(c0);
               int j = i;
               if (flag1) {
                  while (true) {
                     if (i < s.length()) {
                        char c2 = s.charAt(i);
                        if (c2 != '\n' && Character.isWhitespace(c2)) {
                           i++;
                           continue;
                        }
                     }

                     if (flag) {
                        String s2 = s.substring(j, i);
                        stringbuilder1.append(s2);
                        f2 += y(var0.y(), s2, var3, var4);
                     }
                     break;
                  }
               } else {
                  while (true) {
                     if (i < s.length()) {
                        char c1 = s.charAt(i);
                        if (c1 != '\n' && !Character.isWhitespace(c1)) {
                           i++;
                           continue;
                        }
                     }

                     String s1 = s.substring(j, i);
                     float f4 = y(var0.y(), s1, var3, var4);
                     float f5 = flag ? f1 + f2 + f4 : f4;
                     if (flag && f5 > var2 + 0.01F) {
                        f3 = Math.max(f3, f1);
                        arraylist.add(stringbuilder.toString());
                        stringbuilder.setLength(0);
                        stringbuilder1.setLength(0);
                        f1 = 0.0F;
                        f2 = 0.0F;
                        flag = false;
                     }

                     if (flag && !stringbuilder1.isEmpty()) {
                        stringbuilder.append((CharSequence)stringbuilder1);
                        f1 += f2;
                        stringbuilder1.setLength(0);
                        f2 = 0.0F;
                     }

                     stringbuilder.append(s1);
                     f1 += f4;
                     flag = true;
                     break;
                  }
               }
            }
         }

         f3 = Math.max(f3, f1);
         arraylist.add(stringbuilder.toString());
         return new class10026(String.join("\n", arraylist), f3, arraylist.size() * f, arraylist.size());
      }
   }
}
