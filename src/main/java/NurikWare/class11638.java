package NurikWare;

import java.util.function.UnaryOperator;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class class11638 implements class09785<Vector2f> {
   public Object N_0;
   public Object N_1;

   public class11638(class09785 var1, Vector2f var2) {
      super();
      this.R();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   @Override
   public void y() {
      ((class09785)this.N_0).y();
   }

   @Override
   public void N(UnaryOperator<Vector2f> var1) {
      this.N(var1.apply(this.L()));
   }

   public Vector2f L() {
      Vector4f vector4f = (Vector4f)((class09785)this.N_0).L();
      return vector4f == null ? null : ((Vector2f)this.N_1).set(vector4f.z, vector4f.w);
   }

   public void N(Vector2f var1) {
      Vector4f vector4f = (Vector4f)((class09785)this.N_0).L();
      if (vector4f == null) {
         vector4f = new Vector4f();
      }

      vector4f.set(var1.x, var1.y, var1.x, var1.y);
      ((class09785)this.N_0).N(vector4f);
   }

   private void R() {
   }
}
