package NurikWare;

import java.util.List;
import java.util.Optional;
import org.joml.Vector4f;

public record class11635(List<Vector4f> rects, List<Vector4f> rounds, Optional<class11599> currentMask, Optional<class11599> effectiveMask) {

   public Optional<class11599> L() {
      return this.currentMask;
   }


   static class11635 i() {
      return new class11635(List.of(), List.of(), Optional.empty(), Optional.empty());
   }

   public Optional<class11599> u() {
      return this.effectiveMask;
   }

   public List<Vector4f> y() {
      return this.rounds;
   }

   public List<Vector4f> N() {
      return this.rects;
   }
}
