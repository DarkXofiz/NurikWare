package NurikWare;

import java.util.Iterator;
import java.util.List;
import minecraft.class00486;
import minecraft.class00539;
import minecraft.class00543;
import minecraft.class04453;
import minecraft.class04474;
import minecraft.class05096;
import minecraft.class05410;
import minecraft.class05873;
import minecraft.class06202;
import minecraft.class08687;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class12024 extends class12001 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;
   public static Object y_0 = LogManager.getLogger(String.class);

   private void L(class12040 var1, class12029 var2) {
      if (class11902.N(((class04474)((class04453)((class06202)super.u_0).T_4).L_1).field_54155)) {
         ((List)var2.N_0).add(var1);
      } else {
         var2.N_4 = true;
         var1.accept((class06202)super.u_0);
      }
   }

   public void L(class12029 var1) {
      this.M();
      if (!(Boolean)this.N_1) {
         this.N_1 = true;
         super.B(var1);
      }
   }

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
         this.N_1 = false;
         this.N_2 = false;
      }
   }

   @Override
   public boolean M(class12029 var1) {
      this.M();
      return !((List)var1.N_0).isEmpty() || (Boolean)this.N_2;
   }

   public class12024() {
      super();
      this.M();
   }

   static {
      R();
   }

   @Override
   public void B(class12029 var1) {
      if (class11902.N(((class04474)((class04453)((class06202)super.u_0).T_4).L_1).field_54155)) {
         ((List)var1.N_0).add(new class12008(() -> {
            if (!class11902.N(((class04474)((class04453)((class06202)super.u_0).T_4).L_1).field_54155)) {
               this.L(var1);
            }
         }));
      } else {
         super.B(var1);
      }
   }

   @Override
   public void i(class12029 var1) {
      this.M();
      if (!((List)var1.N_0).isEmpty() && (Integer)var1.N_3 == this.N() || (Boolean)var1.N_4 && !(Boolean)this.N_0) {
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

            if (!(Boolean)this.N_1) {
               var1.N_4 = true;
               ((class06202)super.u_0).NE().N(new class00543(0));
            }

            this.N_1 = false;
            ((List)var1.N_1).removeIf(var1x -> {
               var1x.accept((class06202)super.u_0);
               return true;
            });
            ((List)var1.N_0).clear();
            ((List)var1.N_1).clear();
         } catch (Exception exception) {
            ((Logger)y_0).error(exception.getMessage(), exception.getCause());
            this.N_1 = false;
            ((List)var1.N_0).clear();
            ((List)var1.N_1).clear();
         }
      }
   }

   @Override
   public void u(class12029 var1) {
      var1.N_3 = this.y();
   }

   @Override
   public void y(class12029 var1) {
      if (class11902.N(((class04474)((class04453)((class06202)super.u_0).T_4).L_1).field_54155)) {
         ((List)var1.N_0).add(new class12008(() -> this.L(var1)));
      } else {
         super.B(var1);
      }
   }

   @Override
   public void y(class12040 var1, class12029 var2) {
      ((List)var2.N_0).add(var1);
   }

   public int y() {
      return 2;
   }

   @Override
   public void N(class09311 var1, class12029 var2) {
      if ((Integer)var2.N_3 > 1) {
         var1.y(new class08687(false, false, false, false, false, false, false));
      }
   }

   @Override
   public void N(class11385 var1, class12029 var2) {
      if ((Integer)var2.N_3 > 1) {
         class11902.N(var1);
      }
   }

   @Override
   public void N(class12006 var1, class12029 var2) {
      if (!class11902.N(((class04474)((class04453)((class06202)super.u_0).T_4).L_1).field_54155)) {
         var1.accept((class06202)super.u_0);
      } else {
         ((List)var2.N_0).add(var1);
      }
   }

   @Override
   public void N(class10965 var1, class12029 var2) {
      this.M();
      switch (var1.L()) {
         case class00543 class00543:
            if ((Boolean)var2.N_4 || (Boolean)this.N_0) {
               var2.N_4 = false;
               this.N_0 = false;
               return;
            }

            if (((List)var2.N_0).isEmpty()) {
               if (!((class05096)((class06202)super.u_0).v_3 instanceof class05410) || !(Boolean)this.N_2) {
                  var1.N();
               }

               this.N_2 = false;
            } else if ((class05096)((class06202)super.u_0).v_3 instanceof class05410) {
               var2.L();
               this.N_2 = false;
               var1.N();
            }
            break;
         case class00539 class00539:
            if ((class05096)((class06202)super.u_0).v_3 instanceof class05410) {
               var2.y(class00539);
               this.N_2 = true;
               var1.N();
            }
            break;
         default:
      }
   }

   @Override
   public void N(class12029 var1) {
      var1.N_3 = this.y();
      var1.N();
   }

   @Override
   public void N(class12040 var1, class12029 var2) {
      this.L(var1, var2);
   }

   public int N() {
      return 1;
   }

   @Override
   public void N(class10990 var1, class12029 var2) {
      this.M();
      switch (var1.u()) {
         case class05873 class05873:
            this.N_0 = true;
            var2.N_4 = true;
            this.N_2 = false;
            break;
         case class00486 class00486:
            var2.N_4 = false;
            this.N_0 = false;
            this.N_2 = false;
            break;
         default:
      }
   }

   private static void R() {
      y_0 = null;
   }

   @Override
   public void R(class12029 var1) {
      if ((Integer)var1.N_3 >= 0) {
         var1.N_3 = (Integer)var1.N_3 - 1;
      }
   }
}
