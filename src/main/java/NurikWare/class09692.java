package NurikWare;

import java.util.EnumMap;

public final class class09692 {
   private static void L(EnumMap<class09736, class09743> var0, class09743 var1) {
      var0.put(class09736.VISUAL_TRANSLATE_X, var1);
      var0.put(class09736.VISUAL_TRANSLATE_Y, var1);
   }

   private class09692() {
      super();
   }

   private static void y(EnumMap<class09736, class09743> var0, class09743 var1) {
      var0.put(class09736.POSITION_OFFSET_X, var1);
      var0.put(class09736.POSITION_OFFSET_Y, var1);
   }

   private static void N(EnumMap<class09736, class09743> var0, class09743 var1) {
      var0.put(class09736.PADDING_LEFT, var1);
      var0.put(class09736.PADDING_RIGHT, var1);
      var0.put(class09736.PADDING_TOP, var1);
      var0.put(class09736.PADDING_BOTTOM, var1);
   }

   public static class09713 N(float var0, class09759 var1) {
      EnumMap enummap = new EnumMap<>(class09736.class);
      class09728 class09728 = new class09728(Math.max(0.0F, var0) / 1000.0F, var1);
      if (!class09728.u()) {
         return class09713.N;
      } else {
         for (class09736 class09736 : class09736.values()) {
            enummap.put(class09736, class09728);
         }

         return new class09713(enummap);
      }
   }

   public static class09713 N(class09994... var0) {
      if (var0 != null && var0.length != 0) {
         EnumMap enummap = new EnumMap<>(class09736.class);

         for (class09994 class09994 : var0) {
            if (class09994 != null && class09994.y() != null && class09994.y().u()) {
               class09736 class09736 = class09994.N();
               if (class09736 == null && class09994.L() == class09668.PADDING) {
                  N(enummap, class09994.y());
               } else if (class09736 == null && class09994.L() == class09668.POSITION_OFFSET) {
                  y(enummap, class09994.y());
               } else if (class09736 == null && class09994.L() == class09668.VISUAL_TRANSLATE) {
                  L(enummap, class09994.y());
               } else if (class09736 != null) {
                  enummap.put(class09736, class09994.y());
               }
            }
         }

         return new class09713(enummap);
      } else {
         return class09713.N;
      }
   }
}
