package NurikWare;

import java.util.function.Consumer;

public class class11204 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public static class11196 L() {
      return new class11196();
   }

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0;
      }
   }

   public class11204(class09322 var1, class12036 var2, int var3) {
      super();
      this.M();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_2 = var3;
   }

   public int i() {
      return (Integer)this.N_2;
   }

   static int U() {
      return 4;
   }

   static class12036 z() {
      return (class12036)class12019.N_3;
   }

   public class12036 u() {
      return (class12036)this.N_1;
   }

   public void y() {
      this.N(var0 -> {});
   }

   public class09322 N() {
      return (class09322)this.N_0;
   }

   public void N(Consumer<class09322> var1) {
      ((class09322)this.N_0).M();
      ((class12036)this.N_1).N();
      var1.accept((class09322)this.N_0);
   }
}
