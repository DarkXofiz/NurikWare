package NurikWare;

public record class11030(int[] lines, int[] cubes) {

   class11030(int[] lines, int[] cubes) {
      super();
      this.lines = lines;
      this.cubes = cubes;
   }

   boolean u() {
      return this.lines.length == 0 && this.cubes.length == 0;
   }

   public int[] y() {
      return this.lines;
   }

   public int[] N() {
      return this.cubes;
   }
}
