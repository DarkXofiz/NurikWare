package page.langeweile.ok_zoomer.config.screen.components;

import minecraft.class00392;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06318;
import minecraft.class06478;

public class OkZoomerSelectionList extends class06318<OkZoomerSelectionList$Entry> {
   private final class05096 screen;

   public OkZoomerSelectionList(class06202 var1, int var2, int var3, int var4, class05096 var5) {
      super(var1, var2, var3, var4, 25);
      this.screen = var5;
   }

   public void addButton(class06478 var1, class06478 var2) {
      this.method_25321(new OkZoomerSelectionList$ButtonEntry(var1, var2, this.screen));
   }

   public void addButton(class06478 var1) {
      this.method_25321(new OkZoomerSelectionList$ButtonEntry(var1, this.screen));
   }

   public void addCategory(class00392 var1) {
      byte b0 = 9;
      int i = this.method_25396().isEmpty() ? 0 : b0 * 2;
      this.method_73370(new OkZoomerSelectionList$CategoryEntry(var1, this.screen, i), i + b0 + 4);
   }

   public int method_25322() {
      return 310;
   }
}
