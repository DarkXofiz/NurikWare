package NurikWare;

import java.util.Objects;

public record class09994(class09736 property, class09743 spec, class09668 group) {
   public class09668 L() {
      return this.group;
   }

   public static class09994 L(class09743 var0) {
      return N(class09736.COLOR, var0);
   }

   public static class09994 M(class09743 var0) {
      return N(class09668.PADDING, var0);
   }

   public static class09994 P(class09743 var0) {
      return N(class09736.BACKDROP_SHADOW_COLOR, var0);
   }

   public class09994(class09736 property, class09743 spec, class09668 group) {
      super();
      spec = spec == null ? class09743.Z() : spec;
      group = group == null ? class09668.SINGLE : group;
      N(property, group, spec);
      this.property = property;
      this.spec = spec;
      this.group = group;
   }

   public static class09994 B(class09743 var0) {
      return N(class09668.POSITION_OFFSET, var0);
   }

   public static class09994 Z(class09743 var0) {
      return N(class09668.VISUAL_TRANSLATE, var0);
   }

   public static class09994 i(class09743 var0) {
      return N(class09736.BORDER_WIDTH, var0);
   }

   public static class09994 s(class09743 var0) {
      return N(class09736.OPACITY, var0);
   }

   public static class09994 m(class09743 var0) {
      return N(class09736.BACKDROP_SHADOW_RADIUS, var0);
   }

   public static class09994 U(class09743 var0) {
      return N(class09736.VISUAL_ROTATE, var0);
   }

   public static class09994 z(class09743 var0) {
      return N(class09736.VISUAL_SCALE, var0);
   }

   public static class09994 u(class09743 var0) {
      return N(class09736.BORDER_RADIUS, var0);
   }

   public static class09994 y(class09743 var0) {
      return N(class09736.BORDER_COLOR, var0);
   }

   public class09743 y() {
      return this.spec;
   }

   public static class09994 E(class09743 var0) {
      return N(class09736.WIDTH, var0);
   }

   public class09736 N() {
      return this.property;
   }

   public static class09994 N(class09743 var0) {
      return N(class09736.BACKGROUND_COLOR, var0);
   }

   public static class09994 N(class09736 var0, class09743 var1) {
      return new class09994(Objects.requireNonNull(var0, "property"), var1, class09668.SINGLE);
   }

   private static class09994 N(class09668 var0, class09743 var1) {
      return new class09994(null, var1, Objects.requireNonNull(var0, "group"));
   }

   private static void N(class09736 var0, class09668 var1, class09743 var2) {
      if (var2.u()) {
         if (!(var2 instanceof class09728)) {
            if (var2 instanceof class09815 class09815) {
               class09782 class09782 = N(var0, var1);
               if (class09782 != null && !class09815.N(class09782)) {
                  throw new IllegalArgumentException("Transition spec does not support " + class09782 + " values");
               }
            } else {
               throw new IllegalArgumentException("Unsupported transition spec type: " + var2.getClass().getName());
            }
         }
      }
   }

   private static class09782 N(class09736 var0, class09668 var1) {
      if (var0 != null) {
         return var0.N();
      } else {
         return switch (var1) {
            case SINGLE, PADDING -> class09782.FLOAT;
            case POSITION_OFFSET -> class09782.TRANSLATE_LENGTH;
            case VISUAL_TRANSLATE -> null;
         };
      }
   }

   public static class09994 W(class09743 var0) {
      return N(class09736.HEIGHT, var0);
   }

   public static class09994 R(class09743 var0) {
      return N(class09736.GAP, var0);
   }
}
