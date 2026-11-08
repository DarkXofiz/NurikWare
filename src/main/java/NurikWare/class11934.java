package NurikWare;

import java.time.Duration;

public class class11934 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object y_0;
   public Object y_1;
   public Object y_2;

   public boolean L() {
      return (Boolean)this.N_4 && this.j() < ((Duration)this.y_1).toNanos();
   }

   public boolean M() {
      return (Boolean)this.N_4;
   }

   public class11934(class11903 var1) {
      super();
      this.v();
      this.y_1 = Duration.ZERO;
      this.N_1 = (class11887)class11905.N_5;
      this.N_3 = var1;
      this.N_2 = var1.L() ? 0.0 : 1.0;
      this.y_2 = (Double)this.N_2;
      this.N_0 = (Double)this.N_2;
   }

   public double B() {
      return (Double)this.y_2;
   }

   public class11903 Z() {
      return (class11903)this.N_3;
   }

   public class11887 i() {
      return (class11887)this.N_1;
   }

   private void v() {
      this.y_0 = 0L;
      this.N_0 = 0.0;
      this.y_2 = 0.0;
      this.N_4 = false;
      this.N_5 = false;
   }

   private long j() {
      return System.nanoTime() - (Long)this.y_0;
   }

   public boolean U() {
      return (Boolean)this.N_5;
   }

   public long z() {
      return (Long)this.y_0;
   }

   public void u() {
      this.N_5 = false;
      this.N_4 = false;
      this.N_2 = ((class11903)this.N_3).L() ? 0.0 : 1.0;
      this.y_2 = (Double)this.N_2;
      this.N_0 = (Double)this.N_2;
   }

   public Duration y() {
      return (Duration)this.y_1;
   }

   public Double E() {
      return (Double)this.N_2;
   }

   public void N(double var1, Duration var3, class11887 var4) {
      if (Double.compare((Double)this.N_0, var1) != 0) {
         this.y_2 = (Double)this.N_2;
         this.N_0 = var1;
         this.y_1 = var3;
         this.N_1 = var4;
         if (var1 > (Double)this.y_2) {
            this.N_3 = class11903.FORWARDS;
         } else if (var1 < (Double)this.y_2) {
            this.N_3 = class11903.BACKWARDS;
         }

         this.N_5 = true;
         if (!var3.isZero() && !var3.isNegative()) {
            this.y_0 = System.nanoTime();
            this.N_4 = true;
         } else {
            this.N_2 = var1;
            this.N_4 = false;
         }
      }
   }

   public boolean N(class11903 var1) {
      return this.W() && (class11903)this.N_3 == var1;
   }

   public void N() {
      if ((Boolean)this.N_5 && (Boolean)this.N_4) {
         double d0 = (double)this.j() / ((Duration)this.y_1).toNanos();
         if (d0 < 1.0) {
            this.N_2 = (Double)this.y_2 + ((Double)this.N_0 - (Double)this.y_2) * ((class11887)this.N_1).ease(d0);
         } else {
            this.N_2 = (Double)this.N_0;
            this.N_4 = false;
         }
      }
   }

   public boolean W() {
      return (Boolean)this.N_5 && !(Boolean)this.N_4;
   }

   public double R() {
      return (Double)this.N_0;
   }
}
