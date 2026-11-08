package NurikWare;

import minecraft.class03448;
import minecraft.class04477;
import minecraft.class06202;

@class11080(
   L = "AntiBot",
   y = class11072.COMBAT,
   N = class11106.OTHER
)
public class AntiBot extends class11067 {
   public Object L_0;

   public AntiBot() {
      super();
      this.m();
      this.L_0 = class11524.N(this, "no-bot-interaction", false);
   }

   @Override
   public boolean Z() {
      if ((class03448)((class06202)super.y_0).T_3 != null) {
         ((class03448)((class06202)super.y_0).T_3).method_18456().stream().filter(class11907::N).forEach(var0 -> ((class11783)var0).dataManager().M().N(true));
      }

      return super.Z();
   }

   @Override
   public boolean i() {
      if ((class03448)((class06202)super.y_0).T_3 != null) {
         ((class03448)((class06202)super.y_0).T_3).method_18456().forEach(var0 -> ((class11783)var0).dataManager().M().N(false));
      }

      return super.i();
   }

   private void m() {
   }

   @class11782
   public void N(class11357 var1) {
      this.m();
      if (((class11507)this.L_0).i() && ((class11783)var1.L()).dataManager().M().N()) {
         var1.N();
      }
   }

   @class11782
   public void N(class11371 var1) {
      if (var1.N() instanceof class04477 class04477) {
         class11938.Z().N(() -> {
            if (class11907.N(class04477)) {
               ((class11783)class04477).dataManager().M().N(true);
            }
         });
      }
   }
}
