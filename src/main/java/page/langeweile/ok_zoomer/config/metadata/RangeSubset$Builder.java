package page.langeweile.ok_zoomer.config.metadata;

import org.quiltmc.config.api.metadata.MetadataType.Builder;

public final class RangeSubset$Builder implements Builder<RangeSubset$Range> {
   private RangeSubset$Range range = new RangeSubset$Range(0, 100);

   public RangeSubset$Builder() {
      super();
   }

   public void set(int var1, int var2) {
      this.range = new RangeSubset$Range(var1, var2);
   }

   public RangeSubset$Range build() {
      return this.range;
   }
}
