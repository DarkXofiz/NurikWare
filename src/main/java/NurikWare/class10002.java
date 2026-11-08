package NurikWare;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;

public final class class10002 {
   public static final class10002 N = new class10002();
   private final EnumMap<class09989, Object> y;
   private final int L;

   public class10002 L(int var1) {
      return this.N(class09989.BACKDROP_SHADOW_COLOR, var1);
   }

   public class10002 L(float var1) {
      return this.N(class09989.PADDING_TOP, var1);
   }

   public class10002 L(class09973 var1) {
      return this.N(class09989.ANCHOR_ALIGN, var1);
   }

   public class10002 L() {
      return this.N(class09989.Z_INDEX, new class09966(true, 0));
   }

   public class10002 L(boolean var1) {
      return this.N(class09989.FOCUSABLE, var1);
   }

   public class10002 M(float var1) {
      return this.N(class09989.POSITION_OFFSET_X, var1);
   }

   public class10002 P(float var1) {
      return this.N(class09989.TEXT_OUTLINE_WIDTH, var1);
   }

   public class10002 T(float var1) {
      return this.N(class09989.BLUR_RADIUS, var1);
   }

   private class10002() {
      super();
      this.y = new EnumMap<>(class09989.class);
      this.L = this.y.hashCode();
   }

   private class10002(EnumMap<class09989, Object> var1) {
      super();
      this.y = N(var1);
      this.L = this.y.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof class10002 class10002) {
         return this.L != class10002.L ? false : this.y.equals(class10002.y);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "StylePatch[values=" + this.y + "]";
   }

   @Override
   public int hashCode() {
      return this.L;
   }

   public class10002 B(float var1) {
      return this.N(class09989.POSITION_OFFSET_Y, var1);
   }

   public class10002 Z(float var1) {
      return this.N(class09989.ANCHOR_GAP, var1);
   }

   public class10002 i(float var1) {
      return this.N(class10009.N(var1));
   }

   public class10002 i(int var1) {
      return this.N(class09989.COLOR, var1);
   }

   public class10002 s(float var1) {
      return this.N(class09989.OPACITY, var1);
   }

   public class10002 m(float var1) {
      return this.N(class09989.TEXT_FONT_SIZE, var1);
   }

   public class10002 U(float var1) {
      return this.N(class09989.VISUAL_ROTATE, var1);
   }

   public class10002 z(float var1) {
      return this.N(class09989.VISUAL_SCALE, var1);
   }

   public class10002 u(float var1) {
      return this.N(class09989.PADDING_BOTTOM, var1);
   }

   public class10002 u(boolean var1) {
      return this.N(class09989.POINTER_TRANSPARENT, var1);
   }

   private EnumMap<class09989, Object> u() {
      return new EnumMap<>(this.y);
   }

   public class10002 u(int var1) {
      return this.N(class09989.BORDER_COLOR, var1);
   }

   public class10002 y(int var1) {
      return this.N(class09989.BACKGROUND_COLOR, var1);
   }

   public Object y(class09989 var1) {
      return var1 == null ? null : this.y.get(var1);
   }

   public class10002 y(class09962 var1) {
      return this.N(class09989.HEIGHT, var1);
   }

   public class10002 y(class09666 var1) {
      return this.N(class09989.VISUAL_TRANSLATE_Y, var1);
   }

   public Set<class09989> y() {
      return Collections.unmodifiableSet(this.y.keySet());
   }

   public class10002 y(class09973 var1) {
      return this.N(class09989.ALIGN_Y, var1);
   }

   public class10002 y(boolean var1) {
      return this.N(class09989.ANCHOR_CLAMP, var1);
   }

   public class10002 y(float var1) {
      return this.N(class09989.PADDING_RIGHT, var1);
   }

   public class10002 E(float var1) {
      return this.N(class09989.BACKDROP_BLUR_RADIUS, var1);
   }

   private static EnumMap<class09989, Object> N(Map<class09989, Object> var0) {
      EnumMap enummap = new EnumMap<>(class09989.class);
      if (var0 != null && !var0.isEmpty()) {
         for (Entry entry : var0.entrySet()) {
            N(enummap, (class09989)entry.getKey(), entry.getValue());
         }

         return enummap;
      } else {
         return enummap;
      }
   }

   public boolean N(class09989 var1) {
      return var1 != null && this.y.containsKey(var1);
   }

   private static void N(EnumMap<class09989, Object> var0, class09989 var1, Object var2) {
      if (var1 != null && var2 != null) {
         Object object = var1.N(var2);
         if (object != null) {
            var0.put(var1, object);
         }
      }
   }

   public class10002 N(class09973 var1) {
      return this.N(class09989.ALIGN_X, var1);
   }

   public class10002 N(class09838 var1) {
      return this.N(class09989.TEXT_FONT_SPEC, var1);
   }

   public class10002 N(class09964 var1) {
      return this.N(class09989.TEXT_WRAP, var1);
   }

   public boolean N() {
      return this.y.isEmpty();
   }

   public class10002 N(class09713 var1) {
      return this.N(class09989.TRANSITIONS, var1);
   }

   public class10002 N(class10002 var1) {
      if (var1 == null || var1.N()) {
         return this;
      } else if (this.N()) {
         return var1;
      } else {
         EnumMap enummap = this.u();
         enummap.putAll(var1.y);
         return new class10002(enummap);
      }
   }

   public class10002 N(class09689 var1) {
      return this.N(class09989.TEXTURE_UV, var1);
   }

   public class10002 N(class09965 var1) {
      return this.N(class09989.BORDER_RADIUS, var1);
   }

   public class10002 N(class09981 var1) {
      return this.N(class09989.BORDER_POSITION, var1);
   }

   public class10002 N(class09969 var1) {
      return this.N(class09989.POSITION, var1);
   }

   public class10002 N(class09989 var1, Object var2) {
      if (var1 != null && var2 != null) {
         Object object = var1.N(var2);
         if (object != null && !Objects.equals(this.y.get(var1), object)) {
            EnumMap enummap = this.u();
            enummap.put(var1, object);
            return new class10002(enummap);
         } else {
            return this;
         }
      } else {
         return this;
      }
   }

   public class10002 N(int var1) {
      return this.N(class09989.Z_INDEX, new class09966(false, var1));
   }

   public class09980 N(class09980 var1) {
      return class10008.N(var1 == null ? class09968.N() : var1, this.y);
   }

   public class10002 N(class09983 var1) {
      return this.N(class09989.BOX_SIZING, var1);
   }

   public class10002 N(class09985 var1) {
      if (var1 == null) {
         return this;
      } else {
         EnumMap enummap = this.u();
         N(enummap, class09989.PADDING_LEFT, var1.L());
         N(enummap, class09989.PADDING_RIGHT, var1.u());
         N(enummap, class09989.PADDING_TOP, var1.i());
         N(enummap, class09989.PADDING_BOTTOM, var1.R());
         return new class10002(enummap);
      }
   }

   public class10002 N(float var1) {
      return this.N(class09989.PADDING_LEFT, var1);
   }

   public class10002 N(class09975 var1) {
      return this.N(class09989.LAYOUT_DIRECTION, var1);
   }

   public class10002 N(class10009 var1) {
      return this.N(class09989.GAP, var1);
   }

   public class10002 N(class09666 var1) {
      return this.N(class09989.VISUAL_TRANSLATE_X, var1);
   }

   public class10002 N(class10001 var1) {
      if (var1 == null) {
         return this;
      } else {
         EnumMap enummap = this.u();
         N(enummap, class09989.SCROLLBAR_TRACK_WIDTH, var1.N());
         N(enummap, class09989.SCROLLBAR_TRACK_PADDING, var1.y());
         N(enummap, class09989.SCROLLBAR_THUMB_MIN_HEIGHT, var1.u());
         N(enummap, class09989.SCROLLBAR_TRACK_COLOR, var1.i());
         N(enummap, class09989.SCROLLBAR_TRACK_HOVER_COLOR, var1.R());
         N(enummap, class09989.SCROLLBAR_TRACK_ACTIVE_COLOR, var1.M());
         N(enummap, class09989.SCROLLBAR_THUMB_COLOR, var1.B());
         N(enummap, class09989.SCROLLBAR_THUMB_HOVER_COLOR, var1.Z());
         N(enummap, class09989.SCROLLBAR_THUMB_ACTIVE_COLOR, var1.z());
         return new class10002(enummap);
      }
   }

   public class10002 N(class09976 var1) {
      return this.N(class09989.CLIP, var1);
   }

   public class10002 N(class09993 var1) {
      return this.N(class09989.OVERFLOW_Y, var1);
   }

   public class10002 N(class09970 var1) {
      return this.N(class09989.SCROLLBAR_MODE, var1);
   }

   public class10002 N(String var1) {
      return this.N(class09989.ANCHOR_KEY, var1);
   }

   public class10002 N(class09962 var1) {
      return this.N(class09989.WIDTH, var1);
   }

   public class10002 N(class10003 var1) {
      return this.N(class09989.ANCHOR_SIDE, var1);
   }

   public <T> T N(class09989 var1, Class<T> var2) {
      Object object = this.y(var1);
      return (T)(object == null ? null : var2.cast(object));
   }

   public class10002 N(boolean var1) {
      return this.N(class09989.ANCHOR_FLIP, var1);
   }

   public class10002 W(float var1) {
      return this.N(class09989.BACKDROP_SHADOW_RADIUS, var1);
   }

   public class10002 R(int var1) {
      return this.N(class09989.TEXT_OUTLINE_COLOR, var1);
   }

   public class10002 R(float var1) {
      return this.N(class09989.BORDER_WIDTH, var1);
   }
}
