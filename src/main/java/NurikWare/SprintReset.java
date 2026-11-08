package NurikWare;

import java.util.function.Supplier;
import minecraft.class04453;
import minecraft.class06202;

@class11080(
   L = "SprintReset",
   y = class11072.COMBAT,
   N = class11106.TOOLS
)
public class SprintReset extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public boolean i_init;

   public SprintReset() {
      super();
      this.j();
      this.L_0 = new class11156(this, "w-tap", true);
      this.L_1 = new class11128(this, "s-tap", false);
      this.u_0 = new class11136(this, "shift-tap", false);
      this.u_1 = new class11153(this, "no-stop", false);
      this.u_2 = class11524.N(this, "mode", (class11156)this.L_0, (class11128)this.L_1, (class11136)this.u_0, (class11153)this.u_1);
      this.u_3 = class11524.N(this, "chance", 100.0F, 1.0F, 100.0F, 1.0F).N((Supplier<String>)class11502.N_0);
      this.u_4 = class11524.N(this, "ground-only", true);
      this.u_5 = (class11504)class11524.N(this, "delay", 1.0F, 1.0F, 10.0F, 1.0F).N((Supplier<String>)class11502.N_3).N(var1 -> {
         this.j();
         return ((class11144)((class11517)this.u_2).i()).N();
      });
   }

   public int m() {
      this.j();
      return ((class11504)this.u_5).i().intValue();
   }

   private void j() {
      if (!this.i_init) {
         this.i_init = true;
         this.i_0 = 0;
         this.i_1 = 0;
         this.i_2 = 0;
      }
   }

   @class11782(
      y = class11777.AFTER,
      L = {Sprint.class}
   )
   public void N(class11385 var1) {
      this.j();
      this.i_2 = (Integer)this.i_2 - 1;
      if ((Integer)this.i_1 > 0) {
         this.i_1 = (Integer)this.i_1 - 1;
      } else if ((Integer)this.i_0 > 0) {
         this.i_0 = (Integer)this.i_0 - 1;
         ((class11144)((class11517)this.u_2).i()).y(var1);
      }
   }

   @class11782
   public void N(class11382 var1) {
      this.j();
      if ((Boolean)((class04453)((class06202)super.y_0).T_4).R_6) {
         if (!((class11507)this.u_4).i() || ((class04453)((class06202)super.y_0).T_4).method_24828()) {
            if ((Integer)this.i_2 <= 0 && Math.random() * 100.0 <= ((class11504)this.u_3).i().floatValue()) {
               this.i_1 = class11908.N(0, 2);
               this.i_0 = ((class11144)((class11517)this.u_2).i()).y();
               this.i_2 = 10;
            }
         }
      }
   }
}
