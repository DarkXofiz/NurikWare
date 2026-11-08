package NurikWare;

import org.joml.Vector4fc;

public record class09925(
   float x,
   float y,
   float width,
   float height,
   Vector4fc borderRadius,
   int fillColor,
   int borderColor,
   float borderThickness,
   class09981 borderPosition,
   int shadowColor,
   float shadowRadius
) implements class09924 {
   public float L() {
      return this.width;
   }

   public int M() {
      return this.borderColor;
   }

   public class09925(
      float x,
      float y,
      float width,
      float height,
      Vector4fc borderRadius,
      int fillColor,
      int borderColor,
      float borderThickness,
      class09981 borderPosition,
      int shadowColor,
      float shadowRadius
   ) {
      super();
      if (borderPosition == null) {
         borderPosition = class09981.INSIDE;
      }

      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
      this.borderRadius = borderRadius;
      this.fillColor = fillColor;
      this.borderColor = borderColor;
      this.borderThickness = borderThickness;
      this.borderPosition = borderPosition;
      this.shadowColor = shadowColor;
      this.shadowRadius = shadowRadius;
   }

   public class09925(float var1, float var2, float var3, float var4, Vector4fc var5, int var6, int var7, float var8, int var9, float var10) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, class09981.INSIDE, var9, var10);
   }

   public float B() {
      return this.borderThickness;
   }

   public class09981 Z() {
      return this.borderPosition;
   }

   public Vector4fc i() {
      return this.borderRadius;
   }

   public float U() {
      return this.shadowRadius;
   }

   public int z() {
      return this.shadowColor;
   }

   public float u() {
      return this.height;
   }

   public float N() {
      return this.x;
   }

   public int R() {
      return this.fillColor;
   }
}
