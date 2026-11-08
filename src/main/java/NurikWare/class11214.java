package NurikWare;

import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class08066;

public record class11214<C>(Supplier<class08066> framebuffer, boolean viewport) implements class11171<C> {
   private static String[] L;

   public boolean L() {
      return this.viewport;
   }

   class11214(Supplier<class08066> framebuffer, boolean viewport) {
      super();
      this.framebuffer = Objects.requireNonNull(framebuffer, L[0]);
      this.viewport = viewport;
   }

   static {
      i();
   }

   private static void i() {
      L = new String[1];
      L[0] = "framebuffer";
   }

   public Supplier<class08066> u() {
      return this.framebuffer;
   }

   @Override
   public void N(C var1, class09076 var2, class09065 var3) {
      var3.N(this.framebuffer.get(), this.viewport);
   }
}
