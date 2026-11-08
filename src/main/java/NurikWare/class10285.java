package NurikWare;

import minecraft.class03875;

public record class10285(int blockX, int blockY, int blockZ) implements class03875 {
   public int L() {
      return this.blockY;
   }

   public class10285(int blockX, int blockY, int blockZ) {
      super();
      this.blockX = blockX;
      this.blockY = blockY;
      this.blockZ = blockZ;
   }

   public int u() {
      return this.blockZ;
   }

   public int y() {
      return this.blockX;
   }
}
