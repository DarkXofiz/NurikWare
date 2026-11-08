package NurikWare;

import java.util.Iterator;
import java.util.List;
import minecraft.class00250;
import minecraft.class00624;
import minecraft.class00748;
import minecraft.class00869;
import minecraft.class00889;
import minecraft.class00891;
import minecraft.class02484;
import minecraft.class02833;
import minecraft.class04453;
import minecraft.class05982;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07027;
import minecraft.class07036;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07196;
import minecraft.class07504;
import minecraft.class07789;
import minecraft.class07804;

@class11080(
   L = "NoInteract",
   y = class11072.PLAYER,
   N = class11106.BASE
)
public class NoInteract extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;

   private void P() {
   }

   public NoInteract() {
      super();
      this.P();
      this.L_0 = class11524.N(this, "aura-only", true);
      this.L_1 = class11524.N(this, "pvp-only", true);
      this.L_2 = class11524.N(this, "dont-place-orbs", true);
      this.L_3 = class11524.y(
         this,
         "block-interact",
         new class11714(this, "furnace", true, var0 -> var0 instanceof class00748),
         new class11714(this, "signs", true, var0 -> var0 instanceof class07036),
         new class11714(this, "hopper", true, class00869.Bf),
         new class11714(this, "dispenser", true, class00869.yy),
         new class11714(this, "dropper", true, class00869.Br),
         new class11714(this, "shulker", true, var0 -> var0 instanceof class07027),
         new class11714(this, "barrel", true, class00869.PF),
         new class11714(this, "door", true, var0 -> var0 instanceof class07196),
         new class11714(this, "chest", true, var0 -> var0 instanceof class05982),
         new class11714(this, "anvil", true, var0 -> var0 instanceof class07804),
         new class11714(this, "lever", true, class00869.uD),
         new class11714(this, "bed", true, var0 -> var0 instanceof class07789),
         new class11714(this, "note-block", true, class00869.yR),
         new class11714(this, "enchant-tables", true, class00869.MM),
         new class11714(this, "brewing-stands", true, class00869.MB),
         new class11714(this, "button", true, var0 -> var0 instanceof class00889),
         new class11714(this, "trapdoor", true, var0 -> var0 instanceof class00624),
         new class11714(this, "crafting-tables", true, class00869.LD)
      );
      this.L_4 = class11524.y(
         this,
         "entity-interact",
         new class11015(this, "armor-stand", true, var0 -> var0.method_5864() == class07078.B),
         new class11015(this, "boat", true, var0 -> var0 instanceof class00250),
         new class11015(this, "minecart", true, var0 -> var0 instanceof class07504)
      );
   }

   private boolean s() {
      this.P();
      AttackAura attackaura = class11938.u().C();
      return !((class11507)this.L_0).i() || attackaura.U() && attackaura.s()
         ? !((class11507)this.L_1).i() || ((class11822)((class04453)((class06202)super.y_0).T_4)).dataManager().y().N().N()
         : false;
   }

   @class11782
   public void N(class11357 var1) {
      this.P();
      if (this.s()) {
         ((List)((class11523)this.L_4).i()).forEach(var1x -> var1x.y(var1));
      }
   }

   @class11782
   public void N(class11393 var1) {
      this.P();
      if (this.s()) {
         if (((class11507)this.L_2).i()) {
            class06584 class06584 = ((class04453)((class06202)super.y_0).T_4).method_5998(var1.u());
            if (!class06584.R() && !((class02833)class06584.y().a_(class02484.b, class02833.N)).y().isEmpty()) {
               var1.N();
            }
         }

         boolean flag = !((class04453)((class06202)super.y_0).T_4).method_6047().R() || !((class04453)((class06202)super.y_0).T_4).method_6079().R();
         if (!((class04453)((class06202)super.y_0).T_4).method_21823() || !flag) {
            Iterator iterator = ((List)((class11523)this.L_3).i()).iterator();

            while (iterator.hasNext()) {
               ((class11714)iterator.next()).y(var1);
            }
         }
      }
   }
}
