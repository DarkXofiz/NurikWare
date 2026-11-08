package NurikWare;

import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class08066;

public record class11186(Supplier<class08066> framebuffer, boolean viewport) implements class11212 {

   public Supplier<class08066> L() {
      return this.framebuffer;
   }

   class11186(Supplier<class08066> framebuffer, boolean viewport) {
      super();
      Objects.requireNonNull(framebuffer, "framebuffer");
      this.framebuffer = framebuffer;
      this.viewport = viewport;
   }

   public boolean y() {
      return this.viewport;
   }

   @Override
   public boolean N(class09076 var1) {
      return true;
   }

   @Override
   public void N(class09076 var1, class09065 var2) {
      var2.N(this.framebuffer.get(), this.viewport);
   }
}
