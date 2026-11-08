package NurikWare;

import java.util.Objects;

public class class11494 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   public float L() {
      return (Float)this.N_1;
   }

   public class11494(float var1, float var2) {
      super();
      this.Z();
      this.N_0 = var1;
      this.N_1 = var2;
      this.y();
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof class11494 class11494)
         ? false
         : Float.compare((Float)this.N_0, (Float)class11494.N_0) == 0 && Float.compare((Float)this.N_1, (Float)class11494.N_1) == 0;
   }

   @Override
   public int hashCode() {
      return Objects.hash((Float)this.N_0, (Float)this.N_1);
   }

   private void Z() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = 0.0F;
         this.N_1 = 0.0F;
      }
   }

   public class11494 y(float var1) {
      this.N_1 = var1;
      return this;
   }

   public void y() {
      if ((Float)this.N_0 > (Float)this.N_1) {
         throw new IllegalArgumentException(String.format("Invalid range: min (%f) cannot be greater than max (%f)", (Float)this.N_0, (Float)this.N_1));
      }
   }

   public void N(class11494 var1) {
      this.y();
      if ((Float)this.N_0 < (Float)var1.N_0 || (Float)this.N_1 > (Float)var1.N_1) {
         throw new IllegalArgumentException(
            String.format("The range [%f, %f] is outside the valid range [%f, %f]", (Float)this.N_0, (Float)this.N_1, (Float)var1.N_0, (Float)var1.N_1)
         );
      }
   }

   public float N() {
      return (Float)this.N_0;
   }

   public class11494 N(float var1) {
      this.N_0 = var1;
      return this;
   }
}
