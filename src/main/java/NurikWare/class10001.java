package NurikWare;

public record class10001(
   float trackWidth,
   float trackPadding,
   float trackPaddingY,
   float thumbMinHeight,
   int trackColor,
   int trackHoverColor,
   int trackActiveColor,
   int thumbColor,
   int thumbHoverColor,
   int thumbActiveColor
) {
   public float L() {
      return this.trackPaddingY;
   }

   public class10001 L(int var1) {
      return new class10001(
         this.trackWidth,
         this.trackPadding,
         this.trackPaddingY,
         this.thumbMinHeight,
         this.trackColor,
         this.trackHoverColor,
         var1,
         this.thumbColor,
         this.thumbHoverColor,
         this.thumbActiveColor
      );
   }

   public class10001 L(float var1) {
      return new class10001(
         this.trackWidth,
         this.trackPadding,
         var1,
         this.thumbMinHeight,
         this.trackColor,
         this.trackHoverColor,
         this.trackActiveColor,
         this.thumbColor,
         this.thumbHoverColor,
         this.thumbActiveColor
      );
   }

   public int M() {
      return this.trackActiveColor;
   }

   public class10001(
      float trackWidth,
      float trackPadding,
      float trackPaddingY,
      float thumbMinHeight,
      int trackColor,
      int trackHoverColor,
      int trackActiveColor,
      int thumbColor,
      int thumbHoverColor,
      int thumbActiveColor
   ) {
      super();
      trackWidth = Math.max(0.0F, trackWidth);
      trackPadding = Math.max(0.0F, trackPadding);
      trackPaddingY = Math.max(0.0F, trackPaddingY);
      thumbMinHeight = Math.max(0.0F, thumbMinHeight);
      this.trackWidth = trackWidth;
      this.trackPadding = trackPadding;
      this.trackPaddingY = trackPaddingY;
      this.thumbMinHeight = thumbMinHeight;
      this.trackColor = trackColor;
      this.trackHoverColor = trackHoverColor;
      this.trackActiveColor = trackActiveColor;
      this.thumbColor = thumbColor;
      this.thumbHoverColor = thumbHoverColor;
      this.thumbActiveColor = thumbActiveColor;
   }

   public class10001(float var1, float var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this(var1, var2, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public int B() {
      return this.thumbColor;
   }

   public int Z() {
      return this.thumbHoverColor;
   }

   public class10001 i(int var1) {
      return new class10001(
         this.trackWidth,
         this.trackPadding,
         this.trackPaddingY,
         this.thumbMinHeight,
         this.trackColor,
         this.trackHoverColor,
         this.trackActiveColor,
         this.thumbColor,
         var1,
         this.thumbActiveColor
      );
   }

   public int i() {
      return this.trackColor;
   }

   public int z() {
      return this.thumbActiveColor;
   }

   public float u() {
      return this.thumbMinHeight;
   }

   public class10001 u(float var1) {
      return new class10001(
         this.trackWidth,
         this.trackPadding,
         this.trackPaddingY,
         var1,
         this.trackColor,
         this.trackHoverColor,
         this.trackActiveColor,
         this.thumbColor,
         this.thumbHoverColor,
         this.thumbActiveColor
      );
   }

   public class10001 u(int var1) {
      return new class10001(
         this.trackWidth,
         this.trackPadding,
         this.trackPaddingY,
         this.thumbMinHeight,
         this.trackColor,
         this.trackHoverColor,
         this.trackActiveColor,
         var1,
         this.thumbHoverColor,
         this.thumbActiveColor
      );
   }

   public boolean y(class10001 var1) {
      return var1 == null
         ? false
         : Float.compare(this.trackPadding, var1.trackPadding) == 0
            && Float.compare(this.trackPaddingY, var1.trackPaddingY) == 0
            && Float.compare(this.thumbMinHeight, var1.thumbMinHeight) == 0
            && this.trackColor == var1.trackColor
            && this.trackHoverColor == var1.trackHoverColor
            && this.trackActiveColor == var1.trackActiveColor
            && this.thumbColor == var1.thumbColor
            && this.thumbHoverColor == var1.thumbHoverColor
            && this.thumbActiveColor == var1.thumbActiveColor;
   }

   public class10001 y(int var1) {
      return new class10001(
         this.trackWidth,
         this.trackPadding,
         this.trackPaddingY,
         this.thumbMinHeight,
         this.trackColor,
         var1,
         this.trackActiveColor,
         this.thumbColor,
         this.thumbHoverColor,
         this.thumbActiveColor
      );
   }

   public class10001 y(float var1) {
      return new class10001(
         this.trackWidth,
         var1,
         var1,
         this.thumbMinHeight,
         this.trackColor,
         this.trackHoverColor,
         this.trackActiveColor,
         this.thumbColor,
         this.thumbHoverColor,
         this.thumbActiveColor
      );
   }

   public float y() {
      return this.trackPadding;
   }

   public boolean N(class10001 var1) {
      return var1 == null ? false : Float.compare(this.trackWidth, var1.trackWidth) == 0;
   }

   public class10001 N(float var1) {
      return new class10001(
         var1,
         this.trackPadding,
         this.trackPaddingY,
         this.thumbMinHeight,
         this.trackColor,
         this.trackHoverColor,
         this.trackActiveColor,
         this.thumbColor,
         this.thumbHoverColor,
         this.thumbActiveColor
      );
   }

   public float N() {
      return this.trackWidth;
   }

   public class10001 N(int var1) {
      return new class10001(
         this.trackWidth,
         this.trackPadding,
         this.trackPaddingY,
         this.thumbMinHeight,
         var1,
         this.trackHoverColor,
         this.trackActiveColor,
         this.thumbColor,
         this.thumbHoverColor,
         this.thumbActiveColor
      );
   }

   public class10001 R(int var1) {
      return new class10001(
         this.trackWidth,
         this.trackPadding,
         this.trackPaddingY,
         this.thumbMinHeight,
         this.trackColor,
         this.trackHoverColor,
         this.trackActiveColor,
         this.thumbColor,
         this.thumbHoverColor,
         var1
      );
   }

   public int R() {
      return this.trackHoverColor;
   }
}
