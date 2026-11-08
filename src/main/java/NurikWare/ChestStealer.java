package NurikWare;

import java.util.stream.IntStream;
import minecraft.class00388;
import minecraft.class03443;
import minecraft.class04439;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class06026;
import minecraft.class06202;
import minecraft.class06937;
import minecraft.class07490;
import minecraft.class07510;
import org.apache.commons.lang3.RandomUtils;

@class11080(
   L = "ChestStealer",
   y = class11072.PLAYER,
   N = class11106.BASE
)
public class ChestStealer extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public boolean u_init;

   private void P() {
      this.n();
      this.u_2 = RandomUtils.insecure().randomInt((int)((class11525)this.L_6).i().N(), (int)((class11525)this.L_6).i().L());
   }

   public ChestStealer() {
      super();
      this.n();
      this.L_0 = new class11671("normal", true);
      this.L_1 = new class11702("reverse");
      this.L_2 = new class11673("shuffle");
      this.L_3 = class11524.N(this, "loot-type", (class11671)this.L_0, (class11702)this.L_1, (class11673)this.L_2);
      this.L_4 = class11524.N(this, "auto-close", true);
      this.L_5 = class11524.N(this, "ignore-server-menus", false);
      this.L_6 = class11524.N(this, "delay", new class11494(0.0F, 600.0F), new class11494(100.0F, 300.0F), 10.0F);
      this.u_0 = new class11467();
   }

   private void s() {
      this.n();
      this.u_1 = null;
      this.u_2 = 0;
      this.u_3 = 0;
   }

   private void n() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_2 = 0;
         this.u_3 = 0;
      }
   }

   @Override
   public void y() {
      this.s();
      super.y();
   }

   private boolean N(class06026 var1) {
      class04439 class04439 = var1.method_25440().method_10851();
      return !(class04439 instanceof class00388) || !((class00388)class04439).y().startsWith("container.");
   }

   private void N(class07490 var1) {
      this.n();
      int i = var1.E().method_5439();
      if ((int[])this.u_1 == null || ((int[])this.u_1).length != i) {
         this.R(i);
      }

      for (int j : (int[])this.u_1) {
         class06937 class06937 = var1.L(j);
         if (class06937.R() && ((class11467)this.u_0).N(((Integer)this.u_2).intValue())) {
            this.N(var1, class06937);
            this.P();
            this.R(i);
            ((class11467)this.u_0).N();
            break;
         }
      }
   }

   @class11782
   public void N(class09343 var1) {
      this.n();
      this.u_3 = 0;
   }

   private boolean N(int var1, class07490 var2) {
      this.n();
      return IntStream.range(0, var1).noneMatch(var1x -> var2.L(var1x).R()) && (Integer)this.u_3 > 40 && ((class11467)this.u_0).N(100L);
   }

   @class11782(
      y = class11777.BEFORE_ALL
   )
   public void N(class10967 var1) {
      this.n();
      class05096 class05096 = (class05096)((class06202)super.y_0).v_3;
      if (class05096 instanceof class06026 class06026) {
         if (((class11507)this.L_5).i() && this.N(class06026)) {
            if ((int[])this.u_1 != null) {
               this.s();
            }
         } else {
            class07490 class07490 = (class07490)class06026.E();
            this.N(class07490);
            if (!((class11507)this.L_4).i() || !class11281.N() && !this.N(class07490.E().method_5439(), class07490)) {
               this.u_3 = (Integer)this.u_3 + 1;
            } else {
               ((class04453)((class06202)super.y_0).T_4).method_7346();
               this.s();
            }
         }
      } else {
         if ((int[])this.u_1 != null) {
            this.s();
         }
      }
   }

   private void N(class07490 var1, class06937 var2) {
      ((class03443)((class06202)super.y_0).T_2).N(var1.b, var2.u, 1, class07510.field_7794, (class04453)((class06202)super.y_0).T_4);
   }

   private void R(int var1) {
      this.n();
      this.u_1 = ((class11676)((class11517)this.L_3).i()).N(var1);
   }
}
