package NurikWare;

import java.util.function.IntConsumer;

public record class11872(int color, class09785<Boolean> opened, IntConsumer onChange, boolean alphaAllowed, boolean pastel) {

   public boolean L() {
      return this.pastel;
   }

   public class11872(int color, class09785<Boolean> opened, IntConsumer onChange, boolean alphaAllowed, boolean pastel) {
      super();
      this.color = color;
      this.opened = opened;
      this.onChange = onChange;
      this.alphaAllowed = alphaAllowed;
      this.pastel = pastel;
   }

   public IntConsumer i() {
      return this.onChange;
   }

   public boolean u() {
      return this.alphaAllowed;
   }

   public int y() {
      return this.color;
   }

   public class09785<Boolean> N() {
      return this.opened;
   }
}
