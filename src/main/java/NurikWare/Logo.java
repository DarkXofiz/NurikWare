package NurikWare;

import java.util.List;

@class11080(
   L = "Logo",
   y = class11072.VISUAL,
   N = class11106.INTERFACE
)
public class Logo extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public Object u_0;
   public Object u_1;
   public Object u_2;

   public class11535 P() {
      this.Y();
      return (class11535)this.L_5;
   }

   public class11517<class11535> T() {
      this.Y();
      return (class11517<class11535>)this.u_2;
   }

   public Logo() {
      super();
      this.Y();
      this.L_0 = new class11535("login", true);
      this.L_1 = new class11535("fps", true);
      this.L_2 = new class11535("ping", true);
      this.L_3 = new class11535("time", true);
      this.L_4 = new class11535("tps", true);
      this.L_5 = new class11535("bps", true);
      this.L_6 = new class11535("coordinates", true);
      this.L_7 = (class11523)class11524.y(
            this,
            "details",
            (class11535)this.L_0,
            (class11535)this.L_1,
            (class11535)this.L_2,
            (class11535)this.L_3,
            (class11535)this.L_4,
            (class11535)this.L_5,
            (class11535)this.L_6
         )
         .N_6((var0, var1) -> class11938.i().N());
      this.u_0 = new class11535("left", true);
      this.u_1 = new class11535("right", false);
      this.u_2 = (class11517)class11524.N(this, "position", (class11535)this.u_0, (class11535)this.u_1).N_6((var0, var1) -> class11938.i().N());
   }

   @Override
   public boolean Z() {
      class11938.i().N();
      return super.Z();
   }

   @Override
   public boolean i() {
      class11938.i().N();
      return super.i();
   }

   public class11535 b() {
      this.Y();
      return (class11535)this.L_2;
   }

   public class11535 s() {
      this.Y();
      return (class11535)this.L_1;
   }

   public class11535 n() {
      this.Y();
      return (class11535)this.L_4;
   }

   public class11535 m() {
      this.Y();
      return (class11535)this.u_1;
   }

   public class11535 t() {
      this.Y();
      return (class11535)this.L_0;
   }

   public class11535 v() {
      this.Y();
      return (class11535)this.L_3;
   }

   public class11535 j() {
      this.Y();
      return (class11535)this.L_6;
   }

   public class11535 G() {
      this.Y();
      return (class11535)this.u_0;
   }

   private void Y() {
   }
}
