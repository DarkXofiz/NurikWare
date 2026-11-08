package NurikWare;

import minecraft.class00392;
import minecraft.class02071;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06366;

public class class09663 extends class05096 {
   private final class05096 N;

   public class09663(class05096 var1) {
      super(class00392.y("Mouse Tweaks Options"));
      this.N = var1;
   }

   public void method_25426() {
      class09678.N.N();
      this.method_37063(
         new class02071(this.field_22789 / 2 - this.field_22793.N(this.field_22785) / 2, 15, this.field_22789, 9, this.field_22785, this.field_22793)
      );
      this.method_37063(
         class06366.N(class09678.N.N)
            .N(this.field_22789 / 2 - 155, this.field_22790 / 6, 150, 20, class00392.y("RMB Tweak"), (var0, var1) -> class09678.N.N = var1)
      );
      this.method_37063(
         class06366.N(class09678.N.u)
            .N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 24, 150, 20, class00392.y("Wheel Tweak"), (var0, var1) -> class09678.N.u = var1)
      );
      this.method_37063(
         class06366.N(class09678.N.y)
            .N(this.field_22789 / 2 + 5, this.field_22790 / 6, 150, 20, class00392.y("LMB Tweak With Item"), (var0, var1) -> class09678.N.y = var1)
      );
      this.method_37063(
         class06366.N(class09678.N.L)
            .N(this.field_22789 / 2 + 5, this.field_22790 / 6 + 24, 150, 20, class00392.y("LMB Tweak Without Item"), (var0, var1) -> class09678.N.L = var1)
      );
      this.method_37063(
         class06366.N(var0 -> {
               return class00392.y(switch (var0) {
                  case FIRST_TO_LAST -> "First to Last";
                  case LAST_TO_FIRST -> "Last to First";
               });
            }, class09678.N.i)
            .N(new class09684[]{class09684.FIRST_TO_LAST, class09684.LAST_TO_FIRST})
            .N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 48, 310, 20, class00392.y("Wheel Tweak Search Order"), (var0, var1) -> class09678.N.i = var1)
      );
      this.method_37063(
         class06366.N(var0 -> {
               return class00392.y(switch (var0) {
                  case NORMAL -> "Down to Push, Up to Pull";
                  case INVERTED -> "Up to Push, Down to Pull";
                  case INVENTORY_POSITION_AWARE -> "Inventory Position Aware";
                  case INVENTORY_POSITION_AWARE_INVERTED -> "Inventory Position Aware, Inverted";
               });
            }, class09678.N.R)
            .N(new class09664[]{class09664.NORMAL, class09664.INVERTED, class09664.INVENTORY_POSITION_AWARE, class09664.INVENTORY_POSITION_AWARE_INVERTED})
            .N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 72, 310, 20, class00392.y("Scroll Direction"), (var0, var1) -> class09678.N.R = var1)
      );
      this.method_37063(
         class06366.N(var0 -> {
               return class00392.y(switch (var0) {
                  case PROPORTIONAL -> "Multiple Wheel Clicks Move Multiple Items";
                  case ALWAYS_ONE -> "Always Move One Item (macOS Compatibility)";
               });
            }, class09678.N.M)
            .N(new class09688[]{class09688.PROPORTIONAL, class09688.ALWAYS_ONE})
            .N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 96, 310, 20, class00392.y("Scroll Scaling"), (var0, var1) -> class09678.N.M = var1)
      );
      this.method_37063(
         class06366.N(class09674.B)
            .N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 120, 310, 20, class00392.y("Debug Mode"), (var0, var1) -> class09674.B = var1)
      );
      this.method_37063(class05362.method_46430(class05220.u, var1 -> this.method_25419()).N(this.field_22789 / 2 - 100, this.field_22790 - 27, 200, 20).N());
   }

   public void method_25432() {
      class09678.N.y();
   }

   public void method_25419() {
      this.field_22787.N(this.N);
   }
}
