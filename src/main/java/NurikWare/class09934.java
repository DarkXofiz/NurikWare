package NurikWare;

import java.util.List;
import java.util.Objects;

public record class09934(class09926 mask, List<class09935> children) implements class09935 {
   public class09934(class09926 mask, List<class09935> children) {
      super();
      Objects.requireNonNull(mask, "mask");
      Objects.requireNonNull(children, "children");
      this.mask = mask;
      this.children = children;
   }

   public List<class09935> y() {
      return this.children;
   }

   public class09926 N() {
      return this.mask;
   }
}
