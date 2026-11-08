package page.langeweile.ok_zoomer.config.screen.components;

import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class02071;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05096;

class OkZoomerSelectionList$CategoryEntry extends OkZoomerSelectionList$Entry {
   private final int paddingTop;
   private final class02071 widget;

   OkZoomerSelectionList$CategoryEntry(class00392 var1, class05096 var2, int var3) {
      super(var2);
      this.widget = new class02071(var1, var2.method_64506());
      this.paddingTop = var3;
   }

   public List<? extends class04654> method_25396() {
      return List.of(this.widget);
   }

   public List<? extends class03434> method_37025() {
      return List.of(this.widget);
   }

   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      this.widget.y(this.screen.field_22789 / 2 - 155, this.method_73382() + this.paddingTop);
      this.widget.method_25394(var1, var2, var3, var5);
   }
}
