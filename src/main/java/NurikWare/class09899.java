package NurikWare;

import java.util.List;
import java.util.Objects;

public record class09899(float alpha, List<class09935> children) implements class09935 {
   public class09899(float alpha, List<class09935> children) {
      super();
      Objects.requireNonNull(children, "children");
      alpha = class09693.N(alpha);
      this.alpha = alpha;
      this.children = children;
   }

   public List<class09935> y() {
      return this.children;
   }

   public float N() {
      return this.alpha;
   }
}
