package NurikWare;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public record class09713(Map<class09736, class09743> specs) {
   public static final class09713 N = new class09713(null);

   public class09713(Map<class09736, class09743> specs) {
      super();
      EnumMap enummap = new EnumMap<>(class09736.class);
      if (specs != null) {
         for (Entry entry : specs.entrySet()) {
            class09736 class09736 = (class09736)entry.getKey();
            if (class09736 != null) {
               class09743 class09743 = entry.getValue() == null ? class09743.Z() : (class09743)entry.getValue();
               if (class09743.u()) {
                  class09736.y(class09743);
                  enummap.put(class09736, class09743);
               }
            }
         }
      }

      this.specs = Collections.unmodifiableMap(enummap);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof class09713 class09713x) {
         class09713 class09713x = class09713x;

         try {
            map1 = class09713x.y();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         Map map = map1;
         return this.specs.equals(map);
      } else {
         return false;
      }
   }

   public Map<class09736, class09743> y() {
      return this.specs;
   }

   public class09743 N(class09736 var1) {
      return var1 == null ? class09743.Z() : this.specs.getOrDefault(var1, class09743.Z());
   }

   public boolean N() {
      return this.specs.isEmpty();
   }
}
