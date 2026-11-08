package NurikWare;

import java.util.UUID;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00482;
import minecraft.class03132;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06685;
import minecraft.class06702;
import minecraft.class07254;
import minecraft.class07262;
import minecraft.class08068;

public class class09313 implements class07262, class11826<class10990> {
   public Object N_0;
   public Object N_1;

   private void L() {
   }

   public class09313() {
      super();
      this.L();
      this.N_0 = class11938.U();
      this.N_1 = class06202.Nq();
   }

   static {
      y();
      N();
   }

   private static void y() {
   }

   public void N(UUID var1, class00392 var2, float var3, class06685 var4, class06702 var5, boolean var6, boolean var7, boolean var8) {
      if (var2.getString().toLowerCase().contains("pvp") && (class04453)((class06202)this.N_1).T_4 != null) {
         class11815 class11815 = ((class11822)((class04453)((class06202)this.N_1).T_4)).dataManager().y().N();
         class11815.N(var1);
         class11815.N(true);
      }
   }

   public void listen(class10990 var1) {
      class00381<?> class00381 = var1.u();
      class11920.N(class00381, var1x -> ((class06202)this.N_1).execute(() -> {
         if ((class04453)((class06202)this.N_1).T_4 != null) {
            ((class11796)((class11825)((class04453)((class06202)this.N_1).T_4)).dataManager()).N().N(var1x);
         }
      }));
      switch (class00381) {
         case class07254 class07254:
            ((class06202)this.N_1).execute(() -> this.N(class07254));
            break;
         case class03132 class03132:
            ((class06202)this.N_1).execute(() -> {
               ((class11459)this.N_0).N(class03132.N());
               ((class11459)this.N_0).N();
            });
            break;
         case class08068 class08068:
            ((class06202)this.N_1).execute(((class11459)this.N_0)::L);
            break;
         case class00482 class00482:
            ((class06202)this.N_1).execute(((class11459)this.N_0)::N);
            break;
         case null:
         default:
      }
   }

   private static void N() {
   }

   public void N(UUID var1) {
      if ((class04453)((class06202)this.N_1).T_4 != null) {
         class11815 class11815 = ((class11796)((class11825)((class04453)((class06202)this.N_1).T_4)).dataManager()).y().N();
         if (class11815.N() && class11815.y() != null && class11815.y().equals(var1)) {
            class11815.N(null);
            class11815.N(false);
         }
      }
   }

   private void N(class07254 var1) {
      var1.N(this);
   }
}
