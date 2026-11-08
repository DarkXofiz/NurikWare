package page.langeweile.ok_zoomer.config.screen.components;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class04995;
import minecraft.class05220;
import minecraft.class05801;
import org.quiltmc.config.api.values.TrackedValue;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset$Range;

public class OkZoomerIntegerSlider extends class05801 {
   private final class00392 optionText;
   private final int minValue;
   private final int maxValue;
   private final Consumer<Integer> responder;
   private int internalValue;

   public OkZoomerIntegerSlider(TrackedValue<Integer> var1, class00392 var2, int var3, int var4, int var5, int var6, int var7, Consumer<Integer> var8) {
      super(var3, var4, var5, var6, class05220.N(var2, class00392.y(String.valueOf(var7))), 0.0);
      this.optionText = var2;
      this.responder = var8;
      this.internalValue = var7;
      int i = 0;
      int j = 100;
      if (var1.hasMetadata(RangeSubset.TYPE)) {
         RangeSubset$Range rangesubset$range = (RangeSubset$Range)var1.metadata(RangeSubset.TYPE);
         i = rangesubset$range.min();
         j = rangesubset$range.max();
      }

      this.minValue = i;
      this.maxValue = j;
      this.field_22753 = (double)Math.clamp((long)var7, i, j) / (j - i);
      this.method_25346();
   }

   public void method_25344() {
      int i = class04995.N(class04995.u(class04995.N(this.field_22753, 0.0, 1.0), this.minValue, this.maxValue));
      this.responder.accept(i);
      this.internalValue = i;
   }

   public void method_25346() {
      this.field_22754 = class05220.N(this.optionText, class00392.y(String.valueOf(this.internalValue)));
   }
}
