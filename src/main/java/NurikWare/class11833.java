package NurikWare;

import java.util.Objects;

public class class11833 implements class09780 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;
   public static Object y_0;

   public float L() {
      return (Float)this.N_1;
   }

   private void L(float var1) {
      float f = (Float)this.N_1 - (Float)this.N_3;
      float f1 = (-((class11863)this.N_0).L() * f - ((class11863)this.N_0).i() * (Float)this.N_2) / ((class11863)this.N_0).M();
      this.N_2 = (Float)this.N_2 + f1 * var1;
      this.N_1 = (Float)this.N_1 + (Float)this.N_2 * var1;
   }

   private static void M() {
      y_0 = 0.25F;
   }

   public class11833(float var1, float var2, class11863 var3) {
      super();
      this.E();
      this.N_0 = Objects.requireNonNull(var3, "spec");
      this.N_1 = var1;
      this.N_3 = var2;
      this.N_4 = this.Z();
      if ((Boolean)this.N_4) {
         this.N_1 = (Float)this.N_3;
      }
   }

   static {
      M();
   }

   private boolean Z() {
      return Math.abs((Float)this.N_1 - (Float)this.N_3) <= ((class11863)this.N_0).y() && Math.abs((Float)this.N_2) <= ((class11863)this.N_0).B();
   }

   public float u() {
      return (Float)this.N_2;
   }

   @Override
   public boolean y() {
      return (Boolean)this.N_4;
   }

   public boolean y(float var1) {
      this.N_3 = var1;
      this.N_4 = this.Z();
      if ((Boolean)this.N_4) {
         this.N_1 = (Float)this.N_3;
         this.N_2 = 0.0F;
      }

      return true;
   }

   private void E() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0.0F;
         this.N_2 = 0.0F;
         this.N_3 = 0.0F;
         this.N_4 = false;
      }
   }

   @Override
   public boolean N(class09753 var1) {
      return this.y(var1.y());
   }

   @Override
   public boolean N(float var1) {
      if (!(Boolean)this.N_4 && !(var1 <= 0.0F)) {
         float f = (Float)this.N_1;
         float f1 = Math.min(var1, 0.25F);

         while (f1 > 0.0F) {
            float f2 = Math.min(((class11863)this.N_0).R(), f1);
            this.L(f2);
            f1 -= f2;
         }

         if (this.Z()) {
            this.N_1 = (Float)this.N_3;
            this.N_2 = 0.0F;
            this.N_4 = true;
         }

         return Float.compare(f, (Float)this.N_1) != 0;
      } else {
         return false;
      }
   }

   @Override
   public class09753 N() {
      return class09753.N((Float)this.N_1);
   }
}
