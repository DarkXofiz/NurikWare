package NurikWare;

import java.util.List;

final class class09913 {
   private List<class10021> N = List.of();
   private int y;
   private int L;
   private boolean u;

   class09913() {
      super();
   }

   void N(List<class10021> var1, int var2, int var3, int var4) {
      this.N = var1 != null && !var1.isEmpty() ? List.copyOf(var1) : List.of();
      this.y = var2;
      this.L = var3;
      this.u = !this.N.isEmpty() || var4 == 0;
   }

   List<class10021> N() {
      return this.N;
   }

   boolean N(int var1, int var2, int var3) {
      return this.u && this.y == var1 && this.L == var2 && this.N.size() == var3;
   }
}
