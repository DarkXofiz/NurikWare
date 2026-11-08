package NurikWare;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public enum class09989 {
   LAYOUT_DIRECTION(true, true, true, false, class09980::M, class09984.N(class09980::M), var0 -> var0),
   ALIGN_X(true, true, true, false, class09980::B, class09984.N(class09980::B), var0 -> var0),
   ALIGN_Y(true, true, true, false, class09980::Z, class09984.N(class09980::Z), var0 -> var0),
   BOX_SIZING(true, true, true, false, class09980::z, class09984.N(class09980::z), var0 -> var0),
   PADDING_LEFT(true, true, true, true, var0 -> var0.U().L(), class09984.N(var0 -> var0.U().L()), class09989::y),
   PADDING_RIGHT(true, true, true, true, var0 -> var0.U().u(), class09984.N(var0 -> var0.U().u()), var0 -> var0),
   PADDING_TOP(true, true, true, true, var0 -> var0.U().i(), class09984.N(var0 -> var0.U().i()), var0 -> var0),
   PADDING_BOTTOM(true, true, true, true, var0 -> var0.U().R(), class09984.N(var0 -> var0.U().R()), var0 -> var0),
   GAP(true, true, true, true, class09980::E, class09984.N(class09980::E), class09989::L),
   BORDER_RADIUS(true, true, true, true, class09980::W, class09984.N(class09980::W), var0 -> var0),
   BORDER_WIDTH(true, true, true, true, class09980::m, class09984.N(class09980::m), var0 -> var0),
   BORDER_POSITION(true, true, true, false, class09980::P, class09984.N(class09980::P), var0 -> var0),
   POSITION(true, true, true, false, class09980::s, class09984.N(class09980::s), var0 -> var0),
   Z_INDEX(true, true, true, false, var0 -> new class09966(var0.T(), var0.b()), (var0, var1) -> var0.T() != var1.T() || var0.b() != var1.b(), var0 -> var0),
   POSITION_OFFSET_X(true, true, true, true, class09980::j, class09984.N(class09980::j), var0 -> var0),
   POSITION_OFFSET_Y(true, true, true, true, class09980::v, class09984.N(class09980::v), var0 -> var0),
   ANCHOR_KEY(true, true, true, false, class09980::x, class09984.N(class09980::x), var0 -> var0),
   ANCHOR_SIDE(true, true, true, false, class09980::D, class09984.N(class09980::D), var0 -> var0),
   ANCHOR_GAP(true, true, true, false, class09980::h, class09984.N(class09980::h), var0 -> var0),
   ANCHOR_ALIGN(true, true, true, false, class09980::r, class09984.N(class09980::r), var0 -> var0),
   ANCHOR_FLIP(true, true, true, false, class09980::NN, class09984.N(class09980::NN), var0 -> var0),
   ANCHOR_CLAMP(true, true, true, false, class09980::Ny, class09984.N(class09980::Ny), var0 -> var0),
   VISUAL_TRANSLATE_X(true, true, true, true, class09980::n, class09984.N(class09980::n), var0 -> var0),
   VISUAL_TRANSLATE_Y(true, true, true, true, class09980::t, class09984.N(class09980::t), var0 -> var0),
   VISUAL_SCALE(true, true, true, true, class09980::G, class09984.N(class09980::G), class09989::R),
   VISUAL_ROTATE(true, true, true, true, class09980::l, class09984.N(class09980::l), class09989::M),
   CLIP(true, true, true, false, class09980::d, class09984.N(class09980::d), var0 -> var0),
   OVERFLOW_Y(true, true, true, false, class09980::w, class09984.N(class09980::w), var0 -> var0),
   SCROLLBAR_MODE(true, true, true, false, class09980::k, class09984.N(class09980::k), var0 -> var0),
   SCROLLBAR_TRACK_WIDTH(true, true, true, false, var0 -> var0.Y().N(), class09984.N(var0 -> var0.Y().N()), var0 -> var0),
   SCROLLBAR_TRACK_PADDING(true, true, true, false, var0 -> var0.Y().y(), class09984.N(var0 -> var0.Y().y()), var0 -> var0),
   SCROLLBAR_THUMB_MIN_HEIGHT(true, true, true, false, var0 -> var0.Y().u(), class09984.N(var0 -> var0.Y().u()), var0 -> var0),
   SCROLLBAR_TRACK_COLOR(true, true, true, false, var0 -> var0.Y().i(), class09984.N(var0 -> var0.Y().i()), var0 -> var0),
   SCROLLBAR_TRACK_HOVER_COLOR(true, true, true, false, var0 -> var0.Y().R(), class09984.N(var0 -> var0.Y().R()), var0 -> var0),
   SCROLLBAR_TRACK_ACTIVE_COLOR(true, true, true, false, var0 -> var0.Y().M(), class09984.N(var0 -> var0.Y().M()), var0 -> var0),
   SCROLLBAR_THUMB_COLOR(true, true, true, false, var0 -> var0.Y().B(), class09984.N(var0 -> var0.Y().B()), var0 -> var0),
   SCROLLBAR_THUMB_HOVER_COLOR(true, true, true, false, var0 -> var0.Y().Z(), class09984.N(var0 -> var0.Y().Z()), var0 -> var0),
   SCROLLBAR_THUMB_ACTIVE_COLOR(true, true, true, false, var0 -> var0.Y().z(), class09984.N(var0 -> var0.Y().z()), var0 -> var0),
   WIDTH(true, true, true, true, class09980::Q, class09984.N(class09980::Q), var0 -> var0),
   HEIGHT(true, true, true, true, class09980::O, class09984.N(class09980::O), var0 -> var0),
   VISIBLE(true, true, true, false, class09980::g, class09984.N(class09980::g), var0 -> var0),
   FOCUSABLE(true, true, true, false, class09980::I, class09984.N(class09980::I), var0 -> var0),
   POINTER_TRANSPARENT(true, true, true, false, class09980::J, class09984.N(class09980::J), var0 -> var0),
   BACKGROUND_COLOR(true, true, true, true, class09980::o, class09984.N(class09980::o), var0 -> var0),
   BACKDROP_BLUR_RADIUS(true, true, true, false, class09980::q, class09984.N(class09980::q), var0 -> var0),
   BACKDROP_SHADOW_RADIUS(true, true, true, true, class09980::K, class09984.N(class09980::K), var0 -> var0),
   BACKDROP_SHADOW_COLOR(true, true, true, true, class09980::V, class09984.N(class09980::V), var0 -> var0),
   BORDER_COLOR(true, true, true, true, class09980::e, class09984.N(class09980::e), var0 -> var0),
   COLOR(true, true, true, true, class09980::H, class09984.N(class09980::H), var0 -> var0),
   TEXT_FONT_SIZE(true, true, true, false, class09980::c, class09984.N(class09980::c), class09989::u),
   TEXT_FONT_SPEC(true, true, true, false, class09980::X, class09984.N(class09980::X), var0 -> var0),
   TEXT_WRAP(true, true, true, false, class09980::a, class09984.N(class09980::a), var0 -> var0),
   TEXT_OUTLINE_COLOR(true, true, true, false, class09980::p, class09984.N(class09980::p), var0 -> var0),
   TEXT_OUTLINE_WIDTH(true, true, true, false, class09980::F, class09984.N(class09980::F), var0 -> var0),
   TRANSITIONS(true, true, true, false, class09980::A, class09984.N(class09980::A), var0 -> var0),
   OPACITY(true, true, true, true, class09980::f, class09984.N(class09980::f), class09989::i),
   BLUR_RADIUS(true, true, true, false, class09980::C, class09984.N(class09980::C), class09989::B),
   TEXTURE_UV(true, true, true, false, class09980::S, class09984.N(class09980::S), var0 -> var0);

   private static final List<class09989> LAYOUT_AFFECTING_FIELDS = Arrays.stream(values()).filter(class09989::i).toList();
   private static final List<class09989> POSITION_AFFECTING_FIELDS = Arrays.stream(values()).filter(class09989::R).toList();
   private static final List<class09989> DRAW_AFFECTING_FIELDS = Arrays.stream(values()).filter(class09989::M).toList();
   private static final List<class09989> ANIMATABLE_FIELDS = Arrays.stream(values()).filter(class09989::B).toList();
   private final boolean layoutAffecting;
   private final boolean positionAffecting;
   private final boolean drawAffecting;
   private final boolean animatable;
   private final Function<class09980, Object> reader;
   private final BiPredicate<class09980, class09980> changed;
   private final UnaryOperator<Object> sanitizer;

   public static List<class09989> L() {
      return DRAW_AFFECTING_FIELDS;
   }

   private static Object L(Object var0) {
      return class10009.class.cast(var0);
   }

   public boolean M() {
      return this.drawAffecting;
   }

   private static Object M(Object var0) {
      float f = (Float)var0;
      return Float.isFinite(f) ? f : 0.0F;
   }

   private class09989(
      boolean var3,
      boolean var4,
      boolean var5,
      boolean var6,
      Function<class09980, Object> var7,
      BiPredicate<class09980, class09980> var8,
      UnaryOperator<Object> var9
   ) {
      this.layoutAffecting = var3;
      this.positionAffecting = var4;
      this.drawAffecting = var5;
      this.animatable = var6;
      this.reader = var7;
      this.changed = var8;
      this.sanitizer = var9;
   }

   private class09989(
      boolean var3, boolean var4, boolean var5, Function<class09980, Object> var6, BiPredicate<class09980, class09980> var7, UnaryOperator<Object> var8
   ) {
      this(var3, false, var4, var5, var6, var7, var8);
   }

   private class09989(boolean var3, boolean var4, boolean var5, boolean var6, Function<class09980, Object> var7, BiPredicate<class09980, class09980> var8) {
      this(var3, var4, var5, var6, var7, var8, var0 -> var0);
   }

   private class09989(boolean var3, boolean var4, boolean var5, Function<class09980, Object> var6, BiPredicate<class09980, class09980> var7) {
      this(var3, false, var4, var5, var6, var7, var0 -> var0);
   }

   private static Object B(Object var0) {
      return Math.max(0.0F, (Float)var0);
   }

   public boolean B() {
      return this.animatable;
   }

   private static Object i(Object var0) {
      return class09693.N((Float)var0, 0.0F, 1.0F);
   }

   public boolean i() {
      return this.layoutAffecting;
   }

   public static List<class09989> u() {
      return ANIMATABLE_FIELDS;
   }

   private static Object u(Object var0) {
      float f = (Float)var0;
      return Float.isFinite(f) && !(f <= 0.0F) ? f : 16.0F;
   }

   class09980 y(class09980 var1, Object var2) {
      class09980 class09980 = var1 == null ? class09968.N() : var1;
      return var2 == null ? class09980 : class10008.N(class09980, this, var2);
   }

   public static List<class09989> y() {
      return POSITION_AFFECTING_FIELDS;
   }

   private static Object y(Object var0) {
      float f = (Float)var0;
      return !Float.isFinite(f) ? 0.0F : Math.max(0.0F, f);
   }

   public class09980 N(class09980 var1, Object var2) {
      class09980 class09980 = var1 == null ? class09968.N() : var1;
      Object object = this.N(var2);
      return object == null ? class09980 : this.y(class09980, object);
   }

   public boolean N(class09980 var1, class09980 var2) {
      return var1 != null && var2 != null ? this.changed.test(var1, var2) : var1 != var2;
   }

   public static List<class09989> N() {
      return LAYOUT_AFFECTING_FIELDS;
   }

   public Object N(class09980 var1) {
      return var1 == null ? null : this.reader.apply(var1);
   }

   public Object N(Object var1) {
      return var1 == null ? null : this.sanitizer.apply(var1);
   }

   public boolean R() {
      return this.positionAffecting;
   }

   private static Object R(Object var0) {
      float f = (Float)var0;
      return !Float.isFinite(f) ? 1.0F : Math.max(0.0F, f);
   }
}
