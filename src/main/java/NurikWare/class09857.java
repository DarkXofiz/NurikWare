package NurikWare;

public record class09857(boolean ctrl, boolean shift, boolean alt, boolean meta) {
   public static final class09857 N = new class09857(false, false, false, false);

   public boolean L() {
      return this.alt;
   }

   public class09857(boolean ctrl, boolean shift, boolean alt, boolean meta) {
      super();
      this.ctrl = ctrl;
      this.shift = shift;
      this.alt = alt;
      this.meta = meta;
   }

   public boolean u() {
      return this.meta;
   }

   public boolean y() {
      return this.shift;
   }

   public boolean N() {
      return this.ctrl;
   }
}
