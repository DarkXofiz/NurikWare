package NurikWare;

import java.time.Duration;
import minecraft.class07438;

public class class11754 implements class09819 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public boolean N_init;

   public class11754() {
      super();
      this.y();
      this.N_1 = new class11934(class11903.FORWARDS);
      this.N_2 = Float.NaN;
   }

   float u() {
      return ((class11934)this.N_1).E().floatValue();
   }

   private void y() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0.0F;
      }
   }

   @Override
   public boolean N(float var1) {
      ((class11934)this.N_1).N();
      return true;
   }

   void N(class07438 var1, float var2) {
      if ((class07438)this.N_0 != var1) {
         boolean flag = (class07438)this.N_0 == null;
         this.N_0 = var1;
         this.N_2 = var2;
         ((class11934)this.N_1).N(var2, flag ? Duration.ZERO : (Duration)TargetInfoHud.U_1, (class11887)class11905.u_4);
      } else if (Float.compare((Float)this.N_2, var2) != 0) {
         this.N_2 = var2;
         ((class11934)this.N_1).N(var2, (Duration)TargetInfoHud.U_1, (class11887)class11905.u_4);
      }
   }

   @Override
   public boolean N() {
      return ((class11934)this.N_1).M();
   }
}
