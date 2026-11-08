package NurikWare;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import minecraft.class01207;
import minecraft.class01894;

public record class09450(Function<class01894, Optional<class01207>> loader, Supplier<Stream<class01894>> lister) {
   public class09450(Function<class01894, Optional<class01207>> loader, Supplier<Stream<class01894>> lister) {
      super();
      this.loader = loader;
      this.lister = lister;
   }

   public Supplier<Stream<class01894>> y() {
      return this.lister;
   }

   public Function<class01894, Optional<class01207>> N() {
      return this.loader;
   }
}
