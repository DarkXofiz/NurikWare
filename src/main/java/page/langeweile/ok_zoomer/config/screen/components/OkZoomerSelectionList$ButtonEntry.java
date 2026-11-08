package page.langeweile.ok_zoomer.config.screen.components;

import java.util.List;
import minecraft.class01054;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class06478;

class OkZoomerSelectionList$ButtonEntry extends OkZoomerSelectionList$Entry {
   private final class06478 leftButton;
   private final class06478 rightButton;
   private final List<class06478> buttons;

   public OkZoomerSelectionList$ButtonEntry(class06478 var1, class05096 var2) {
      super(var2);
      var1.method_25358(310);
      this.leftButton = var1;
      this.rightButton = null;
      this.buttons = List.of(var1);
   }

   public OkZoomerSelectionList$ButtonEntry(class06478 var1, class06478 var2, class05096 var3) {
      super(var3);
      this.leftButton = var1;
      this.rightButton = var2;
      this.buttons = var2 != null ? List.of(var1, var2) : List.of(var1);
   }

   public List<? extends class04654> method_25396() {
      return this.buttons;
   }

   public int method_25364() {
      return (this.rightButton != null ? Math.max(this.leftButton.method_25364(), this.rightButton.method_25364()) : this.leftButton.method_25364()) + 4;
   }

   public List<? extends class03434> method_37025() {
      return this.buttons;
   }

   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      int i = this.screen.field_22789 / 2 - 155;
      int j = this.method_73382();
      this.leftButton.y(i, j + 2);
      this.leftButton.method_25394(var1, var2, var3, var5);
      if (this.rightButton != null) {
         this.rightButton.y(i + 160, j + 2);
         this.rightButton.method_25394(var1, var2, var3, var5);
      }
   }
}
