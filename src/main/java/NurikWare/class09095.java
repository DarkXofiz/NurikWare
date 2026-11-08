package NurikWare;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;

public class class09095 {
   public Object N_0;
   public Object N_1;
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public boolean y_init;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public boolean L_init;

   public class09095 L(boolean var1) {
      this.L_1 = var1;
      return this;
   }

   public class09095 L(class11175 var1) {
      this.y_0 = var1;
      return this;
   }

   public class09095() {
      super();
      this.i();
   }

   @Override
   public String toString() {
      return "FbConfig.Builder(widthSupplier="
         + (IntSupplier)this.N_0
         + ", heightSupplier="
         + (IntSupplier)this.N_1
         + ", pixelFormat="
         + (class11181)this.L_0
         + ", useDepth="
         + (Boolean)this.L_1
         + ", minFilter="
         + (class11199)this.L_2
         + ", magFilter="
         + (class11199)this.L_3
         + ", wrapS="
         + (class11175)this.y_0
         + ", wrapT="
         + (class11175)this.y_1
         + ", mipmapped="
         + (Boolean)this.y_2
         + ", label="
         + (String)this.y_3
         + ", textureDeleteBlocked="
         + (BooleanSupplier)this.y_4
         + ")";
   }

   private void i() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_1 = false;
      }

      if (!this.y_init) {
         this.y_init = true;
         this.y_2 = false;
      }
   }

   public class09095 y(class11199 var1) {
      this.L_3 = var1;
      return this;
   }

   public class09095 y(class11181 var1) {
      this.L_0 = var1;
      return this;
   }

   public class09095 y(boolean var1) {
      return this.L(var1);
   }

   public class09095 y(IntSupplier var1) {
      this.N_1 = var1;
      return this;
   }

   public class09095 y(class11175 var1) {
      return this.N(var1, var1);
   }

   public class09095 N(class11175 var1) {
      this.y_1 = var1;
      return this;
   }

   public class09095 N(class11199 var1) {
      this.L_2 = var1;
      return this;
   }

   public class09095 N(String var1) {
      this.y_3 = var1;
      return this;
   }

   public class09095 N(boolean var1) {
      this.y_2 = var1;
      return this;
   }

   public class09095 N(IntSupplier var1) {
      this.N_0 = var1;
      return this;
   }

   public class09064 N() {
      return new class09064(
         (IntSupplier)this.N_0,
         (IntSupplier)this.N_1,
         (class11181)this.L_0,
         (Boolean)this.L_1,
         (class11199)this.L_2,
         (class11199)this.L_3,
         (class11175)this.y_0,
         (class11175)this.y_1,
         (Boolean)this.y_2,
         (String)this.y_3,
         (BooleanSupplier)this.y_4
      );
   }

   public class09095 N(BooleanSupplier var1) {
      this.y_4 = var1;
      return this;
   }

   public class09095 N(class11199 var1, class11199 var2) {
      return this.N(var1).y(var2);
   }

   public class09095 N(class11175 var1, class11175 var2) {
      return this.L(var1).N(var2);
   }

   public class09095 N(class11181 var1) {
      this.L_0 = var1;
      return this;
   }
}
