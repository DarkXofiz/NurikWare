package NurikWare;

public class class11196 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = false;
         this.N_3 = false;
         this.N_4 = 0;
      }
   }

   public class11196() {
      super();
      this.L();
   }

   @Override
   public String toString() {
      return "Pipeline.PipelineBuilder(shader="
         + (class09322)this.N_0
         + ", state$value="
         + (class12036)this.N_2
         + ", drawMode$value="
         + (Integer)this.N_4
         + ")";
   }

   public class11196 N(class09322 var1) {
      this.N_0 = var1;
      return this;
   }

   public class11196 N(int var1) {
      this.N_4 = var1;
      this.N_3 = true;
      return this;
   }

   public class11204 N() {
      class12036 class12036 = (class12036)this.N_2;
      if (!(Boolean)this.N_1) {
         class12036 = class11204.z();
      }

      int i = (Integer)this.N_4;
      if (!(Boolean)this.N_3) {
         i = class11204.U();
      }

      return new class11204((class09322)this.N_0, class12036, i);
   }

   public class11196 N(class12036 var1) {
      this.N_2 = var1;
      this.N_1 = true;
      return this;
   }
}
