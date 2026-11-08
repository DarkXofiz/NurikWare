package NurikWare;

import java.util.Objects;

public enum class09736 {
   BACKGROUND_COLOR(class09989.BACKGROUND_COLOR),
   BORDER_COLOR(class09989.BORDER_COLOR),
   COLOR(class09989.COLOR),
   BORDER_RADIUS(class09989.BORDER_RADIUS),
   BORDER_WIDTH(class09989.BORDER_WIDTH),
   GAP(class09989.GAP),
   PADDING_LEFT(class09989.PADDING_LEFT),
   PADDING_RIGHT(class09989.PADDING_RIGHT),
   PADDING_TOP(class09989.PADDING_TOP),
   PADDING_BOTTOM(class09989.PADDING_BOTTOM),
   POSITION_OFFSET_X(class09989.POSITION_OFFSET_X),
   POSITION_OFFSET_Y(class09989.POSITION_OFFSET_Y),
   VISUAL_TRANSLATE_X(class09989.VISUAL_TRANSLATE_X),
   VISUAL_TRANSLATE_Y(class09989.VISUAL_TRANSLATE_Y),
   VISUAL_SCALE(class09989.VISUAL_SCALE),
   VISUAL_ROTATE(class09989.VISUAL_ROTATE),
   WIDTH(class09989.WIDTH),
   HEIGHT(class09989.HEIGHT),
   BACKDROP_SHADOW_RADIUS(class09989.BACKDROP_SHADOW_RADIUS),
   BACKDROP_SHADOW_COLOR(class09989.BACKDROP_SHADOW_COLOR),
   OPACITY(class09989.OPACITY);

   private final class09989 styleField;

   public boolean L(class09980 var1, class09980 var2) {
      return switch (this) {
         case BORDER_RADIUS -> var1.W().L() && var2.W().L();
         case GAP -> var1.E().L() && var2.E().L();
         case WIDTH -> N(var1.Q(), var2.Q());
         case HEIGHT -> N(var1.O(), var2.O());
         default -> true;
      };
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static class09962 L(class09738 var0, float var1) {
      class09962 class09962x = var0.z();
      class09962 class09962x = var0.U();
      if (class09962x != null && class09962x != null && class09962x.u() == class09962x.u()) {
         float f = class09712.N(class09962x.i(), class09962x.i(), var1);
         float f1 = class09712.N(class09962x.R(), class09962x.R(), var1);
         if (f1 < f) {
            f1 = f;
         }

         float f2 = class09712.N(class09962x.M(), class09962x.M(), var1);

         return switch (class09962x.u()) {
            case FIXED -> class09962.y(f2);
            case PERCENT -> class09962.N(f2);
            case FIT -> class09962.N(f, f1);
            case GROW -> class09962.y(f, f1);
         };
      } else {
         return class09962x;
      }
   }

   public boolean L() {
      return this.styleField.R();
   }

   private class09736(class09989 var3) {
      this.styleField = var3;
   }

   public class09989 u() {
      return this.styleField;
   }

   public boolean y() {
      return this.styleField.i();
   }

   public void y(class09743 var1) {
      if (!this.N(var1)) {
         throw new IllegalArgumentException(this.name() + " does not support transition spec " + var1.getClass().getName());
      }
   }

   private static class09666 y(class09738 var0, float var1) {
      class09666 class09666x = var0.E();
      class09666 class09666x = var0.W();
      if (class09666x != null && class09666x != null) {
         return class09666.N(class09712.N(class09666x.y(), class09666x.y(), var1), class09712.N(class09666x.L(), class09666x.L(), var1));
      } else {
         return class09666x == null ? class09666.N : class09666x;
      }
   }

   public class09980 y(class09980 var1, class09980 var2) {
      return switch (this) {
         case BACKGROUND_COLOR -> var2.y(var1.o());
         case BORDER_COLOR -> var2.u(var1.e());
         case COLOR -> var2.i(var1.H());
         case BORDER_RADIUS -> var2.N(var1.N());
         case BORDER_WIDTH -> var2.M(var1.m());
         case GAP -> var2.N(var1.E());
         case PADDING_LEFT -> var2.L(var1.U().L());
         case PADDING_RIGHT -> var2.u(var1.U().u());
         case PADDING_TOP -> var2.i(var1.U().i());
         case PADDING_BOTTOM -> var2.R(var1.U().R());
         case POSITION_OFFSET_X -> var2.B(var1.j());
         case POSITION_OFFSET_Y -> var2.Z(var1.v());
         case VISUAL_TRANSLATE_X -> var2.N(var1.n());
         case VISUAL_TRANSLATE_Y -> var2.y(var1.t());
         case VISUAL_SCALE -> var2.z(var1.G());
         case VISUAL_ROTATE -> var2.U(var1.l());
         case WIDTH -> var2.N(var1.Q());
         case HEIGHT -> var2.y(var1.O());
         case BACKDROP_SHADOW_RADIUS -> var2.W(var1.K());
         case BACKDROP_SHADOW_COLOR -> var2.L(var1.V());
         case OPACITY -> var2.s(var1.f());
      };
   }

   public boolean y(class09980 var1, class09980 var2, class09743 var3) {
      return this.N(var3) && this.L(var1, var2);
   }

   public boolean N(class09980 var1, class09980 var2) {
      return this.styleField.N(var1, var2);
   }

   public class09782 N() {
      return switch (this) {
         case BACKGROUND_COLOR, BORDER_COLOR, COLOR, BACKDROP_SHADOW_COLOR -> class09782.COLOR;
         default -> class09782.FLOAT;
         case VISUAL_TRANSLATE_X, VISUAL_TRANSLATE_Y -> class09782.TRANSLATE_LENGTH;
         case WIDTH, HEIGHT -> class09782.AXIS_SIZE;
      };
   }

   private static float N(float var0) {
      return Math.max(0.0F, var0);
   }

   private int N(class09738 var1, float var2) {
      return class09712.N(var1.R(), var1.M(), var2);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static boolean N(class09962 var0, class09962 var1) {
      if (var0 != null && var1 != null) {
         class09982 class09982x = var0.u();
         class09982 class09982x = var1.u();
         if (class09982x != class09982x) {
            return false;
         } else {
            return switch (class09982x) {
               case FIXED, PERCENT -> Float.isFinite(var0.M()) && Float.isFinite(var1.M());
               case FIT, GROW -> Float.isFinite(var0.i()) && Float.isFinite(var0.R()) && Float.isFinite(var1.i()) && Float.isFinite(var1.R());
            };
         }
      } else {
         return false;
      }
   }

   public boolean N(class09743 var1) {
      Objects.requireNonNull(var1, "spec");
      if (!var1.u() || var1 instanceof class09728) {
         return true;
      } else {
         return var1 instanceof class09815 ? ((class09815)var1).N(this.N()) : false;
      }
   }

   public boolean N(class09738 var1, class09980 var2) {
      return var1.N(this.N(var2));
   }

   public class09980 N(class09980 var1, class09738 var2) {
      class09996 class09996 = var1.R();
      this.N(class09996, var2);
      return class09996.N();
   }

   public void N(class09996 var1, class09738 var2) {
      if (var2.m() == class09733.RUNTIME_VALUE) {
         this.N(var1, var2.u());
      } else {
         float f = var2.y();
         switch (this) {
            case BACKGROUND_COLOR:
               var1.y(this.N(var2, f));
               break;
            case BORDER_COLOR:
               var1.u(this.N(var2, f));
               break;
            case COLOR:
               var1.i(this.N(var2, f));
               break;
            case BORDER_RADIUS:
               var1.N(class09965.N(var2.L()));
               break;
            case BORDER_WIDTH:
               var1.N(var2.L());
               break;
            case GAP:
               var1.N(class10009.N(var2.L()));
               break;
            case PADDING_LEFT:
               var1.N(N(var2.L()), null, null, null);
               break;
            case PADDING_RIGHT:
               var1.N(null, N(var2.L()), null, null);
               break;
            case PADDING_TOP:
               var1.N(null, null, N(var2.L()), null);
               break;
            case PADDING_BOTTOM:
               var1.N(null, null, null, N(var2.L()));
               break;
            case POSITION_OFFSET_X:
               var1.y(var2.L());
               break;
            case POSITION_OFFSET_Y:
               var1.L(var2.L());
               break;
            case VISUAL_TRANSLATE_X:
               var1.N(y(var2, f));
               break;
            case VISUAL_TRANSLATE_Y:
               var1.y(y(var2, f));
               break;
            case VISUAL_SCALE:
               var1.u(var2.L());
               break;
            case VISUAL_ROTATE:
               var1.i(var2.L());
               break;
            case WIDTH:
               var1.N(L(var2, f));
               break;
            case HEIGHT:
               var1.y(L(var2, f));
               break;
            case BACKDROP_SHADOW_RADIUS:
               var1.M(var2.L());
               break;
            case BACKDROP_SHADOW_COLOR:
               var1.L(this.N(var2, f));
               break;
            case OPACITY:
               var1.z(var2.L());
         }
      }
   }

   public class09980 N(class09980 var1, class09753 var2) {
      class09996 class09996 = var1.R();
      this.N(class09996, var2);
      return class09996.N();
   }

   public void N(class09996 var1, class09753 var2) {
      switch (this) {
         case BACKGROUND_COLOR:
            var1.y(var2.L());
            break;
         case BORDER_COLOR:
            var1.u(var2.L());
            break;
         case COLOR:
            var1.i(var2.L());
            break;
         case BORDER_RADIUS:
            var1.N(class09965.N(var2.y()));
            break;
         case BORDER_WIDTH:
            var1.N(var2.y());
            break;
         case GAP:
            var1.N(class10009.N(var2.y()));
            break;
         case PADDING_LEFT:
            var1.N(N(var2.y()), null, null, null);
            break;
         case PADDING_RIGHT:
            var1.N(null, N(var2.y()), null, null);
            break;
         case PADDING_TOP:
            var1.N(null, null, N(var2.y()), null);
            break;
         case PADDING_BOTTOM:
            var1.N(null, null, null, N(var2.y()));
            break;
         case POSITION_OFFSET_X:
            var1.y(var2.y());
            break;
         case POSITION_OFFSET_Y:
            var1.L(var2.y());
            break;
         case VISUAL_TRANSLATE_X:
            var1.N(var2.i());
            break;
         case VISUAL_TRANSLATE_Y:
            var1.y(var2.i());
            break;
         case VISUAL_SCALE:
            var1.u(var2.y());
            break;
         case VISUAL_ROTATE:
            var1.i(var2.y());
            break;
         case WIDTH:
            var1.N(var2.u());
            break;
         case HEIGHT:
            var1.y(var2.u());
            break;
         case BACKDROP_SHADOW_RADIUS:
            var1.M(var2.y());
            break;
         case BACKDROP_SHADOW_COLOR:
            var1.L(var2.L());
            break;
         case OPACITY:
            var1.z(var2.y());
      }
   }

   public class09753 N(class09980 var1) {
      return switch (this) {
         case BACKGROUND_COLOR -> class09753.N(var1.o());
         case BORDER_COLOR -> class09753.N(var1.e());
         case COLOR -> class09753.N(var1.H());
         case BORDER_RADIUS -> class09753.N(var1.N());
         case BORDER_WIDTH -> class09753.N(var1.m());
         case GAP -> class09753.N(var1.E().u());
         case PADDING_LEFT -> class09753.N(var1.U().L());
         case PADDING_RIGHT -> class09753.N(var1.U().u());
         case PADDING_TOP -> class09753.N(var1.U().i());
         case PADDING_BOTTOM -> class09753.N(var1.U().R());
         case POSITION_OFFSET_X -> class09753.N(var1.j());
         case POSITION_OFFSET_Y -> class09753.N(var1.v());
         case VISUAL_TRANSLATE_X -> class09753.N(var1.n());
         case VISUAL_TRANSLATE_Y -> class09753.N(var1.t());
         case VISUAL_SCALE -> class09753.N(var1.G());
         case VISUAL_ROTATE -> class09753.N(var1.l());
         case WIDTH -> class09753.N(var1.Q());
         case HEIGHT -> class09753.N(var1.O());
         case BACKDROP_SHADOW_RADIUS -> class09753.N(var1.K());
         case BACKDROP_SHADOW_COLOR -> class09753.N(var1.V());
         case OPACITY -> class09753.N(var1.f());
      };
   }

   public class09738 N(class09980 var1, class09980 var2, class09743 var3) {
      this.y(var3);

      return switch (this) {
         case BACKGROUND_COLOR -> class09738.N(this, var3, var1.o(), var2.o());
         case BORDER_COLOR -> class09738.N(this, var3, var1.e(), var2.e());
         case COLOR -> class09738.N(this, var3, var1.H(), var2.H());
         case BORDER_RADIUS -> class09738.N(this, var3, var1.N(), var2.N());
         case BORDER_WIDTH -> class09738.N(this, var3, var1.m(), var2.m());
         case GAP -> class09738.N(this, var3, var1.E().u(), var2.E().u());
         case PADDING_LEFT -> class09738.N(this, var3, var1.U().L(), var2.U().L());
         case PADDING_RIGHT -> class09738.N(this, var3, var1.U().u(), var2.U().u());
         case PADDING_TOP -> class09738.N(this, var3, var1.U().i(), var2.U().i());
         case PADDING_BOTTOM -> class09738.N(this, var3, var1.U().R(), var2.U().R());
         case POSITION_OFFSET_X -> class09738.N(this, var3, var1.j(), var2.j());
         case POSITION_OFFSET_Y -> class09738.N(this, var3, var1.v(), var2.v());
         case VISUAL_TRANSLATE_X -> class09738.N(this, var3, var1.n(), var2.n());
         case VISUAL_TRANSLATE_Y -> class09738.N(this, var3, var1.t(), var2.t());
         case VISUAL_SCALE -> class09738.N(this, var3, var1.G(), var2.G());
         case VISUAL_ROTATE -> class09738.N(this, var3, var1.l(), var2.l());
         case WIDTH -> class09738.N(this, var3, var1.Q(), var2.Q());
         case HEIGHT -> class09738.N(this, var3, var1.O(), var2.O());
         case BACKDROP_SHADOW_RADIUS -> class09738.N(this, var3, var1.K(), var2.K());
         case BACKDROP_SHADOW_COLOR -> class09738.N(this, var3, var1.V(), var2.V());
         case OPACITY -> class09738.N(this, var3, var1.f(), var2.f());
      };
   }
}
