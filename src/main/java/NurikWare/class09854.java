package NurikWare;

public record class09854(class10021 element, class09871 scrollbarPart, float accumulatedOffsetY) {
   public static final class09854 N = new class09854(null, class09871.NONE, 0.0F);

   public class10021 L() {
      return this.element;
   }


   public float i() {
      return this.accumulatedOffsetY;
   }

   public class09871 u() {
      return this.scrollbarPart;
   }

   public boolean y() {
      return this.element == null;
   }

   public boolean N() {
      return this.scrollbarPart != class09871.NONE;
   }
}
