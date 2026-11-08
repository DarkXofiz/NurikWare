package NurikWare;

import java.util.Objects;

public record class09810(class09787 exitAnimationPolicy) {
   public static final class09810 N = new class09810(class09787.ANIMATE_REMOVALS);
   public static final class09810 y = new class09810(class09787.REMOVE_IMMEDIATELY);

   public class09787 L() {
      return this.exitAnimationPolicy;
   }

   public class09810(class09787 exitAnimationPolicy) {
      super();
      Objects.requireNonNull(exitAnimationPolicy, "exitAnimationPolicy");
      this.exitAnimationPolicy = exitAnimationPolicy;
   }

   public static class09810 y() {
      return y;
   }

   public static class09810 N() {
      return N;
   }
}
