package NurikWare;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public final class class10010 {
   public static final class10010 N = new class10010(null);
   private final Map<class09979, class10002> y;

   public class10010(Map<class09979, class10002> var1) {
      super();
      EnumMap enummap = new EnumMap<>(class09979.class);
      if (var1 != null) {
         for (Entry entry : var1.entrySet()) {
            class09979 class09979 = (class09979)entry.getKey();
            class10002 class10002 = (class10002)entry.getValue();
            if (class09979 != null && class10002 != null && !class10002.N()) {
               enummap.put(class09979, class10002);
            }
         }
      }

      this.y = Collections.unmodifiableMap(enummap);
   }

   public Map<class09979, class10002> y() {
      return this.y;
   }

   public class10010 N(class10010 var1) {
      if (var1 != null && var1 != N && !var1.N()) {
         EnumMap enummap = new EnumMap<>(class09979.class);
         enummap.putAll(this.y);

         for (Entry entry : var1.y.entrySet()) {
            class09979 class09979 = (class09979)entry.getKey();
            class10002 class10002x = (class10002)entry.getValue();
            class10002 class10002x = this.N(class09979).N(class10002x);
            if (class10002x.N()) {
               enummap.remove(class09979);
            } else {
               enummap.put(class09979, class10002x);
            }
         }

         return new class10010(enummap);
      } else {
         return this;
      }
   }

   public boolean N() {
      return this.y.isEmpty();
   }

   public class10002 N(class09979 var1) {
      return var1 == null ? class10002.N : this.y.getOrDefault(var1, class10002.N);
   }

   public class10010 N(class09979 var1, class10002 var2) {
      if (var1 == null) {
         return this;
      } else {
         EnumMap enummap = new EnumMap<>(class09979.class);
         enummap.putAll(this.y);
         if (var2 != null && !var2.N()) {
            enummap.put(var1, var2);
         } else {
            enummap.remove(var1);
         }

         return new class10010(enummap);
      }
   }

   public class10002 N(boolean var1, boolean var2, boolean var3) {
      class10002 class10002 = class10002.N;
      if (var1) {
         class10002 = class10002.N(this.N(class09979.HOVER));
      }

      if (var2) {
         class10002 = class10002.N(this.N(class09979.FOCUS));
      }

      if (var3) {
         class10002 = class10002.N(this.N(class09979.ACTIVE));
      }

      return class10002;
   }
}
