package NurikWare;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public final class class10062 {
   private final class10033 N;
   private final Map<class10021, class10050> y = new IdentityHashMap<>();

   public boolean L(class10021 var1) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 class10050 = this.R(var1);
         this.N(class10050, var1.B());
         int i = class10050.N;
         int j = class10050.y;
         float f = class10050.L;
         class10050.y = 0;
         class10050.N = var1.B().length();
         this.y(var1, class10050);
         return this.N(var1, class10050, i, j, f);
      }
   }

   private static boolean L(class10021 var0, class10050 var1) {
      return class10067.L(var0.B(), var1.y, var1.N);
   }

   public boolean L(class10021 var1, boolean var2) {
      return !M(var1) ? false : this.N(var1, this.R(var1), 0, var2);
   }

   private static boolean M(class10021 var0) {
      return var0 != null && var0.y() == class10049.INPUT;
   }

   private class10062(class09781 var1) {
      super();
      this.N = new class10033(var1);
   }

   public class10041 i(class10021 var1) {
      if (!M(var1)) {
         return class10041.N;
      } else {
         class10050 class10050 = this.R(var1);
         this.N(class10050, var1.B());
         this.y(var1, class10050);
         return this.N(var1, class10050);
      }
   }

   private static int i(class10021 var0, class10050 var1) {
      return class10067.y(var0.B(), var1.y, var1.N);
   }

   public boolean u(class10021 var1, boolean var2) {
      return !M(var1) ? false : this.N(var1, this.R(var1), var1.B().length(), var2);
   }

   private static int u(class10021 var0, class10050 var1) {
      return class10067.N(var0.B(), var1.y, var1.N);
   }

   public boolean u(class10021 var1) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 class10050 = this.R(var1);
         if (!class10050.u) {
            return false;
         } else {
            class10050.u = false;
            return true;
         }
      }
   }

   private void y(class10021 var1, class10050 var2) {
      var2.L = this.N.N(var1, var2.N, var2.L);
   }

   public boolean y(class10021 var1, boolean var2) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 class10050 = this.R(var1);
         return this.N(var1, class10050, class10067.L(var1.B(), class10050.N), var2);
      }
   }

   public boolean y(class10021 var1, float var2) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 class10050 = this.R(var1);
         if (!class10050.u) {
            return false;
         } else {
            this.N(class10050, var1.B());
            int i = class10050.N;
            int j = class10050.y;
            float f = class10050.L;
            class10050.N = this.N.N(var1, var2, class10050.L);
            this.y(var1, class10050);
            return this.N(var1, class10050, i, j, f);
         }
      }
   }

   public boolean y(class10021 var1) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 class10050 = this.R(var1);
         String s = var1.B();
         this.N(class10050, s);
         if (L(var1, class10050)) {
            return this.N(var1, class10050, "");
         } else if (class10050.N >= s.length()) {
            return false;
         } else {
            int i = class10067.L(s, class10050.N);
            return this.N(var1, class10050, class10050.N, i, "");
         }
      }
   }

   private static boolean N(class10050 var0, int var1, int var2, float var3) {
      return var1 != var0.N || var2 != var0.y || Float.compare(var3, var0.L) != 0;
   }

   public boolean N(class10021 var1, boolean var2) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 class10050 = this.R(var1);
         return this.N(var1, class10050, class10067.y(var1.B(), class10050.N), var2);
      }
   }

   private boolean N(class10021 var1, class10050 var2, int var3, int var4, float var5) {
      if (!N(var2, var3, var4, var5)) {
         return false;
      } else {
         var1.i(1);
         return true;
      }
   }

   public static class10062 N(class09781 var0) {
      return var0.N(class10062.class).orElseGet(() -> {
         class10062 class10062 = new class10062(Objects.requireNonNull(var0, "context"));
         var0.N(class10062.class, class10062);
         return class10062;
      });
   }

   public boolean N(class10021 var1, String var2) {
      if (!M(var1)) {
         return false;
      } else {
         String s = class10027.N(var2);
         class10050 class10050 = this.R(var1);
         this.N(class10050, var1.B());
         return s.isEmpty() && !L(var1, class10050) ? false : this.N(var1, class10050, s);
      }
   }

   public boolean N(class10021 var1) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 class10050 = this.R(var1);
         String s = var1.B();
         this.N(class10050, s);
         if (L(var1, class10050)) {
            return this.N(var1, class10050, "");
         } else if (class10050.N <= 0) {
            return false;
         } else {
            int i = class10067.y(s, class10050.N);
            return this.N(var1, class10050, i, class10050.N, "");
         }
      }
   }

   private boolean N(class10021 var1, class10050 var2, String var3) {
      return this.N(var1, var2, u(var1, var2), i(var1, var2), var3);
   }

   private boolean N(class10021 var1, class10050 var2, int var3, boolean var4) {
      String s = var1.B();
      this.N(var2, s);
      int i = var2.N;
      int j = var2.y;
      float f = var2.L;
      int k = class10067.N(s, var3);
      var2.N = k;
      if (!var4) {
         var2.y = k;
      }

      this.y(var1, var2);
      return this.N(var1, var2, i, j, f);
   }

   private boolean N(class10021 var1, class10050 var2, int var3, int var4, String var5) {
      String s = var1.B();
      int i = var2.N;
      int j = var2.y;
      float f = var2.L;
      int k = class10067.N(s, var3, var4);
      String s1 = class10027.N(s, k, var4, var5);
      int l = class10067.N(s1, k + var5.length());
      var2.N = l;
      var2.y = l;
      if (!s.equals(s1)) {
         var1.N(s1);
      }

      this.y(var1, var2);
      boolean flag = N(var2, i, j, f);
      if (flag && s.equals(s1)) {
         var1.i(1);
      }

      return !s.equals(s1) || flag;
   }

   public boolean N(class10021 var1, float var2) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 class10050 = this.R(var1);
         this.N(class10050, var1.B());
         int i = class10050.N;
         int j = class10050.y;
         float f = class10050.L;
         boolean flag = class10050.u;
         int k = this.N.N(var1, var2, class10050.L);
         class10050.N = k;
         class10050.y = k;
         class10050.u = true;
         this.y(var1, class10050);
         boolean flag1 = i != class10050.N || j != class10050.y || Float.compare(f, class10050.L) != 0 || !flag;
         if (flag1) {
            var1.i(1);
         }

         return flag1;
      }
   }

   public void N(class10021 var1, class10021 var2) {
      if (M(var1) && var1 != var2) {
         class10050 class10050 = this.R(var1);
         boolean flag = L(var1, class10050);
         class10050.u = false;
         class10050.y = class10050.N;
         if (flag) {
            var1.i(1);
         }
      }

      if (M(var2)) {
         this.N(this.R(var2), var2.B());
      }
   }

   private class10041 N(class10021 var1, class10050 var2) {
      String s = var1.B();
      boolean flag = s.isEmpty() && !var1.Z().isEmpty();
      String s1 = flag ? var1.Z() : s;
      return new class10041(s, s1, flag, var2.N, u(var1, var2), i(var1, var2), flag ? 0.0F : var2.L);
   }

   private void N(class10050 var1, String var2) {
      var1.N = class10067.N(var2, var1.N);
      var1.y = class10067.N(var2, var1.y);
   }

   private class10050 R(class10021 var1) {
      return this.y.computeIfAbsent(var1, var0 -> new class10050());
   }
}
