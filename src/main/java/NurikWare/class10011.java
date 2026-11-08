package NurikWare;

import java.util.List;

final class class10011 {
   private List<class09935> N = List.of();
   private int y;
   private int L;
   private int u;
   private int i;
   private int R;
   private boolean M;

   void L() {
      this.N = List.of();
      this.y = 0;
      this.L = 0;
      this.u = 0;
      this.i = 0;
      this.R = 0;
      this.M = false;
   }

   class10011() {
      super();
   }

   int y() {
      return this.y;
   }

   void N(List<class09935> var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null && !var1.isEmpty() && var2 > 0) {
         this.N = List.copyOf(var1);
         this.y = var2;
         this.L = var3;
         this.u = var4;
         this.i = var5;
         this.R = var6;
         this.M = true;
      } else {
         this.L();
      }
   }

   void N(int var1) {
      this.R = var1;
   }

   boolean N(int var1, int var2) {
      return this.M && this.R == var1 && this.L == var2;
   }

   boolean N(int var1, int var2, int var3) {
      return this.M && this.L == var1 && this.u == var2 && this.i == var3;
   }

   List<class09935> N() {
      return this.N;
   }
}
