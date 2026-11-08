package NurikWare;

import java.util.List;
import java.util.Objects;

public record class09922(class09916 bounds, class09914 effect, List<class09935> children) implements class09935 {
   public List<class09935> L() {
      return this.children;
   }

   public class09922(class09916 bounds, class09914 effect, List<class09935> children) {
      super();
      Objects.requireNonNull(bounds, "bounds");
      Objects.requireNonNull(effect, "effect");
      Objects.requireNonNull(children, "children");
      this.bounds = bounds;
      this.effect = effect;
      this.children = children;
   }

   public class09914 y() {
      return this.effect;
   }

   public class09916 N() {
      return this.bounds;
   }
}
