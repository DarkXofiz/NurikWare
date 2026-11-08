package NurikWare;

import java.util.List;
import java.util.Objects;

public record class09903(float x, float y, float width, float height, List<class09935> children) implements class09935 {
   public float L() {
      return this.width;
   }

   public class09903(float x, float y, float width, float height, List<class09935> children) {
      super();
      Objects.requireNonNull(children, "children");
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
      this.children = children;
   }

   public List<class09935> i() {
      return this.children;
   }

   public float u() {
      return this.height;
   }

   public float N() {
      return this.x;
   }
}
