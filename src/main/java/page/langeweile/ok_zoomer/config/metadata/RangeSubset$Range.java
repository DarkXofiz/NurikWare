package page.langeweile.ok_zoomer.config.metadata;

public record RangeSubset$Range() {
   private final int min;
   private final int max;

   public RangeSubset$Range(int var1, int var2) {
      super();
      this.min = var1;
      this.max = var2;
   }
}
