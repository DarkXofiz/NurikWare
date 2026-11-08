package NurikWare;

import java.util.List;
import minecraft.class00543;
import minecraft.class06202;

public class class12001 {
   public Object u_0;

   private void L() {
   }

   public boolean M(class12029 var1) {
      return !((List)var1.N_0).isEmpty();
   }

   public class12001() {
      super();
      this.L();
      this.u_0 = class06202.Nq();
   }

   static {
      N();
   }

   public void B(class12029 var1) {
      ((class06202)this.u_0).NE().N(new class00543(0));
      ((List)var1.N_1).removeIf(var1x -> {
         var1x.accept((class06202)this.u_0);
         return true;
      });
   }

   public void i(class12029 var1) {
   }

   public void u(class12029 var1) {
   }

   public void y(class12029 var1) {
      this.B(var1);
   }

   public void y(class12040 var1, class12029 var2) {
      var1.accept((class06202)this.u_0);
   }

   public void N(class12028 var1, class12029 var2) {
      var1.accept((class06202)this.u_0);
   }

   public void N(class11385 var1, class12029 var2) {
   }

   public void N(class09311 var1, class12029 var2) {
   }

   private static void N() {
   }

   public void N(class12006 var1, class12029 var2) {
      var1.accept((class06202)this.u_0);
   }

   public void N(class12029 var1) {
   }

   public void N(class12040 var1, class12029 var2) {
      var1.accept((class06202)this.u_0);
   }

   public void N(class10965 var1, class12029 var2) {
   }

   public void N(class10990 var1, class12029 var2) {
   }

   public void R(class12029 var1) {
   }
}
