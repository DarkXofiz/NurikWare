package NurikWare;

import java.util.List;
import java.util.Objects;

public record class09919(float translateX, float translateY, float pivotX, float pivotY, float scale, float rotationDegrees, List<class09935> children)
   implements class09935 {
   public float L() {
      return this.pivotX;
   }

   public List<class09935> M() {
      return this.children;
   }

   public class09919(float translateX, float translateY, float pivotX, float pivotY, float scale, float rotationDegrees, List<class09935> children) {
      super();
      Objects.requireNonNull(children, "children");
      this.translateX = translateX;
      this.translateY = translateY;
      this.pivotX = pivotX;
      this.pivotY = pivotY;
      this.scale = scale;
      this.rotationDegrees = rotationDegrees;
      this.children = children;
   }

   public float i() {
      return this.scale;
   }

   public float u() {
      return this.pivotY;
   }

   public float y() {
      return this.translateY;
   }

   public static class09919 N(float var0, float var1, List<class09935> var2) {
      return new class09919(var0, var1, 0.0F, 0.0F, 1.0F, 0.0F, var2);
   }

   public float N() {
      return this.translateX;
   }

   public float R() {
      return this.rotationDegrees;
   }
}
