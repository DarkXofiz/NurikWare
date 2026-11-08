package NurikWare;

import java.util.Iterator;
import minecraft.class04453;
import minecraft.class06202;

public class class09328 implements class11826<class11380> {
   public static Object N_0;
   public Object y_0;

   private void M() {
      if ((class04453)((class06202)this.y_0).T_4 != null) {
         ((class11822)((class04453)((class06202)this.y_0).T_4)).dataManager().u().N(((class04453)((class06202)this.y_0).T_4).method_36455());
         class11938.L().L(class10992.N());
      }
   }

   public class09328() {
      super();
      this.Z();
      this.y_0 = class06202.Nq();
   }

   static {
      B();
   }

   private static void B() {
      N_0 = 3000L;
   }

   private void Z() {
   }

   private void i() {
      if (class11938.j().y() % 20 == 0) {
         Iterator<class09173> iterator = class11938.b().N().iterator();

         while (iterator.hasNext()) {
            iterator.next().u();
         }
      }
   }

   public void listen(class11380 var1) {
      this.i();
      ((class09065)class09065.y_0).y();
      class11938.j().N();
      class11938.Z().N();
      this.R();
      this.M();
      class11322.R();
   }

   private void R() {
      class09345 class09345 = class11938.N();
      class09345.N(3000L, System.currentTimeMillis());
      if (!class09345.u()
         && (class04453)((class06202)this.y_0).T_4 != null
         && ((class04453)((class06202)this.y_0).T_4).field_6012 % 20 == 0
         && ((class06202)this.y_0).y()) {
         class11938.z()
            .N(
               new class11975(
                  ((class04453)((class06202)this.y_0).T_4).method_23317(),
                  ((class04453)((class06202)this.y_0).T_4).method_23318(),
                  ((class04453)((class06202)this.y_0).T_4).method_23321()
               )
            );
      }
   }
}
