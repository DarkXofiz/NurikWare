package NurikWare;

import minecraft.class06889;

public record class10671(class06889 pos, int color, float size) {

   public float L() {
      return this.size;
   }

   public class10671(class06889 pos, int color, float size) {
      super();
      this.pos = pos;
      this.color = color;
      this.size = size;
   }

   public int y() {
      return this.color;
   }

   public class06889 N() {
      return this.pos;
   }
}
