package page.langeweile.ok_zoomer.config.screen.components;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class04995;
import minecraft.class05220;
import minecraft.class05801;
import org.quiltmc.config.api.values.TrackedValue;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset$Range;

public class OkZoomerFloatSlider extends class05801 {
   private final class00392 optionText;
   private final double minValue;
   private final double maxValue;
   private final Consumer<Float> responder;
   private float internalValue;

   public OkZoomerFloatSlider(TrackedValue<Float> var1, class00392 var2, int var3, int var4, int var5, int var6, float var7, Consumer<Float> var8) {
      super(var3, var4, var5, var6, class05220.N(var2, class00392.y(String.valueOf(var7))), 0.0);
      this.optionText = var2;
      this.responder = var8;
      this.internalValue = var7;
      double d0 = 0.0;
      double d1 = 100.0;
      if (var1.hasMetadata(RangeSubset.TYPE)) {
         RangeSubset$Range rangesubset$range = (RangeSubset$Range)var1.metadata(RangeSubset.TYPE);
         d0 = rangesubset$range.min();
         d1 = rangesubset$range.max();
      }

      this.minValue = d0;
      this.maxValue = d1;
      this.field_22753 = (Math.clamp((double)var7, d0, d1) - d0) / (d1 - d0);
      this.method_25346();
   }

   public void method_25344() {
      float f = (float)(class04995.N(class04995.u(class04995.N(this.field_22753, 0.0, 1.0), this.minValue, this.maxValue) * 10.0) / 10.0);
      this.responder.accept(f);
      this.internalValue = f;
   }

   public void method_25346() {
      this.field_22754 = class05220.N(this.optionText, class00392.y(String.valueOf(this.internalValue)));
   }
}
