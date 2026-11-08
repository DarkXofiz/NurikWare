package NurikWare;

import org.joml.Vector4f;
import org.joml.Vector4fc;

public record class11599(Vector4fc rect, Vector4fc round) {

   public float L() {
      return this.rect.x();
   }

   public class11625 M() {
      return new class11625(this.L(), this.u(), this.L() + this.N(), this.u() + this.y());
   }

   public class11599(float var1, float var2, float var3, float var4, Vector4fc var5) {
      this(new Vector4f(var1, var2, var3, var4), var5);
   }

   public class11599(Vector4fc rect, Vector4fc round) {
      super();
      Vector4f vector4f = new Vector4f(rect);
      Vector4f vector4f1 = new Vector4f(round);
      this.rect = vector4f;
      this.round = vector4f1;
   }

   public Vector4fc i() {
      return this.rect;
   }

   public float u() {
      return this.rect.y();
   }

   public float y() {
      return this.rect.w();
   }

   public class11599 N(class11599 var1) {
      class11625 class11625 = this.M().N(var1.M());
      if (class11625 == null) {
         return null;
      } else {
         Vector4f vector4f = new Vector4f();
         N(this, class11625, vector4f);
         N(var1, class11625, vector4f);
         return new class11599(class11625.L(), class11625.u(), class11625.i(), class11625.R(), vector4f);
      }
   }

   private static boolean N(float var0, float var1) {
      return Math.abs(var0 - var1) <= 1.0E-4F;
   }

   private static void N(class11599 var0, class11625 var1, Vector4f var2) {
      float f = var0.L();
      float f1 = var0.u();
      float f2 = f + var0.N();
      float f3 = f1 + var0.y();
      if (N(var1.L(), f) && N(var1.u(), f1)) {
         var2.w = Math.max(var2.w, var0.R().w());
      }

      if (N(var1.y(), f2) && N(var1.u(), f1)) {
         var2.z = Math.max(var2.z, var0.R().z());
      }

      if (N(var1.L(), f) && N(var1.N(), f3)) {
         var2.y = Math.max(var2.y, var0.R().y());
      }

      if (N(var1.y(), f2) && N(var1.N(), f3)) {
         var2.x = Math.max(var2.x, var0.R().x());
      }
   }

   public float N() {
      return this.rect.z();
   }

   public Vector4fc R() {
      return this.round;
   }
}
