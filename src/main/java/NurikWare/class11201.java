package NurikWare;

public class class11201 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   private void L() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0;
         this.N_2 = 0;
      }
   }

   public class11201() {
      super();
      this.L();
   }

   @Override
   public String toString() {
      return "Mesh.MeshBuilder(format=" + (class09087)this.N_0 + ", initialVertexBytes=" + (Integer)this.N_1 + ", initialIndices=" + (Integer)this.N_2 + ")";
   }

   public class11201 y(int var1) {
      this.N_2 = var1;
      return this;
   }

   public class11201 N(class09087 var1) {
      this.N_0 = var1;
      return this;
   }

   public class11213 N() {
      return new class11213((class09087)this.N_0, (Integer)this.N_1, (Integer)this.N_2);
   }

   public class11201 N(int var1) {
      this.N_1 = var1;
      return this;
   }
}
