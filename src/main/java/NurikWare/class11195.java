package NurikWare;

public class class11195 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0;
      }
   }

   public class11195() {
      super();
      this.L();
   }

   @Override
   public String toString() {
      return "RenderType.RenderTypeBuilder(pipeline="
         + (class11204)this.N_0
         + ", mesh="
         + (class11213)this.N_1
         + ", verticesPerInstance="
         + (Integer)this.N_2
         + ")";
   }

   public class11195 N(class11204 var1) {
      this.N_0 = var1;
      return this;
   }

   public class11195 N(int var1) {
      this.N_2 = var1;
      return this;
   }

   public class11174 N() {
      return new class11174((class11204)this.N_0, (class11213)this.N_1, (Integer)this.N_2);
   }

   public class11195 N(class11213 var1) {
      this.N_1 = var1;
      return this;
   }
}
