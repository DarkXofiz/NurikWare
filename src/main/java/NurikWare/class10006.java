package NurikWare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class class10006 {
   public static final class10006 N = new class10006(null);
   private final List<class09998> y;

   private class10006(List<class09998> var1) {
      super();
      this.y = var1 != null && !var1.isEmpty() ? List.copyOf(var1) : List.of();
   }

   public List<class09998> y() {
      return this.y;
   }

   public class10006 N(class10006 var1) {
      if (var1 == null || var1.N()) {
         return this;
      } else if (this.N()) {
         return var1;
      } else {
         ArrayList arraylist = new ArrayList(this.y.size() + var1.y.size());
         arraylist.addAll(this.y);
         arraylist.addAll(var1.y);
         return new class10006(arraylist);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static boolean N(class09979 var0, boolean var1, boolean var2, boolean var3) {
      return switch (var0) {
         case HOVER -> var1;
         case FOCUS -> var2;
         case ACTIVE -> var3;
      };
   }

   private static boolean N(List<class09992> var0, class09992 var1) {
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         if ((class09992)iterator.next() == var1) {
            return true;
         }
      }

      return false;
   }

   public boolean N() {
      return this.y.isEmpty();
   }

   public class10006 N(class09979 var1, class09992 var2, class10002 var3) {
      if (var1 != null && var2 != null && var3 != null && !var3.N()) {
         ArrayList arraylist = new ArrayList(this.y.size() + 1);
         arraylist.addAll(this.y);
         arraylist.add(new class09998(var1, var2, var3));
         return new class10006(arraylist);
      } else {
         return this;
      }
   }

   public boolean N(class09979 var1) {
      if (var1 != null && !this.N()) {
         Iterator iterator = this.y.iterator();

         while (iterator.hasNext()) {
            if (((class09998)iterator.next()).N() == var1) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public class10002 N(List<class09992> var1, boolean var2, boolean var3, boolean var4) {
      if (!this.N() && var1 != null && !var1.isEmpty()) {
         class10002 class10002 = class10002.N;

         for (class09998 class09998 : this.y) {
            if (N(class09998.N(), var2, var3, var4) && N(var1, class09998.y())) {
               class10002 = class10002.N(class09998.L());
            }
         }

         return class10002;
      } else {
         return class10002.N;
      }
   }
}
