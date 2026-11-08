package NurikWare;

import java.util.Iterator;
import java.util.List;
import minecraft.class00543;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class12000 extends class12024 {
   public static Object L_0 = LogManager.getLogger(String.class);

   public int L() {
      return this.N() - 2;
   }

   public class12000() {
      super();
   }

   static {
      i();
   }

   private void Z(class12029 var1) {
      if (!(Boolean)super.N_1) {
         var1.N_4 = true;
         ((class06202)super.u_0).NE().N(new class00543(0));
      }

      super.N_1 = false;
   }

   private static void i() {
      L_0 = null;
   }

   @Override
   public void i(class12029 var1) {
      if ((Integer)var1.N_3 == this.N()) {
         this.U(var1);
      } else if ((Integer)var1.N_3 == this.u()) {
         this.Z(var1);
      } else if ((Integer)var1.N_3 == this.L()) {
         this.z(var1);
      } else if ((Boolean)var1.N_4 && !(Boolean)super.N_0) {
         this.U(var1);
         this.Z(var1);
         this.z(var1);
      }
   }

   private void U(class12029 var1) {
      try {
         Iterator iterator = ((List)var1.N_0).iterator();

         while (iterator.hasNext()) {
            class12040 class12040 = (class12040)iterator.next();
            if (!class12040.test((class06202)super.u_0)) {
               var1.N_3 = this.N() + 1;
               return;
            }

            class12040.accept((class06202)super.u_0);
            iterator.remove();
         }
      } catch (Exception exception) {
         ((Logger)L_0).error(exception.getMessage(), exception.getCause());
         super.N_1 = false;
         ((List)var1.N_0).clear();
         ((List)var1.N_1).clear();
      }
   }

   private void z(class12029 var1) {
      ((List)var1.N_1).removeIf(var1x -> {
         var1x.accept((class06202)super.u_0);
         return true;
      });
      ((List)var1.N_0).clear();
      ((List)var1.N_1).clear();
   }

   public int u() {
      return this.N() - 1;
   }

   @Override
   public int y() {
      return this.N() + 1;
   }

   @Override
   public int N() {
      return 3;
   }
}
