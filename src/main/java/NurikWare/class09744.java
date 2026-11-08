package NurikWare;

record class09744(class09946[] handles, int[] outX, int[] outY, int count, int usedBottom, int usedLayoutBottom, int newHeight) {
   static final class09744 B = new class09744(new class09946[0], new int[0], new int[0], 0, 0, 0, 1);

   public int[] L() {
      return this.outY;
   }

   public int M() {
      return this.newHeight;
   }

   class09744(class09946[] handles, int[] outX, int[] outY, int count, int usedBottom, int usedLayoutBottom, int newHeight) {
      super();
      this.handles = handles;
      this.outX = outX;
      this.outY = outY;
      this.count = count;
      this.usedBottom = usedBottom;
      this.usedLayoutBottom = usedLayoutBottom;
      this.newHeight = newHeight;
   }

   public int i() {
      return this.usedBottom;
   }

   public int u() {
      return this.count;
   }

   public int[] y() {
      return this.outX;
   }

   public class09946[] N() {
      return this.handles;
   }

   public int R() {
      return this.usedLayoutBottom;
   }
}
