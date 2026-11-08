package NurikWare;

public record class09734(class09735 fieldType, double baseSize, double pxRange, int initialPageSize, int maxPageSize, double weight) {
   public double L() {
      return this.baseSize;
   }

   public double M() {
      return this.weight;
   }

   public class09734(class09735 fieldType, double baseSize, double pxRange, int initialPageSize, int maxPageSize, double weight) {
      super();
      if (fieldType == null) {
         throw new IllegalArgumentException("fieldType");
      } else if (baseSize <= 0.0) {
         throw new IllegalArgumentException("baseSize must be > 0");
      } else if (pxRange <= 0.0) {
         throw new IllegalArgumentException("pxRange must be > 0");
      } else if (initialPageSize <= 0) {
         throw new IllegalArgumentException("initialPageSize must be > 0");
      } else if (maxPageSize < initialPageSize) {
         throw new IllegalArgumentException("maxPageSize must be >= initialPageSize");
      } else if (Double.isNaN(weight) || Double.isFinite(weight) && weight > 0.0) {
         this.fieldType = fieldType;
         this.baseSize = baseSize;
         this.pxRange = pxRange;
         this.initialPageSize = initialPageSize;
         this.maxPageSize = maxPageSize;
         this.weight = weight;
      } else {
         throw new IllegalArgumentException("weight must be NaN (font default) or finite and > 0");
      }
   }

   public class09734(class09735 var1, double var2, double var4, int var6, int var7) {
      this(var1, var2, var4, var6, var7, Double.NaN);
   }

   public int i() {
      return this.initialPageSize;
   }

   public double u() {
      return this.pxRange;
   }

   public class09735 y() {
      return this.fieldType;
   }

   public class09734 N(double var1) {
      return new class09734(this.fieldType, this.baseSize, this.pxRange, this.initialPageSize, this.maxPageSize, var1);
   }

   public static class09734 N() {
      return new class09734(class09735.MTSDF, 40.0, 6.0, 1024, 8192);
   }

   public int R() {
      return this.maxPageSize;
   }
}
