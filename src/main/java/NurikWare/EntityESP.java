package NurikWare;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import minecraft.class01054;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class07049;
import org.joml.Vector4f;

@class11080(
   L = "EntityESP",
   y = class11072.VISUAL,
   N = class11106.SCREEN
)
public class EntityESP extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object u_7;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object R_4;
   public Object R_5;
   public Object M_0;
   public Object M_1;
   public Object M_2;
   public Object M_3;
   public Object B_0;
   public Object B_1;
   public Object B_2;
   public Object B_3;
   public Object Z_0;
   public Object Z_1;
   public Object Z_2;
   public Object Z_3;
   public Object Z_4;
   public Object Z_5;
   public Object z_0;
   public Object z_1;

   private int P() {
      this.s();
      if (((class11535)this.u_2).U()) {
         return ((class11515)this.u_6).i();
      } else {
         return ((class11535)this.u_3).U() ? class11300.y(class09181.N(), 0.2F) : -65536;
      }
   }

   public EntityESP() {
      super();
      this.s();
      this.R_0 = new class11273(this, "players", true);
      this.R_1 = new class11005(this, "friends", true);
      this.R_2 = new class11269(this, "villagers", true);
      this.R_3 = new class11236(this, "monsters", false);
      this.R_4 = new class11033(this, "animals", false);
      this.R_5 = new class11035(this, "items", true);
      this.M_0 = new class11234(this, "self", false);
      this.M_1 = new class11004(this, "chest-minecart", false);
      this.M_2 = new class11785("invisible", true);
      this.M_3 = new class11786("naked", true);
      this.i_0 = new class11793("bot", false);
      this.i_1 = new class11020("dormant", false);
      this.i_2 = class11524.y(
         this,
         "entities",
         (class11273)this.R_0,
         (class11005)this.R_1,
         (class11269)this.R_2,
         (class11035)this.R_5,
         (class11234)this.M_0,
         (class11236)this.R_3,
         (class11033)this.R_4,
         (class11004)this.M_1
      );
      this.i_3 = (class11523)class11524.y(this, "target-condition", (class11785)this.M_2, (class11786)this.M_3, (class11793)this.i_0, (class11020)this.i_1)
         .N(var1 -> {
            this.s();
            return ((class11273)this.R_0).U();
         });
      this.i_4 = new class11535("name", true);
      this.L_0 = new class11535("equipment", true);
      this.L_1 = new class11535("hold-in-hands", false);
      this.L_2 = new class11535("box", true);
      this.L_3 = new class11535("ft-spheres", true);
      this.L_4 = new class11535("health-bar", true);
      this.L_5 = new class11535("shader", true);
      this.z_0 = new class11535("chams", false);
      this.z_1 = class11524.y(
         this,
         "details",
         (class11535)this.L_0,
         (class11535)this.L_1,
         (class11535)this.i_4,
         (class11535)this.L_2,
         (class11535)this.L_3,
         (class11535)this.L_4,
         (class11535)this.L_5,
         (class11535)this.z_0
      );
      this.B_0 = new class11007("_1x", false, 1);
      this.B_1 = new class11007("_2x", true, 2);
      this.B_2 = (class11517)class11524.N(this, "equipment-size", (class11007)this.B_0, (class11007)this.B_1).N(var1 -> {
         this.s();
         return ((class11535)this.L_0).U();
      });
      this.B_3 = (class11504)class11524.N(this, "dormant-display-time", 3.0F, 2.0F, 10.0F, 1.0F).N(var1 -> {
         this.s();
         return ((class11020)this.i_1).U() && ((class11523)this.i_3).E();
      });
      this.u_0 = (class11515)class11524.N(this, "box-color", -11104513).N(var1 -> {
         this.s();
         return ((class11535)this.L_2).U();
      });
      this.u_1 = new class11535("health", true);
      this.u_2 = new class11535("custom", false);
      this.u_3 = new class11535("client", false);
      this.u_4 = (class11517)class11524.N(this, "health-bar-mode", (class11535)this.u_1, (class11535)this.u_2, (class11535)this.u_3).N(var1 -> {
         this.s();
         return ((class11535)this.L_4).U();
      });
      this.u_5 = (class11515)class11524.N(this, "health-bar-color", -16711936).N(var1 -> {
         this.s();
         return ((class11535)this.L_4).U() && ((class11535)this.u_2).U();
      });
      this.u_6 = (class11515)class11524.N(this, "health-bar-color-bottom", -65536).N(var1 -> {
         this.s();
         return ((class11535)this.L_4).U() && ((class11535)this.u_2).U();
      });
      this.u_7 = (class11504)class11524.N(this, "scale", 20.0F, 12.0F, 24.0F, 4.0F).N(var1 -> {
         this.s();
         return ((class11535)this.i_4).U();
      });
      this.Z_0 = new class11535("formatted", true);
      this.Z_1 = new class11535("item-name", false);
      this.Z_2 = new class11535("both", false);
      this.Z_3 = (class11517)class11524.N(this, "item-name-mode", (class11535)this.Z_0, (class11535)this.Z_1, (class11535)this.Z_2).N(var1 -> {
         this.s();
         return ((class11535)this.i_4).U() && ((class11035)this.R_5).U();
      });
      this.Z_4 = new class11002(this);
      this.Z_5 = new HashSet();
   }

   private void s() {
   }

   public class11504 m() {
      this.s();
      return (class11504)this.u_7;
   }

   private int j() {
      this.s();
      if (((class11535)this.u_2).U()) {
         return ((class11515)this.u_5).i();
      } else {
         return ((class11535)this.u_3).U() ? class11300.N(class09181.N(), 0.9F) : -16711936;
      }
   }

   @class11782
   public void N(class11396 var1) {
      this.s();
      if (((class11020)this.i_1).U() && ((class11523)this.i_3).E()) {
         if (var1.N() instanceof class10401 class10401) {
            class10401.dataManager().y().N(true);
            ((Set)this.Z_5).add(N(class10401));
         }
      }
   }

   @class11782
   public void N(class09321 var1) {
      this.s();
      ((class11002)this.Z_4).N(var1);
   }

   @class11782
   public void N(class11371 var1) {
      this.s();
      if (var1.N() instanceof class10401 class10401) {
         ((Set)this.Z_5).remove(N(class10401));
      }
   }

   @class11782(
      y = class11777.BEFORE
   )
   public void N(class10967 var1) {
      this.s();
      class01054 class01054 = var1.N();
      ((class11002)this.Z_4).N(class01054);
      class09093 class09093 = class09080.u();

      for (class07049 class07049 : ((class03448)((class06202)super.y_0).T_3).M()) {
         if (class11925.y(class07049)) {
            this.N(class07049, class01054, class09093);
         }
      }

      ((Set)this.Z_5).removeIf(var3x -> {
         this.s();
         if (class11938.j().y() - var3x.y() > class11464.u(((class11504)this.B_3).i().intValue())) {
            return true;
         } else {
            this.N(var3x.N(), class01054, class09093);
            return false;
         }
      });
   }

   private static class11043 N(class10401 var0) {
      return new class11043(var0, class11938.j().y());
   }

   @class11782
   public void N(class10972 var1) {
      this.s();
      if (((class11535)this.i_4).U()) {
         class07049 class07049 = ((class11806)var1.L()).dataManager().N().N();
         Iterator iterator = ((List)((class11523)this.i_2).i()).iterator();

         while (iterator.hasNext()) {
            if (((class11051)iterator.next()).test(class07049)) {
               var1.N();
            }
         }
      }
   }

   @class11782
   public void N(class09343 var1) {
      this.s();
      ((Set)this.Z_5).clear();
   }

   private void N(class07049 var1, class01054 var2, class09093 var3) {
      this.s();
      Vector4f vector4f = class11925.N(var1, true);
      if (vector4f != null && var1.method_5476() != null) {
         for (class11051 class11051 : (List)((class11523)this.i_2).i()) {
            if (class11051.test(var1)) {
               if (((class11535)this.L_4).U()) {
                  class11051.N(var2, var3, vector4f, var1, this.j(), this.P());
               }

               if (((class11535)this.L_2).U()) {
                  class11051.N(var2, var3, vector4f, var1, ((class11515)this.u_0).i());
               }

               if (((class11535)this.i_4).U()) {
                  class11051.N(var2, var3, vector4f, var1);
               }

               if (((class11535)this.L_0).U()) {
                  class11051.L(var2, var3, vector4f, var1);
               }

               if (((class11535)this.L_1).U()) {
                  class11051.y(var2, var3, vector4f, var1);
               }
               break;
            }
         }
      }
   }
}
