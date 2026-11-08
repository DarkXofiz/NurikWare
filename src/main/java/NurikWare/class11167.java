package NurikWare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class11167 implements class09337 {
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public boolean y_init;

   class11167(List<class11208> var1) {
      super();
      this.i();
      this.y_0 = new ArrayList();
      this.y_1 = new HashMap();
      this.y_2 = new HashSet();
      this.y_3 = new HashSet();

      for (class11208 class11208 : var1) {
         if (class11208.u() == null) {
            ((List)this.y_0).add(class11208);
         } else if (((Map)this.y_1).put(class11208.u(), class11208) != null) {
            throw new IllegalArgumentException("Shader template arg was configured twice: " + class11208.u());
         }
      }
   }

   private void i() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_4 = 0;
      }
   }

   @Override
   public void y() {
      this.y_4 = 0;
      ((Set)this.y_2).clear();
      ((Set)this.y_3).clear();
   }

   private class11208 y(String var1) {
      class11208 class11208 = (class11208)((Map)this.y_1).get(var1);
      if (class11208 != null) {
         ((Set)this.y_2).add(var1);
         return class11208;
      } else if ((Integer)this.y_4 < ((List)this.y_0).size()) {
         List list = (List)this.y_0;
         int i = (Integer)this.y_4;
         this.y_4 = i + 1;
         return (class11208)list.get(i);
      } else {
         throw new IllegalArgumentException("Missing shader template value for " + var1);
      }
   }

   @Override
   public boolean N() {
      return true;
   }

   @Override
   public String N(int var1, String var2, String var3) {
      Matcher matcher = ((Pattern)class11193.N_0).matcher(var3);
      StringBuilder stringbuilder = new StringBuilder();

      while (matcher.find()) {
         String s = matcher.group(1);
         String s1 = matcher.group(2);
         class11169 class11169 = class11169.N(matcher.group(3));
         int i = N(class11169, s1, matcher.group(4));
         String s2 = matcher.group(5);
         class11208 class11208 = this.y(s1);
         String s3 = this.N(var2, s1, class11169, i, class11208);
         matcher.appendReplacement(stringbuilder, Matcher.quoteReplacement(s + s3 + s2));
         ((Set)this.y_3).add(s1);
      }

      matcher.appendTail(stringbuilder);
      if (var1 == 35632) {
         this.N(var2);
      }

      return stringbuilder.toString();
   }

   private String N(String var1, String var2, class11169 var3, int var4, class11208 var5) {
      if (var5.N() != null && var5.N() != var3) {
         throw new IllegalArgumentException("Shader template type mismatch for " + var2 + " in " + var1 + ". Expected " + var5.N() + ", actual " + var3);
      } else if (var5.y()) {
         return var3.N(var2, var4);
      } else {
         try {
            return var3.N(var2, var5.L(), var4);
         } catch (IllegalArgumentException illegalargumentexception) {
            throw new IllegalArgumentException(
               "Invalid shader template value for " + var2 + " (" + var3 + ") in " + var1 + ": " + illegalargumentexception.getMessage(),
               illegalargumentexception
            );
         }
      }
   }

   private static int N(class11169 var0, String var1, String var2) {
      if (!var0.N()) {
         if (var2 != null) {
            throw new IllegalArgumentException("Only array shader template args can have a size: " + var1);
         } else {
            return 0;
         }
      } else if (var2 == null) {
         throw new IllegalArgumentException("Array shader template arg needs a marker size: " + var1);
      } else {
         return Integer.parseInt(var2);
      }
   }

   private void N(String var1) {
      if ((Integer)this.y_4 < ((List)this.y_0).size()) {
         throw new IllegalArgumentException("Too many ordered shader template actions for " + var1 + ". First unused action index: " + (Integer)this.y_4);
      } else {
         for (String s : ((Map)this.y_1).keySet()) {
            if (!((Set)this.y_3).contains(s)) {
               throw new IllegalArgumentException("Shader template arg was not found: " + s);
            }

            if (!((Set)this.y_2).contains(s)) {
               throw new IllegalArgumentException("Shader template arg was not used: " + s);
            }
         }
      }
   }
}
